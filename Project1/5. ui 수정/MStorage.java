
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MStorage
{
	int foodNum;		// 재료 번호 변수
	int su;				// 재료 증가(감소) 변수
	static int bowl=10;	// 용기 변수

	private static BufferedReader br;

	private static ManagerMode mm;

	static
	{
		// BufferedReader 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// ManagerMode 인스턴스 생성
		mm = new ManagerMode();
	}


	public void mStorageChange() throws IOException // 재료 추가/삭제 입력 메소드
	{	
		while(true)
		{
			System.out.print("재료를 추가하시려면 (+), 삭제하시려면 (-) : "); // 재료를 추가하려면 (+), 삭제하려면 (-) 입력
			
			Password.op = br.readLine();
			
			if(Password.op.equals("+") || Password.op.equals("-"))	// 조건 : (+), (-) 올바르게 입력 시
				break;												// 연산자 입력칸 통과

			System.out.println("\n입력에 문제가 있습니다.\n");		// 연산자 올바르지 않게 입력 시 메세지 표시 후 다시 입력받음	
		}

		mStorageFoodSelect();	// 이름 검토 메소드 호출

	}// end mStorageChange()


	public void mStorageFoodSelect() throws IOException	// 이름 검토 메소드
	{
		int vegNum=0;		// 야채의 종류 총 갯수를 알기위한 변수 (ex : v.size()와 같은개념)
		int mainNum=0;		// 메인의 종류 총 갯수를 알기위한 변수
		int sourceNum=0;	// 소스의 종류 총 갯수를 알기위한 변수
		int topNum=0;		// 토핑의 종류 총 갯수를 알기위한 변수

		for (int i=0; i<ISetup.v.size(); i++)
		{
			if (ISetup.v.get(i).cate == 1)	// v벡터 전체를 돌면서 야채 카테고리의 경우
				vegNum++;					// vegNum을 1씩 증가

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

			if (foodNum>=0 && foodNum<ISetup.v.size())	// 입력값이 1~v벡터크기 사이의 값이면 while문 빠져나옴
			{
				break;
			}
			else
				System.out.println("잘못 입력하셨습니다.");	// 아닐경우 다시 반복

		}

		mStorageFoodNum();	// 조절할 수량 선택 메소드 호출

	}// end mStorageFoodSelect()


	public void mStorageFoodNum() throws IOException // 조절할 수량 선택 메소드
	{
		while (true)
		{
			System.out.printf("▶ [%s] 수량 : ", ISetup.v.get(foodNum).name); // 재료 추가/삭제할 수량 입력
			su = Integer.parseInt(br.readLine());

			// 재료 추가시 : 총 재료 개수(원래 재료+추가 입력 재료) 30개 이하로 입력
			// 재료 삭제시 : 해당 재료의 현재 개수 이상 입력할 수 없도록 함
			if (Password.op.equals("+"))
			{
				if(su + ISetup.v.get(foodNum).num<=30)	// [각 재료당 총 재료 개수 30개 이하일 시]
					break;								// 재료 수량 입력칸 통과

				System.out.println("\n입력에 문제가 있습니다.\n"); // 올바르지 않게 입력 시 메세지 표시 후 다시 입력받음	
			}

			else
			{
				if(su<=ISetup.v.get(foodNum).num)		// [현재 수량 이하로 입력시] 
					break;								// 재료 수량 입력칸 통과
				System.out.println("\n입력에 문제가 있습니다.\n"); // 올바르지 않게 입력 시 메세지 표시 후 다시 입력받음
			}
		}

		if (Password.op.equals("+")) //수량 검토가 끝나면 각각의 실행 메소드 호출
			mSAdd();
		else
			mSRemove();

	}// end mStorageFoodNum()


	public void mSAdd() throws IOException	// 재고 추가 실행 메소드
	{
		System.out.print("\n재고를 추가하시겠습니까? (Y/N) : ");
		Password.con = br.readLine().toUpperCase();

		if(Password.con.equals("Y")) // 구매자가 Y 입력한 경우 재고 추가
		{
			ISetup.v.get(foodNum).num += su;
			System.out.println("\n<<재고가 추가됐습니다.>>\n");
		}
		else
			System.out.println("취소됐습니다.");
		
		System.out.println("이전 메뉴로 돌아갑니다.");
		mm.mStorage();
			
	} //end mSAdd()


	public void mSRemove() throws IOException	// 재고 삭제 실행 메소드
	{                     
		System.out.print("\n재고를 삭제하시겠습니까? (Y/N) : "); 
		Password.con = br.readLine().toUpperCase();

		if(Password.con.equals("Y")) // 구매자가 Y 입력한 경우 재고 삭제
		{
			ISetup.v.get(foodNum).num -= su;
			System.out.println("\n<<재고가 삭제되었습니다.>>\n");
		}
		else
			System.out.println("취소됐습니다.");

		System.out.println("이전 메뉴로 돌아갑니다.");
		mm.mStorage();

	} // end mSAdd()


	public void mBowlChange() throws IOException	// 용기 추가 실행 메소드
	{
		int bowlChangeNum;	// 용기 변경 변수

		
		System.out.println();
		System.out.printf("현재 용기 갯수 : %d", bowl);
		System.out.println();
		System.out.print("용기를 몇개 추가하시겠습니까? : ");
	
		bowlChangeNum = Integer.parseInt(br.readLine());

		if (bowl+bowlChangeNum>=0 && bowl+bowlChangeNum <= 30)	// 기존 용기수량과 입력 수량을 더해 30 이하면
		{
			bowl = bowl+bowlChangeNum;	// 용기 추가 실행
		}
		else
		{
			System.out.println("입력에 문제가 있습니다");	// 아닐경우 실행하지 않고
		}

		mStorageReturn();	// 계속 수행할지 물어보는 메소드 호출

	}// end mBowlChange()


	public void mStorageReturn() throws IOException	// 계속 수행 물어보는 메소드 실행
	{
		// Password 인스턴스 생성
		Password pw = new Password();

		System.out.print("재고관리 작업을 계속 수행하시겠습니까? (Y/N) : ");

		Password.con = br.readLine().toUpperCase();

		// 'Y' 입력시 추가 수행
		if(Password.con.equals("Y"))
		{
			mm.mStorage();
		}
		// 다른거 입력시 처음 화면으로
		else
		{
			pw.modePrint();
			pw.modeSelect();
			pw.modeRun();
		}
	}// end mStorageReturn()

}// end class Storagechange