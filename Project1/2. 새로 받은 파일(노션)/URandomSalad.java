import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Random;
import java.util.Vector;
import java.io.IOException;
import java.util.Iterator;

// 랜덤 샐러드 클래스
public class URandomSalad
{
   private static Integer sel;         // 선택 값을 담을 변수
   private static String con;   
   
   // 임시로 냉장고 불러오기
   public static ISetup isu = new ISetup();

   // 임시로 담을 메인, 야채, 소스 벡터
   Vector<Ingredient> temp = new Vector<Ingredient>();    // 마지막에 담을 그릇
   Vector<Ingredient> mtemp = new Vector<Ingredient>();   // 메인
   Vector<Ingredient> vtemp = new Vector<Ingredient>();   // 야채
   Vector<Ingredient> stemp = new Vector<Ingredient>();   // 소스
   Vector<Ingredient> ttemp = new Vector<Ingredient>();   // 토핑
   // 제한 칼로리 입력받을 변수
   int limitkcal;  
   int sumkcal;	// 칼로리 누적합을 담을 변수

   // 제외할 재료들을 담을 변수 (소스는 제외 안함)
   String limitMain;
   String[] limitVeg = new String[2];
   String[] limitTop = new String[2];


   // 칼로리와 재료 입력
   public void limitCal() throws IOException
   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		System.out.println();
       	System.out.println("\t입력하신 칼로리보다 낮은 칼로리로 샐러드를 조합해드립니다.");
		System.out.println("\t(메인 재료 1종류 / 양상추 1번 / 소스 1종류 기본 포함)");
		System.out.println("\t어떤 재료가 몇 번 나올지는 아무도 모르는 랜~ 덤~ 샐러드");
		System.out.println();

		//System.out.printf("%2d. %5s, 총 %3d개, 총 %d원\n", n+1, is.vMain.get(n).name, xxx, xxx); 
		// 재료 번호, 재료 이름, 총 판매 수량, 총 판매 금액


		// [재료 목록]
		System.out.println("\n    [재료 목록]");
		System.out.println();

		// 메인
		System.out.println("-----------------------");
		System.out.println("        [메인]");
		System.out.println();
		for (int n=0; n<isu.vMain.size(); n++)
			System.out.printf("%2d. %5s\n", n+1, isu.vMain.get(n).name);


		// 야채
		System.out.println("-----------------------");
		System.out.println("        [야채]");
		System.out.println();
		for (int n=0; n<isu.vVeg.size(); n++)
			System.out.printf("%2d. %5s\n", n+1, isu.vVeg.get(n).name);

		// 토핑
		System.out.println("-----------------------");
		System.out.println("        [토핑류]");
		for (int n=0; n<isu.vTop.size(); n++)
			System.out.printf("%2d. %5s\n", n+1, isu.vTop.get(n).name);
		System.out.println("-----------------------");
		System.out.println();
		System.out.println();

		// 칼로리 제한 입력
		do         
		{
			System.out.print("제한할 칼로리를 입력하세요 (200~400): "); 
			limitkcal = sc.nextInt();
		}
		while (limitkcal < 200 || limitkcal > 400);
	  

		// 메인 제외할 재료 입력(최대 1개)
		
		System.out.print("제외할 [메인]재료 입력 (최대 1개): ");
		limitMain = br.readLine();
		System.out.println();
	
		   
		// 야채 제외할 재료 입력(최대 2개)
		int i = 0 ;   // 루프 변수
		System.out.print("제외할 [야채]재료 입력 (최대 2개) : ");
		limitVeg [i] = br.readLine();

		System.out.print("제외를 계속 하시겠습니까? (Y/N)");
		con = sc.next().toUpperCase();
		  
		if (con.equals("Y")) // y일때만. 한번 더 입력
		{
			i++;
			System.out.print("제외할 [야채]재료 입력 (최대 2개) : ");
			limitVeg [i] = br.readLine();

			/* 실험용 구문 ( ※ 지워도 됨~!!!)
			for (int x=0; x<limitVeg.length; x++)
				System.out.printf("limtieVeg[%d] : %s ", x, limitVeg[x]);
			*/
		}
		System.out.println();



		// 토핑 제외할 재료 입력(최대 2개)
		i = 0;
		System.out.print("제외할 [토핑]재료 입력 (최대 2개) : ");
		limitTop [i] = br.readLine();

		System.out.print("제외를 계속 하시겠습니까? (Y/N)");
		con = sc.next().toUpperCase();

		if (con.equals("Y")) // y일때만. 한번 더 입력
		{
			i++;
			System.out.print("제외할 [토핑]재료 입력 (최대 2개) : ");
			limitTop [i] = br.readLine();
		}
		System.out.println();
		System.out.println();

   }  //end limitCal()


    public void cancel()
	{
		// 전체 재료 담기
		mtemp = isu.vMain;
		vtemp = isu.vVeg;
		stemp = isu.vSource;
		ttemp = isu.vTop;


		// 메인재료 제거
		for (int i=0; i<mtemp.size(); i++)
		{
			for (int j=0; j<1; j++)
			{
				// 전체 재료에서 입력받은 값 제거
				if (mtemp.get(i).name.equals(limitMain))
					mtemp.remove(mtemp.get(i));
			}
		}

		// 야채재료 제거 
		for (int i=0; i<limitVeg.length; i++)
		{
			for (int j=0; j<vtemp.size(); j++)
			{
				// 전체 재료에서 입력받은 값 제거
				if (vtemp.get(j).name.equals(limitVeg[i]))
					vtemp.remove(vtemp.get(j));
			}
		}

		// 토핑재료 제거
		for (int i=0; i<limitTop.length; i++)
		{
			for (int j=0; j<ttemp.size(); j++)
			{
				// 전체 재료에서 입력받은 값 제거
				if (ttemp.get(j).name.equals(limitTop[i]))
					ttemp.remove(ttemp.get(j));
			}
		}

	}


	public Vector<Ingredient> randomRun()
	{
		// 재료 랜덤으로 고르기
		// 메인 1
		// 양상추는 1 or 2 
		// 양상추를 제외한 야채류 에서 1 ~ 5 
		// 소스류 1 
		 
		// ① 어떤 재료일지, ② 몇 번 나올지 랜덤.
		// 모든 재료의 칼로리 합이 제한을 넘지않도록

		// 랜덤으로 뽑기 시작
		Random rd = new Random();
		do
		{
			temp.clear();
			sumkcal = 0;
			
			// ※ 메인과 소스 : 무조건 1개 
			temp.add(mtemp.get(rd.nextInt(mtemp.size())));
			temp.add(stemp.get(rd.nextInt(stemp.size())));
			//                 ---------------------------
			//                 랜덤으로 1종류 뽑아서 temp(메인그릇)에 담기

			// ※ 야채와 토핑 : 종류도 랜덤, 횟수도 랜덤
			for (int i=0; i<rd.nextInt(5)+1; i++)
			{
				int idx = rd.nextInt(vtemp.size());		
				temp.add(vtemp.get(idx));
			}
			for (int i=0; i<rd.nextInt(3)+1; i++)
			{
				int idx = rd.nextInt(ttemp.size());		
				temp.add(ttemp.get(idx));
			}
	 
	 		// 총 합 칼로리 계산
			for (int i=0; i<temp.size(); i++)
				sumkcal += temp.get(i).kcal;
		}
		while (sumkcal>limitkcal || sumkcal < 200);

		return temp;
	}
}


