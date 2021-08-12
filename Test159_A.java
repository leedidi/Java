/*=====================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=====================================================*/
/*
�� �ǽ� ����
Test159 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

���� ��)

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6): 1

	1��° ��� �Է�: �չ���
	1��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N)?: Y

	2��° ��� �Է�: ���±�
	2��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N)?: n

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6): 2

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
	>> �޴� ����(1~6): 3

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
	>> �޴� ����(1~6): 3

	�˻��� ��� �Է� : �չ���

	[�˻� ��� ���]
	�׸��� �����մϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6): 4

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
	>> �޴� ����(1~6): 4

	������ ��� �Է�: ���±�

	[���� ��� ���]
	���±� �׸��� �����Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6): 5

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
	>> �޴� ����(1~6): 5

	������ ��� �Է� : �չ���
	������ ���� �Է� : ������

	[���� ��� ���]
	������ �Ϸ�Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1~6): 6

	���α׷� ����~!!!
	����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus		//-- �ϼ�
{
	public static final int E_ADD  = 1;		//--��� �߰�
	public static final int E_DISP = 2;		//--��� ���
	public static final int E_FIND = 3;		//--��� �˻�
	public static final int E_DEL  = 4;		//--��� ����
	public static final int E_CHA  = 5;		//--��� ����
	public static final int E_EXIT = 6;		//--����
}



public class Test159_A
{
	// �ֿ� �Ӽ� ���� -- �ϼ�
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;				//-- ����� ���� ��
	private static String con;				//-- ��� ����



	// static �ʱ�ȭ ��
	static
	{
		// Vector �ڷᱸ�� ����
		vt = new Vector<Object>();

		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է� �� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}


	// �޴� ��� �޼ҵ�
	public static void menuDisp()
	{
		System.out.println();
		System.out.println("[�޴� ����]");
		System.out.println("1. ��� �߰�");
		System.out.println("2. ��� ���");
		System.out.println("3. ��� �˻�");
		System.out.println("4. ��� ����");
		System.out.println("5. ��� ����");
		System.out.println("6. ����");
		System.out.println();
	}


	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException
	{		
		System.out.print(">> �޴� ����(1~6): ");
		sel = Integer.parseInt(br.readLine());
	}


	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
		switch (sel)
		{
			case Menus.E_ADD  : addElement(); break;
			case Menus.E_DISP : dispElement(); break;
			case Menus.E_FIND : findElement(); break;
			case Menus.E_DEL  : delElement(); break;
			case Menus.E_CHA  : chaElement(); break;
			case Menus.E_EXIT : exit(); break;
		}
	}


	// ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		System.out.println();
		System.out.printf("%d��° ��� �Է�: ", vt.size()+1);
		vt.add(br.readLine());

		System.out.printf("%d��° ��� �Է� ����~!!!\n", vt.size());		//<<<<<<<<

		do
		{
			System.out.print("��� �Է� ���(Y/N)?: ");
			con = br.readLine();
		}
		while (con!="Y" || con!=" y" || con!="N" || con!="n");
		
		if (con.equals("Y") || con.equals("y"))
			addElement();
	}


	// ��� ��� �޼ҵ�
	public static void dispElement()
	{
		System.out.println();
		System.out.println("[���� ��ü ���]");

		for (int i=0; i<vt.size(); i++)
			System.out.printf("\t%s\n", vt.get(i));	
		
		System.out.println("���� ��ü ��� �Ϸ�~!!!");

		//for (Object obj : vt)									//<<<<<<<<<<
		//	System.out.printf("\t%s\n", vt);			
	}

	// ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		System.out.println();
		System.out.print("�˻��� ��� �Է�: ");
		int idx = vt.indexOf(br.readLine());

		System.out.println();
		System.out.println("[�˻� ��� ���]");
		if (idx<0)
			System.out.println("�׸��� �������� �ʽ��ϴ�.");
		else 
			System.out.println("�׸��� �����մϴ�.");
	}

	// ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		System.out.println();
		System.out.print("������ ��� �Է�: ");
		String ele = br.readLine();
		
		System.out.println("\n[���� ��� ���]");
		if (vt.contains(ele))
		{			
			int idx = vt.indexOf(ele);
			vt.remove(idx);
			System.out.printf("%s �׸��� �����Ǿ����ϴ�.\n", ele);
		}
		else
			System.out.println("�׸��� �������� �ʾ� ������ �� �����ϴ�.");
	}

	// ��� ����(����)�޼ҵ�
	public static void chaElement() throws IOException
	{
		System.out.print("������ ��� �Է�: ");
		String ele = br.readLine();
		
		if (vt.contains(ele))
		{
			System.out.print("������ ���� �Է�: ");
			String chaEle = br.readLine();

			int idx = vt.indexOf(ele);
			vt.set(idx, chaEle);

			System.out.println("\n[���� ��� ���]");
			System.out.println("������ �Ϸ�Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("\n[���� ��� ���]");
			System.out.println("������ ��� �������� �ʽ��ϴ�.");
		}
	}

	// ���α׷� ���� �޼ҵ� -- �ϼ�
	public static void exit()
	{
		System.out.println("\t���α׷� ����~!!!");
		System.exit(-1);
	}

	// main() �޼ҵ� -- �ϼ�
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