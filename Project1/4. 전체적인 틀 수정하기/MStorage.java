
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MStorage
{
	int foodNum;		// 재료 번호 변수
	int su;				// 재료 증가(감소) 변수
	static int bowl=0;	// 용기 변수

	private static BufferedReader br;

	static
	{
		// BufferedReader 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));
	}


	// 재료 추가/삭제 입력 메소드
	public void mStorageChange() throws IOException
	{	
		while(true)
		{
			System.out.print("재료를 추가하시려면 (+), 삭제하시려면 (-) : "); // 재료를 추가하려면 (+), 삭제하려면 (-) 입력
			
			Password.op = br.readLine();
			
			if(Password.op.equals("+") || Password.op.equals("-"))	// 조건 : (+), (-) 올바르게 입력 시
				break;		// 연산자 입력칸 통과

			System.out.println("\n입력에 문제가 있습니다.\n");	// 연산자 올바르지 않게 입력 시 메세지 표시 후 다시 입력받음	
		}

		mStorageFoodSelect();
		
	}// end mStorageChange()


	// 재료 메뉴 선택 메소드
	public void mStorageFoodSelect() throws IOException
	{
		int vegNum=0;
		int mainNum=0;
		int sourceNum=0;
		int topNum=0;

		for (int i=0; i<ISetup.v.size(); i++)
		{
			if (ISetup.v.get(i).cate == 1)
				vegNum++;

			else if (ISetup.v.get(i).cate == 2)
				mainNum++;

			else if (ISetup.v.get(i).cate == 3)
				sourceNum++;

			else if (ISetup.v.get(i).cate == 4)
				topNum++;
		}

		while (true)
		{	
			System.out.print("▶ 재료 번호 : "); // 재료 번호 입력
			foodNum = Integer.parseInt(br.readLine())-1;
			
			if (ISetup.v.get(foodNum).cate==Menus.E_ONE)
			{
				//조건: [1. 야채/ (1부터 야채의 마지막 재료 번호) 까지 입력시] 
				if(foodNum<vegNum && foodNum>=0)
					break;  // 재료 입력칸 통과
			}
			else if (ISetup.v.get(foodNum).cate==Menus.E_TWO)
			{
				//조건: [2. 메인/ (1부터 메인의 마지막 재료 번호) 까지 입력시] 
				if(foodNum<mainNum && foodNum>=0)
					break;  // 재료 입력칸 통과
			}
			else if (ISetup.v.get(foodNum).cate==Menus.E_THREE)
			{
				//조건: [3. 소스/ (1부터 소스의 마지막 재료 번호) 까지 입력시]
				if(foodNum<sourceNum && foodNum>=0)
					break;  // 재료 입력칸 통과
			}
			else if (ISetup.v.get(foodNum).cate==Menus.E_FOUR)
			{
				//조건: [4. 토핑/ (1부터 소스의 마지막 재료 번호) 까지 입력시]
				if(foodNum<topNum && foodNum>=0) 
					break;  // 재료 입력칸 통과
			}

			System.out.println("잘못 입력하셨습니다.");	// 각 카테고리의 재료 번호 잘못 입력시 메세지 표시 후 다시 입력받음	

		}

		mStorageFoodNum();

	}// end mStorageFoodSelect()


	// 재료 메뉴 갯수 선택 메소드
	public void mStorageFoodNum() throws IOException
	{
		while (true)
		{
			System.out.print("▶ 재료 수량 : "); // 재료 추가/ 삭제할 수량 입력
			su = Integer.parseInt(br.readLine());
			
			// 재료 추가시 : 총 재료 개수(원래 재료+추가 입력 재료) 50개 이하로 입력
			// 재료 삭제시 : 해당 재료의 현재 개수 이상 입력할 수 없도록 함
			if (Password.op.equals("+"))
			{
				if(su + ISetup.v.get(foodNum).num<=30) // [각 재료당 총 재료 개수 50개 이하일 시]
					break;  // 재료 번호 입력칸 통과

				System.out.println("\n입력에 문제가 있습니다.\n"); // 올바르지 않게 입력 시 메세지 표시 후 다시 입력받음	
			}

			else
			{
				if(su<=ISetup.v.get(foodNum).num) //조건: [현재 수량 이하로 입력시] 
					break;  // 재료 수량 입력칸 통과

				System.out.println("\n입력에 문제가 있습니다.\n"); // 올바르지 않게 입력 시 메세지 표시 후 다시 입력받음
			}

		}

		mStorageRun();

	}// end mStorageFoodNum()

	
	public void mStorageRun() throws IOException // 재료 추가/삭제 실행 메소드
	{
		if (Password.op.equals("+")) // 구매자가 (-) 입력시
		{
			System.out.print("\n재고를 삭제하시겠습니까? (Y/N) : "); // 재고를 삭제하시겠습니까? 메세지 출력
			Password.con = br.readLine().toUpperCase();

			if(Password.con.equals("Y")) // 구매자가 Y 입력한 경우
			{
				ISetup.v.get(foodNum).num += su;

				System.out.println("\n<<재료가 추가되었습니다.>>\n");
			}
			else
			{
				System.out.println("취소되었습니다.");	// 재료 개수를 삭제하지 않은 경우, 취소 메시지 출력
			}
		}
		else
		{
			System.out.print("\n재고를 삭제하시겠습니까? (Y/N) : "); // 재고를 추가하시겠습니까? 메세지 출력
			Password.con = br.readLine().toUpperCase();

			if(Password.con.equals("Y")) // 구매자가 Y 입력한 경우
			{
				ISetup.v.get(foodNum).num -= su;

				System.out.println("\n<<재료가 삭제되었습니다.>>\n");
			}
			else
			{
				System.out.println("취소되었습니다."); // 재료 개수를 추가하지 않은 경우, 취소 메시지 출력
			}
		}

		mStorageReturn();

	}// end mStorageRun()

	
	public void mBowlChange() throws IOException
	{
		int bowlChangeNum;

		while (true)
		{
			System.out.println();
			System.out.print("용기를 몇개 추가하기겠습니까? : ");
		
			bowlChangeNum = Integer.parseInt(br.readLine());

			if (bowl+bowlChangeNum <= 30)
			{
				bowl = bowl+bowlChangeNum;
				break;
			}
			else
			{
				System.out.println("입력에 문제가 있습니다");
			}
		}

		mStorageReturn();
		
	}

	public void mStorageReturn() throws IOException
	{
		// Password 인스턴스 생성
		Password pw = new Password();

		System.out.print("추가로 작업을 수행하시겠습니까? (Y/N) : ");

		Password.con = br.readLine().toUpperCase();

		// 'Y' 입력시 추가 수행
		if(Password.con.equals("Y"))
		{
			mStorageChange();
		}
		// 다른거 입력시 처음 화면으로
		else
		{
			pw.modeRun();
		}

	}// end mStorageReturn()



}// end class Storagechange