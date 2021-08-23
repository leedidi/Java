
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class TestCode 
{

	private static BufferedReader br;
	private static Integer sel;				//-- ���� ��

	static
	{
		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
	}

	// �ݰ� ���� �޼ҵ�
	
	public void mMoneySelect()	// �ݰ� ���� �޴� ��� �޼ҵ�
	{
		System.out.println();
		System.out.println("    [�޴� ���]");
		System.out.println();
		System.out.println("1. ����");
		System.out.println("2. ���� Ȯ��");
		System.out.println();
	}

	public void mMoney() throws IOException
	{
		// MMoneychange, MMoneyCheck �ν��Ͻ� ����
		//MMoneyChange mmc = new MMoneyChange();
		MMoneyCheck mmck = new MMoneyCheck();
		mMoneySelect();

		// 1~2 �ܿ� �ٸ� ���� ������ �ݺ�
		do
		{
			System.out.print(">> �޴� ����(1~2) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>2);
		
		// �Է¹��� ���� ���� ����
		switch (sel)
		{
			case Menus.E_ONE :				// 1. ����� �̵�
			{
				System.out.print("�׽�Ʈ1");

			} break;
			case Menus.E_TWO :				// 2. ���� Ȯ������ �̵�
			{
				mmck.mMoneyPrint();
				mmck.mMoneyCal();

			} break;		
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); break;
		}

	}
}
