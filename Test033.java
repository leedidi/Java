/*===================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - if ~ else �� �ǽ�
 ===================================*/

// ����ڷκ��� ������ ���� �� ���� �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 5		//9
// �� ��° ���� �Է� : 15		//5
// �� ��° ���� �Է� : 10		//9

// >> ���� ��� : 5 10 15		// 5 9 9
// ����Ϸ��� �ƹ� Ű�� ��������...

/*[���� ���� �ڵ�]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� �� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : " );
		b = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : " );
		c = Integer.parseInt(br.readLine());
		

		// a b c ���� ���� ������� ����

		if(a>b)
		{
			a = a^b; 
			b = b^a; 
			a = a^b;
		}
		if(a>c)
		{
			a = a^c;
			c = c^a;
			a = a^c;
		}
		if(b>c)
		{
			b = b^c;
			c = c^b;
			b = b^c;
		}

		// ��� ���(@��� �Է� �ƴϰ� �����~!!)

		System.out.printf("\n>> ���� ��� : %d %d %d\n", a, b, c);
	}
}
*/

//�Բ� ���� �ڵ�

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 int a,b,c;	//-- ����ڰ� �Է��ϴ������� ���� �� ���� ���� ������ ����

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("ù ��° ���� �Է� : ");
		c = Integer.parseInt(br.readLine());

		// 7 8 2	8 6 13   10 50 30    9 30 45
		// ---      ---      ----		 ----    (@ù��° ������ �ι�° �������� ũ�� �ڸ� �ٲ��)
		//          6 8 13	 
		// -  -     -   --	  --    --  --    -- (@ù��° ������ ����° �������� ũ�� �ڸ� �ٲ��)
		// 2 8 7	6 8 13	 10 50 30    9 30 45
		//    --      -----     -----      -----
		// 2 7 8	6 8 13	 10 30 50	 9 30 45 (@�ι�° ������ ����° �������� ũ�� �ڸ� �ٲ��)
		
		if(a>b) // ���� ù ��° ����(a)�� �� ��° ����(b)���� ũ�ٸ� ....
		{	
			//				a�� b �� ������ �ڸ��� �ٲ۴�.
			a=a^b;
			b=b^a;
			a=a^b;

			// �׽�Ʈ
			//System.out.println("�ڸ��ٲ� �߻�~!!!");
		}
		if(a>c)// ���� ù ��° ����(a)�� �� ��° ����(c)���� ũ�ٸ� ...		//@ else if ����ȵ�! 1�ܰ� ����ϸ� 2 ���� �ȵ�
		{	
			//				a�� c �� ������ �ڸ��� �ٲ۴�.
			a=a^c;
			c=c^a;
			a=a^c;
			
			// �׽�Ʈ
			/////System.out.println("�ڸ��ٲ� �߻�~!!!");
		}
		if(b>c)// ���� �� ��° ����(c)�� �� ��° ����(c)���� ũ�ٸ� ...
		{
			//				b�� c �� ������ �ڸ��� �ٲ۴�.
			b=b^c;
			c=c^b;
			b=b^c;



			
			// �׽�Ʈ
			//System.out.println("�ڸ��ٲ� �߻�~!!!");
		}


		// ��� ���
		System.out.printf("\n>> ���� ��� : %d %d %d\n", a, b, c);
	}
}


//���� ���

/*
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 5
�� ��° ���� �Է� : 9

>> ���� ��� : 5 5 9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
ù ��° ���� �Է� : 7
�� ��° ���� �Է� : 8
ù ��° ���� �Է� : 2

>> ���� ��� : 2 7 8
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
ù ��° ���� �Է� : 8
�� ��° ���� �Է� : 6
ù ��° ���� �Է� : 13

>> ���� ��� : 6 8 13
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 50
ù ��° ���� �Է� : 30

>> ���� ��� : 10 30 50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
ù ��° ���� �Է� : 9
�� ��° ���� �Է� : 30
ù ��° ���� �Է� : 45

>> ���� ��� : 9 30 45
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/