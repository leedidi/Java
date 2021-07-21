/*===================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - if ~ else �� �ǽ�
 ===================================*/

 // ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
 // ������ ���� ���·� ����ϴ� ���α׷��� �ۼ��Ѵ�.
 // ����� ��� ���¸� �������� �����Ͽ� ó���Ѵ�.

 // 90�� ~ 100�� : A		80�� ~ 89�� : B
 // 70�� ~ 79��  : C		60�� ~ 69�� : D
 // 60�� �̸�	 : F

 // ��, BufferedReader �� Ȱ���Ͽ� �����͸� �Է¹��� �� �ֵ��� �ϸ�,
 // printf() �޼ҵ带 ���� ����� �� �ֵ��� �����Ѵ�.

 // ���� ��)
 // �̸� �Է� : �չ���
 // ���� ���� : 90
 // ���� ���� : 80
 // ���� ���� : 70

 // >> ����� �̸��� �չ����Դϴ�.
 // >> ���� ������ 90,
 // >> ���� ������ 80,
 // >> ���� ������ 70.
 // >> ������ 240�̰�, ����� 80�Դϴ�.
 // >> ����� B �Դϴ�.
 // ����Ϸ��� �ƹ� Ű�� �������� ...

/* [���� �ۼ��� �ڵ�]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ���� 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int kor, eng, mat, tot;
		double avg;
		char grade;

		// ���� �� ó�� (@ �� ������ �������� ���� ��� ����)

		System.out.print("�̸� �Է� : ");
		name = br.readLine();
		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� ���� : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		avg = tot / 3.0;

		//grade �� ����
		// 90�� ~ 100�� : A		80�� ~ 89�� : B
        // 70�� ~ 79��  : C		60�� ~ 69�� : D
        // 60�� �̸�	 : F

		if( avg > 89 )
		grade = 'A';
	    else if ( avg > 79)
			{ grade = 'B';
			}
			else if (avg > 69)
			{ grade = 'C';
			}
				else if(avg > 59)
				{ grade = 'D';
				}
			else 
				{ grade = 'F';
				}		

		// ��� �Է�
		
		System.out.printf(" \n >> ����� �̸��� %s�Դϴ�.\n", name);
		System.out.printf(" >> ���� ������ %d,\n",kor);
		System.out.printf(" >> ���� ������ %d,\n",eng);   
		System.out.printf(" >> ���� ������ %d,\n",mat);
		System.out.printf(" >> ������ %d�̰�, ����� %.2f�Դϴ�.\n", tot, avg);
		System.out.printf(" >> ����� %s �Դϴ�.\n", grade);
		//@ ���� ����: %d / �Ǽ� ����: %f / ���ڿ� ���� : %s / \n: ����

	}
}
*/
// [���� �ۼ��� �ڵ�]


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;        //--�̸�
		int kor, eng, mat;	//-- ����, ����, ���� ����
		int tot;			//-- ����
		//int tot = 0;
		double avg;			//-- ���
		//char grade;	
		char grade='F';			//-- ��� //@ else �Ƚᵵ ��Ÿ��� �ȳ��͵� �����ִ°� ����� �ִ� ��

		System.out.print("�̸� �Է� : ");
		name = br.readLine();

		System.out.print("���� ���� : ");
		kor = Integer.parseInt(br.readLine());
		//tot += kor;

        System.out.print("���� ���� : ");
		eng = Integer.parseInt(br.readLine());
		//tot += eng;

		System.out.print("���� ���� : ");
		mat = Integer.parseInt(br.readLine());
		//tot += mat;

		// ���� ����
		tot = kor + eng + mat;

		// ��� ����
		avg = tot / 3.0;		//-- check~!! �ǿ��������� �ϳ� �Ǽ��� �ؾ� �Ǽ������ ���� ����!

		// ��� ����(@ ����!)

		// 90 <= ��� < = 100 / ���ǿ����� ����ϴ� �����̳�, Java������ ���������� �����Ҽ� ���� ����

		// �� �� �� �̻��� ���� ���� �� �� ������
		// ����� 90���̻� / ����� 100������(���� �ΰ��� ����)
		// ����� 90���̻� and ����� 100������ (@���� Ʋ���� or�� ��ٰ��ص� ���� ��Ÿ���� ����! ����)

		/*
		if (avg<=100)
		{
		}
		else
		{
			System.out.println("���� �Է� ����");
		}
		*/

		if (avg>=90)
		{
			// ����� A
			grade = 'A';
		}
		//else if (avg>=80 && avg<90) //(80�� ~ 89�� : B) // 80 <= avg < 90 // ��� ������ �̹� 90�����ΰ� ��Ÿ��
		else if (avg>=80)
		{
			//����� B
			grade = 'B';
		}
		else if (avg >= 70)
		{
			//����� C
			grade = 'C';
		}
		else if (avg>=60)
		{
			//����� D
			grade = 'D';
		}
		/* else if (avg<60)
		{
			//����� F
			grade = 'F';
		}
		*/

		//@ if(){} ~ else{} : �� ����. �� �߰��� �ٸ��� ���� X. ~�� �Ǵٸ� if, else{} �ȿ� �Ǵٸ� if �ִ°� ������
		//@ if~else ������ �� else�� ������ �Ѵ�? X! �� �׷��� ��. if(){} ~ else{}: �̹� ���� ������


		// ���� ��� ���
		
		System.out.println();
		System.out.printf(">> ����� �̸��� %s�Դϴ�.\n", name);
		System.out.printf(">> ���� ������ %d,\n",kor);
		System.out.printf(">> ���� ������ %d,\n", eng);
		System.out.printf(">> ���� ������ %d,\n", mat);
		System.out.printf(">> ������ %d�̰�, ����� %.2f�Դϴ�.\n", tot, avg);
		System.out.printf(">> ����� %c �Դϴ�.\n", grade);




	}
}

// ���� ���
/*
�̸� �Է� : �չ���
���� ���� : 90
���� ���� : 80
���� ���� : 70

>> ����� �̸��� �չ����Դϴ�.
>> ���� ������ 90,
>> ���� ������ 80,
>> ���� ������ 70,
>> ������ 240�̰�, ����� 80.00�Դϴ�.
>> ����� B �Դϴ�.
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/


// ���� ���
/*
�̸� �Է� : �̴ٿ�
���� ���� : 95
���� ���� : 90
���� ���� : 90

 >> ����� �̸��� �̴ٿ��Դϴ�.
 >> ���� ������ 95,
 >> ���� ������ 90,
 >> ���� ������ 90,
 >> ������ 275�̰�, ����� 91.67�Դϴ�.
 >> ����� A �Դϴ�.
*/