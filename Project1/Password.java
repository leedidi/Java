
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Password
{
	private static BufferedReader br;
	private static Integer sel;

	static
	{
		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
	}

	public void modePrint()
	{
		System.out.println("1. ������ ���");
		System.out.println("2. �Ǹ� ���");
		System.out.println("3. ����");
		System.out.println();
		System.out.print(">> �޴� ����(1~3) : ");
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
		default : System.out.println(">> �޴� ���� ����~!!!"); break;
		}
	}
}