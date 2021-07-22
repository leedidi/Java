/*===================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - if ~ else 문 실습
 ===================================*/

// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 5		//9
// 두 번째 정수 입력 : 15		//5
// 세 번째 정수 입력 : 10		//9

// >> 정렬 결과 : 5 10 15		// 5 9 9
// 계속하려면 아무 키나 누르세요...

/*[내가 만든 코드]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 및 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : " );
		b = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : " );
		c = Integer.parseInt(br.readLine());
		

		// a b c 숫자 작은 순서대로 정렬

		if(a>b)
		{
			a = a^b; 
			b = b^a; 
			a = a^b;
		}
		if(a>c)
		{
			a = a^c;
			c = c^a;
			a = a^c;
		}
		if(b>c)
		{
			b = b^c;
			c = c^b;
			b = b^c;
		}

		// 결과 출력(@결과 입력 아니고 출력임~!!)

		System.out.printf("\n>> 정렬 결과 : %d %d %d\n", a, b, c);
	}
}
*/

//함께 만든 코드

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 int a,b,c;	//-- 사용자가 입력하는임의의 정수 세 개를 담을 각각의 변수

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("첫 번째 정수 입력 : ");
		c = Integer.parseInt(br.readLine());

		// 7 8 2	8 6 13   10 50 30    9 30 45
		// ---      ---      ----		 ----    (@첫번째 정수가 두번째 정수보다 크면 자리 바꿔라)
		//          6 8 13	 
		// -  -     -   --	  --    --  --    -- (@첫번째 정수가 세번째 정수보다 크면 자리 바꿔라)
		// 2 8 7	6 8 13	 10 50 30    9 30 45
		//    --      -----     -----      -----
		// 2 7 8	6 8 13	 10 30 50	 9 30 45 (@두번째 정수가 세번째 정수보다 크면 자리 바꿔라)
		
		if(a>b) // 만약 첫 번째 정수(a)가 두 번째 정수(b)보다 크다면 ....
		{	
			//				a와 b 두 정수의 자리를 바꾼다.
			a=a^b;
			b=b^a;
			a=a^b;

			// 테스트
			//System.out.println("자리바꿈 발생~!!!");
		}
		if(a>c)// 만약 첫 번째 정수(a)가 세 번째 정수(c)보다 크다면 ...		//@ else if 쓰면안됨! 1단계 통과하면 2 수행 안됨
		{	
			//				a와 c 두 정수의 자리를 바꾼다.
			a=a^c;
			c=c^a;
			a=a^c;
			
			// 테스트
			/////System.out.println("자리바꿈 발생~!!!");
		}
		if(b>c)// 만약 두 번째 정수(c)가 세 번째 정수(c)보다 크다면 ...
		{
			//				b와 c 두 정수의 자리를 바꾼다.
			b=b^c;
			c=c^b;
			b=b^c;



			
			// 테스트
			//System.out.println("자리바꿈 발생~!!!");
		}


		// 결과 출력
		System.out.printf("\n>> 정렬 결과 : %d %d %d\n", a, b, c);
	}
}


//실행 결과

/*
첫 번째 정수 입력 : 5
두 번째 정수 입력 : 5
세 번째 정수 입력 : 9

>> 정렬 결과 : 5 5 9
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 : 7
두 번째 정수 입력 : 8
첫 번째 정수 입력 : 2

>> 정렬 결과 : 2 7 8
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 : 8
두 번째 정수 입력 : 6
첫 번째 정수 입력 : 13

>> 정렬 결과 : 6 8 13
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 50
첫 번째 정수 입력 : 30

>> 정렬 결과 : 10 30 50
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 : 9
두 번째 정수 입력 : 30
첫 번째 정수 입력 : 45

>> 정렬 결과 : 9 30 45
계속하려면 아무 키나 누르십시오 . . .
*/