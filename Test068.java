/*==================================
   ���� Ŭ������ �ν��Ͻ� ����
 ===================================*/

 // ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
 // ��Ģ������ �����ϴ� ���α׷��� �����Ѵ�.
 // ��, Ŭ������ �ν��Ͻ��� ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

 // ���� ��)
 // ������ �� ���� �Է�(���� ����) : 10 5
 // ������ ������ �Է�(+ = * /)	   : +
 // >> 10 + 5 = 15
 // ����Ϸ��� �ƹ� Ű�� ��������...

// [���� �ۼ��� �ڵ�]

import java.util.Scanner;
import java.io.IOException;

 class Calculate
 {
	 // �ֿ� ���� ����
	 int su1, su2;	//-- ����ڷκ��� �Է¹��� �� ������ ��Ƶ� ����
	 char op;		//-- ����ڷκ��� �Է¹��� �����ڸ� ��Ƶ� ����

	Calculate() //@ �츮�� �������ϴ� �������� �����ڰ� ���ٸ�(����ڰ� ���� ����� ���� ������)
	 {			//@ �ڵ����� �����ڰ� ������ ��. ���� ���·�. (�� �̰� �߿��� ������!)
		 // �� ����ִ� ����
		 // System.out.println("������ Ȯ��");
	 }

	 // �޼ҵ� ����(��� : �Է�)
	 void input() throws IOException //@ System.in.read ����!
	 {	
		 Scanner sc = new Scanner(System.in);
		 System.out.print("������ �� ���� �Է�(���� ����) : ");
		 su1 = sc.nextInt();
		 su2 = sc.nextInt();
		 System.out.print("������ ������ �Է�(+ = * /)    : ");
		 op = (char)System.in.read();
	 }

	 // �޼ҵ� ����(��� : ����)
	 int cal()
	 {
		int result = 0;
		
		switch(op)
		 {
			case '+' : result = su1 + su2; break;
			case '-' : result = su1 - su2; break;
			case '*' : result = su1 * su2; break;
			case '/' : result = su1 / su2; break;
		 }

		return result;
	 }


	 // �޼ҵ� ����(��� : ���)
	 void print(int s)
	 {
		 System.out.printf(">> %d %c %d = %d\n", su1, op, su2, s); 

 }
 }

public class Test068
{
	public static void main(String[] args) throws IOException
	{
		// Calculate Ŭ���� �ν��Ͻ� ����
		Calculate cal = new Calculate();

		cal.input();
		int result = cal.cal();
		cal.print(result);

		//cal.actionPerfomed();
		//cal.Calculate();

	}
}


// [���� �ۼ��� �ڵ�]
/*
import java.util.Scanner;
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
import java.io.IOException;

 class Calculate
 {
	 // �ֿ� ���� ����
	 int n1, n2;		// ����ڿ��� �Է¹��� ������ �� ����
	 char op;			// ����ڿ��� �Է¹��� ������ ������

	 // �Է� �޼ҵ� ����
	 void input() throws IOException
	 {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		//n1 = Integer.parseInt(br.readLine()); 

		System.out.print("������ ������ �Է�(+ = * /) : ");
		op = (char)System.in.read();
	 }

	 // ���� ó�� �޼ҵ� ����
	 int calculate()
	 {
		 int result = 0;
		 if(op == '+')
			 result = n1 + n2;
			 else if (op == '-')
				result = n1 - n2;
			   else if (op == '*')
				  result = n1 * n2;
				else if(op == '/')
			 		result = n1/n2;
					else
						result = -1;

		 return result;

	 }
	 // ��� ��� �޼ҵ� ����
	 void print(int sum)
	 {
		 System.out.printf(">> %d %c %d = %d\n", n1,op, n2, sum);
	 }
 }

public class Test068
{
	public static void main(String[] args) throws IOException
	{
		// Calculate �ν��Ͻ� ����
		Calculate ob = new Calculate();

		// ������ �ν��Ͻ��� ���� �Է� �޼ҵ� ȣ��
		ob.input();

		// ������ �ν��ͽ��� ���� ���� ó�� �޼ҵ� ȣ��
		int sum = ob.calculate();

		// ������ �ν��ͽ��� ���� ��� ��� �޼ҵ� ȣ��
		ob.print(sum);
	}
}

*/

// ���� ���
/*
������ �� ���� �Է�(���� ����) : 10 10
������ ������ �Է�(+ = * /) : *
>> 10 * 10 = 100
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ �� ���� �Է�(���� ����) : 20 15
������ ������ �Է�(+ = * /)    : +
>> 20 + 15 = 35
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/