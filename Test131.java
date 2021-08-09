/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스
===========================================*/

//@ 아 이코너에 시식코너가 있네, 이코너에 이불을 파네~~ 하고 부담없이 넘어가기
//@ int만 플마 21억정도구나~~~ 정도만 알기. 나머진 외우지 말기!

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
		//@ 다들 static final 찍어보고 있는 겁니당~!!
		
		System.out.println();

		System.out.println("1 : " + 3.0/0);
		//--==>> 1 : Infinity (@ 무한대)
		System.out.println("2 : " + -3.0/0);
		//--==>> 2 : -Infinity

		System.out.println("3 : " + (3.0/0 == 3.0/0));
		System.out.println("3 : " + (3.0/0 == -3.0/0));
		//--==>> 3 : true
		//--==>> 3 : false

		// 『Double.isInfinite()』
		System.out.println("5 : " + Double.isInfinite(3.0/0));
		System.out.println("6 : " + Double.isInfinite(-3.0/0));
		//--==>> 5 : true
		//		 6 : true

		//@ to~~~ : 99.9퍼센트 뭔가 변환을 가진 메소드
		//@ is~~~ : 99.9퍼센트 ~인지 아닌지 판별해서 true false를 반환하는 메소드

		System.out.println("7 : " + (3.0/0 + -3.0/0));
		System.out.println("8 : " + (0.0/0));
		//--==>> 7 : NaN ( → Not a Number : @ 숫자가 아님! 실무에서도 난~ 이라고 함.)
		//--==>> 8 : NaN

		System.out.println("9 : " + (0.0/0 == 0.0/0));
		System.out.println("10: " + (0.0/0 != 0.0/0));
		//--==>> 9 : false
		//		 10: true
        //@ 무한대는 숫자 개념 O, NaN은 숫자가 아니므로 숫자가 아닌거끼리 크기 비교를 어떻게 합니까! 하는 의미(false)

		// ※ NaN(Not a Number) 값과 임의의 수를
		//    『==』 연산자를 통해 비교 연산을 수행하게 되면
		//    결과는 언제나 『false』를 반환한다.
		//@ 기억해놓기!
		
		// 『Double.isNaN()』
		System.out.println("11: " + Double.isNaN(0.0/0));
		System.out.println("12: " + Double.isNaN(1.1+2.2));
		//--==>> 11: true
		//		 12: false
		//@ 클래스명.메소드명() -> 클래스 메소드, 정적 메소드
		
		//@ 시간 있을 때마다 api도큐먼트 보며 다른 메소드, 속성값 확인해보기~~!!!
	}
}