/*==========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - switch �� �ǽ�
 ==========================================================*/

 // 1 ���� 3 ������ ���� �� �ϳ��� ����ڷκ��� �Է¹޾�
 // �Է¹��� ������ŭ�� ������(��)�� ��µǴ� ���α׷��� �ۼ��Ѵ�.
 // ��, �� ���� ������� ������ �� �ֵ��� �Ѵ�.

 // �� switch ���� �Ϲ� ���� ����Ͽ� �ذ��Ѵ�.
 // �� switch ���� �⺻ ���� ����ϵ�,
 //	   ��break;�� �� �� �� ���� ����� �� �ֵ��� �����Ѵ�.
 // @ �� << ���� �Է� ��� : �� + ���� + 7��!
 // ����Ʈ + end Ű�� ctrl+R, ���� ���� ������ �� �� �� Ŭ�� ����!!

 // ���� ��)
 // ������ ���� �Է�(1~3) : 3
 // �ڡڡ�
 // ����Ϸ��� �ƹ� Ű��...

  // ������ ���� �Է�(1~3) : 1
  // ��
  // ����Ϸ��� �ƹ� Ű��...

  // ������ ���� �Է�(1~3) : 7
  // �Է� ����~!!!
  // ����Ϸ��� �ƹ� Ű��...


  //���� ���� �ڵ�

/*

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{	
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;	// ����ڰ� �Է��� ������ ����(1~3)

		// ���� �� ó��
		System.out.print("������ ���� �Է�(1~3) : ");
		n = Integer.parseInt(br.readLine());
		
		// ��� ���

		//�� switch ���� �Ϲ� ���� ��� >> break ��� O

*/
		/*
		switch(n)
		{
		case 1 : System.out.print("��\n"); break;
		case 2 : System.out.print("�ڡ�\n"); break;
		case 3 : System.out.print("�ڡڡ�\n"); break;
		default : System.out.print("�Է� ����~!!!\n"); break;
		}
		*/

/*
		//�� switch ���� �⺻ ���� ��� >> break �� �ѹ��� ��� O
		switch(n)
		{
		default : System.out.print("�Է� ����~!!!\n"); break;
		case 3: System.out.print("��");
		case 2: System.out.print("��");
		case 1: System.out.print("��");
		System.out.println();
		}

		
	}
}
		
	*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			int n ;

			System.out.print("������ ���� �Է�(1~3) : ");
			n = Integer.parseInt(br.readLine());

			// ��
			/*
			switch (n)
			{
			case 1 : System.out.println("��"); break;
			case 2 : System.out.println("�ڡ�"); break;
			case 3 : System.out.println("�ڡڡ�"); break;
			default : System.out.println("�Է� ����~!!!"); break; //(@��׵鿡 println ���� ���� \n�߰� ���ص� ��!)
			}
			*/

			// ��
			switch (n)
			{
			default : System.out.println("�Է� ����~!!!"); 
			
			break; //@ ���� �÷��� ����  �Ʒ��� ������ ����! default ~ case 321 ���̿� break�� ������ ��
			
			case 3 : System.out.print("��"); 
			case 2 : System.out.print("��"); 
			case 1 : System.out.print("��\n"); 

		
			}



			}
	}

// �Բ� �ۼ��� �ڵ�


/*
������ ���� �Է�(1~3) : 1
��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . . 
*/

/*
������ ���� �Է�(1~3) : 2
�ڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է�(1~3) : 3
�ڡڡ�
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ ���� �Է�(1~3) : 7
�Է� ����~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/