
import java.util.Scanner;
import java.io.IOException;

public class MStorageNew
{
	private static Scanner sc;
	private static ManagerMode mm;

	String name;
	int cate,num,kcal,money;

	static
	{
		 sc = new Scanner(System.in);

		 mm = new ManagerMode();
	}


	public void mAddRemove() throws IOException // ǰ�� �߰�/ ���� �޼ҵ�
	{
		//System.out.println("�ű� ǰ�� �߰�/���� ");

		System.out.println("�߰�, ������ ����� ��ȣ�� ������ �Է��ϼ���.");
		System.out.print("��� �߰� ��(+), ����(-) �� �Է� : ");
		Password.op = sc.next();

		//�ءءءءءءءءء� �߰�5 : MStorageNew.mAddRemove() - ���� ������ �׸� �ڽ� ����
		// ���� ������ �׸� ǥ���ϵ��� �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		/*
		System.out.println();
		System.out.println("��������������������������������������������������������");
		System.out.println("��                          ��");
		System.out.println("��    [���� ������ �׸�]    ��");
		System.out.println("��                          ��");
		mm.mStock();
		System.out.println("��                          ��");
		System.out.println("��������������������������������������������������������");
		System.out.println();
		*/

		System.out.println();
		System.out.println("    [���� ������ �׸�]    ");
		mm.mStock();
		System.out.println();

		switch (Password.op)
		{
			case "+" : mNewAdd(); break;
			case "-" : mNewRemove(); break;
		}
	}//end mAddRemove()


	public void mNewAdd() throws IOException // �߰� �޼ҵ�
	{
		System.out.print("���ο� ǰ���� ī�װ��� �Է����ּ��� : ");
		cate = sc.nextInt();

 		System.out.print("�� ǰ����� �Է����ּ��� : ");
		name = sc.next();

		System.out.print("�� ������ �Է����ּ���   : ");
		num = sc.nextInt();

		System.out.print("�� Į�θ��� �Է����ּ��� : ");
		kcal = sc.nextInt();

		System.out.print("�� �ݾ��� �Է����ּ���   : ");
		money = sc.nextInt();

			
		System.out.println();
		System.out.println(" [ǰ���] [����] [Į�θ�] [�ݾ�]");	
		System.out.printf("%5s %4d�� %4dkcal %5d��",name,num,kcal,money);

		System.out.println();
		System.out.print("������ �߰��Ͻðڽ��ϱ�? (Y/N) : ");
		Password.con = sc.next().toUpperCase();
 
		if (Password.con.equals("Y"))
		{
			ISetup.v.add(new Ingredient(cate,name,num,kcal,money));

			System.out.printf("\n<%s ǰ���� �߰��Ǿ����ϴ�.>\n",name);
		}
		else
		{
			System.out.println("�߰��� ��ҵǾ����ϴ�.");
		}						

	}//end mNewAdd()


	public void mNewRemove() throws IOException// ǰ�� ���� �޼ҵ�
	{	
		System.out.print("������ ǰ����� �Է����ּ��� : ");
		name = sc.next();

		for (int i=0; i<ISetup.v.size(); i++)
		{
			if (ISetup.v.get(i).name.equals(name))
			{	
				ISetup.v.remove(i);
				System.out.printf("\n<%s ǰ���� ���ŵǾ����ϴ�.>\n",name);
			}
		}

	}//end mNewRemove()

	// ǰ�� �߰�/���� ��� ����� �޼ҵ�
	public void mStorageNewReturn() throws IOException
	{

		System.out.print("ǰ�� �߰�/������ ��� �Ͻðڽ��ϱ�? (Y/N) : ");
		Password.con = sc.next().toUpperCase();

		Password pw = new Password();

		if (Password.con.equals("Y"))
			mAddRemove();
		else
			pw.modeRun();
		//else => ������ ���� ���� &&
	}//end mStorageNewReturn()

}//end class