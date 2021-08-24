
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


	public void mMenuPrint() // 메뉴 출력 메소드
	{
		// ★ 테스트가 필요
		if (Change.moneyCount[0] == 0 || Change.moneyCount[1] == 0 || 
			Change.moneyCount[2] == 0 || Change.moneyCount[3] == 0 || 
			Change.moneyCount[4] < 5)
			System.out.println("※경고※ 시재점검이 필요합니다.");

		System.out.println();
		System.out.println("┌─────────────────────────────────────────┐");
		System.out.println("│                                         │");
		System.out.println("│              [메뉴 출력]                │");
		System.out.println("│                                         │");
		System.out.println("│            1. 요청사항 확인             │");
		System.out.println("│            2. 재고 관리                 │");
		System.out.println("│            3. 금고 관리                 │");
		System.out.println("│            4. 모드 선택                 │");
		System.out.println("│                                         │");
		System.out.println("└─────────────────────────────────────────┘");
		System.out.println();
	}// end mMenuPrint()


	public void mMenuSelect()// 메뉴 선택 메소드
	{
		do	// 1~4 외에 다른 값을 넣으면 반복
		{
			try
			{
				System.out.print(">> 메뉴 선택(1~4) : ");

				Password.sel = Integer.parseInt(br.readLine());
			}

			catch (NumberFormatException e)
			{
				System.out.println("잘못 입력하셨습니다.");
			}

			// ★ IOException 예외처리
			catch (IOException e)
			{
			}
		}
		while (Password.sel<1 || Password.sel>4);
		
	}// end mMenuSelect()


	public void mMenuRun() throws IOException // 메뉴 호출 메소드
	{
		// Password 인스턴스 생성
		Password pw = new Password();

		switch (Password.sel)	// 입력받은 값에 따라 실행
		{
			case Menus.E_ONE : mNote(); break;		// 요청사항 확인으로
			case Menus.E_TWO : mStorage(); break;	// 재고 관리로
			case Menus.E_THREE : mMoney(); break;	// 금고 관리로
			case Menus.E_FOUR :						// pw모드 선택으로
			{
				pw.modePrint();
				pw.modeSelect();
				pw.modeRun();
			} break;
		}
	}// end mMenuRun()


	// ☆☆☆미완성☆☆☆ (무한반복됨)
	public void mNote() throws IOException // 요청사항 확인 메소드
	{
		System.out.println(ISetup.sbNote);

		System.out.print("고객의 소리함을 비우시겠습니까? (Y/N) : ");
		Password.con = br.readLine().toUpperCase();
 
		if (Password.con.equals("Y"))	// Y 입력한 경우
		{								// 
			ISetup.sbNote.delete(0,ISetup.sbNote.length());
			System.out.println("고객의 소리함이 비워졌습니다");
		}
		
		mMenuPrint();	// 관리자 메뉴 출력으로
		mMenuSelect();
		mMenuRun();

	}// end mNote()


	public void mStorageSelect()
	{
		System.out.println();
		System.out.println("┌─────────────────────────────────────────┐");
		System.out.println("│                                         │");
		System.out.println("│                                         │");
		System.out.println("│       [메뉴 출력] (이전메뉴 : -1)       │");
		System.out.println("│                                         │");
		System.out.println("│            1. 재고 추가/삭제            │");
		System.out.println("│            2. 품목 추가/삭제            │");
		System.out.println("│            3. 용기 추가                 │");
		System.out.println("│                                         │");
		System.out.println("│                                         │");
		System.out.println("└─────────────────────────────────────────┘");
		System.out.println();
	}// end mStorageSelect()


	public void mStorage() throws IOException // 재고 관리 메소드
	{
		// Storagechange 인스턴스 생성
		MStorage stc = new MStorage();

		MStorageNew msn = new MStorageNew();

		mStorageSelect();	// 출력문 호출

		do	// 1~3 외에 다른 값을 넣으면 반복
		{
			System.out.print(">> 메뉴 선택(1~3) : ");

			Password.sel = Integer.parseInt(br.readLine());
		}
		while (Password.sel!=-1 && (Password.sel<1 || Password.sel>3));


		switch (Password.sel)	// 입력받은 값에 따라 실행
		{
			case Menus.E_MINUS :
			{
				mMenuPrint();
				mMenuSelect();
				mMenuRun();
			} break;
			case Menus.E_ONE :	// 재고 추가 / 삭제로
			{
				mStock();

				stc.mStorageChange();
			} break;
			case Menus.E_TWO :	// 품목 추가 / 삭제로
			{
				mStock();

				msn.mAddRemove();
			} break;
			case Menus.E_THREE :// 품목 추가 / 삭제로
			{
				stc.mBowlChange();
			} break;
			default : System.out.println("잘못 입력하셨습니다."); break;
		}

	}// end mStorage()

	public void mMoneySelect()
	{
		System.out.println();
		System.out.println("┌─────────────────────────────────────────┐");
		System.out.println("│                                         │");
		System.out.println("│                                         │");
		System.out.println("│              [메뉴 출력]                │");
		System.out.println("│                                         │");
		System.out.println("│          1. 시재                        │");
		System.out.println("│          2. 매출 확인 및 정산           │");
		System.out.println("│                                         │");
		System.out.println("│                                         │");
		System.out.println("└─────────────────────────────────────────┘");
		System.out.println();
	}// end mStorageSelect()

	public void mMoney() throws IOException // 재고 관리 메소드
	{
		MMoneyChange mmcg = new MMoneyChange();

		MMoneyCheck mmck = new MMoneyCheck();

		mMoneySelect();	// 출력문 호출

		do	// 1~2 외에 다른 값을 넣으면 반복
		{
			System.out.print(">> 메뉴 선택(1~2) : ");

			Password.sel = Integer.parseInt(br.readLine());
		}
		while (Password.sel<1 || Password.sel>2);
		

		switch (Password.sel)	// 입력받은 값에 따라 실행
		{
			case Menus.E_ONE :	// 시재로
			{
				mmcg.rightNowChange();
				mmcg.changeInput();
			} break;
			case Menus.E_TWO :	// 매출 확인 및 정산으로
			{
				mmck.mMoneyPrint();
				mmck.mMoneyCal();
			} break;
			default : System.out.println("잘못 입력하셨습니다."); break;
		}

	}// end mStorage()


	public void mStock()	// 현재 재고 출력 메소드
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