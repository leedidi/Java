/*==========================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - ��� ������
  - BufferedReader
  - printf()
 ===========================================*/

// ����ڷκ��� ������ ������ �� �� �Է¹޾�
// ��Ģ���� �� ������ ������ �����Ͽ�
// �� ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, �Է¹��� ������ BufferedReader �� Ȱ���� �� �ֵ��� �ϰ�
// ����ϴ� ������ printf() �޼ҵ带 Ȱ���� �� �ֵ��� �Ѵ�.
// ����, ������ ������ ���ǻ� ���� ������� ó���Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 10
// �� ��° ���� �Է� : 2

// ====[���]====
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2 = 20
// 10 / 2 = 5
// 10 % 2 = 0
// ==============
// ����Ϸ��� �ƹ� Ű�� ��������...

/*
[���� �� ��]


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test019_1
{
	public static void main(String[] args) throws IOException //@��� ; ���� ��������!
		{
		// �� �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;

		// �� ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		// �� ��� ���
		
		System.out.printf("\n");
		System.out.printf("\n=====[���]=====\n");
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
		System.out.printf("===============\n");
		}
}
*/



/*
[�ٸ� ģ���� �� ��] (����)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test019
{
	public static void main(String[] args) throws IOException
	{	
		// �� �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b;
		
		// �� ���� �� ó��

		System.out.print("ù ��° ���� �Է� : ");
		a= Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b= Integer.parseInt(br.readLine());

		// �� ��� ���
		
		System.out.printf("\n");
		System.out.printf("\n=====[���]=====\n");
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
		System.out.printf("===============\n");
	}
}
*/

// [���� Ǯ���� ��]

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test019
{
	public static void main(String[] args) throws IOException
	{	
		//�ֿ� ���� ����
		int num1, num2;
		int res1, res2, res3, res4, res5;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		//���� �� ó��
		System.out.print("ù ��° ���� �Է� : " );
		num1= Integer.parseInt(br.readLine());

		
		System.out.print("�� ��° ���� �Է� : " );
		num2= Integer.parseInt(br.readLine());

		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		res5 = num1 % num2;

		// ��� ���
		System.out.printf("\n====[���]====\n");

		System.out.printf("%d + %d = %d\n", num1, num2, res1);
		System.out.printf("%d - %d = %d\n", num1, num2, res2);
		System.out.printf("%d * %d = %d\n", num1, num2, res3);
		System.out.printf("%d / %d = %d\n", num1, num2, res4);
		System.out.printf("%d %% %d = %d\n", num1, num2, res5); //@ %������ �ڹٰ� ����! �� �׵� d,s, ... �豸��!
															    //@ �� d ������ % : �� �갡 �� �Ⱦ��� ������? �����̱��� ����(�ɼǹ��ڶ����)
															    //@ �׷��� '%%' ���! ����Ǯ�� �ڹپ� �̰� �׳� %��~!

		System.out.printf("==============\n");
			
			}
}
//���� ���
/*
====[���]====
20 + 5 = 25
20 - 5 = 15
20 * 5 = 100
20 / 5 = 4
20 % 5 = 0
==============
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/