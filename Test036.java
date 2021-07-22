/*==========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - switch �� �ǽ�
 ==========================================================*/

/*
�� ���� ���ù��̶� �ϸ�, swith �� ������ ���� ���� ����
   ���� ������ ���� �������� �б��� �� ����ϴ� �����̴�.

�� ���� �� ����
   switch(����)
   {
	   case ���1: ����1; [break;] (@ []: �־ �ǰ� ��� �Ǵ� ����)
	   case ���2: ����2; [break;]
				.
				.
	   [defalt : ����n+1; [break;]]
	   }

	   switch ���� �����ġ� �� case�� ���������
	   byte, short, int, long �̾�� �Ѵ�.

	   case �� �ڿ� ��break;�� �� ���� ������ ���
	   ���� case ���� ������ ����ؼ�(�̾) �����ϰ� �ȴ�. (�� �⺻ ��)

*/

// ����� �̸��� ���±� �Դϴ�.
// ������ xx, ����� xx �Դϴ�.
// ����� A �Դϴ�.


//
/*
if() >> true/ flase
{
}

switch(n) >> ���
{	(@�⺻��)
	case 1 : ....; ( @n=1 �̸� �������� ��, ��������. ���� 2,3 �� ������. 1�� �����ϴ°� X) 
						ex>> å�� �ٿ����� ����Ʈ��. ǥ���� ����Ʈ�� ���ĺ��� ������ å ��! 					
	case 2 : .....;
	case 3 : .....; (@n=3 �̸� �������� ��, 3�� ����) (case 3 : ... case 1 ... case 2... ������ ����!)

	default : ......; (@ n�� 1�� �ƴϰ� 2�� �ƴϰ� 3�� �ƴҶ� �����ϴ� ����) (default ���, �� ������, �߰��� ���־ ����)
																		     (�ٸ� default �����ϰ�� n=7�̸� default, 1,2,3 ������� �ټ���)
	(@�Ϲ���)
	default : ....; (@ n=7�϶� �길 ����)
			 break;
	case 3 : ....;  (@ n=3 3���� 2���� ����)
	case 2 : ....;	(@ n = 2 2�� ����)
			 break;
	case 1 : ....;
			 break;
	}

	>> break ������ �ش� �� ���� ������ ����� switch�� ��������!
	

	-- break; : �����. + (��...�׸��� ����������) << �׻� �̷��� �����ϱ�!!
	-- continue; : (�ڵ޺κ� �����ϰ�....) + ����Ѵ�. << �׻� �̷��� �����ϱ�!!
	
	(@�Ǵٸ� ����)
	case 1 : case 2 : case 3:
			.....;    (@ ����Ʈ�� å���κи��� å ���κп��� ���ϼ� ����! �������������� ���ϼ� ����!)

			
	case 1 : System.out.println("Simple JAVA");
					break;
	case 2 : System.out.println("Simple JAVA");
					break;
	case 3 : System.out.println("Simple JAVA");
					break;

					(=)

	case 1 : case 2 : case 3: System.out.println("Simple JAVA");
					break;

*/


/*
// [���� ���� �ڵ�]
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

*/
		

/*	[�������� ������ ������] - ����Ȯ�μ��� �Ϸ�!
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�������� �Է� : 
		System.out.print("�������� �Է� : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է�: ");
		int mat = Integer.parseInt(br.readLine);
*/
		
/*
		System.out.print("�̸� �Է� : ");
		String name = br.readLine();

		System.out.print("�������� �Է� : " );
		int kor = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : " );
		int eng = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : " );
		int mat = Integer.parseInt(br.readLine());

		// ��� - ���ǻ� ������ ó��
		int avg = (kor+eng+mat) / 3;

		char grade;

		switch(avg/10)
		{
			case 10 : case 9:
			grade = 'A';
			break;
			case 8:
			grade = 'B';
			break;
			case 7 :
			grade = 'C';
			break;
			case 6 :
			grade = 'D';
			break;
			default :
			grade = 'F';
		}

		System.out.printf("\n����� �̸��� %s �Դϴ�.", name);
		System.out.printf("\n������ %d, ����� %d �Դϴ�.", (kor+eng+mat),avg);
		System.out.printf("\n����� %c �Դϴ�.\n", grade);

	}
}
*/

//���� �ۼ��� �ڵ�


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�̸� �Է� : ");
		String name = br.readLine();

		System.out.print("�������� �Է� : " );
		int kor = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : " );
		int eng = Integer.parseInt(br.readLine());
		System.out.print("�������� �Է� : " );
		int mat = Integer.parseInt(br.readLine());

		// ��� - ���ǻ� ������ ó��
		int avg = (kor+eng+mat) / 3;

		char grade = 'F';
	
		/*
		if (avg>=90)
			grade = 'A';
		else if(avg >=80)
			grade = 'B';
		else if(avg >=70)
			grade = 'C';
		else if(avg >=60)
			grade = 'D';
		//else 
		//	grade = 'F';
		*/

		/*
		switch (avg)
		{
			case 100: grade ='A'; break;
			case 99: grade ='A'; break;
			case 98: grade ='A'; break;
			         ..
			case 2: grade ='F'; break;
			case 1: grade ='F'; break;
			case 0: grade ='F'; break;
	
		}
		*/
		
		/*switch (avg/10)
		{
			case 10: grade ='A'; break;
			case 9: grade ='A'; break;
			case 8: grade ='B'; break;
			case 7: grade ='C'; break;
			case 6: grade ='D'; break;
			case 5: grade ='F'; break;
			case 4: grade ='F'; break;
			case 3: grade ='F'; break;
			case 2: grade ='F'; break;
			case 1: grade ='F'; break;
			case 0: grade ='F'; break;
	
		}
		*/
		
		/*
		switch (avg/10)
		{
			case 10: grade ='A'; break;
			case 9: grade ='A'; break;
			case 8: grade ='B'; break;
			case 7: grade ='C'; break;
			case 6: grade ='D'; break;
			default : grade = 'F'; break;
	
		}

		*/

			switch (avg/10)
		{
			case 10: case 9: grade ='A'; break;
			case 8: grade ='B'; break;
			case 7: grade ='C'; break;
			case 6: grade ='D'; break;
			// default : grade = 'F'; break;
	
		}
	
		// ��� ���
		System.out.printf("\n����� �̸��� %s �Դϴ�.\n", name);
		System.out.printf("������ %d, ����� %d �Դϴ�.\n", (kor+eng+mat), avg);
		System.out.printf("����� %c �Դϴ�.\n", grade);


	}
}


// ���� ���

/*
����� �̸��� �̴ٿ� �Դϴ�.
������ 255, ����� 85 �Դϴ�.
����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
�̸� �Է� : ����ȣ
�������� �Է� : 98
�������� �Է� : 97
�������� �Է� : 55

����� �̸��� ����ȣ �Դϴ�.
������ 250, ����� 83 �Դϴ�.
����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/