
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Password
{
	private static BufferedReader br;
	public static Integer sel;
	public static String op;
	public static String con;

	// static �ʱ�ȭ ��
	static
	{
		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		op = "+";
		con = "Y";
	}

	// �н����� �Է� �޼ҵ�
	public void inputPass() throws IOException
	{
		// �н�����, �Է�Ƚ�� ����
		int pass;
		int count=1;

		// �н����� �Է½� �ݺ��� ����������
		// 5ȸ �̻� �Է� ���н� ���α׷� ����
		do
		{
			System.out.println("\t �Ϸ�~ Power On ");
			System.out.println("===============================");
			System.out.print("�н����带 �Է��ϼ��� (Hint_ �츮�� ó�� ���� �� ��) : ");
			pass = Integer.parseInt(br.readLine());
			count++;
			if (count>5)
			{
				System.out.println("�Է�Ƚ���� �ʰ��Ͽ����ϴ�.");
				exit();
			}
		}
		while (pass != 210714);
	}

	
	//�ءءءءءءءءء� �߰�1: Password.modePrint() - �ڽ� �߰� (�Ϸ��)
	public void modePrint() // �޴� ��� �޼ҵ�
	{

		System.out.println();
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.println("��                                         ��");
		System.out.println("��             [�޴� ���]		  ��");
		System.out.println("��                                         ��");
		System.out.println("��            1. ������ ���               ��");
		System.out.println("��            2. �Ǹ� ���                 ��");
		System.out.println("��            3. ����                      ��");
		System.out.println("��                                         ��");
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.println();
		/*
		System.out.println();
		System.out.println("1. ������ ���");
		System.out.println("2. �Ǹ� ���");
		System.out.println("3. ����");
		System.out.println();
		*/
	}

	public void modeSelect() throws IOException // �޴� ���� �޼ҵ�
	{
		// 1~3 �ܿ� �ٸ� ���� ������ �ݺ�
		do
		{
			System.out.print(">> �޴� ����(1~3) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>3);
		
	}

	public void modeRun() throws IOException // �޴� ȣ�� �޼ҵ�
	{
		// ManagerMode �ν��Ͻ� ����
		ManagerMode mm = new ManagerMode();
		
		UserMode um = new UserMode();

		// �Է¹��� ���� ���� ����
		switch (sel)
		{
			case Menus.E_ONE :						// ������ ����
				{
					mm.mMenuPrint();
					mm.mMenuSelect();
					mm.mMenuRun();
				}
				break;
			case Menus.E_TWO :						// �Ǹ� ����
				{
					um.uMenuPrint();
					um.uMenuSelect();
					um.uMenuRun();
				}
				break;				
			case Menus.E_THREE : exit(); break;		// ���α׷� ����
			default : System.out.println(">> �޴� ���� ����~!!!"); break;
		}

	}

	public void exit() // �ý��� ���� �޼ҵ�
	{
		System.out.println();
		System.out.println("���α׷� ����");
		System.exit(-1);
	}

}