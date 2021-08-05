/*===========================
   ■■■ 클래스 고급 ■■■
   - 상속(Inheritance)
 ============================*/

// 다음과 같은 프로그램을 구현한다.
// 단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분) : 20 15
// 연산자 입력(+ - * /) : -
// >> 20 - 15 = 5.00
// 계속하려면 아무 키나 누르세요...

//@ A 클래스는 건들지x, B 클래스를 설계해서 해보기....
//@@@ Test109_1(로 만들어서 내가 해결해보고) 같이 해결 하는건 Test109로 저장하는거도 방법임!!
//@@@ 런타임에러면 출력서식 printf 잘못 썼을 확률 있음!!!


// [내가 작성한 코드]
/*
import java.util.Scanner;
import java.io.IOException;

class Aclass
{
	protected int x,y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	}
}

class Bclass extends Aclass
{
	// 상속받은 것들

	//void write(double result)
	//{
	//	System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	//}
	//
	
	public Bclass()
	{
		super();
	}

	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력(공백 구분) : ");
		super.x = sc.nextInt();
		super.y = sc.nextInt();

		System.out.print("연산자 입력(+ - * /) : ");
		super.op = (char)System.in.read();
		
	}

	int calc()
	{
		int result = 0;

		switch(op)
		{
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = x / y; break;
		}
		
		return result;

	}


}

public class Test109
{
	public static void main(String[] args) throws IOException
	{
		Bclass bc = new Bclass();
		bc.input();
		int result = bc.calc();
		
	}
}
*/

//[같이 작성한 코드]

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

// super class
class Aclass
{
	protected int x,y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	}
}

// sub class → Aclass 를 상속받는 클래스
class Bclass extends Aclass
{
	/*
	protected int x,y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	}
	*/
	
	/*
	Bclass() //@ 사용자 임의 생성자 삽입없을때 자동 삽입
	{
		super();
	}
	*/

	// 입력
	/////@@@ 왜 오류나지....????? >> return value 없음 아마 boolean이라서? > 맞넼ㅋ 오류 아님!
	boolean input() throws IOException
	{
		//@ bufferedReader로 입력받아 문자열 잘라내기 해봄
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("임의의 두 정수 입력(공백 구분) : "); // : 20 15
		//int su1 = sc.nextInt();
		//int su2 = sc.nextInt();
		String temp = br.readLine();		 // "20 15" <<@ 문자열 형태
		String[] strArr = temp.split("\\s"); // 구분자 → 공백! //@ " " 라고 하면 안됨~!
		// String[] strArr = {"20", "15"}

		// ※ 문자열.split("구분자")
		//    ex) "10 20 30 40".split("\\s"); //@ \s : 공백, 문자열 내에서는 \\s로 작성해야 함
		//										  \t 탭, \n 엔터 \s 치면 기다려버림! 
		//									      %도 %만 치면 기다리고 \도 \만 쓰면 기다림 > &&,\\ 작성
		//        → {"10", "20", "30", "40"} 반환

		if (strArr.length != 2)
			return false;

		//-- false 를 반환하며 input() 메소드 종료
		//   이 조건을 수행할 경우....
		//   이 코드의 아래에 수행해야 할 코드가 남아있더라도
		//   결과값을 반환하며 메소드는 종료된다.

		//@ return 뒤에 ...; ...; 쓰면 에러 남

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("연산자 입력(+ - * /) : ");
		op = (char)System.in.read();
		
		/*
		if(op != '+' && op != '-' && op != '*' && op != '/')
		{
			return false;
		}
		return true;
		*/

		if (op=='+' || op=='-' || op=='*' || op=='/')
		{
			return true;
		}
		return false;

	}//end input();

	double calc()
	{
		double result = 0;

		switch(op)
		{
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = (double)x / y; break; //@ 둘중 하나를 실수형태로 해서 실수형태로 결과값 반환
		}
		return result;

	}// end calc()

}//end Bcalss

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test109
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();
		
		if (!ob.input()) //@ false라면! //@ IOException 사용... 위에 적어줘야 함
		{
			System.out.println("Error...");
			return; // 프로그램 종료
		}
		
		double result = ob.calc();

		ob.write(result);

	}//end main()

}// end class Test109

/*
임의의 두 정수 입력(공백 구분) : 25 17
연산자 입력(+ - * /) : -
>> 25 - 17 = 8.00
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 두 정수 입력(공백 구분) : 1
Error...
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 두 정수 입력(공백 구분) : 10 20 30
Error...
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 두 정수 입력(공백 구분) : 10 20
연산자 입력(+ - * /) : 2
Error...
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 두 정수 입력(공백 구분) : 25 2
연산자 입력(+ - * /) : *
>> 25 * 2 = 50.00
계속하려면 아무 키나 누르십시오 . . .
*/
