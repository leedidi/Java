/*==========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - �ݺ���(while��) �ǽ�
 ==========================================================*/

 // ����ڷκ��� ������ ������ �Է¹޾�
 // �Է¹��� ������ �Ҽ����� �ƴ����� �Ǻ��Ͽ�
 // ����� ����ϴ� ���α׷��� �����Ѵ�.

 // ���� ��)
 // ������ ���� �Է� : 10
 // 10 �� �Ҽ� �ƴ�
 // ����Ϸ��� �ƹ� Ű�� ��������...

 // ������ ���� �Է� : 11
 // 11 �� �Ҽ�
 // ����Ϸ��� �ƹ� Ű�� ��������...

 // �� �Ҽ� : 1 �Ǵ� �ڱ� �ڽ��� �� �̿��� � ���ε� ������ �������� �ʴ� ��.
 //			  ��, 1�� �Ҽ� �ƴ�.

//[���� �ۼ��� �ڵ�]

/*

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test046
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=1;			// ����ڰ� �Է��� ������ ���� n
		int a=1;			// n�� ������ �� ����� ���� a
		String result;	// �Է��� ������ �Ҽ�����, �ƴ��� ���� ��� �Ǻ���

		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		
		// n/(n-1) ������, �ѹ� ������ �������� �� �ڴ� �� �ʿ� ����!
		// 1 �Է½� -> �Ҽ� �ƴ� ���;� ��
		*/
		
	/*
		while(a<n)
		{ 
		if(n == 1)
			result = "�Ҽ� �ƴ�";
			else if(n%a == 0)
			{
				result = "�Ҽ� �ƴ�";
				break;
			}
				else
					result = "�Ҽ�";
		}
		n++;
		
		// ��� ���
		System.out.printf("%d �� %s", n, result);
		*/

/*

		while(a<n)
		{ 
			if(n%a == 0)
			{
				System.out.println(n + "�� �Ҽ� �ƴ�");
				break;
			}
					else
						System.out.println(n + "�� �Ҽ�");
						a++;
		}


	*/

//% : ���� ��Ʈ! � ������� �ڵ� ����� �� �� ������

		// ��� ���
		//System.out.printf("%d �� %s", n, result);

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test046
{
	public static void main(String[] args) throws IOException
	{
		// �� �ֿ� ���� ���� �� �ʱ�ȭ
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;	// -- ����� �Է°��� ��Ƴ� ����
		
		// �� ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		num = Integer.parseInt(br.readLine());

		int n = 2;		// -- �Է°��� ������� ������ ������ ������ ����
						// (1�� ����)   5 �� 2 3 4

		boolean flag = true;	//-- ���~ �Ҽ���~!!!

		while(n < num)	// num = 5 �� n = 2~4 // num = 15 �� n=2~14
 		{	
			// �Է°�(num)�� n(2, 3, 4)���� ������ ���������� Ȯ��..
			// ���ŷӰ� �����Ƶ� �ּ�ȭ�ؼ� �ѱ۷� � �������� ǥ�� �غ���!!
			// �� �Ӹ��� ������ �ڹ� �ڵ�� �ٲ� ������ ��. ���� �� �۾� ���� �� ������! ���ŷӰ� �������� �߿��� ����
			if (num%n == 0)
			{
				// break ; // ���� break ����ϸ� flag false �� �ٲܼ� ����!
			    // 
				// �ѹ��� ��� ������ ������, 
				// plag���� -  ��ߺ���. �������� �ȾƳ��� û��÷� ���÷�! 
				// ��δ� �Ķ����̸� ���������� �Ķ�����̸�, ������ ��� �������� ���������� �Ķ� ����̶�� �� �� ����!
				
				// num �� �Ҽ��� �ƴϴ�.
	
				flag = false; // ����~ �Ҽ� �ƴϾ���~!!!
				break;	// if�� ���������°� X, �긦 ���ΰ��ִ� ���� ����� �ݺ���(while)��������

			}

			 n++;

		}
		// �߰� Ȯ��

		//% flag üũ

		// �߰� Ȯ��

		//% flag üũ
		
		
		
		// �� ��� ���(��� ���� �����ؾ� �� �߰� Ȯ�� �� 1���� �ƴ����� ���� �߰� ����)
		if (flag && num!=1) //flag == true ���ʿ䰡 ����! flag�� ���� �⺻ ���� ��ü�ν� true, false ��ȯ, num�� ���ڹٲ����� true�� ���)
			System.out.printf("%d �� �Ҽ�~!!!\n", num);
		else
			System.out.printf("%d �� �Ҽ� �ƴ�~!!!\n", num);
		
		//% flag ���� > �������� �Ǵ� ���


	}
}

// ��� ���

/*
������ ���� �Է� : 100
100 �� �Ҽ� �ƴ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է� : 97
97 �� �Ҽ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է� : 1
1 �� �Ҽ� �ƴ�~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/