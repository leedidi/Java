
import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
import java.io.IOException;

// 랜덤 샐러드 클래스
public class URandomSalad
{
	private static Integer sel;			// 선택 값을 담을 변수
	private static String con;	
	
	// 임시로 냉장고 불러오기
	public static ISetup isu = new ISetup();

	// 임시로 담을 메인, 야채, 소스 벡터
	Vector<Ingredient> temp = new Vector<Ingredient>();    // 마지막에 담을 그릇
	Vector<Ingredient> mtemp = new Vector<Ingredient>();   // 메인
	Vector<Ingredient> vtemp = new Vector<Ingredient>();   // 야채
	Vector<Ingredient> stemp = new Vector<Ingredient>();   // 소스

	
	int limitkcal;  // 제한 칼로리 입력받을 변수
	int sumkcal;	// 칼로리 누적합을 담을 변수 


	// 제외할 재료들을 담을 변수 (소스는 제외 안함)
	String limitMain;
	String[] limitVeg = new String[2];
	//  String[] limitTop = new String[2];


	// 칼로리와 재료 입력
	public void limitCal()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
       	System.out.println("\t입력하신 칼로리 아래로 샐러드를 조합해드립니다.");
		System.out.println("\t(메인 재료 1종류 / 양상추 1번 / 소스 1종류 기본 포함)");
		System.out.println("\t 어떤 재료가 몇 번 나올지는 아무도 모르는 랜~덤~ 샐러드");
		
		do			// 칼로리 제한 입력
		{
			System.out.print("칼로리 제한 (200~400): "); 
			limitkcal = sc.nextInt();
		}
		while (limitkcal < 200 || limitkcal > 400);


		int i = 0 ;	// 루프 변수 
		   
		System.out.print("제외할 [메인]재료 입력 (최대 1개) : ");
		limitMain = sc.next();
		
		System.out.print("제외할 [야채]재료 입력 (최대 2개) : ");
		limitVeg [i] = sc.next();

		System.out.print("제외를 계속 하시겠습니까? (Y/N)");
		con = sc.next().toUpperCase();
		
		if (con.equals("Y")) // y일때만. 한번 더 입력
		{
			i++;
			System.out.print("제외할 [야채]재료 입력 (최대 2개) : ");
			limitVeg [i] = sc.next();
			return;
		}

	}//end limitCal()


	public void cancel()
	{
		// 전체 재료 담기
		mtemp = isu.vMain;
		vtemp = isu.vVeg;
		stemp = isu.vSource;


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
		for (int i=0; i<vtemp.size(); i++)
		{
			for (int j=0; j<limitVeg.length; j++)
			{
				// 전체 재료에서 입력받은 값 제거
				if (vtemp.get(i).name.equals(limitVeg[j]))
					vtemp.remove(vtemp.get(i));
			}
		}

		// 토핑재료 제거 (※ 구현 해야 함)
		randomRun();   // 재료 뽑기 시작
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

		do
		{
			// 랜덤으로 뽑기 시작
			Random rd = new Random();
			// ※ 메인 (임시그릇) 
			// 무조건 1개   후보군에서 랜덤
			temp.add(mtemp.get(rd.nextInt(mtemp.size())));
			//                           ---------------
			//                           임시그릇에 있는 재료 전체 수

			// ※ 소스 (임시그릇)
			// 소스 1
			temp.add(stemp.get(rd.nextInt(stemp.size())));


			// ※ 야채 (임시그릇)
			// 양상추는 1 or 2개 /   (양상추 제외 야채) 012345
			// 양상추 for문 (무조건 1~2 개 담기)
			//int idx = isu.vVeg.indexof("양상추");
			for (int i=0; i<rd.nextInt(2)+1; i++)      
			 temp.add(isu.vVeg.get(0));


			// 나머지 재료 (수량 랜덤으로 담기, 양상추는 무조건 제외)
			int idx;
			for (int i=0; i<rd.nextInt(5)+1; i++)
			{
				 idx = rd.nextInt(vtemp.size());

				 // 랜덤 돌린 것 중에 양상추면 다시 컨티뉴
				 if (vtemp.get(idx).name == "양상추")
					continue;

				 // 그 외에는 야채그릇에 추가
				 temp.add(vtemp.get(idx));
			}

			// 조건에 맞는 칼로리 연산
			for (int i=0; i<temp.size(); i++)
				sumkcal += temp.get(i).kcal;
			
		}
		while (sumkcal<limitkcal || sumkcal<200);
		
		return temp;
	  }
   }