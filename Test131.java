/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Wrapper Ŭ����
===========================================*/

//@ �� ���ڳʿ� �ý��ڳʰ� �ֳ�, ���ڳʿ� �̺��� �ĳ�~~ �ϰ� �δ���� �Ѿ��
//@ int�� �ø� 21����������~~~ ������ �˱�. ������ �ܿ��� ����!

public class Test131
{
	public static void main(String[] args)
	{
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//--==>> 2147483647
		//		 -2147483648

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		//--==>> 9223372036854775807
		//		 -9223372036854775808

		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		//--==>> 1.7976931348623157E308
		//		 4.9E-324
		//@ �ٵ� static final ���� �ִ� �̴ϴ�~!!
		
		System.out.println();

		System.out.println("1 : " + 3.0/0);
		//--==>> 1 : Infinity (@ ���Ѵ�)
		System.out.println("2 : " + -3.0/0);
		//--==>> 2 : -Infinity

		System.out.println("3 : " + (3.0/0 == 3.0/0));
		System.out.println("3 : " + (3.0/0 == -3.0/0));
		//--==>> 3 : true
		//--==>> 3 : false

		// ��Double.isInfinite()��
		System.out.println("5 : " + Double.isInfinite(3.0/0));
		System.out.println("6 : " + Double.isInfinite(-3.0/0));
		//--==>> 5 : true
		//		 6 : true

		//@ to~~~ : 99.9�ۼ�Ʈ ���� ��ȯ�� ���� �޼ҵ�
		//@ is~~~ : 99.9�ۼ�Ʈ ~���� �ƴ��� �Ǻ��ؼ� true false�� ��ȯ�ϴ� �޼ҵ�

		System.out.println("7 : " + (3.0/0 + -3.0/0));
		System.out.println("8 : " + (0.0/0));
		//--==>> 7 : NaN ( �� Not a Number : @ ���ڰ� �ƴ�! �ǹ������� ��~ �̶�� ��.)
		//--==>> 8 : NaN

		System.out.println("9 : " + (0.0/0 == 0.0/0));
		System.out.println("10: " + (0.0/0 != 0.0/0));
		//--==>> 9 : false
		//		 10: true
        //@ ���Ѵ�� ���� ���� O, NaN�� ���ڰ� �ƴϹǷ� ���ڰ� �ƴѰų��� ũ�� �񱳸� ��� �մϱ�! �ϴ� �ǹ�(false)

		// �� NaN(Not a Number) ���� ������ ����
		//    ��==�� �����ڸ� ���� �� ������ �����ϰ� �Ǹ�
		//    ����� ������ ��false���� ��ȯ�Ѵ�.
		//@ ����س���!
		
		// ��Double.isNaN()��
		System.out.println("11: " + Double.isNaN(0.0/0));
		System.out.println("12: " + Double.isNaN(1.1+2.2));
		//--==>> 11: true
		//		 12: false
		//@ Ŭ������.�޼ҵ��() -> Ŭ���� �޼ҵ�, ���� �޼ҵ�
		
		//@ �ð� ���� ������ api��ť��Ʈ ���� �ٸ� �޼ҵ�, �Ӽ��� Ȯ���غ���~~!!!
	}
}