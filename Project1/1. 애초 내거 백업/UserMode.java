import java.util.Vector;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

class UserMode
{
	private static Integer sel;			// ���� ���� ���� ����
	private static String con;			// ���� ���� ���� ����
	private static Scanner sc;
	static Vector<String> vNote = new Vector<String>();

	static	// �ʱ�ȭ
	{
		// Scanner �ν��Ͻ� ���� 
		sc = new Scanner(System.in);

	}

	// �ϼ�
	// �޴� ��� �޼ҵ�
	public static void uMenuPrint()
	{
		System.out.println();
		System.out.println("1 . ��Ű¡ ������ ");
		System.out.println("2 . Ŀ���� ������");
		System.out.println("3 . ���� ������");
		System.out.println("4 . ���� �Ҹ�");
		System.out.println();
		System.out.print(">> �޴� ����(1~4) : ");
	}

	// �ϼ�
	// �޴� ���� �޼ҵ�
	public static void uMenuSelect() throws IOException
	{
		do
		{
			sel = sc.nextInt();
		}
		while ( sel!=4646 && (sel<1 || sel>4) );
		// 4646�ƴϸ鼭, 1���� �۰� 4���� ũ�� �Է� �ٽ�.
	}


	// �ϼ�
	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void uMenuRun() throws IOException
	{
		Password pw = new Password();

		UPackageSalad ups = new UPackageSalad();

		UCustomSalad ucs = new UCustomSalad();

		URandomSalad urs = new URandomSalad();

		switch (sel)
		{
			case Menus.E_ONE : 
				{
					uDecision(ups.uPackageSalad());
				} break;		
			case Menus.E_TWO   :
				{
					uDecision(ucs.CustomRun());
				} break;
			case Menus.E_THREE : 
				{
					urs.limitCal();
					urs.cancel();
					uDecision(urs.randomRun());
				} break;
			case Menus.E_FOUR  : uNote();  break;		
			case Menus.E_SECRETCODE : 
				{
					pw.inputPass();

					pw.modePrint();
					pw.modeSelect();
					pw.modeRun();
				};
				//�����ڷ� ���ư��¸޼ҵ�ȣ��;  break;		
		}
	}

	// ���ǼҸ� �޼ҵ�
	public static void uNote() throws IOException
	{
		Password pw = new Password();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String test;

		System.out.println("������� �Ҹ��ԡ���");
		System.out.println("���Ͻô� ��û ������ �����ּ���");
		System.out.println();
		System.out.print("- ");
		test = br.readLine();

		vNote.add(test);

		System.out.println(vNote.get(0));


		pw.modeRun();

	}

	// ���� ������ ����� �޼ҵ� -> ���굵 �̷��������
	public static void uDecision(Vector<Ingredient> temp) throws IOException
	{
		// ������ ���� ����..���ͷ� �޾Ƽ� ȭ�鿡 ���
		System.out.println("=============================");

		System.out.print("��� : ");
		for (int i=0; i<temp.size(); i++)
			System.out.printf("%s ", temp.get(i).name);
		System.out.println();

		
		int sumkcal=0;	// Į�θ� �������� ���� ����
		for (int i=0; i<temp.size(); i++)
			sumkcal += temp.get(i).kcal;
		System.out.printf("Į�θ� : %dKcal\n", sumkcal);

		
		int summoney=0;	// �ݾ� �������� ���� ����
		for (int i=0; i<temp.size(); i++)
			summoney += temp.get(i).money;
		System.out.printf("�ݾ� : %d��\n", summoney);

		
		// System.out.printf("������� : %d�ϱ���...\n", ��);
		Calendar rightNow = Calendar.getInstance();		// Ķ���� Ŭ���� ����

		int y = rightNow.get(Calendar.YEAR);
		int m = rightNow.get(Calendar.MONTH) + 1;
		int d = rightNow.get(Calendar.DATE);
		System.out.printf("�������� : %d-%d-%d�� \n", y, m, d);	

		
		int n = (temp.get(0).name == "����") ?  3 : 5;
		rightNow.add(Calendar.DATE, n);
		//	get(i)�� ���� �ε������� ���� ��������� ���÷κ��� �߰�
		//	���� true �� 3
		//	���� false �� 5


		y = rightNow.get(Calendar.YEAR);
		m = rightNow.get(Calendar.MONTH)+1;
		d = rightNow.get(Calendar.DATE);
		System.out.printf("������� : %d-%d-%d�ϱ���...\n", y, m, d);
		System.out.println("=============================");




		// ���� (���±��� ���� ������ �Ҳ��� ������)
		System.out.print("���� �Ͻðڽ��ϱ�? (Y/N) : ");
		con = sc.next().toUpperCase();	
		
		// yes��� �����޼ҵ��, no�� �ܰ� 1��- 
		if (con.equals("Y"))
			// uPayment()
			System.out.println("uPayment");
		else if (!con.equals("Y"))
		{
			System.out.println("��� �������� ���ư��ϴ�. ");
			// ������� ��Ƴ��� �� ����? ���������?
		}
		 
	}// end uDecision
	
	// MMoneyCheck���� �ʿ��� ��Ż �ݾװ� Į�θ� ���...
	/*
	public void uPayTotal()
	{
		
	}
	*/

	// ���� Ȯ�� �޼ҵ�
	public static void uPayment() throws IOException
	{
		/*
		int pay = 0; //	���� �� �Է� ���� ����

		System.out.print("���� ����� �����ϼ��� (ī��/����)");
		con = sc.next();
			if (con.equals("����"))
			{
				System.out.println("������ ������ ������ ������ �Է��ϼ���"); 
				System.out.println("����, ��õ��, õ��, �����, ��� (����� ����) : ");
				money[0] = sc.nextInt();
				money[1] = sc.nextInt();
				money[2] = sc.nextInt();
				money[3] = sc.nextInt();
				money[4] = sc.nextInt();
				
				for (int i=0; i<5; i++)
					pay += money[i]*bill[i];
				
				if (pay == summoney)
				{
					System.out.print("������ �Ϸ� �Ǿ����ϴ�.");
					// ���, ��� ���� -ó��.
				}
				else
				{
					// �Ž����� ����
					// �Ž����� ����
					System.out.print("�ܵ��� �����մϴ�. �̾ȿ�...");
					
					// �Ž����� �Ⱥ���
					System.out.print("������ �Ϸ� �Ǿ����ϴ�.");
					// ���, ��� ���� -ó��.
				
				}// end if 
			}
			else if (con.equals("ī��"))
			{
				System.out.print("������ �Ϸ� �Ǿ����ϴ�.");
				// ���, ��� ���� - ó��
			}
		*/

	}//end uPayment


}
