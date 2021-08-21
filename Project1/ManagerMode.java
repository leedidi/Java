
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ManagerMode 
{
	private static BufferedReader br;
	private static Integer sel;				//-- 선택 값

	static
	{
		// BufferedReader 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화
		sel = 1;
	}
	
	// ★★★완성★★★
	public void mMenuPrint() // 메뉴 출력 메소드
	{
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("|                         |");
		System.out.println("|       [메뉴 출력]       |");
		System.out.println("|                         |");
		System.out.println("|   1. 요청사항 확인      |");
		System.out.println("|   2. 재고 관리          |");
		System.out.println("|   3. 금고 관리          |");
		System.out.println("|   4. 모드 선택          |");
		System.out.println("|                         |");
		System.out.println("---------------------------");
		System.out.println();
	}


	// ★★★완성★★★
	public void mMenuSelect() throws IOException// 메뉴 선택 메소드
	{
		// 1~4 외에 다른 값을 넣으면 반복
		do
		{
			System.out.print(">> 메뉴 선택(1~4) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>4);
		
	}


	// ★★★완성★★★
	public void mMenuRun() throws IOException // 메뉴 호출 메소드
	{
		// Password 인스턴스 생성
		Password pw = new Password();

		// 입력받은 값에 따라 실행
		switch (sel)
		{
			case Menus.E_ONE : mNote(); break;		// 요청사항 확인으로
			case Menus.E_TWO : mStorage(); break;	// 재고 관리로
			case Menus.E_THREE : ; break;			// 금고 관리로
			case Menus.E_FOUR :						// pw모드 선택으로
			{
				pw.modePrint();
				pw.modeSelect();
				pw.modeRun();
			}
			break;
			default : System.out.println(">> 메뉴 선택 오류~!!!"); break;
		}
	}


	// ☆☆☆ 구성중 ☆☆☆
	public void mNote() // 요청사항 확인 메소드
	{
		System.out.println("요청사항 확인 메소드");
	}


	public void mStorageSelect()
	{
		System.out.println();
		System.out.println("    [메뉴 출력]");
		System.out.println();
		System.out.println("1. 재고 추가/삭제");
		System.out.println("2. 품목 추가/삭제");
		System.out.println();
	}


	// ☆☆☆ 구성중 ☆☆☆ (품목 추가만 가져와서 넣으면 됨)
	public void mStorage() throws IOException // 재고 관리 메소드
	{
		// Storagechange 인스턴스 생성
		Storagechange stc = new Storagechange();

		mStorageSelect();

		// 1~2 외에 다른 값을 넣으면 반복
		do
		{
			System.out.print(">> 메뉴 선택(1~2) : ");

			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>2);
		

		// 입력받은 값에 따라 실행
		switch (sel)
		{
			case Menus.E_ONE :				// 재고 추가 / 삭제로
			{
				mStock();

				stc.mStorageChange();

				stc.mStorageCategory();

				stc.mStorageFoodSelect();

				stc.mStorageFoodNum();

				stc.mStorageRun();
			}
			break;
			case Menus.E_TWO : ; break;		// 품목 추가 / 삭제로
			default : System.out.println("잘못 입력하셨습니다."); break;
		}

	}


	// ★★★완성★★★
	public void mStock()
	{
		// ISetup 인스턴스 생성
		ISetup is = new ISetup();

		// 초기 재고 셋팅
		is.firstSet();

		System.out.println("\n    [재고 관리]");
		System.out.println();
		System.out.println("추가·삭제할 재료 선택");
		System.out.println("-----------------------");
		System.out.println("    [야채]");
		System.out.println();
		
		// 야채 출력 반복문
		for (int n=0; n<is.vVeg.size(); n++)
			System.out.printf("%2d %5s, %3d개\n", n+1, is.vVeg.get(n).name, is.vVeg.get(n).num);
		
		System.out.println("-----------------------");
		System.out.println("    [육류]");
		System.out.println();

		// 육류 출력 반복문
		for (int n=0; n<is.vMain.size(); n++)
			System.out.printf("%2d %5s, %3d개\n", n+1, is.vMain.get(n).name, is.vMain.get(n).num);
		
		System.out.println("-----------------------");
		System.out.println("    [소스류]");
		System.out.println();

		// 소스 출력 반복문
		for (int n=0; n<is.vSource.size(); n++)
			System.out.printf("%2d %5s, %3d개\n", n+1, is.vSource.get(n).name, is.vSource.get(n).num);

		System.out.println("-----------------------");
		System.out.println("    [토핑류]");
		System.out.println();
	}


}