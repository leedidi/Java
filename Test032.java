/*===================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - if ~ else �� �ǽ�
 ===================================*/

// ����ڷκ��� ������ �� ������ �����ڸ� �Է¹޾�
// �ش� �������� ���� ó�� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, if ���ǹ��� Ȱ���Ͽ� ó���� �� �ֵ��� �ϸ�,
// ���� ����� ���ǻ� ���������� ó���� �� �ֵ��� �Ѵ�.

// ���� ��)
// ù ��° ���� �Է�	: 20
// �� ��° ���� �Է�	: 14
// ������ �Է�[+ = * /] : +
// @ �����ڴ� �� �ڸ��� ����,,!

// >> 20 + 14 = 34
// ����Ϸ��� �ƹ� Ű�� ��������...


//[���� ���� �ڵ�]
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1, n2, strResult;
		char oper;

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		n2 = Integer.parseInt(br.readLine());
		System.out.print("������ �Է�[+ - * /] : ");
		oper = (char)System.in.read();

		if(oper == '+')
		{
			strResult = n1 + n2;
		}
			else if(oper == '-')
			{
				strResult = n1 - n2;
			}
				else if(oper == '*')
				{
					strResult = n1 * n2;
				}
					else if(oper == '/')
					{
						strResult = n1 / n2;
					}
						else
						{ 
							System.out.print("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
							}

		// ��� �Է�

		// >> 20 + 14 = 34
		
		System.out.printf(">> %d %c %d = %fd\n", n1, oper, n2, strResult); 

	}
}
*/

/* [�ٸ� ģ���� �Ѱ�] >> ��!

		if(oper == '+')
		{ System.out.printf(">> %d %c %d = %d\n", n1, oper, n2, n1+n2);
		}
			else if(oper == '-')
			{ System.out.printf(">> %d %c %d = %d\n", n1, oper, n2, n1-n2);
			}
				else if(oper == '*')
				{ System.out.printf(">> %d %c %d = %d\n", n1, oper, n2, n1*n2);
				}
					else if(oper == '/')
					{ System.out.printf(">> %d %c %d = %d\n", n1, oper, n2, n1/n2);
					}
						else
						{ System.out.print("�����ڸ� �߸� �Է��ϼ̽��ϴ�.");
							}
							
*/
//[���� ���� �ڵ�]

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException //(@���۵帮�� readLine(), System.in.read(); �� �̰ŷ� ���� ����!!),
	{

		/*
		// ��� ��

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;   //-- ù��°, �� ��° ����
		char op;	//-- ������(���ڿ� �񱳹� ���� �𸣴� stringx, �ϴ� ���� char��!)

		System.out.print("ù ��° ���� �Է� : " );
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : " );
		b = Integer.parseInt(br.readLine());
		
		// Integer.parseInt()
		// "1234" �� Integer.parseInt() �� 1234
		// "abcd" �� Integer.parseInt() �� (X)

		System.out.print("������ �Է�[+ - * /] : " );
		// op = br.readLine(); ���� = ���ڿ�(�� ���!)
		// op = Integer.parseInt(br.readLine()); //"+" >> @ �������°� �ƴ�, �ٲ��� ����
		// op = System.in.read(); //@ char = int
		op = (char)System.in.read(); //��� �ƽ�Ű�ڵ� �������°�! ���۵帮���� ���ڿ����ΰ������°�!!!

		// Ȯ��(�׽�Ʈ)
		//System.out.print("op : " + op);
		//op= 43;

		if(op=='+') // 43 == 43(�ƽ�Ű�ڵ�)
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if(op=='-')	//45 == 45
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if(op=='*')	//42 == 42
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if(op=='/')	//47 == 47
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else
		{
			System.out.printf("\n>> �Է� ������ ������ �����մϴ�.\n");
		}

       */
		
		/*
		// ��� ��
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//check~!!!
		int a, b, op;   //-- ù��°, �� ��° ����, �׸��� ������
		
		System.out.print("ù ��° ���� �Է� : " );
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : " );
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : " );
		op = System.in.read();

		// Ȯ��(�׽�Ʈ)
		//System.out.print("op : " + op);

		// Ȯ��(�׽�Ʈ)
		//System.out.print("op : " + op);

		if(op==43) // 43 == 43(�ƽ�Ű�ڵ�)  //@ �Ʒ� ���� ������ ��, {} ���̽�, ���� ����! 
											//@ �鿩���� ����! ���ϸ� ������â �˾ƺ��� ����
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		else if(op==45)	//45 == 45
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		else if(op==42)	//42 == 42
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		else if(op==47)	//47 == 47
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		else
			System.out.printf("\n>> �Է� ������ ������ �����մϴ�.\n");

		*/

		// ��� ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//check~!!!
		//int a, b, result; 
		int a, b, result=0; //@(����!! else ���ٸ� result �� ó���� ��������. �̸� �ʱ�ȭ�������!) 
		char op;
		
		System.out.print("ù ��° ���� �Է� : " );
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : " );
		b = Integer.parseInt(br.readLine());

		System.out.print("������ �Է�[+ - * /] : " );
		op = (char)System.in.read();

		// Ȯ��(�׽�Ʈ)
		//System.out.print("op : " + op);

		// Ȯ��(�׽�Ʈ)
		//System.out.print("op : " + op); 

		if(op=='+') // 43 == 43(�ƽ�Ű�ڵ�)  //@ �Ʒ� ���� ������ ��, {} ���̽�, ���� ����! 
											 //@ �鿩���� ����! ���ϸ� ������â �˾ƺ��� ����
			result = a + b;
		else if(op==45)	//45 == 45
			result = a - b;
		else if(op==42)	//42 == 42
			result = a * b;
		else if(op==47)	//47 == 47
			result = a / b;
		else
			result = -1; //@ 0,-1 �� ���� ���̶�°� �� �� �ִ�, ������ �� �ִ� �� ���

		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);
			//@ %c : ����




	}
}

// �Է� ���

/*
ù ��° ���� �Է� : 21
�� ��° ���� �Է� : 6
������ �Է�[+ - * /] : -

>> 21 - 6 = 15
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/



/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 5
������ �Է�[+ - * /] : +

>> 10 + 5 = 15
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 5
������ �Է�[+ - * /] : -

>> 10 - 5 = 5
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 5
������ �Է�[+ - * /] : *

>> 10 * 5 = 50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 5
������ �Է�[+ - * /] : /

>> 10 / 5 = 2
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 5
������ �Է�[+ - * /] : >

>> �Է� ������ ������ �����մϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
