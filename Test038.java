/*==========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - switch �� �ǽ�
 ==========================================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, switch ���� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���������� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�	: 20
// �� ��° ���� �Է�	: 14
// ������ �Է�[+ = * /] : +
// @ �����ڴ� �� �ڸ��� ����,,!

// >> 20 + 14 = 34
// ����Ϸ��� �ƹ� Ű�� ��������...

 /*
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

 public class Test038
 {
	 public static void main(String[] args) throws IOException
	 {
		 // [���� �ۼ��� �ڵ�] >> �������� ������ ����,,,???
		
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1, n2;				// ����ڰ� �Է��� ������ �� ���� n1, n2, 
		int result;			    //����� result;
		char op=0;				// ����ڰ� �Է��� ������ ������ op[+ = * /]

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());
		
		System.out.print("������ �Է�[+ = * /] : ");
		op = (char)System.in.read();
		
		1>
		switch(op)
		 {
			case '+' : result = n1 + n2; break;
			case '-' : result = n1 - n2; break;
			case '*' : result = n1 * n2; break;
			case '/' : result = n1 / n2; break;
			//default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		 }
			System.out.printf("%d %c %d = %d", n1, op, n2, result);
		 2>
		switch(op)
		 {
			case 43 : n1 + n2; break;
			case 45 : n1 - n2; break;
			case 42	: n1 * n2; break;
			case 47 : n1 / n2; break;
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		*/
			
		// ��� ���

		
	   //switch ���� �����ġ� �� case�� ���������
	   //byte, short, int, long �̾�� �Ѵ�.


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

 public class Test038
 {
	 public static void main(String[] args) throws IOException
	 {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/****
		 // ��

		 int a, b, result=0;
		 int op; // ���� ������ �ƽ�Ű �ڵ�� ��!

		 System.out.print("ù ��° ���� �Է� : ");
		 a = Integer.parseInt(br.readLine());
		 System.out.print("�� ��° ���� �Է� : ");
		 b = Integer.parseInt(br.readLine());

		 System.out.print("������ �Է�[+ = * /] : ");
		 op = System.in.read();

		 // + �� op : 43
		 // - �� op : 45
		 // * �� op : 42
		 // / �� op : 47

		 switch (op) // �ƽ�Ű �ڵ�� ��!
		 {
			case 43: result= a+b; break;
			case 45: result= a-b; break;
			case 42: result= a*b; break;
			case 47: result= a/b; break;
			default: return; // -- ���߿�!! check~!!! (@�� ���� �޼ҵ� ���� �� ���α׷� ����!)(@�츮�������̴°� ����Ϸ��� �ƹ� Ű��..)
		 }

		 // �� return Ű���尡 ���ϴ� �� ���� �ǹ�
		 //	   1. ���� ��ȯ  // @���� �� ����! Ŭ���� �޼ҵ� ���޵� �����Ҷ� �ٽ� �� ��
		 //    2. �޼ҵ��� ���� �� main() �޼ҵ� ���� �� ���α׷� ����
		 // return �����, �� Ű���� ǰ���ִ�, �� Ű���� ���Ե� �޼ҵ带 ã�ƺ��� <main> �̶�� �̸� ���� <<�޼ҵ�>> �ȿ� �������!!!
		 //  (it, switch �̷� ���� �� �������!!)

		 System.out.println();
		 System.out.printf(">> %d %c %d = %d\n", a, op, b, result); //@ op�� int�ε��� %c��?
																	// %c �Է½� (+,-,*,/)�� ����
																	// %d �Է½� 43, 45, 42, 47 �ƽ�Ű�ڵ�� ����

			*/


		 // ��
		/*
		 int a, b, result;
		 int op; 

		 System.out.print("ù ��° ���� �Է� : ");
		 a = Integer.parseInt(br.readLine());
		 System.out.print("�� ��° ���� �Է� : ");
		 b = Integer.parseInt(br.readLine());

		 System.out.print("������ �Է�[+ = * /] : ");
		 op = (char)System.in.read();

		 switch (op) 
		 {
			case '+': result= a+b; break;	//jdk 1.5���� ����Ÿ�Ե� ����ġ ����, case ��������� ���� ����!
			case '-': result= a-b; break;
			case '*': result= a*b; break;
			case '/': result= a/b; break;
			default: return; 
		 }

		 System.out.println();
		 System.out.printf(">> %d %c %d = %d\n", a, op, b, result); 
	 }
 }

		*/

		// �� >> @ ���û ����Ѱ� �Ұ���! �ٵ� �츮�� ����Ѱ� ���� �� ������..

		 int a, b, result;
		 String op;					// -- check~~!!!
	
		 System.out.print("ù ��° ���� �Է� : ");
		 a = Integer.parseInt(br.readLine());
		 System.out.print("�� ��° ���� �Է� : ");
		 b = Integer.parseInt(br.readLine());

		 System.out.print("������ �Է�[+ = * /] : ");
		 op = br.readLine();		// -- check~~!!

		 switch (op) 
		 {
			case "+": result= a+b; break;	//jdk 1.7���� ����ġ ����, case ��������� ���ڿ� ����(String)
			case "-": result= a-b; break;	//������ �ܿ������� �ƴ����� ��� ������ �ϰ� �ֱ�!
			case "*": result= a*b; break;
			case "/": result= a/b; break;
			default: return; 
		 }

		 System.out.println();
		 System.out.printf(">> %d %s %d = %d\n", a, op, b, result); //%s : ���ڿ� (%c�� ����)
	 }
 }

//���� ���

/*
ù ��° ���� �Է� : 27
�� ��° ���� �Է� : 7
������ �Է�[+ = * /] : -

>> 27 - 7 = 20
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
 */

 /*
ù ��° ���� �Է� : 25
�� ��° ���� �Է� : 5
������ �Է�[+ = * /] : +

>> 25 + 5 = 30
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
 */

 /*
ù ��° ���� �Է� : 12
�� ��° ���� �Է� : 3
������ �Է�[+ = * /] : *

>> 12 * 3 = 36
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

 */