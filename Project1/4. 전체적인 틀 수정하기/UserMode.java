import java.util.Vector;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

class UserMode
{
	private static Scanner sc;
	private static BufferedReader br;

	public int pay;
	public int sumpay;			// ���Աݾ��� �����ؼ� ���� ����
	public int summoney;			// ������ �ݾ��� ����� ����

	static Password pw;


	static	// �ʱ�ȭ
	{
		// Scanner �ν��Ͻ� ���� 
		sc = new Scanner(System.in);

		br = new BufferedReader(new InputStreamReader(System.in));

		pw = new Password();
	}

	// �ϼ�
	// �޴� ��� �޼ҵ�
	public void uMenuPrint()
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
	public void uMenuSelect() throws IOException
	{
		do
		{
			Password.sel = sc.nextInt();
		}
		while ( Password.sel!=4646 && (Password.sel<1 || Password.sel>4) );
		// 4646�ƴϸ鼭, 1���� �۰� 4���� ũ�� �Է� �ٽ�.
	}


	// �ϼ�
	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public void uMenuRun() throws IOException
	{
		UPackageSalad ups = new UPackageSalad();

		UCustomSalad ucs = new UCustomSalad();

		URandomSalad urs = new URandomSalad();

		switch (Password.sel)
		{
			case Menus.E_ONE : uDecision(ups.uPackageSalad()); break;		
			case Menus.E_TWO : 
				{
					ucs.uCustomMenuSelect();
				} break;
			case Menus.E_THREE : 
				{
					urs.limitCal();
					urs.cancel();
					uDecision(urs.randomRun());
				} break;
			case Menus.E_FOUR : uNote();  break;
			case Menus.E_SECRETCODE : 
				{
					pw.inputPass();

					pw.modePrint();
					pw.modeSelect();
					pw.modeRun();
				}
				//�����ڷ� ���ư��¸޼ҵ�ȣ��;  break;		
		}
	}

	// ���ǼҸ� �޼ҵ�
	public void uNote() throws IOException
	{
		String note;

		System.out.println("������� �Ҹ��ԡ���");
		System.out.println("���Ͻô� ��û ������ �����ּ���");
		System.out.println();
		System.out.print("- ");
		note = br.readLine();

		ISetup.sbNote.append(note);
		ISetup.sbNote.append("\n");
		// ���� �ݺ�...?

		pw.modePrint();
		pw.modeSelect();
		pw.modeRun();
	}

	// ���� ������ ����� �޼ҵ� -> ���굵 �̷��������
	public void uDecision(Vector<Ingredient> temp) throws IOException
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


		summoney=0;	// �ݾ� �������� ���� ����
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
		Password.con = sc.next().toUpperCase();	

		// yes��� �����޼ҵ��, no�� �ܰ� 1��- 
		if (Password.con.equals("Y"))
			uPayRun(temp); 
			// uPayment(temp)
			// ���׽�Ʈ�Ϸ���,
		else if(!Password.con.equals("Y"))
		{
			System.out.println("��� �������� ���ư��ϴ�. ");
			// ������� ��Ƴ��� �� ����? ���������?
		}
	 }// end uDecision

	// ���� Ȯ�� �޼ҵ�
	// uPayment()������ temp ������ ������, uPayRun�� �Ѱ���� ��.
	// �Ű������� �ȹް� uDecision�� �ִ� temp�� ������ ����..?

	public void uPayment() throws IOException
	{
		// int pay = 0; //	���� �� �Է� ���� ����

		System.out.print("���� ����� �����ϼ��� (ī��/����)");
		Password.con = sc.next();
			if (Password.con.equals("����"))
			{
				System.out.print("������ �ݾ��� �Է��ϼ���."); 
				pay = sc.nextInt();
				
				if (pay == summoney)
				{
					System.out.print("������ �Ϸ� �Ǿ����ϴ�.");
					// uPayRun(Vector<Ingredient> temp);
				}
				else
				{
					// �Ž����� ����
					// �Ž����� ����
					System.out.print("�ܵ��� �����մϴ�. �̾ȿ�...");


					// �Ž����� �Ⱥ���
					System.out.print("������ �Ϸ� �Ǿ����ϴ�.");
					// uPayRun();

				}// end if 
			}
			else if (Password.con.equals("ī��"))
			{
				System.out.print("������ �Ϸ� �Ǿ����ϴ�.");
				// uPayRun();
			}
	}//end uPayment


	public void uPayRun(Vector<Ingredient> temp) // ������ �Ϸ�� �� ��. �����͸� ����?����?�ϴ� ���.
	{
		// �Ǹŵ� ������ ���� ī��Ʈ
		ISetup.countBowl++;

		// ��� ������ - : �����Ǽ� count �ϸ� �ɵ�.
		MStorage.bowl--;

		// PayRun ���� �Ѿ�� temp�� ��� �������� ����.
		// temp���� ��� �̸��� �̾Ƽ� String���� ����.
		// �׸��� ����.
		for (int i =0;i<temp.size();i++ )
			ISetup.payment.add(temp.get(i).name);

		// ����� temp���� ���� ������ ������ -


		// ���Թ��� �ݾ��� + 
		// sumpay += pay; 

	}//end uPayRun()

}
