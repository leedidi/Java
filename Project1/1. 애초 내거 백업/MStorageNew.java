import java.util.Scanner;
import java.io.IOException;

public class MStorageNew
{
	Scanner sc = new Scanner(System.in);
	ISetup is = new ISetup();

	int cate;
	String real;
	String name;
	int num,kcal,money;

	public void mAddRemove() throws IOException // ǰ�� �߰�/ ���� �޼ҵ�
	{
		String op;

		System.out.println("�ű� ǰ�� �߰�/���� ");

		System.out.println("�߰�, ������ ����� ��ȣ�� ������ �Է��ϼ���.");
		System.out.print("��� �߰� ��(+), ����(-) �� �Է� : ");
		op = sc.next();

		
		// ���� ������ �׸� ǥ���ϵ��� �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		System.out.println();
		System.out.println("��������������������������������������������������������");
		System.out.println("��                          ��");
		System.out.println("��    [���� ������ �׸�]    ��");
		System.out.println("��                          ��");
		System.out.println("��                          ��");
		System.out.println("��������������������������������������������������������");
		System.out.println();
		System.out.println("ī�װ��� �����ϼ���.");
		System.out.println(" 1. ��ä \n 2. ����\n 3. �ҽ�\n 4. ����");
		System.out.print("ī�װ��� �Է��ϼ��� : ");
		cate = sc.nextInt();

		switch (op)
		{
			case "+" : mNewAdd(); break;
			case "-" : mNewRemove(); break;
		}
	}


	 public void mNewAdd() throws IOException // �߰� �޼ҵ�
	 {
		is.firstSet();	//	�ٲپߴ�~!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

 		System.out.print("���ο� ǰ����� �Է����ּ��� : ");
		name = sc.next();

		System.out.print("������ �Է����ּ��� : ");
		num = sc.nextInt();

		System.out.print("Į�θ��� �Է����ּ��� : ");
		kcal = sc.nextInt();

		System.out.print("�ݾ��� �Է����ּ��� : ");
		money = sc.nextInt();
			
		System.out.println();
		System.out.println(" [ǰ���] [����] [Į�θ�] [�ݾ�]");	
		System.out.printf("%5s %5d %7d %6d��",name,num,kcal,money);

		System.out.println();
		System.out.print("������ �߰��Ͻðڽ��ϱ�? (Y/N) : ");
		real = sc.next();
 
		if (real.equals("y")||real.equals("Y"))	// toUpperCase??�� �ٲٱ� �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		{
			switch (cate)		// ���߿� ����
			{
				case Menus.E_ONE: // ��ä
				{
					//��¥ �߰� 
					is.vVeg.add(new Ingredient(name,num,kcal,money));

					System.out.printf("%sǰ���� �߰��Ǿ����ϴ�.\n",name);

					//�׽�Ʈ
					for (int i=0; i<is.vVeg.size();i++)
							System.out.print(is.vVeg.get(i).name + " ");

				} break;

				case Menus.E_TWO: // ����
				{
					//��¥ �߰� 
					is.vMain.add(new Ingredient(name,num,kcal,money));

					System.out.printf("%sǰ���� �߰��Ǿ����ϴ�.\n",name);

					for (int i=0; i<is.vMain.size();i++)
							System.out.print(is.vMain.get(i).name + " ");

				} break;

				case Menus.E_THREE: // �ҽ�
				{
					//��¥ �߰� 
					is.vSource.add(new Ingredient(name,num,kcal,money));

					System.out.printf("%sǰ���� �߰��Ǿ����ϴ�.\n",name);

					for (int i=0; i<is.vSource.size();i++)
							System.out.print(is.vSource.get(i).name + " ");	

				} break;

				case Menus.E_FOUR: // ����
				{

					//��¥ �߰� 
					is.vTop.add(new Ingredient(name,num,kcal,money));

					System.out.printf("%sǰ���� �߰��Ǿ����ϴ�.\n",name);

					for (int i=0; i<is.vTop.size();i++)
							System.out.print(is.vTop.get(i).name + " ");

				} break;
			}

		}// end if

		else
		 {
			System.out.println("�߰��� ��ҵǾ����ϴ�");
		 }

				System.out.println();
				System.out.print("ǰ�� �߰�/������ ��� �Ͻðڽ��ϱ�? (Y/N) : ");
				real = sc.next();

				Password pw = new Password();		// �ӽ÷� �����Ѱ�, ���� �ű��ڡڡڡڡڡڡڡڡڡڡڡڡ�

				if (real.equals("y")||real.equals("Y"))
					mAddRemove();
				else
					pw.modeRun();
				//else => ������ ���� ���� &&
						
					
	 }//end mNewAdd() => �ϼ� &&�����ʿ�/ ���� �ʱ�ȭ �ذ�
	 
	public void mNewRemove() throws IOException// ǰ�� ���� �޼ҵ�
	{	
		is.firstSet();
		//������

		System.out.print("������ ǰ����� �Է����ּ��� : ");
		String str = sc.next();

		switch (cate) //ī�װ� 
		{
			case Menus.E_ONE :		// ��ä ����
			{
				for (int i=0; i<is.vVeg.size(); i++)
				{
					if (is.vVeg.get(i).name.equals(str))
					{	
						is.vVeg.remove(i);
						System.out.printf("%sǰ���� ���ŵǾ����ϴ�.",str);
						break;
					}

					if (i==is.vVeg.size()-1)
						System.out.print("�߸� �Է��߽��ϴ�.");

				} 
				
			} break;
		

			case Menus.E_TWO :		// ���� ����
			{
				for (int i=0; i<is.vMain.size(); i++)
				{
					if (is.vMain.get(i).name.equals(str))
					{	
						is.vMain.remove(i);
						System.out.printf("%sǰ���� ���ŵǾ����ϴ�.",str);
						break;
					} 

					if (i==is.vMain.size()-1)
						System.out.print("�߸� �Է��߽��ϴ�.");
						
				} 
				
			} break;

			case Menus.E_THREE :	// �ҽ� ����
			{
				for (int i=0; i<is.vSource.size(); i++)
				{
					if (is.vSource.get(i).name.equals(str))
					{	
						is.vSource.remove(i);
						System.out.printf("%sǰ���� ���ŵǾ����ϴ�.",str);
						break;
					} 

					if (i==is.vSource.size()-1)
						System.out.print("�߸� �Է��߽��ϴ�.");

				}
				
			} break;

			case Menus.E_FOUR :		// ���� ����
			{
				for (int i=0; i<is.vTop.size(); i++)
				{
				if (is.vTop.get(i).name.equals(str))
					{	
						is.vTop.remove(i);
						System.out.printf("%sǰ���� ���ŵǾ����ϴ�.",str);
						break;
					} 

					if (i==is.vTop.size()-1)
						System.out.print("�߸� �Է��߽��ϴ�.");
			
				} 
				
			} break;
		}

		System.out.println();
		System.out.print("ǰ�� �߰�/������ ��� �Ͻðڽ��ϱ�? (Y/N) : ");
		real = sc.next();

		Password pw = new Password();		// �ӽ÷� �����Ѱ�, ���� �ű��ڡڡڡڡڡڡڡڡڡڡڡڡ�

		if (real.equals("y")||real.equals("Y"))
			mAddRemove();
		else
			pw.modeRun();

	}

}//end class
