/*========================================
   ���� ����(Sort) �˰��� ����
   - ���� ���� ����(Bubble Sort)
 =========================================*/

 // ����ڷκ��� ���� �л��� ���� �����͸� �Է¹޾�
 // ������ ���� ������ ���� ������ ����� �ο��Ͽ�
 // ����� ����ϴ� ���α׷��� �����Ѵ�.
 // ��, �迭�� ���� �˰����� Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

 // ���� ��)
 // �ο� �� �Է� : 5
 // �̸� ���� �Է�(1) : ������ 90
 // �̸� ���� �Է�(2) : ������ 80
 // �̸� ���� �Է�(3) : ������ 85
 // �̸� ���� �Է�(4) : ����ȣ 75
 // �̸� ���� �Է�(5) : ����ȭ 95
 /*
 ---------------------
 1�� ����ȭ 95
 2�� ������ 90
 3�� ������ 85
 4�� ������ 80
 5�� ����ȣ 75
 ---------------------
 ����Ϸ��� �ƹ� Ű�� ��������...
 */

 //@ ���� �� ����
 //@ ���� ���� ��Ʈ ���� ���� ����! �׷��� � �����̵� ����ص� ��
 //@ ~11:30 ���� �ذ�/ ���� ��ȸ�ǽ�, ���� �� Ǯ����! ��ȸ�ǽ� �ȿ��� �ڵ� �����ϱ�

import java.util.Scanner;

public class Test106
{	
	
	public static void main(String[] args)
	{
		int n=0;
		// String name;
		// int score;
		// i��° �̸� �迭, i��° ���� �迭 ����
		// ���� ���� ������ �迭...

		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� �Է� : ");
		n = sc.nextInt();

		int[] score = new int[n];
		String[] name = new String[n];
		boolean flag = false;

		int[] ns = new int[n];

		for (int i=0; i<n; i++)
		{
			System.out.printf("�̸� ���� �Է�(%d) : ", i+1);
			name[i] = sc.next();
			score[i] = sc.nextInt();			
		}
		
		// �׽�Ʈ
		/*
		for (int i=0; i<n; i++)
			{
			System.out.printf("%d��° �̸� ���� : %s, %d\n", i+1, name[i], score[i]);   
			}
		*/

		// ���
		System.out.println("---------------------");

		String temp = " ";
		
		// -- ���� ������� ��� ���� �迭�ϱ�
		for (int i=0; i<score.length-1; i++)			//* �� ���ǿ� int ������ �ʰ� ����~!!
		{	
			//flag = false;
			
			for (int j=i+1; j<score.length; j++)
			{ 
				if (score[i]<score[j])
				{
				score[i] = score[j]^score[i];		//* ; ������ �ʰ� ����~!!
				score[j] = score[i]^score[j];
				score[i] = score[j]^score[i];

				//flag = true;
				temp = name[i];  
				name[i] = name[j];
				name[j] = temp;	
				}
				
				// flag �־ flag = true�� �̸��� �ٲٱ�
				
				/*
				if (flag == true)
				{
					//name[i] = name[j]^name[i];
					//name[j] = name[i]^name[j];
					//name[i] = name[j]^name[i];
							
				}
				*/

			
			}
		}
		
		for (int i=0; i<score.length; i++)
		{
			System.out.printf("%d�� %s %d\n", i+1, name[i], score[i]);
		}
		

		System.out.println("---------------------");
		

	}
}

// ���� ��� // �ȴ� �Ф�!!
/*
�ο� �� �Է� : 5
�̸� ���� �Է�(1) : ������ 90
�̸� ���� �Է�(2) : ������ 80
�̸� ���� �Է�(3) : ������ 85
�̸� ���� �Է�(4) : ����ȣ 75
�̸� ���� �Է�(5) : ����ȭ 95
---------------------
1�� ����ȭ 95
2�� ������ 90
3�� ������ 85
4�� ������ 80
5�� ����ȣ 75
---------------------
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/ 