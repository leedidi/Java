
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Password
{
	private static BufferedReader br;
	private static Integer sel;

	static
	{
		// BufferedReader 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화
		sel = 1;
	}

	public void modePrint()
	{
		System.out.println("1. 관리자 모드");
		System.out.println("2. 판매 모드");
		System.out.println("3. 종료");
		System.out.println();
		System.out.print(">> 메뉴 선택(1~3) : ");
	}

	public void modeSeclect() throws IOException
	{
		do
		{
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>3);
		
	}

	public void modeRun()
	{
		switch (sel)
		{
		case Menus.E_ONE : ???; break;
		case Menus.E_TWO : ???; break;
		case Menus.E_THREE : return;
		default : System.out.println(">> 메뉴 선택 오류~!!!"); break;
		}
	}
}