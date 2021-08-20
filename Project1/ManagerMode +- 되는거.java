
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class ManagerMode 
{
	private static BufferedReader br;
	private static Integer sel;				//-- ���� ��
	private static String con;	

	static
	{
		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}

	public void mMenuPrint() // �޴� ��� �޼ҵ�
	{
		System.out.println("    [�޴� ���]");
		System.out.println("1. ��û���� Ȯ��");
		System.out.println("2. ��� ����");
		System.out.println("3. �ݰ� ����");
		System.out.println();
		System.out.print(">> �޴� ����(1~3) : ");

	}

	public void mMenuSelect() throws IOException// �޴� ���� �޼ҵ�
	{
		do
		{
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>3);
		
	}

	public void mMenuRun() throws IOException // �޴� ȣ�� �޼ҵ�
	{
		switch (sel)
		{
			case Menus.E_ONE : mNote(); break;
			case Menus.E_TWO : mStorage(); break;
			case Menus.E_THREE : mMoney(); break;
			default : System.out.println(">> �޴� ���� ����~!!!"); break;
		}
	}

	public void mNote() // ��û���� Ȯ�� �޼ҵ�
	{
		System.out.println("��û���� Ȯ�� �޼ҵ�");
	}


	public void mStorage() throws IOException // ��� ���� �޼ҵ�
	{
		System.out.print(">> �޴� ����(1~2) : ");

		int sel = Integer.parseInt(br.readLine());

		switch (sel)
		{
			case Menus.E_ONE : mStorageChange(); break;
			case Menus.E_TWO : mStorageNew(); break;
			default : System.out.println(">> �޴� ���� ����~!!!"); break;
		}

	}

	public void mStock()
	{
		// 1. ���� ��� ���(������ ���) - ������.. ����.. ��� ������(�ű�ǰ�� �߰������� ����)
		//    (��ȣ, ��ǰ��, ����)
		
		ISetup is = new ISetup();
		is.firstSet();

		System.out.println("\n    [��� ����]");
		System.out.println();
		System.out.println("�߰��������� ��� ����");
		System.out.println("-----------------------");
		System.out.println("    [��ä]");
		System.out.println();
		
		for (int n=0; n<is.vVeg.size(); n++)
		{	
			System.out.printf("%5s, %5d��\n", is.vVeg.get(n).name, is.vVeg.get(n).num);
			//System.out.print(is.vVeg.get(n).name + "    ");
			//System.out.println(is.vVeg.get(n).num);
		}
		//for�� - vVeg.get(0).name
		//v.leng
		
		System.out.println("-----------------------");
		System.out.println("    [����]");
		System.out.println();

		for (int n=0; n<is.vMain.size(); n++)
		{	
			System.out.printf("%5s, %5d��\n", is.vMain.get(n).name, is.vMain.get(n).num);
			//System.out.print(is.vVeg.get(n).name + "    ");
			//System.out.println(is.vVeg.get(n).num);
		}
		
		System.out.println("-----------------------");
		System.out.println("    [�ҽ���]");
		System.out.println();
		for (int n=0; n<is.vSource.size(); n++)
		{	
			System.out.printf("%5s, %5d��\n", is.vSource.get(n).name, is.vSource.get(n).num);
			//System.out.print(is.vVeg.get(n).name + "    ");
			//System.out.println(is.vVeg.get(n).num);
		}

		System.out.println("-----------------------");
		System.out.println("    [���η�]");
		System.out.println();
		// ���� �߰��� ���
		
	}

	public void mStorageChange() throws IOException // ��� �߰�/���� �޼ҵ�
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("��� �߰�/���� �޼ҵ�");
		/*
		1. ���� ��� ���
		2. �߰�(+), ����(-) ���� ���� �Է¹��� - �Է� do~while
		3. ����ȣ, ���� �Է¹��� - �Է�
		4. �߰� ���� Ȯ�� ���� ���
		5. �߰� ���� ���� �Է¹��� �� �Է�
		*/
		
		

		// 2. �߰�(+), ����(-) ���� ���� �Է¹���
		// --> �Է¿����� : �Է¿� ������ �ֽ��ϴ� ���. 
		//(���⼭ �Է¿�����? +/-, [����ȣ, �������� �ּҰ�~�ִ밪] �̿��� ���� �Է½�?)
		

		//1. �߰����� ����°�
		//2. ����°� �Է°� �޾ƿͼ� �����ϴ� �޼ҵ�

		char op;
		int num;
		int su;

		while(true) 
		{
			System.out.print("��Ḧ �߰��Ͻ÷��� (+), �����Ͻ÷��� (-) : "); // oper
			//op = (char)System.in.read();
			//op = sc.nextInt();
			op = (char)System.in.read();
			
			/*
			if (op == "+")
			{
				System.out.println();
			}
			else if (op == "-")
			{
				System.out.println();
			}
			*/
			
			if(op == '+' || op == '-') //����: ��� �߰�/������ +,- �� ��
			{
				break;  // ��� �Է�ĭ ���
			}
			System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n");
		}

		while (true)
		{
			System.out.print("��� ��ȣ : "); // num
			num = Integer.parseInt(br.readLine());

			if(num<20) //����: [����ȣ�� �ִ밪 �ʰ�] �Է½�
			{
				break;  // ��� �Է�ĭ ���
			}
			System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n");
		}
			

		while (true)
		{
			System.out.print("��� ���� : "); // su
			su = Integer.parseInt(br.readLine());

			if(su<20) // ����: [�������� �ִ밪 �ʰ�] �Է½�
			{
				break;  // ��� �Է�ĭ ���
			}
			System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n");
		
		}
		



		/*
		while (!scan.hasNextInt())
		{	
			scan.next();
			System.out.println("�Է¿� ������ �ֽ��ϴ�.");
		}
		*/

			//--> ��� �߰�, ���� ó�� ȭ������ ���ư�

		//3. �߰� ���� Ȯ�� ���� ���
		// 4. �߰�, ���� ����
		// -->> ��� �߰��Ǿ����ϴ� / �����Ǿ����ϴ� ���� ���
		
	/*
		if (op == "-")
		{
			System.out.println("\n��� �����Ͻðڽ��ϱ�? (Y/N)");
			String yn = sc.next();
			if(yn == "y" || yn == "Y")
				{
				// + ��� ���� ����	
				System.out.println("��ᰡ �����Ǿ����ϴ�.");
				}
				else if(yn == "n" || yn == "N")
				{
				// ó�� ȭ������,,,,,���� ���ư���,,,,? ����?
				System.out.println("��ҵǾ����ϴ�.");
				return;
				}
		}
			else
			{
				System.out.println("\n��� �߰��Ͻðڽ��ϱ�? (Y/N)");
				String yn = sc.next();
				if(yn == "y" || yn == "Y")
					{
					// + ��� �߰� ����	
					System.out.println("��ᰡ �߰��Ǿ����ϴ�.");
					}
					else if(yn == "n" || yn == "N")
					{
					// ó�� ȭ������,,,,,���� ���ư���,,,,?

					return;
					}
			}
		*/

		System.out.println("���Դϴ�.");

		// 
	}


	public void mStorageNew() // �ű� ǰ�� �߰�/���� �޼ҵ�
	{
		System.out.println("�ű� ǰ�� �߰�/���� �޼ҵ�");
	}


	public void mMoney() // �ݰ� ���� �޼ҵ�
	{
		System.out.println("�ݰ� ���� �޼ҵ�");
	}


	public void mMoneyChange() // ����
	{
		
	}


	public void mMoneyCheck() // ���� Ȯ��
	{
		
	}


	public void mMoneyCal() // ����
	{
		
	}


}