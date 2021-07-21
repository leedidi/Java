/*===================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - if ~ else 문 실습
 ===================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
// 단, if 조건문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수형으로 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력	: 20
// 두 번째 정수 입력	: 14
// 연산자 입력[+ = * /] : +
// @ 연산자는 한 자리의 문자,,!

// >> 20 + 14 = 34
// 계속하려면 아무 키나 누르세요...


//[내가 만든 코드]
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1, n2, strResult;
		char oper;

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력[+ - * /] : ");
		oper = (char)System.in.read();

		if(oper == '+')
		{
			strResult = n1 + n2;
		}
			else if(oper == '-')
			{
				strResult = n1 - n2;
			}
				else if(oper == '*')
				{
					strResult = n1 * n2;
				}
					else if(oper == '/')
					{
						strResult = n1 / n2;
					}
						else
						{ 
							System.out.print("연산자를 잘못 입력하셨습니다.");
							}

		// 결과 입력

		// >> 20 + 14 = 34
		
		System.out.printf(">> %d %c %d = %fd\n", n1, oper, n2, strResult); 

	}
}
*/

/* [다른 친구가 한거] >> 됨!

		if(oper == '+')
		{ System.out.printf(">> %d %c %d = %d\n", n1, oper, n2, n1+n2);
		}
			else if(oper == '-')
			{ System.out.printf(">> %d %c %d = %d\n", n1, oper, n2, n1-n2);
			}
				else if(oper == '*')
				{ System.out.printf(">> %d %c %d = %d\n", n1, oper, n2, n1*n2);
				}
					else if(oper == '/')
					{ System.out.printf(">> %d %c %d = %d\n", n1, oper, n2, n1/n2);
					}
						else
						{ System.out.print("연산자를 잘못 입력하셨습니다.");
							}
							
*/
//[같이 만든 코드]

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test032
{
	public static void main(String[] args) throws IOException //(@버퍼드리더 readLine(), System.in.read(); 다 이거로 서명 가능!!),
	{

		/*
		// 방법 ①

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a, b;   //-- 첫번째, 두 번째 정수
		char op;	//-- 연산자(문자열 비교법 아직 모르니 stringx, 일단 문자 char로!)

		System.out.print("첫 번째 정수 입력 : " );
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : " );
		b = Integer.parseInt(br.readLine());
		
		// Integer.parseInt()
		// "1234" → Integer.parseInt() → 1234
		// "abcd" → Integer.parseInt() → (X)

		System.out.print("연산자 입력[+ - * /] : " );
		// op = br.readLine(); 문자 = 문자열(안 담김!)
		// op = Integer.parseInt(br.readLine()); //"+" >> @ 숫자형태가 아님, 바뀌지 않음
		// op = System.in.read(); //@ char = int
		op = (char)System.in.read(); //얘는 아스키코드 가져오는거! 버퍼드리더는 문자열고대로가져오는거!!!

		// 확인(테스트)
		//System.out.print("op : " + op);
		//op= 43;

		if(op=='+') // 43 == 43(아스키코드)
		{
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		}
		else if(op=='-')	//45 == 45
		{
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		}
		else if(op=='*')	//42 == 42
		{
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		}
		else if(op=='/')	//47 == 47
		{
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		}
		else
		{
			System.out.printf("\n>> 입력 과정에 오류가 존재합니다.\n");
		}

       */
		
		/*
		// 방법 ②
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//check~!!!
		int a, b, op;   //-- 첫번째, 두 번째 정수, 그리고 연산자
		
		System.out.print("첫 번째 정수 입력 : " );
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : " );
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : " );
		op = System.in.read();

		// 확인(테스트)
		//System.out.print("op : " + op);

		// 확인(테스트)
		//System.out.print("op : " + op);

		if(op==43) // 43 == 43(아스키코드)  //@ 아래 라인 한줄일 때, {} 블레이스, 생략 가능! 
											//@ 들여쓰기 주의! 막하면 엉망진창 알아보기 힘듬
			System.out.printf("\n>> %d + %d = %d\n", a, b, (a+b));
		else if(op==45)	//45 == 45
			System.out.printf("\n>> %d - %d = %d\n", a, b, (a-b));
		else if(op==42)	//42 == 42
			System.out.printf("\n>> %d * %d = %d\n", a, b, (a*b));
		else if(op==47)	//47 == 47
			System.out.printf("\n>> %d / %d = %d\n", a, b, (a/b));
		else
			System.out.printf("\n>> 입력 과정에 오류가 존재합니다.\n");

		*/

		// 방법 ③
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//check~!!!
		//int a, b, result; 
		int a, b, result=0; //@(주의!! else 없다면 result 값 처음에 담아줘야함. 미리 초기화해줘야함!) 
		char op;
		
		System.out.print("첫 번째 정수 입력 : " );
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : " );
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력[+ - * /] : " );
		op = (char)System.in.read();

		// 확인(테스트)
		//System.out.print("op : " + op);

		// 확인(테스트)
		//System.out.print("op : " + op); 

		if(op=='+') // 43 == 43(아스키코드)  //@ 아래 라인 한줄일 때, {} 블레이스, 생략 가능! 
											 //@ 들여쓰기 주의! 막하면 엉망진창 알아보기 힘듬
			result = a + b;
		else if(op==45)	//45 == 45
			result = a - b;
		else if(op==42)	//42 == 42
			result = a * b;
		else if(op==47)	//47 == 47
			result = a / b;
		else
			result = -1; //@ 0,-1 등 오류 값이라는걸 알 수 있는, 구분할 수 있는 값 담기

		System.out.printf("\n>> %d %c %d = %d\n", a, op, b, result);
			//@ %c : 문자




	}
}

// 입력 결과

/*
첫 번째 정수 입력 : 21
두 번째 정수 입력 : 6
연산자 입력[+ - * /] : -

>> 21 - 6 = 15
계속하려면 아무 키나 누르십시오 . . .
*/



/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 5
연산자 입력[+ - * /] : +

>> 10 + 5 = 15
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 5
연산자 입력[+ - * /] : -

>> 10 - 5 = 5
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 5
연산자 입력[+ - * /] : *

>> 10 * 5 = 50
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 5
연산자 입력[+ - * /] : /

>> 10 / 5 = 2
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 5
연산자 입력[+ - * /] : >

>> 입력 과정에 오류가 존재합니다.
계속하려면 아무 키나 누르십시오 . . .
*/
