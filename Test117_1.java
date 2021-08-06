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

 // ~ 2�� 15�б��� �ڵ� �ۼ�
 // [���� �ۼ��� �ڵ�]

 // �Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��

//import java.io.InputStreamReader;
//import java.io.BufferedReader;
//import java.io.IOException;
import java.util.Scanner;
 
 class Record
 {
	 String hak, name;		//-- �й�, �̸�
	 int kor, eng, mat;		//-- ����, ����, ���� ����
	 int tot, avg;			//-- ����, ���(���ǻ� ���� ó��)
 }

 // �������̽�
 interface Sungjuk //implements Record //<<< �̰Ŵ� �� �Ǵµ�,,, ���� main�� �־�ߵǳ�?
 {
	 public void set();		//-- �ο� �� ����
	 public void input();	//-- �� ������ �Է�
	 public void print();   //-- ��� ���
 }

// ���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl implements Sungjuk //throws IOException
{
		int n=0;
		//BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

		// Scanner sc = new Scanner(System.in);
		// System.out.print("�ο� �� �Է�(1~10) : ");
		//n = sc.nextInt();

	@Override
	public void set() //throws IOException
	{   
		int n=0;
		//BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� �Է�(1~10) : ");
		n = sc.nextInt();
		int[] hak = new int[n];
		String[] name = new String[n];
		int[] kor = new int[n];
		int[] eng = new int[n];
		int[] mat = new int[n];

		for (int i=0; i<hak.length; i++)
		{
		System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ", i+1);
		hak[i] = sc.nextInt();
		name[i] = sc.next();
		
		System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
		kor[i] = sc.nextInt();
		eng[i] = sc.nextInt();
		mat[i] = sc.nextInt();
		}
	}

	@Override 
	public void input()
	{   

		int[] total = new int[n];
		int[] avg = new avg[n];

		// tot..avg.. ����̾簡....
		for (int i=0; hak.length; i++)
		{
			tot[i] += kor[i] + eng[i] + mat[i];
		}
		
		for (int i=0; hak.length; i++)
		{
			avg[i] += (kor[i] + eng[i] + mat[i])/3;
		}
	
	}

	@Override
	public void print()
	{
	}
}

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test117_1
{
	public static void main(String[] args)
	{
		Sungjuk ob = new Sungjuk();

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����

		ob.set();
		ob.input();
		ob.print();
	}
}