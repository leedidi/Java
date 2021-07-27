/*==================================
   ■■■ 클래스와 인스턴스 ■■■
 ===================================*/

 // 사용자로부터 임의의 두 정수와 연산자를 입력받아
 // 사칙연산을 수행하는 프로그램을 구현한다.
 // 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.

 // 실행 예)
 // 임의의 두 정수 입력(공백 구분) : 10 5
 // 임의의 연산자 입력(+ = * /)	   : +
 // >> 10 + 5 = 15
 // 계속하려면 아무 키나 누르세요...

// [같이 작성한 코드]

import java.util.Scanner;
import java.io.IOException;

 class Calculate
 {
	 // 주요 변수 선언
	 int su1, su2;	//-- 사용자로부터 입력받은 두 정수를 담아둘 변수
	 char op;		//-- 사용자로부터 입력받은 연산자를 담아둘 변수

	Calculate() //@ 우리가 컴파일하는 과정에서 생성자가 없다면(사용자가 만든 사용자 정의 생성자)
	 {			//@ 자동으로 생성자가 삽입이 됨. 왼쪽 형태로. (※ 이거 중요한 문법임!)
		 // 텅 비어있는 형태
		 // System.out.println("생성자 확인");
	 }

	 // 메소드 정의(기능 : 입력)
	 void input() throws IOException //@ System.in.read 때문!
	 {	
		 Scanner sc = new Scanner(System.in);
		 System.out.print("임의의 두 정수 입력(공백 구분) : ");
		 su1 = sc.nextInt();
		 su2 = sc.nextInt();
		 System.out.print("임의의 연산자 입력(+ = * /)    : ");
		 op = (char)System.in.read();
	 }

	 // 메소드 정의(기능 : 연산)
	 int cal()
	 {
		int result = 0;
		
		switch(op)
		 {
			case '+' : result = su1 + su2; break;
			case '-' : result = su1 - su2; break;
			case '*' : result = su1 * su2; break;
			case '/' : result = su1 / su2; break;
		 }

		return result;
	 }


	 // 메소드 정의(기능 : 출력)
	 void print(int s)
	 {
		 System.out.printf(">> %d %c %d = %d\n", su1, op, su2, s); 

 }
 }

public class Test068
{
	public static void main(String[] args) throws IOException
	{
		// Calculate 클래스 인스턴스 생성
		Calculate cal = new Calculate();

		cal.input();
		int result = cal.cal();
		cal.print(result);

		//cal.actionPerfomed();
		//cal.Calculate();

	}
}


// [내가 작성한 코드]
/*
import java.util.Scanner;
//import java.io.InputStreamReader;
//import java.io.BufferedReader;
import java.io.IOException;

 class Calculate
 {
	 // 주요 변수 선언
	 int n1, n2;		// 사용자에게 입력받을 임의의 두 정수
	 char op;			// 사용자에게 입력받을 임의의 연산자

	 // 입력 메소드 정의
	 void input() throws IOException
	 {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		//n1 = Integer.parseInt(br.readLine()); 

		System.out.print("임의의 연산자 입력(+ = * /) : ");
		op = (char)System.in.read();
	 }

	 // 연산 처리 메소드 정의
	 int calculate()
	 {
		 int result = 0;
		 if(op == '+')
			 result = n1 + n2;
			 else if (op == '-')
				result = n1 - n2;
			   else if (op == '*')
				  result = n1 * n2;
				else if(op == '/')
			 		result = n1/n2;
					else
						result = -1;

		 return result;

	 }
	 // 결과 출력 메소드 정의
	 void print(int sum)
	 {
		 System.out.printf(">> %d %c %d = %d\n", n1,op, n2, sum);
	 }
 }

public class Test068
{
	public static void main(String[] args) throws IOException
	{
		// Calculate 인스턴스 생성
		Calculate ob = new Calculate();

		// 생성한 인스턴스를 통해 입력 메소드 호출
		ob.input();

		// 생성한 인스터스를 통해 연산 처리 메소드 호출
		int sum = ob.calculate();

		// 생성한 인스터스를 통해 결과 출력 메소드 호출
		ob.print(sum);
	}
}

*/

// 실행 결과
/*
임의의 두 정수 입력(공백 구분) : 10 10
임의의 연산자 입력(+ = * /) : *
>> 10 * 10 = 100
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 두 정수 입력(공백 구분) : 20 15
임의의 연산자 입력(+ = * /)    : +
>> 20 + 15 = 35
계속하려면 아무 키나 누르십시오 . . .
*/