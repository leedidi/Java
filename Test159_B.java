/*	===========================
	����÷��� �����ӿ�ũ���
	=========================== */
/* �ǽ�����

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
1��° ��� �Է� ����
��� �Է� ���(Y/N) : Y

2��° ��� �Է� : ���±�
2��° ��� �Է� ����
��� �Է� ���(Y/N) : n

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
���� ��ü ��� �Ϸ�

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
5. ��� ����
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
5. ��� ����
6. ����
>> �޴� ����(1~6) : 6

���α׷� ����

*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//�޴� ���� Ŭ����
class Menus{
	public static final int E_ADD=1;	//��� �߰�
	public static final int E_DISP=2;	//��� ���
	public static final int E_FIND=3;	//��� �˻�
	public static final int E_DEL=4;	//��� ����
	public static final int E_CHA=5;	//��� ����
	public static final int E_EXIT=6;	//����
}

//

public class Test159_B{

	//�ֿ� �Ӽ�
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;					//���ð�
	private static String con;					//��� ����

	//static �ʱ�ȭ ��(�����ں��� ���� ȣ��)
	static{
		vt = new Vector<Object>();

		br = new BufferedReader(new InputStreamReader(System.in));

		//����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}

	//�޴� ��� �޼ҵ�
	public static void menuDisp(){
		System.out.println("\t[�޴� ����]");
		System.out.println("\t1. ��� �߰�");
		System.out.println("\t2. ��� ���");
		System.out.println("\t3. ��� �˻�");
		System.out.println("\t4. ��� ����");
		System.out.println("\t5. ��� ����");
		System.out.println("\t6. ����");
	}

	//�޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException {
		
		System.out.print("\t>> �޴� ����(1~6) : ");
		sel = Integer.parseInt(br.readLine());
		System.out.println();
	}

	//���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�
	public static void menuRun() throws IOException {

		switch(sel){
			case 1 : addElement(); break;
			case 2 : dispElement(); break;
			case 3 : findElement(); break;
			case 4 : delElement(); break;
			case 5 : chaElement(); break;
			case 6 : exit(); break;
		}

	}

	//��� �߰�(�Է�)�޼ҵ�
	public static void addElement() throws IOException {
		do{
			System.out.printf("\t%d��° ��� �Է� : ", vt.size()+1);
			vt.add(br.readLine());
			System.out.printf("\t%d��° ��� �Է� ����", vt.size());
			System.out.print("\n\t��� �Է� ���(Y/N) : ");	
			con = br.readLine();
		}while(con.equals("Y") || con.equals("y"));
		
		System.out.println();
	}

	//��� ��� �޼ҵ�
	public static void dispElement() {
		System.out.println("\t[���� ��ü ���]");
		for(Object o : vt)
			System.out.println("\t"+o);
		System.out.println("\t���� ��ü ��� �Ϸ�");

		System.out.println();
	}

	//��� �˻� �޼ҵ�
	public static void findElement() throws IOException {
		System.out.print("\t�˻��� ��� �Է� : ");
		String temp = br.readLine();
		int i = vt.indexOf(temp);

		System.out.println("\n\t[�˻� ��� ���]");
		if(i>=0)
			System.out.println("\t�׸��� �����մϴ�.");
		else
			System.out.println("\t�׸��� �������� �ʽ��ϴ�.");
		

		System.out.println();
	}

	//��� ���� �޼ҵ�
	public static void delElement() throws IOException {
		System.out.print("\t������ ��� �Է�: ");
		String d = br.readLine();
		
		System.out.println("\n\t[���� ��� ���]");
		if (vt.contains(d)){
			int i = vt.indexOf(d);

			vt.remove(i);
			System.out.printf("\t%s �׸��� �����Ǿ����ϴ�.\n", d);
		}else
			System.out.println("\t�׸��� �������� �ʾ� ������ �� �����ϴ�.");
	
		System.out.println();
	}

	//��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException {
		System.out.print("\t������ ��� �Է�: ");
		String c = br.readLine();
		
		if (vt.contains(c)){
			System.out.print("\t������ ���� �Է�: ");
			String c2 = br.readLine();

			vt.set(vt.indexOf(c), c2);

			System.out.println("\n\t[���� ��� ���]");
			System.out.println("\t������ �Ϸ�Ǿ����ϴ�.");
		}else{
			System.out.println("\n\t[���� ��� ���]");
			System.out.println("\t������ ��� �������� �ʽ��ϴ�.");
		}

		System.out.println();
	}

	//���α׷� ���� �޼ҵ�--�ϼ�
	public static void exit() {
		System.out.println("\t���α׷� ����");
		System.exit(-1);
	}


	//���� �޼ҵ�--�ϼ�
	public static void main(String[] args) throws IOException{
		do{
			menuDisp();		//�޴� ���
			menuSelect();	//�޴� ����
			menuRun();		//�޴� ����
		}while(true);
	}
}