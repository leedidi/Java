/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Calendar Ŭ����
===========================================*/

// �� �ǽ� ����
//    ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������ Ȯ���Ͽ�
//    ����� ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ���� ��¥ : 2021-8-11 ������
// �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

// ========[Ȯ�ΰ��]=========
// 200�� �� : xxxx-xx-xx x����
// ===========================
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� ���� ��¥�� �������� �� ���� ���ϴ� ���� �޼ҵ�
//    ����ü.add(Calendar.DATE, �� ��);�� - �󸶸�ŭ�� �� �������� �˼� �ְ� ��
//	  10�� �� ��ȸ�ǽ�, 10��~15������ ����

import java.util.Calendar;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test140
{
	public static void main(String[] args) throws IOException
	{
		Calendar cal = Calendar.getInstance();
		
		//int y = rightNow.get(Calendar.YEAR); 
		//System.out.println(y);
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH) +1;
		int d = cal.get(Calendar.DATE);
		int w = cal.get(Calendar.DAY_OF_WEEK);


	String week = "";
	switch (w)
		{
			//case 1: week = "�Ͽ���"; break;
			case Calendar.SUNDAY: week = "�Ͽ���"; break;
			case Calendar.MONDAY: week = "������"; break;
			case Calendar.TUESDAY: week = "ȭ����"; break;
			case Calendar.WEDNESDAY: week = "������"; break;
			case Calendar.THURSDAY: week = "�����"; break;
			case Calendar.FRIDAY: week = "�ݿ���"; break;
			case Calendar.SATURDAY: week = "�����"; break;
		
		}
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
	
		int plusday;

		// ���� ��¥ ���
		System.out.printf("���� ��¥ : %d-%d-%d %s\n", y,m,d,week);
		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? ");
		plusday = Integer.parseInt(br.readLine());
		
		System.out.println();
		System.out.println("========[Ȯ�ΰ��]=========");

	// �� ���� ��¥�� �������� �� ���� ���ϴ� ���� �޼ҵ�
	//    ����ü.add(Calendar.DATE, �� ��);�� - �󸶸�ŭ�� �� �������� �˼� �ְ� ��

		cal.add(Calendar.DATE, plusday);

		System.out.printf("%d�� �� : ", plusday);
		int fy = cal.get(Calendar.YEAR);
		int fm = cal.get(Calendar.MONTH) +1;
		int fd = cal.get(Calendar.DATE);
		int fw = cal.get(Calendar.DAY_OF_WEEK);

		String week2 = "";
		switch (fw)
		{
			//case 1: week = "�Ͽ���"; break;
			case Calendar.SUNDAY: week2 = "�Ͽ���"; break;
			case Calendar.MONDAY: week2 = "������"; break;
			case Calendar.TUESDAY: week2 = "ȭ����"; break;
			case Calendar.WEDNESDAY: week2 = "������"; break;
			case Calendar.THURSDAY: week2 = "�����"; break;
			case Calendar.FRIDAY: week2 = "�ݿ���"; break;
			case Calendar.SATURDAY: week2 = "�����"; break;
		
		}

		System.out.println(fy + "-" + fm + "-" + fd + " " + week2);

		System.out.println("===========================");

		//�̷���� �ƴϸ� ymdw�� add �ϰ� �ʱ�ȭ �ѹ� �������~!!

	}
}