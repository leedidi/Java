 /*==========================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 자바의 기본 입출력 : System.in.read()
 ===========================================*/


public class Test015
{
	public static void main(String[] args)
	{
		System.out.print("AAA");
		System.out.print("BBB");
		//System.out.print("CCC"\n);	//--==>> 에러 발생(컴파일 에러)
		System.out.print("CCC\n");		//--==>> 『\n』 개행
		//--==>> AAABBBCCC

		System.out.println();	//-- 개행
		//System.out.print()	//--==>> 에러 발생(컴파일 에러)

		System.out.printf("12345678901234567890");
		System.out.printf("12345678901234567890\n");	//-- 『\n』 개행
		System.out.printf("12345678901234567890%n");	//-- 『%n』 개행


		//System.out.printf();	//--==>> 에러 발생(컴파일 에러)

		System.out.printf("%d + %d + %d%n", 10, 20, 30);
		//--==>> 10 + 20 + 30

		System.out.printf("%d%n", 123);
		System.out.printf("%10d\n", 123); //@확보된 빈칸이 10개! 0000000(0 7개, 빈칸으로 나옴)123(3개)
		System.out.printf("%8d\n", 1234); //@확보된 빈칸이 10개! 0000(0 4개, 빈칸으로 나옴)1234(4개)
		System.out.printf("%010d\n", 123); //@확보된 빈칸이 10개! 0000000(0 7개, <0으로> 나옴)123(3개)
		//--==>>
		/*
				123
			   123
				1234
		0000000123
		*/

		System.out.printf("%+d\n", 365);
		System.out.printf("+%d\n", 365); //@★ 이거 쓰길 권장! 위 방법은 음수쓰면 에러남
		//--==>>
		/*
		+365
		+365
		*/

		System.out.printf("%d\n", 365);
		//--==>> 365

		//System.out.printf("%-d\n", 365);
		//--==>> 에러 발생(런타임 에러)
		System.out.printf("-%d\n", 365);
		//--==>> -365
		System.out.printf("%d\n", -365);
		//--==>> -365


		System.out.printf("%(d\n", -365); // @ "(" → 양수는 그대로 출력, 음수는 괄호안에 넣어서 표현
		//--==>> (365)
		System.out.printf("%(d\n", 365);
		//--==>> 365


		//System.out.printf("%d\n", 'A'); //@ 매개변수( ex> printf(★) << 요 별모양이 채워져 있기만하면 자바는 컴파일 과정에서 검사하지X. 
										//@ 컴파일에러X. 떠도 런타임에러만뜸
		//--==>> 에러 발생(런타임 에러)
		System.out.printf("%c\n", 'A'); //@ %c 오류!
		//--==>> A

		//System.out.printf("%c\n", "ABCD");
		//--==>> 에러 발생(런타임 에러)
		System.out.printf("%s\n", "ABCD");
		//--==>> ABCD

		System.out.printf("%h\n", 365);
		//--==>> 16d /@ 365를 16진수로 표현
		System.out.printf("%o\n", 24);
		//--==>> 30 /@ 24를 8진수로 표현. 진수마다 옵션문자 다르게 표현 가능

		System.out.printf("%b\n", true);	//     true       [vs]    "true"
											//@ 1바이트논리형		문자열 true
		//--==>> true

		System.out.printf("%f\n", 123.23); //@기본이 소수점이하 6자리까지 표현
		//--==>> 123.230000
		System.out.printf("%.2f\n", 123.23);//@소수점이하 2자리까지 표현
		//--==>> 123.23
		System.out.printf("%.2f\n", 123.231);
		//--==>> 123.23
		System.out.printf("%.2f\n", 123.236); //@ 반올림!
		//--==>> 123.24

		// System.out.printf("%10d\n", 123);
		System.out.printf("%8.2f\n", 123.236);
		//__123.24(8칸) //@ .도 자리하나 차지, 123.24 표현 해야하는 상황
		//--==>>  123.24
		System.out.printf("%2.2f\n", 123.236);
		//123.24 표현해야함
		//12
		//24
		//--==>> 123.24 //@내가 표현해야하는 부분보다 적은 자릿수 부여하면 그대로 나옴




}
}

// 실행 결과
/*
AAABBBCCC

1234567890123456789012345678901234567890
12345678901234567890
10 + 20 + 30
123
       123
    1234
0000000123
+365
+365
365
-365
-365
(365)
365
A
ABCD
16d
30
true
123.230000
123.23
123.23
123.24
  123.24
123.24
계속하려면 아무 키나 누르십시오 . . .

*/