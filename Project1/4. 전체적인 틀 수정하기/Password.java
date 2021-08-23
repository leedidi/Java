
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Password
{
	private static BufferedReader br;
	public static Integer sel;
	public static String op;
	public static String con;

	// static 초기화 블럭
	static
	{
		// BufferedReader 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화
		sel = 1;
		op = "+";
		con = "Y";
	}

	// 패스워드 입력 메소드
	public void inputPass() throws IOException
	{
		// 패스워드, 입력횟수 변수
		int pass;
		int count=1;

		// 패스워드 입력시 반복문 빠져나오고
		// 5회 이상 입력 실패시 프로그램 종료
		do
		{
			System.out.println("\t 뾰롱~ Power On ");
			System.out.println("===============================");
			System.out.print("패스워드를 입력하세요 (Hint_ 우리가 처음 만난 날 ☆) : ");
			pass = Integer.parseInt(br.readLine());
			count++;
			if (count>5)
			{
				System.out.println("입력횟수를 초과하였습니다.");
				exit();
			}
		}
		while (pass != 210714);
	}

	
	//※※※※※※※※※※ 추가1: Password.modePrint() - 박스 추가 (완료★)
	public void modePrint() // 메뉴 출력 메소드
	{

		System.out.println();
		System.out.println("┌─────────────────────────────────────────┐");
		System.out.println("│                                         │");
		System.out.println("│             [메뉴 출력]		  │");
		System.out.println("│                                         │");
		System.out.println("│            1. 관리자 모드               │");
		System.out.println("│            2. 판매 모드                 │");
		System.out.println("│            3. 종료                      │");
		System.out.println("│                                         │");
		System.out.println("└─────────────────────────────────────────┘");
		System.out.println();
		/*
		System.out.println();
		System.out.println("1. 관리자 모드");
		System.out.println("2. 판매 모드");
		System.out.println("3. 종료");
		System.out.println();
		*/
	}

	public void modeSelect() throws IOException // 메뉴 선택 메소드
	{
		// 1~3 외에 다른 값을 넣으면 반복
		do
		{
			System.out.print(">> 메뉴 선택(1~3) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>3);
		
	}

	public void modeRun() throws IOException // 메뉴 호출 메소드
	{
		// ManagerMode 인스턴스 생성
		ManagerMode mm = new ManagerMode();
		
		UserMode um = new UserMode();

		// 입력받은 값에 따라 실행
		switch (sel)
		{
			case Menus.E_ONE :						// 관리자 모드로
				{
					mm.mMenuPrint();
					mm.mMenuSelect();
					mm.mMenuRun();
				}
				break;
			case Menus.E_TWO :						// 판매 모드로
				{
					um.uMenuPrint();
					um.uMenuSelect();
					um.uMenuRun();
				}
				break;				
			case Menus.E_THREE : exit(); break;		// 프로그램 종료
			default : System.out.println(">> 메뉴 선택 오류~!!!"); break;
		}

	}

	public void exit() // 시스템 종료 메소드
	{
		System.out.println();
		System.out.println("프로그램 종료");
		System.exit(-1);
	}

}