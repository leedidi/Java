/*===================================
  ■■■ 연산자(Operator) ■■■
  - 논리 연산자
 ===================================*/


public class Test025
{
	public static void main(String[] args)
	{
		boolean a = true, b = false;

		System.out.printf("a && b : %b\n", (a&&b));
		System.out.printf("a || b : %b\n", (a||b));
		System.out.printf("!a     : %b\n", !a);
		System.out.printf("!b     : %b\n", !b);
		//@ 주의! 논리연산자에서 문제 생겼을때는 대부분 우리가 인지못하고 넘어갈때 많음.
		//  조심스럽게 생각하고, 체크 필요!
	}
}

//실행 결과
/*
a && b : false
a || b : true
!a     : false
!b     : true
계속하려면 아무 키나 누르십시오 . . .
*/