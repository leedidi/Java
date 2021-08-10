/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Calendar Ŭ����
===========================================*/

/*
�� java.util.Calendar Ŭ������
   ��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
   ��, ��, ��, ����, ��, ��, �� ������
   �ð��� ��¥�� ���õ� ������ �����Ѵ�.
   �׸���, Calendar Ŭ������ �߻� Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
   �������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
   GregorianCalendar Ŭ������ ���ǵǾ� �ִ�.

   �ý������κ��� ���� �ý��� �ð� ������ ���� ��
   getInstance() ��� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
   ������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
   �� ��ü�� �����Ǹ� �����ִ� �ð� ��������
   get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.

   getInstance() �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
   �����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������
   ���� ���� �ִ�.
*/

// �� �ǽ� ����
//    ����ڷκ��� ��, ���� �Է¹޾�
//    �޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
//    ��, ����޷��� �ƴ϶� Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ���� �Է� : 0
// ���� �Է� : 2021
// �� �Է�   : -2
// �� �Է�   : 16
// �� �Է�   : 8
/*
         [2021�� 8��]

  ��  ��  ȭ  ��  ��  ��  ��
 ===========================
   1   2   3   4   5   6   7
   8   9  10  11  12  13  14
  15  16  17  18  19  20  21
  22  23  24  25  26  27  28
  29  30  31
 ===========================
 ����Ϸ��� �ƹ� Ű�� ��������...
 */


//[���� �ۼ��� �ڵ�]
/*
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test139
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
		
		// �ֿ� ���� ����
		int y, m;

		// �ֿ� ���� �Է�
		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է�   : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);
		

		// Calendar Ŭ������ �̿��Ͽ� �޷� �׸���

		// �׷����� Ķ���� ���

		Calendar rightNow = new GregorianCalendar();
		
		//-- ��¥....!!
		//-- d�� Ķ����Ŭ������ ����� �״��� ������ ��¥�� ���Ҽ� �ִ� ���,,?
		//   >> ���� �Է��ϸ� d�� �״��� ������ ��¥�� �Էµɼ� �ִ� ���?
		//   >> ������1�� -1...???? ??

		int d = rightNow.get(Calendar.DATE);
		System.out.println(d);

		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(w);


		// �޷� ���
		System.out.println();
		System.out.printf("         [%d�� %d��]     ", y, m);
		System.out.println();
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println(" ===========================");
		
		// Ư�� ���Ϻ��� 1���� ������ �� �ֵ��� ���� ����
		for (int i=0; i<=w; i++)
		{
			System.out.print("    ");
		}



		System.out.println(" ===========================");

	}
}
*/

// [���� �ۼ��� �ڵ�]

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Calendar;

public class Test139
{
	public static void main(String[] args) throws IOException
	{	
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

		// Calendar �ν��Ͻ� ����
		Calendar cal = Calendar.getInstance();

		// �ֿ� ���� ����
		int y, m;		//-- ��, ��
		int w;			//-- ����
		int i;			//-- �޷��� �׸��� �������� ����ϰ� �� ���� ����(@ �ݺ��� �������� ���� ����)
		
		do
		{
			System.out.print("���� �Է� : " );
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է� : " );
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);

		// ����ڷκ��� �Է¹��� ��(y), ��(m)�� �̿��Ͽ�
		// �޷��� ��¥ ����
		cal.set(y, m-1, 1);
		//-- �� ���� �� �Է°�(m)�� �״�� ����ϴ� ���� �ƴ϶�
		//   �Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�.
		//-- �� ���� �� �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�.
		//   �� ���� ���� Ȯ���� ���ؼ�...
		
		// ���� ��������
		w = cal.get(Calendar.DAY_OF_WEEK);
		
		// �׽�Ʈ
		//System.out.println(w);
		//--==>> ���� �Է� : 2021
		//		 �� �Է� : 8
		//		 1 �� 2021�� 8�� ���� �� �Ͽ��� �� 2021�� 8�� 1���� �Ͽ���~!!!

		// ��� ��� �� �޷� �׸���
		System.out.println();
		System.out.println("\t[ " + y + "�� " + m + "�� ]\n");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println(" ===========================");

		// �� ĭ ���� �߻�
		for (i=1; i<w; i++)
			System.out.print("    ");
		
		// �׽�Ʈ
		// System.out.printf("%4d", 1);
		
		// �� Calendar �� getActualMaximum() �޼ҵ�
		//System.out.println(cal.getActualMaximum(Calendar.DATE));
		
		for (i=1; i<=cal.getActualMaximum(Calendar.DATE); i++)
		{
			System.out.printf("%4d", i);
			w++;					//-- �ݺ����� �����ϸ� ��¥�� ������ �� ����
									//   ���ϵ� �Բ� ������ �� �ֵ��� ó��

			if(w%7 == 1)			//- ������ ������ �Ͽ����� �� �� ���� ���� �� ���
				System.out.println();	//-- ����

		}
		if(w%7!=1)
			System.out.println();

		System.out.println(" ===========================");

	}
}

// ���� ���
/*
���� �Է� : 2022
�� �Է� : 4

        [ 2022�� 4�� ]

  ��  ��  ȭ  ��  ��  ��  ��
 ===========================
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
 ===========================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

//@ �׷������� 1����� ����Ҽ� X! Ư�� �⵵ ���ĺ��� ����
//@ ��� ������ �����غ���! API ��ť��Ʈ�� ����...
//@ ������� ��ã�ڴ� ������ �Ͼ� �޸��� ����� ���� ���� �� �� �ĺ���! �װŵ� ���� ���� �����!