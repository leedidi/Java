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
	
	}
}