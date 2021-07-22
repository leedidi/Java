/*==========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - switch 문 실습
 ==========================================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현한다.
// 단, switch 문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수형으로 처리될 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력	: 20
// 두 번째 정수 입력	: 14
// 연산자 입력[+ = * /] : +
// @ 연산자는 한 자리의 문자,,!

// >> 20 + 14 = 34
// 계속하려면 아무 키나 누르세요...

 /*
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

 public class Test038
 {
	 public static void main(String[] args) throws IOException
	 {
		 // [내가 작성한 코드] >> 마지막줄 오류남 왜지,,,???
		
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n1, n2;				// 사용자가 입력할 임의의 두 정수 n1, n2, 
		int result;			    //결과값 result;
		char op=0;				// 사용자가 입력할 임의의 연산자 op[+ = * /]

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력[+ = * /] : ");
		op = (char)System.in.read();
		
		1>
		switch(op)
		 {
			case '+' : result = n1 + n2; break;
			case '-' : result = n1 - n2; break;
			case '*' : result = n1 * n2; break;
			case '/' : result = n1 / n2; break;
			//default : System.out.println("잘못 입력하셨습니다.");
		 }
			System.out.printf("%d %c %d = %d", n1, op, n2, result);
		 2>
		switch(op)
		 {
			case 43 : n1 + n2; break;
			case 45 : n1 - n2; break;
			case 42	: n1 * n2; break;
			case 47 : n1 / n2; break;
			default : System.out.println("잘못 입력하셨습니다.");
		}
		*/
			
		// 결과 출력

		
	   //switch 문의 『수식』 과 case의 『상수』는
	   //byte, short, int, long 이어야 한다.


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

 public class Test038
 {
	 public static void main(String[] args) throws IOException
	 {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/****
		 // ①

		 int a, b, result=0;
		 int op; // 여기 어차피 아스키 코드로 들어감!

		 System.out.print("첫 번째 정수 입력 : ");
		 a = Integer.parseInt(br.readLine());
		 System.out.print("두 번째 정수 입력 : ");
		 b = Integer.parseInt(br.readLine());

		 System.out.print("연산자 입력[+ = * /] : ");
		 op = System.in.read();

		 // + → op : 43
		 // - → op : 45
		 // * → op : 42
		 // / → op : 47

		 switch (op) // 아스키 코드로 들어감!
		 {
			case 43: result= a+b; break;
			case 45: result= a-b; break;
			case 42: result= a*b; break;
			case 47: result= a/b; break;
			default: return; // -- ★중요!! check~!!! (@→ 메인 메소드 종료 → 프로그램 종료!)(@우리눈에보이는건 계속하려면 아무 키나..)
		 }

		 // ※ return 키워드가 지니는 두 가지 의미
		 //	   1. 값의 반환  // @지금 안 볼거! 클래스 메소드 웅앵들 공부할때 다시 볼 거
		 //    2. 메소드의 종료 → main() 메소드 종료 → 프로그램 종료
		 // return 등장시, 이 키워드 품고있는, 이 키워드 포함된 메소드를 찾아보면 <main> 이라는 이름 가진 <<메소드>> 안에 들어있음!!!
		 //  (it, switch 이런 하위 건 상관없음!!)

		 System.out.println();
		 System.out.printf(">> %d %c %d = %d\n", a, op, b, result); //@ op는 int인데도 %c로?
																	// %c 입력시 (+,-,*,/)로 나옴
																	// %d 입력시 43, 45, 42, 47 아스키코드로 나옴

			*/


		 // ②
		/*
		 int a, b, result;
		 int op; 

		 System.out.print("첫 번째 정수 입력 : ");
		 a = Integer.parseInt(br.readLine());
		 System.out.print("두 번째 정수 입력 : ");
		 b = Integer.parseInt(br.readLine());

		 System.out.print("연산자 입력[+ = * /] : ");
		 op = (char)System.in.read();

		 switch (op) 
		 {
			case '+': result= a+b; break;	//jdk 1.5부터 문자타입도 스위치 수식, case 상수영역에 지원 가능!
			case '-': result= a-b; break;
			case '*': result= a*b; break;
			case '/': result= a/b; break;
			default: return; 
		 }

		 System.out.println();
		 System.out.printf(">> %d %c %d = %d\n", a, op, b, result); 
	 }
 }

		*/

		// ③ >> @ 어엄청 대단한거 할거임! 근데 우리는 대단한거 딱히 못 느낄거..

		 int a, b, result;
		 String op;					// -- check~~!!!
	
		 System.out.print("첫 번째 정수 입력 : ");
		 a = Integer.parseInt(br.readLine());
		 System.out.print("두 번째 정수 입력 : ");
		 b = Integer.parseInt(br.readLine());

		 System.out.print("연산자 입력[+ = * /] : ");
		 op = br.readLine();		// -- check~~!!

		 switch (op) 
		 {
			case "+": result= a+b; break;	//jdk 1.7부터 스위치 수식, case 상수영역에 문자열 가능(String)
			case "-": result= a-b; break;	//버전더 외울정도는 아니지만 기억 정도는 하고 있기!
			case "*": result= a*b; break;
			case "/": result= a/b; break;
			default: return; 
		 }

		 System.out.println();
		 System.out.printf(">> %d %s %d = %d\n", a, op, b, result); //%s : 문자열 (%c는 문자)
	 }
 }

//실행 결과

/*
첫 번째 정수 입력 : 27
두 번째 정수 입력 : 7
연산자 입력[+ = * /] : -

>> 27 - 7 = 20
계속하려면 아무 키나 누르십시오 . . .
 */

 /*
첫 번째 정수 입력 : 25
두 번째 정수 입력 : 5
연산자 입력[+ = * /] : +

>> 25 + 5 = 30
계속하려면 아무 키나 누르십시오 . . .
 */

 /*
첫 번째 정수 입력 : 12
두 번째 정수 입력 : 3
연산자 입력[+ = * /] : *

>> 12 * 3 = 36
계속하려면 아무 키나 누르십시오 . . .

 */