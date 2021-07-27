/*==================================
   ���� Ŭ������ �ν��Ͻ� ����
 ===================================*/

 // ����ڷκ��� ������ ������ �Է¹޾�
 // 1���� �Է¹��� �� ������ ���� �����Ͽ�
 // ������� ����ϴ� ���α׷��� �����Ѵ�.

 // ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� ó���� �� �ֵ��� �Ѵ�.
 // ����, �Է� ó�� �������� BufferedReader �� Ȱ���ϸ�,
 // �Է� �����Ͱ� 1 ���� �۰ų� 1000 ���� ū ���
 // �ٽ� �Է¹��� �� �ִ� ó���� �����Ͽ� ���α׷��� ������ �� �ֵ��� �Ѵ�.

 // ���� ��)
 // ������ ���� �Է�(1~1000) : 1022
 // ������ ���� �Է�(1~1000) : -20
 // ������ ���� �Է�(1~1000) : 100
 // >> 1 ~ 100 ������ �� : 5050
 // ����Ϸ��� �ƹ� Ű�� ��������...


// [�Բ� �ۼ��� �ڵ�]

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
// import java.io.IOException; ���ٷ� �Ʒ�, ������ ����ϴ� IO �� ����!

 class Hap 
 {
	 //�ֿ� ���� ����(������� �Է°��� ��Ƶ� ����)
	 int su;

	 // �Է� �޼ҵ� ����
	 void input() throws IOException
	 {	
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 do
	     {
		 System.out.print("������ ���� �Է�(1~1000) : ");
		 su = Integer.parseInt(br.readLine());
		 }
		 while (su<1 || su>1000);
	 }

	 // ���� ó�� �޼ҵ� ����
	 int calculate()
	 {
		int result = 0;
		
		for(int i=1; i<=su; i++)
			result += i;

		return result;
	 }

	 // ��� ��� �޼ҵ� ����
	 void print(int sum) //@ �� ��� �� ����ֱ� ������, ���� �����
	 {
		 System.out.printf(">> 1 ~ %d ������ �� : %d\n", su, sum);
	 }

 }

// import java.io.IOException;
//@ import~~ ���� �Ⱦ�! �׻� Ŭ������ ����Ǳ� ������ ��� ����Ʈ������ �ۼ��Ǿ� �־�� ��
public class Test067
{
	public static void main(String[] args) throws IOException
	{	
		// Hap Ŭ���� �ν��Ͻ� ����
		Hap ob = new Hap();

		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		ob.input();

		// ������ �ν��Ͻ��� ���� ���� ó�� �޼ҵ� ȣ��
		int s = ob.calculate(); //@��ȯ�Ѱ� ��Ƶ�

		// ������ �ν��Ͻ��� ���� ��� ��� �޼ҵ� ȣ��
		ob.print(s);
	}
}

// [���� �ۼ��� �ڵ�]
/*
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

 class Hap 
 {
	// �ֿ� �Ӽ�
	int n;

	// ������ ���� �Է� ���
	void input() throws IOException
	{

	// �����Ͱ� 1���� �۰ų� 1000���� ū ��� �ٽ� �Է�
	do 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������ ���� �Է�(1~1000) : ");
		n = Integer.parseInt(br.readLine());
	 }

	 while(n<1 || n>1000);
	}

	 
	 // 1 ~ n������ ���� �� ����
	 int sumsum()
	 {
		 int result = 0;
		 for(int i=1; i<=n; i++)
		 result += i;
		 return result;
	 }
	
	//1 ~ n������ ���� �� ���
	 void print(int a)
	 {
		 System.out.printf(">> 1 ~ %d������ �� : %d\n",n,a);
	 }
 }



public class Test067
{
	public static void main(String[] args) throws IOException
	{	
		// Hap Ŭ���� �ν��Ͻ� ����
		Hap ob = new Hap();

		// ������ Hap �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		ob.input();

		// ������ Hap �ν��Ͻ��� ���� ���� �޼ҵ� ȣ��
		int a = ob.sumsum();

		// ������ Hap �ν��Ͻ��� ���� ��� �޼ҵ� ȣ��
		ob.print(a);
	}
}
*/

// ���� ���
/*
������ ���� �Է�(1~1000) : -3
������ ���� �Է�(1~1000) : 10000
������ ���� �Է�(1~1000) : 100
>> 1 ~ 100������ �� : 5050
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է�(1~1000) : 2000
������ ���� �Է�(1~1000) : -20
������ ���� �Է�(1~1000) : 200
>> 1 ~ 200 ������ �� : 20100
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/