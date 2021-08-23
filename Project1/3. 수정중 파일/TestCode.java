
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class TestCode 
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

	// 금고 관리 메소드
	
	public void mMoneySelect()	// 금고 관리 메뉴 출력 메소드
	{
		System.out.println();
		System.out.println("    [메뉴 출력]");
		System.out.println();
		System.out.println("1. 시제");
		System.out.println("2. 매출 확인");
		System.out.println();
	}

	public void mMoney() throws IOException
	{
		// MMoneychange, MMoneyCheck 인스턴스 생성
		//MMoneyChange mmc = new MMoneyChange();
		MMoneyCheck mmck = new MMoneyCheck();
		mMoneySelect();

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
			case Menus.E_ONE :				// 1. 시재로 이동
			{
				System.out.print("테스트1");

			} break;
			case Menus.E_TWO :				// 2. 매출 확인으로 이동
			{
				mmck.mMoneyPrint();
				mmck.mMoneyCal();

			} break;		
			default : System.out.println("잘못 입력하셨습니다."); break;
		}

	}
}
