/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - String Ŭ����
===========================================*/

public class Test133
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
		//--==>> seoul korea

		// �� ���ڿ� ����
		System.out.println(s.substring(6, 9));
		//--==>> kor
		//-- ��String.substring(s, e)��
		//     String ���ڿ��� �������
		//     s ��°����... e-1 ��°����...
		//     (��, �ε����� 0���� ����)

		System.out.println(s.substring(7));
		//--==>> orea
		//-- ��String.substring(s)��
		//    String ���ڿ��� �������
		//    s ��°���� ������... (��, ���ڿ��� ���� ���̸�ŭ...)

		// �� ���ڿ��� ������(��) ��
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("Seoul Korea"));
		//--==>> true
		//		 false
		//-- ��ҹ��� ����

		System.out.println(s.equalsIgnoreCase("Seoul KOrea"));
		//--==>> true
		//-- ��ҹ��� ���� ����

		// �� ã���� �ϴ� ��� ���ڿ�(s)��
		//    ��kor�� ���ڿ��� �����ұ�?
		//    �����Ѵٸ�... �� ��ġ�� ��� �ɱ�?

		// "seoul korea"
		System.out.println(s.indexOf("kor"));
		//--==>> 6
		//@ s��� ��� ���ڿ��� kor�̶�� ���ڿ��� �����ϸ� �� ��ġ�� �ε��� 6��°��!

		System.out.println(s.indexOf("ea"));
		//--==>> 9

		System.out.println(s.indexOf("e"));
		//--==>> 1
		//@ ��ĳ�� �տ������� �س����� ������.. �տ��� ã���� ��!

		System.out.println(s.indexOf("tt"));
		//--==>> -1
		//-- ã���� �ϴ� ���ڿ��� ��� ���ڿ��� ������ ���
		//   �� ���ڿ��� �ε����� ��ȯ������
		//   �������� ���� ��� ������ ��ȯ�ϰ� �ȴ�. (-1)
	
		
		// �� ��� ���ڿ�(s)�� ��rea���� ���������� ���� Ȯ��
		//    (true / false)
		//@ � ���� ��������(��ȯ�ϴ�����) ���� ��~!!
		System.out.println(s.endsWith("rea"));
		//--==>> true

		System.out.println(s.endsWith("oul"));
		//--==>> false
		
		// �� ã���� �ϴ� ��� ���ڿ�(s)��
		//    ��e�����ڿ��� �����ұ�?
		//     �����Ѵٸ� �� ��ġ�� ��� �ɱ�?
		//     (��, �ڿ������� �˻�)

		// seoul korea
		System.out.println(s.indexOf("e"));
		//--==>> 1

		System.out.println(s.indexOf("o"));
		//--==>> 2

		System.out.println(s.lastIndexOf("e"));
		//--==>> 9
		
		System.out.println(s.lastIndexOf("o"));
		//--==>> 7

		// �� ��� ���ڿ�(s) ��
		//    ��6����° �ε��� ��ġ�� ���ڴ�?

		// seoul korea
		System.out.println(s.charAt(6)); //@ ĳ���;��̶�� �θ�
		//--==>> k

		System.out.println(s.charAt(10));
		//--==>> a

		//System.out.println(s.charAt(22));
		//--==>> ���� �߻�(��Ÿ�� ����)
		//		 �� StringIndexOutOfBoundsException

		// �� ��� ���ڿ�(s)�� �� ���ڿ� ��seoul corea�� ��
		//    � ���ڿ��� �� ū��?
		//    �� ���ڿ��� �ٸ��ٸ� ���̸� Ȯ�� ( �� ������ �迭)

		System.out.println(s.compareTo("seoul korea"));
		//--==>> 0

		System.out.println(s.compareTo("seoul corea"));
		//--==>> 8 (c ~ k �� defghijk)


		// �� ��� ���ڿ�(s) ��
		//    �ش� ���ڿ��� ã�Ƽ� ���ϴ� ���·� ����
		s = "�츮���� ���ѹα� ���ѵ��� ����";
		s = s.replaceAll("����", "����");
		System.out.println(s);
		//--==>> �츮���� ���ֹα� ���ֵ��� ����

	
		// �� ���� ����
		s = "       ��         ��        ";
		System.out.println(":" + s + ":");
		//System.out.println(s);
		//--==>> :       ��         ��        :

		System.out.println(":" + s.trim() + ":");
		//@ �ڹٿ����� trim : ���� ������ ����. (like ������� ���� ���! �츮���� �����ߴ� ������� �귣�� trim ����..)
		//--==>> :��         ��:
		//@ ���� ������ �߶󳻴°Ծƴ϶� �ϳ��ϳ� �ǰ��ǰ� �߶󳽴ٰ� �����ϱ�!
		//-- ���� �����ڸ� ���� ����

		System.out.println(":" + s.replaceAll(" ", "")+":");
		//--==>> :���:


		//int n = Integer.parseInt("30");
		s = Integer.toString(30);
		System.out.println(s);
		//--==>> 30

		int n = 2345678;
		System.out.printf("%d", n);
		System.out.format("%d", n);
		//--==>> 23456782345678

		//@ String.format(); :  ���� printf�� ����. ��� ��� X �� ������ ���ڿ��� ��ȯ��.
		s = String.format("%d", n);
		System.out.println(s);
		//--==>> 2345678

		s = String.format("%, d", n); //@ ����ǥ���� ������ ǥ��! ex> 1,000��
		System.out.println(s); 
		//--==>> 2,345,678


		System.out.printf("%.2f", 3.141592);
		System.out.println();
		//--==>> 3.14

		s = String.format("%.2f", 3.141592);	// "3.14" @ �� s�� ���(���x)
		System.out.println("s ��� : " + s);
		//--==>> s ��� : 3.14
		
		
		String[] sArray = "�⺻,����,���".split(","); //@ ���ڿ� �迭�� ��ȯ
		
		for (String str: sArray) 
		//@ sArray�� String�迭, ���� �ϳ� ������ String!  << �� ����! �ϳ������� String �迭�� �ƴ�X. �� String��
		{
			System.out.print(str + "  ");
		}
		System.out.println();
		//--==>> �⺻  ����  ���



	}
}