/*===========================
  ���� Ŭ���� ��� ����
  - �������̽�(Interface)
===========================*/

// �� �ǽ� ����
// ���� ó�� ���α׷��� �����Ѵ�.
// ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 2
// 1��° �л��� �й� �̸� �Է�(���� ����) : 2108006 �Ǽ���
// ���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2108024 ��ҿ�
// ���� ���� ���� ���� �Է�   (���� ����) : 85 70 65

// 2108006 �Ǽ���    90 100  85      275      91
//                   ��  ��  ��
// 2108024 ��ҿ�    85  70  65      220      73
//                   ��  ��  ��

// ����Ϸ��� �ƹ� Ű�� ��������...

import java.util.Scanner;

// �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��
class Record
{
	/*
	public void set();		//-- �ο� �� ����
	public void input();	//-- �� ������ �Է�
	public void print();	//-- ��� ���
	*/

	String hak, name;		//-- �й�, �̸�
	int kor, eng, mat;		//-- ����, ����, ���� ����
	int tot, avg;			//-- ����, ���(���ǻ� ���� ó��)
}

// �������̽�
interface Sungjuk
{
	public void set();		//-- �ο� �� ����
	public void input();	//-- �� ������ �Է�
	public void print();	//-- ��� ���
}

// ���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk
{
	int inwon;
	Record[] rc;
	String[][] rank;

	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("�ο� �� �Է�(1~10) : ");
		inwon = sc.nextInt();

		rc = new Record[inwon];
		rank = new String[inwon][3];
	}

	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		int i=0;

		do
		{
			rc[i] = new Record();

			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", i+1);
			rc[i].hak = sc.next();
			rc[i].name = sc.next();

			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
			rc[i].kor = sc.nextInt();
			rc[i].eng = sc.nextInt();
			rc[i].mat = sc.nextInt();

			rc[i].tot = rc[i].kor + rc[i].eng + rc[i].mat;
			rc[i].avg = rc[i].tot / 3;

			rank[i][0] = panjung(rc[i].kor);
			rank[i][1] = panjung(rc[i].eng);
			rank[i][2] = panjung(rc[i].mat);

			i++;
		}
		while (i<inwon);

	}

	private String panjung(int score)
	{
		String result;

		switch (score / 10)
		{
		case 10 : case 9 : result = "��"; break;
		case 8 : result = "��"; break;
		case 7 : result = "��"; break;
		case 6 : result = "��"; break;
		default : result = "��"; break;
		}

		return result;
	}

	@Override
	public void print()
	{
		for (int i=0; i<inwon; i++)
		{
			System.out.printf("%s %3s   %3d %3d %3d      %d      %d\n",
							rc[i].hak, rc[i].name, rc[i].kor, rc[i].eng, rc[i].mat, rc[i].tot, rc[i].avg);
			System.out.printf("                  %s  %s  %s\n", 
							rank[i][0], rank[i][1], rank[i][2]);
		}
	}
}

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test117
{
	public static void main(String[] args)
	{
		Sungjuk ob = new SungjukImpl();

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����

		ob.set();
		ob.input();
		ob.print();
	}
}