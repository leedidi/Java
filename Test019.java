/*==========================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 산술 연산자
  - BufferedReader
  - printf()
 ===========================================*/

// 사용자로부터 임의의 정수를 두 번 입력받아
// 사칙연사 및 나머지 연산을 수행하여
// 그 결과를 출력하는 프로그램을 구현한다.
// 단, 입력받은 과정은 BufferedReader 를 활용할 수 있도록 하고
// 출력하는 과정은 printf() 메소드를 활용할 수 있도록 한다.
// 또한, 나눗셈 연산은 편의상 정수 기반으로 처리한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 2

// ====[결과]====
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2 = 20
// 10 / 2 = 5
// 10 % 2 = 0
// ==============
// 계속하려면 아무 키나 누르세요...

/*
[내가 한 것]


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test019_1
{
	public static void main(String[] args) throws IOException //@요기 ; 들어간게 문제였음!
		{
		// ○ 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;

		// ○ 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		// ○ 결과 출력
		
		System.out.printf("\n");
		System.out.printf("\n=====[결과]=====\n");
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
		System.out.printf("===============\n");
		}
}
*/



/*
[다른 친구가 한 것] (참고)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test019
{
	public static void main(String[] args) throws IOException
	{	
		// ○ 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a,b;
		
		// ○ 연산 및 처리

		System.out.print("첫 번째 정수 입력 : ");
		a= Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b= Integer.parseInt(br.readLine());

		// ○ 결과 출력
		
		System.out.printf("\n");
		System.out.printf("\n=====[결과]=====\n");
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
		System.out.printf("===============\n");
	}
}
*/

// [같이 풀이한 것]

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test019
{
	public static void main(String[] args) throws IOException
	{	
		//주요 변수 선언
		int num1, num2;
		int res1, res2, res3, res4, res5;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		//연산 및 처리
		System.out.print("첫 번째 정수 입력 : " );
		num1= Integer.parseInt(br.readLine());

		
		System.out.print("두 번째 정수 입력 : " );
		num2= Integer.parseInt(br.readLine());

		res1 = num1 + num2;
		res2 = num1 - num2;
		res3 = num1 * num2;
		res4 = num1 / num2;
		res5 = num1 % num2;

		// 결과 출력
		System.out.printf("\n====[결과]====\n");

		System.out.printf("%d + %d = %d\n", num1, num2, res1);
		System.out.printf("%d - %d = %d\n", num1, num2, res2);
		System.out.printf("%d * %d = %d\n", num1, num2, res3);
		System.out.printf("%d / %d = %d\n", num1, num2, res4);
		System.out.printf("%d %% %d = %d\n", num1, num2, res5); //@ %나오면 자바가 움찔! 아 그뒤 d,s, ... 썼구나!
															    //@ 양 d 사이의 % : 앗 얘가 뭐 안쓴거 같은데? 누락이구나 생각(옵션문자라생각)
															    //@ 그래서 '%%' 사용! 긴장풀어 자바야 이건 그냥 %야~!

		System.out.printf("==============\n");
			
			}
}
//실행 결과
/*
====[결과]====
20 + 5 = 25
20 - 5 = 15
20 * 5 = 100
20 / 5 = 4
20 % 5 = 0
==============
계속하려면 아무 키나 누르십시오 . . .
*/