
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
	}
	
	// ★★★완성★★★
	public void mMenuPrint() // 메뉴 출력 메소드
	{
		System.out.println();
		System.out.println("┌─────────────────────────────────────────┐");
		System.out.println("│                                         │");
		System.out.println("│       [메뉴 출력] (이전메뉴 : -1)       │");
		System.out.println("│                                         │");
		System.out.println("│            1. 요청사항 확인             │");
		System.out.println("│            2. 재고 관리                 │");
		System.out.println("│            3. 금고 관리                 │");
		System.out.println("│            4. 모드 선택                 │");
		System.out.println("│                                         │");
		System.out.println("└─────────────────────────────────────────┘");
		System.out.println();
	}// end mMenuPrint()


	// ★★★완성★★★
	public void mMenuSelect() throws IOException// 메뉴 선택 메소드
	{
		// 1~4 외에 다른 값을 넣으면 반복
		do
		{
			System.out.print(">> 메뉴 선택(1~4) : ");
			Password.sel = Integer.parseInt(br.readLine());
		}
		while (Password.sel<1 || Password.sel>4);
		
	}// end mMenuSelect()


	// ☆☆☆미완성☆☆☆ (금고관리모드 넣어야함)
	public void mMenuRun() throws IOException // 메뉴 호출 메소드
	{
		// Password 인스턴스 생성
		Password pw = new Password();

		// 입력받은 값에 따라 실행
		switch (Password.sel)
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
		}
	}// end mMenuRun()


	// ★★★완성★★★
	public void mNote() throws IOException // 요청사항 확인 메소드
	{
		System.out.println(ISetup.sbNote);

		mMenuRun();

	}// end mNote()
	

	//※※※※※※※※※※ 추가2: ManagerMode.mStorageSelect() - 박스 추가 (완료★)
	// ★★★완성★★★ 
	public void mStorageSelect()
	{	
		System.out.println();
		System.out.println("┌─────────────────────────────────────────┐");
		System.out.println("│                                         │");
		System.out.println("│       [메뉴 출력] (이전메뉴 : -1)       │");
		System.out.println("│                                         │");
		System.out.println("│            1. 재고 추가/삭제            │");
		System.out.println("│            2. 품목 추가/삭제            │");
		System.out.println("│                                         │");
		System.out.println("└─────────────────────────────────────────┘");
		System.out.println();

	}// end mStorageSelect()


	// ★★★완성★★★
	public void mStorage() throws IOException // 재고 관리 메소드
	{
		// Storagechange 인스턴스 생성
		MStorage stc = new MStorage();

		MStorageNew msn = new MStorageNew();

		mStorageSelect();

		// 1~2 외에 다른 값을 넣으면 반복
		do
		{
			System.out.print(">> 메뉴 선택(1~2) : ");

			Password.sel = Integer.parseInt(br.readLine());
		}
		while (Password.sel<1 || Password.sel>2);
		

		// 입력받은 값에 따라 실행
		switch (Password.sel)
		{
			case Menus.E_ONE :				// 재고 추가 / 삭제로
			{
				mStock();

				stc.mStorageChange();
			} break;
			case Menus.E_TWO : 
			{
				mStock();

				msn.mAddRemove();
			} break;		// 품목 추가 / 삭제로
			default : System.out.println("잘못 입력하셨습니다."); break;
		}

	}// end mStorage()

	
	//※※※※※※※※※※ 추가3: ManagerMode.mStock() - 재고 출력 깔끔하게 정리 완료! + 네모 모양 완료 (완료★)
	// ★★★완성★★★
	public void mStock()
	{
		System.out.println("\n          [재고 관리]");
		System.out.println();
		System.out.println("     추가·삭제할 재료 선택");
		
		System.out.println("┌─────────────────────────────┐");
		System.out.println("│		              │");
		System.out.println("│          [야채]             │");
		System.out.println("│		              │");
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(n).cate == 1)
				System.out.printf("│%2d. %-10s	" + ":" + "%3d개│\n", n+1, ISetup.v.get(n).name, ISetup.v.get(n).num);

				// 테스트용(MMoneyCheck)
				//System.out.printf("│%2d. %-10s	" + ": " + "%3d개 / %d원│\n", n+1, ISetup.v.get(n).name, 100, 20000);
		}
		System.out.println("│		              │");
		System.out.println("│   -----------------------   │");
		System.out.println("│		              │");
		System.out.println("│          [메인]             │");
		System.out.println("│		              │");
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(n).cate == 2)
				System.out.printf("│%2d. %-10s	" + ":" + "%3d개│\n", n+1, ISetup.v.get(n).name, ISetup.v.get(n).num);
		}
		System.out.println("│		              │");
		System.out.println("│   -----------------------   │");
		System.out.println("│		              │");
		System.out.println("│          [소스]             │");
		System.out.println("│		              │");
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(n).cate == 3)
				System.out.printf("│%2d. %-10s	" + ":" + "%3d개│\n", n+1, ISetup.v.get(n).name, ISetup.v.get(n).num);
		}
		System.out.println("│		              │");

		System.out.println("│   -----------------------   │");
		System.out.println("│		              │");
		System.out.println("│          [토핑]             │");
		System.out.println("│		              │");;
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(n).cate == 4)
				System.out.printf("│%2d. %-10s	" + ":" + "%3d개│\n", n+1, ISetup.v.get(n).name, ISetup.v.get(n).num);
		}
		System.out.println("└─────────────────────────────┘");
		
	}// end mStock()


}// end class