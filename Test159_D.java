/*======================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework)����
======================================================*/

// �� �ǽ� ����
// Test159 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

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
	��� �Է� ���(Y/N)? : Y

	2��° ��� �Է� : ���±�
	2��° ��� �Է� ����~!!!
	��� �Է� ���(Y/N)? : n

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
	4. ��� ����
	6. ����
	>> �޴� ����(1~6) : 5

	������ ��� �Է� : �չ���
	������ ���� �Է� : ������

	[���� ��� ���]
	������ �Ϸ�Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	4. ��� ����
	6. ����
	>> �޴� ����(1~6) : 6

	���α׷� ����
	����Ϸ��� �ƹ� Ű�� ��������...
  
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus		//-- �ϼ�
{
	public static final int E_ADD = 1;		//-- ��� �߰�
	public static final int E_DISP = 2;		//-- ��� ���
	public static final int E_FIND = 3;		//-- ��� �˻�
	public static final int E_DEL = 4;		//-- ��� ����
	public static final int E_CHA = 5;		//-- ��� ����
	public static final int E_EXIT = 6;		//-- ����
}



public class Test159_D
{
	// �ֿ� �Ӽ� ����
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;			//-- ���� ��
	private static String con;			//-- ��� ����

	// static �ʱ�ȭ ��
	static
	{
		// Vector �ڷᱸ�� ����;
		vt = new Vector<Object>();

		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";

	}

	// �޴� ��� �޼ҵ�
	public static void menuDisp()
	{
		//[�޴� ����]
		//1. ��� �߰�
		//2. ��� ���
		//3. ��� �˻�
		//4. ��� ����
		//5. ��� ����
		//6. ����
		 
		System.out.println("\t1. ��� �߰�");
		System.out.println("\t2. ��� ���");
		System.out.println("\t3. ��� �˻�");
		System.out.println("\t4. ��� ����");
		System.out.println("\t5. ��� ����");
		System.out.println("\t6. ����");

	}
	
	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException
	{
		System.out.print("\t>> �޴� ����(1~6) : ");
		sel = Integer.parseInt(br.readLine());		// �޴� ���� �Է� ��
		System.out.println();
	}
	
	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException
	{
			switch (sel)
			{
			case Menus.E_ADD: addElement(); break; 
			
			case Menus.E_DISP: dispElement(); break; 

			case Menus.E_FIND: findElement(); break; 

			case Menus.E_DEL: delElement(); break; 

			case Menus.E_CHA: chaElement(); break; 

			case Menus.E_EXIT: exit(); break; 

			}
		
	}

	// ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		//1��° ��� �Է� : �չ���
		//1��° ��� �Է� ����~!!!
		//��� �Է� ���(Y/N)? : Y

		//2��° ��� �Է� : ���±�
		//2��° ��� �Է� ����~!!!
		//��� �Է� ���(Y/N)? : n
	
			
		do
		{
			System.out.printf("\t%d��° ��� �Է� : ", vt.size()+1);
			String name = br.readLine();
			vt.add(name);
			System.out.printf("\t%d��° ��� �Է� ����~!!!\n", vt.size());

			System.out.print("\t��� �Է� ���(Y/N)? : ");
			con = br.readLine();
		}
		while (con.equals("Y") || con.equals("y"));
			

		
		System.out.println();
	}

	// ��� ��� �޼ҵ�
	public static void dispElement()
	{
		//[���� ��ü ���]
		//�չ���
		//���±�
		//���� ��ü ��� �Ϸ�~!!!
		for (Object str : vt)
		{
			System.out.println("\t" + str.toString());
		}
		System.out.println("\t���� ��ü ��� �Ϸ�~!!!");
		System.out.println();

	}

	// ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		//�˻��� ��� �Է� : ����ȭ

		//[�˻� ��� ���]
		//�׸��� �������� �ʽ��ϴ�.

		System.out.print("\t�˻��� ��� �Է� : ");
		String name = br.readLine();
		System.out.println();
		System.out.println("\t[�˻� ��� ���]");
		int idx = vt.indexOf(name);
		if (idx<0)
			System.out.println("\t�׸��� �������� �ʽ��ϴ�.");
		else 
			System.out.println("\t�׸��� �����մϴ�.");
		System.out.println();

		System.out.println();
		
	}

	// ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		//������ ��� �Է� : ���ش�

		//[���� ��� ���]
		//�׸��� �������� �ʾ� ������ �� �����ϴ�.

		System.out.print("\t������ ��� �Է� : ");
		String name = br.readLine();
		System.out.println();
		
		System.out.println("\t[���� ��� ���]");
		if (vt.contains(name))
		{
			int idx = vt.indexOf(name);
			vt.remove(idx);
			System.out.printf("\t%s�׸��� �����Ǿ����ϴ�.\n", name);
			
		}
		else
		{
			System.out.println("\t�׸��� �������� �ʾ� ������ �� �����ϴ�.");
		}
	}

	// ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		System.out.print("\t������ ��� �Է�: ");
		String name = br.readLine();
		
		if (vt.contains(name))
		{
			System.out.print("\t������ ���� �Է�: ");
			String temp = br.readLine();

			int idx = vt.indexOf(name);
			vt.set(idx, temp);

			System.out.println("\t[���� ��� ���]");
			System.out.println("\t������ �Ϸ�Ǿ����ϴ�.");
		}
		else
		{
			System.out.println("\t[���� ��� ���]");
			System.out.println("\t������ ��� �������� �ʽ��ϴ�.");
		}

		System.out.println();
		
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