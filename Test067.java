/*==================================
   ■■■ 클래스와 인스턴스 ■■■
 ===================================*/

 // 사용자로부터 임의의 정수를 입력받아
 // 1부터 입력받은 수 까지의 합을 연산하여
 // 결과값을 출력하는 프로그램을 구현한다.

 // 단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
 // 또한, 입력 처리 과정에서 BufferedReader 를 활용하며,
 // 입력 데이터가 1 보다 작거나 1000 보다 큰 경우
 // 다시 입력받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

 // 실행 예)
 // 임의의 정수 입력(1~1000) : 1022
 // 임의의 정수 입력(1~1000) : -20
 // 임의의 정수 입력(1~1000) : 100
 // >> 1 ~ 100 까지의 합 : 5050
 // 계속하려면 아무 키나 누르세요...


// [함께 작성한 코드]

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
// import java.io.IOException; 한줄로 아래, 위에서 사용하는 IO 다 가능!

 class Hap 
 {
	 //주요 변수 선언(사용자의 입력값을 담아둘 변수)
	 int su;

	 // 입력 메소드 정의
	 void input() throws IOException
	 {	
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 do
	     {
		 System.out.print("임의의 정수 입력(1~1000) : ");
		 su = Integer.parseInt(br.readLine());
		 }
		 while (su<1 || su>1000);
	 }

	 // 연산 처리 메소드 정의
	 int calculate()
	 {
		int result = 0;
		
		for(int i=1; i<=su; i++)
			result += i;

		return result;
	 }

	 // 결과 출력 메소드 정의
	 void print(int sum) //@ 합 어디 안 담겨있기 때문에, 새로 담아줌
	 {
		 System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", su, sum);
	 }

 }

// import java.io.IOException;
//@ import~~ 여기 안씀! 항상 클래스가 설계되기 이전에 모든 임포트구문이 작성되어 있어야 함
public class Test067
{
	public static void main(String[] args) throws IOException
	{	
		// Hap 클래스 인스턴스 생성
		Hap ob = new Hap();

		// 생성한 인스턴스를 통해 입력 메소드 호출
		ob.input();

		// 생성한 인스턴스를 통해 연산 처리 메소드 호출
		int s = ob.calculate(); //@반환한거 담아둠

		// 생성한 인스턴스를 통해 결과 출력 메소드 호출
		ob.print(s);
	}
}

// [내가 작성한 코드]
/*
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

 class Hap 
 {
	// 주요 속성
	int n;

	// 임의의 정수 입력 기능
	void input() throws IOException
	{

	// 데이터가 1보다 작거나 1000보다 큰 경우 다시 입력
	do 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("임의의 정수 입력(1~1000) : ");
		n = Integer.parseInt(br.readLine());
	 }

	 while(n<1 || n>1000);
	}

	 
	 // 1 ~ n까지의 정수 합 구함
	 int sumsum()
	 {
		 int result = 0;
		 for(int i=1; i<=n; i++)
		 result += i;
		 return result;
	 }
	
	//1 ~ n까지의 정수 합 출력
	 void print(int a)
	 {
		 System.out.printf(">> 1 ~ %d까지의 합 : %d\n",n,a);
	 }
 }



public class Test067
{
	public static void main(String[] args) throws IOException
	{	
		// Hap 클래스 인스턴스 생성
		Hap ob = new Hap();

		// 생성된 Hap 인스턴스를 통해 입력 메소드 호출
		ob.input();

		// 생성된 Hap 인스턴스를 통해 연산 메소드 호출
		int a = ob.sumsum();

		// 생성된 Hap 인스턴스를 통해 출력 메소드 호출
		ob.print(a);
	}
}
*/

// 실행 결과
/*
임의의 정수 입력(1~1000) : -3
임의의 정수 입력(1~1000) : 10000
임의의 정수 입력(1~1000) : 100
>> 1 ~ 100까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력(1~1000) : 2000
임의의 정수 입력(1~1000) : -20
임의의 정수 입력(1~1000) : 200
>> 1 ~ 200 까지의 합 : 20100
계속하려면 아무 키나 누르십시오 . . .
*/