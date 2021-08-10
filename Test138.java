/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Calendar Ŭ����
===========================================*/

/*
�� Calendar Ŭ������ �߻�Ŭ�����̱� ������ ��ü�� ������ �� ����. (@�� ���� ���� �����ϴ� �κ�!)
   (�߻� Ŭ���� : �̿ϼ��� Ŭ����)

   Calender ob = new Calendar();
   �� �̿� ���� ������ ���� �ν��Ͻ� ���� �Ұ�

�� Calendar ��ü(�ν��Ͻ�)�� ������ �� �ִ� ���

   1. Calendar ob1 = Calendar.getInstance();

   2. Calendar ob2 = new GregorianCalendar();
   //@ �׷���Ķ������ Ķ������ �ڽ�Ŭ����, Ķ������ �������ִ� ���� �������̵��ؼ� �ϼ����Ѱ� �ϼ��߰ڱ���, ��ĳ����~!!

   3. GregorianCalendar ob3 = new GregorianCalendar();

   (�� GregorianCalendar : Calendar Ŭ������ ���� Ŭ����)
*/

// ������ ��, ��, ��, ������ Calendar ��ü�� Ȱ���Ͽ� ���

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test138
{
	public static void main(String[] args)
	{
		// Calenar Ŭ���� ��� �ν��Ͻ� ����
		//Calendar rightNow = new Calendar();	//--(��)
		Calendar rightNow = Calendar.getInstance();

		// ������ �޷�(Calendar) �ν��Ͻ��� ����
		// ��¥ ���� ������ �� �� �ִ� �޼ҵ� �� ��get()��
		int y = rightNow.get(Calendar.YEAR); //@ rightnow.year�� �ƴϰ�, �빮�� YEAR,,, static final!
		System.out.println(y);
		//--==>> 2021

		int m = rightNow.get(Calendar.MONTH) + 1;		//-- ��+1�� check~!!! //@ �迭ó�� ���ĵǱ� ������, ���������� +1 �ʿ�!
		System.out.println(m);
		//--==>> 8

		int d = rightNow.get(Calendar.DATE);
		System.out.println(d);
		//--==>> 10

		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(w);
		//--==>> 3

		System.out.println(y + "-" + m + "-" + d + " " + w);
		//--==>> 2021-8-10 3

		// �׽�Ʈ
		System.out.println(Calendar.SUNDAY);		//--==>> 1 �� �Ͽ���
		System.out.println(Calendar.MONDAY);		//--==>> 2 �� ������
		System.out.println(Calendar.TUESDAY);		//--==>> 3 �� ȭ����
		System.out.println(Calendar.WEDNESDAY);		//--==>> 4 �� ������
		System.out.println(Calendar.THURSDAY);		//--==>> 5 �� �����
		System.out.println(Calendar.FRIDAY);		//--==>> 6 �� �ݿ���
		System.out.println(Calendar.SATURDAY);		//--==>> 7 �� �����
		
		System.out.println();	// ����

		String week = "";
		switch (w)
		{
			//case 1: week = "�Ͽ���"; break;
			case Calendar.SUNDAY: week = "�Ͽ���"; break;

			//case 2: week = "������"; break;
			case Calendar.MONDAY: week = "������"; break;

			//case 3: week = "ȭ����"; break;
			case Calendar.TUESDAY: week = "ȭ����"; break;

			//case 4: week = "������"; break;
			case Calendar.WEDNESDAY: week = "������"; break;

			//case 5: week = "�����"; break;
			case Calendar.THURSDAY: week = "�����"; break;

			//case 6: week = "�ݿ���"; break;
			case Calendar.FRIDAY: week = "�ݿ���"; break;

			//case 7: week = "�����"; break;
			case Calendar.SATURDAY: week = "�����"; break;
		
		}

		System.out.println(y + "-" + m + "-" + d + " " + week);
		//--==>> 2021-8-10 ȭ����


		////////////////////////////////////////////////////////////////////////////////////
		System.out.println();


		// Calendar ��ü ����
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"�Ͽ���", "������", "ȭ����", "������", "�����", "�ݿ���", "�����"};

		// �޷��� ��¥ ���� �� ��set()�� �޼ҵ� Ȱ��
		rightNow2.set(2021, 11, 24); // 12�� check~!!! (2021�� 12�� 24��) //@ �迭 �ε��� ���� ���� ���� -1 ����� ��

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//--==>> 6 �� �ݿ���

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> �ݿ���
		

		// �޷��� ��¥ ���� �� ������ �������
		rightNow2.set(2021, 9, 27); //@<< 2021�� 10�� 27�ϻ��̾�!
		
		// ���� Ȯ��
		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> ������
	}
}