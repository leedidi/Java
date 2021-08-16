/*====================================================
  �����÷��� ������ ��ũ collection Framework����
======================================================*/
//�۽ǽ�����
//Test159 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�

/*
���� ��)
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 1

	1��° ��� �Է� : �չ���
	1��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N)? Y

	1��° ��� �Է� : ���±�
	1��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N)? N

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 2

	[���� ��ü ���]
		�չ���
		���±�
	���� ��ü ��� �Ϸ�~!!!

		[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3
	
	�˻��� ��� �Է� : ����ȭ

	[�˻� ��� ���]
	�׸��� �������� �ʽ��ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 3

	�˻��� ��� �Է�: �չ���

	[�˻� ��� ���]
	�׸��� �����մϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : ���ش�

	[���� ��� ���]
	�׸��� �������� �ʾ� ������ �� �����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 4

	������ ��� �Է� : ���±�

	[���� ��� ���]
	���±� �׸��� �����Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : ������

	[���� ��� ���]
	������ ����� �������� �ʽ��ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : �չ���
	������ ���� �Է� : ������

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6) : 6
	
	���α׷� ����
	����Ϸ��� �ƹ� Ű�� ��������...

*/
import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus //�ϼ�
{
	public static final int E_ADD =1;
	public static final int E_DISP =2;
	public static final int E_FIND =3;
	public static final int E_DEL =4;
	public static final int E_CHA =5;
	public static final int E_EXIT =6;

}

public class Test159_C
{
	//�ֿ� �Ӽ� ����
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel; //���� ��
	private static String con; //��� ����

	//static �ʱ�ȭ ��
	static
	{
		//vertor �ڷ� ���� ����
		vt = new Vector<Object>();
		
		//BufferedReader �ν��Ͻ� ����
		 br=new BufferedReader(new InputStreamReader(System.in));

		//����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}

	//�޴� ��� �޼ҵ�
	public static void menuDisp()
	{
	System.out.println("\n[�޴�����]");	
	System.out.println("1.��� �߰�");	
	System.out.println("2.��� ���");	
	System.out.println("3.��� �˻�");	
	System.out.println("4.��� ����");	
	System.out.println("5.��� ����");	
	System.out.println("6.����");	
	}

	//�޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException
	{
	System.out.print(">>�޴� ����(1~6) : ");	
	do
	{
	sel = Integer.parseInt(br.readLine());
	}
	while (sel<Menus.E_ADD || sel > Menus.E_EXIT);
	}

	//���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
	switch(sel)	
		{
		case Menus.E_ADD : addElement();break;	
		case Menus.E_DISP : dispElement();break;	
		case Menus.E_FIND : findElement();break;	
		case Menus.E_DEL : delElement();break;	
		case Menus.E_CHA : chaElement();break;	
		case Menus.E_EXIT : exit();break;	

		}
	}
	//��� �߰� �޼ҵ�
	public static void addElement() throws IOException
	{
		String name;
		int i = vt.size(); //vt�� ����� ���� ��ȯ�ϴ� �޼ҵ�

		do
		{
			System.out.printf("%d��° ��� �Է� : ",++i);
			name = br.readLine();
			vt.add(name);

			System.out.printf("\n%d��° ��� �Է� ����\n",i);

			System.out.print("��� �Է� ���(Y/N)? : ");

			con = br.readLine();

		}
		while (con.equals("Y") || con.equals("y"));
	}
	//��� ��� �޼ҵ�
	public static void dispElement() 
	{
			System.out.println("[��� ��ü ���]");
			for(int i=0; i< vt.size(); i++)
			System.out.printf("%s \n", vt.get(i));
			System.out.println("��� ��ü ��� �Ϸ�");
	}
	//��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		String findName ="";
		System.out.print("�˻��� ��� �Է� : ");
		findName = br.readLine();

		if(vt.contains(findName)==true)

		System.out.println("�׸��� �����մϴ�");
		else
		System.out.println("�׸��� �������� �ʽ��ϴ�");

	}
	//��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		String result ="";
		System.out.print("������ ��� �Է� : ");
		
		//������ ��� ã��
		String del = br.readLine();
		int delSite = vt.indexOf(del);

		if(delSite<0)
		result = "�׸��� �������� �ʾ� ������ �� �����ϴ�.";
		
		else
		{
		vt.remove(delSite);
		result = del+"�׸��� �����Ǿ����ϴ�.";
		}

		System.out.println("[���� ��� ���]");
		System.out.println(result);
	}
	
	//��� ����(����) �޼ҵ� 
	public static void chaElement() throws IOException
	{
	String chaName ="";
	System.out.print("������ ��� �Է� : ");
	chaName = br.readLine();
	String temp;

	if(vt.contains(chaName)!= true)
		{
		System.out.println("[���� ��� ���]");
		System.out.println("������ ����� �������� �ʽ��ϴ�.");
		}
	else
		{
		System.out.print("������ ���� �Է� : ");
		String newName = br.readLine();

		vt.set(vt.indexOf(chaName),newName);
		
		System.out.println("[���� ��� ���]");
		System.out.println("������ �Ϸ� �Ǿ����ϴ�.");

		}

	}
	
	//���α׷� ���� �޼ҵ�--�ϼ� 
	public static void exit()
	{
    	System.out.println("\t���α׷� ����");
		System.exit(-1);
	}
	//main() �޼ҵ� --�ϼ�
	public static void main(String[] args) throws IOException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}
}