/*==============================
   ���� Ŭ���� ��� ����
   - �������̽�(Interface)
 ==============================*/

 // �� �ǽ� ����
 // ���� ó�� ���α׷��� �����Ѵ�.
 // ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

 // ���� ��)
 // �ο� �� �Է�(1~10) : 2
 // 1��° �л��� �й� �̸� �Է�(���� ����) : 2108006 �Ǽ���
 // ���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
 // 2��° �л��� �й� �̸� �Է�(���� ����) : 2108024 ��ҿ�
 // ���� ���� ���� ���� �Է�   (���� ����) : 85 70 65

 // 2108006 �Ǽ���    90 100  85      275    91
 //                   ��  ��  �� 
 // 2108024 ��ҿ�    85  70  65      220    73
 //                   ��  ��  ��

 // ����Ϸ��� �ƹ� Ű�� ��������...
 
 // [�Բ� �ۼ��� �ڵ�]
 // --->>> ���߿� �ش��� �ڷ� �������ֽø� ��ü�ϱ�!!!

 // �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��

 import java.util.Scanner;

 class Record
 {
	 String hak, name;		//-- �й�, �̸�
	 int kor, eng, mat;		//-- ����, ����, ���� ����
	 int tot, avg;			//-- ����, ���(���ǻ� ���� ó��)
 }

 // �������̽�
 interface Sungjuk
 {
	 public void set();		//-- �ο� �� ����
	 public void input();	//-- �� ������ �Է�
	 public void print();   //-- ��� ���
 }

// ���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk
{
	int n;
	Record[] rec;
	// Rank[] rank;

	@Override
	public void set() //throws IOException
	{  
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			n = sc.nextInt();
		}
		while (n<1 || n>10);

		rec = new Record[n];
	}

	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		// char...
		
		for (int i=0; i<n; i++)
		{
			rec[i] = new Record();

			System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", i+1);
			rec[i].hak = sc.next();
			rec[i].name = sc.next();
			
			System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
			rec[i].kor = sc.nextInt();
			rec[i].eng = sc.nextInt();
			rec[i].mat = sc.nextInt();

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot/3;
		}
	}

	@Override
	public void print() //throws IOException
	{  
		for (int i=0; i<n; i++)
		{
			System.out.printf("%s %3s %3d %3d %3d %3 %\n", rec[i].hak, rec[i].name, rec[i].kor, rec[i].eng, rec[i].mat, rec[i].tot, rec[i].avg);
			System.out.printf("                          %s %s %c\n", rank[i][0], rank[i][1], rank[i][2]);

		}
	}
}

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test117
{
	public static void main(String[] args)
	{
		//SungjukImpl ob = new SungjukImpl();
		//Sungjuk ob = new SungjukImpl();

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����
		Sungjuk ob;
		ob = new SungjukImpl();

		ob.set();
		ob.input();
		ob.print();
	}
}