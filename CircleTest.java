/*====================================
  ■■■ 클래스와 인스턴스 ■■■
 =====================================*/

 // ※ Test066.java 파일과 세트~!!!


 // 원의 넓이와 둘레 구하기
 // 원의 넓이와 둘레를 구할 수 있는 클래스를 설계한다.
 // (클래스명 : CircleTest) → CircleTest.java
 // Test065.java 파일을 참조하되
 // 위와 같이 두 개의 파일로 나누어 작업을 수행한다.
 // 또한, BufferedReaeder 를 활용한다.

 // 원의 넓이 = 반지름 * 반지름 * 3.141592
 // 원의 둘레 = 반지름 * 반지름 * 2 * 3.141592

 // 실행 예)
 // 반지름 입력 : 13

 // 반지름이 13인 원의
 // 넓이 : xxx.xx
 // 둘레 : xxx.xx
 // 계속하려면 아무 키나 누르세요...

 /*
// [내가 작성한 코드]
public class CircleTest // 원 클래스 설계
{
	int cirArea()
	{
		int result = 0;
		result = r * r * 3.141592;
		return result;
	}
	
	int cirLength()
	{
		int result = 0;
		result = r * r * 2 * 3.141592;
		return result;
	}
	
 // 반지름이 13인 원의
 // 넓이 : xxx.xx
 // 둘레 : xxx.xx
 // 계속하려면 아무 키나 누르세요...
	void print(double a=, double b)
	System.out.printf("반지름이 %d인 원의\n", r);
	System.out.printf("넓이 : %.2f\n", a);
	System.out.printf("둘레 : %.2f\n",b);

}
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CircleTest // 원 클래스 설계
{
	// 주요 속성
	int r;						//-- 반지름
	final double PI = 3.141582;	//-- 원주욜 (변수의 상수화)

	// 기능(동작, 행위)
	// 반지름 입력 기능
	void input() throws IOException // IOException 메소드에 붙이는 것!
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//@ 버퍼드리더 여기서만 필요. 여기서 생성. 만약 다른데서 다 쓰더라도 clas 하단에 바로쓰는건 좋지않음..
		//@ 다른 클래스에서 불러올때 buffered까지 메모리에 넣기 때문... 문법적으로 문제되는 건 아님
		System.out.print("반지름 입력 : ");
		r = Integer.parseInt(br.readLine());
	}

	// 넓이 연산 기능
	double calArea() //@ 받아와야할 매개변수X, 반환해야하는 형태 double
	{
		double result = 0;	//@ 중간에서 다른 작업할수 있으므로.... 초기화해놓으면 에러 안 생김. 보통 결과값 나타내는 건 초기화시켜놈!
		result = r * r * PI;
		return result;

	}

	// 둘레 연산 기능
	double calLength()
	{
		double result = 0;
		result = r * 2 * PI;
		return result;
	}

	// 출력 기능
	void print(double a, double l)
	{
		 // 반지름이 13인 원의
		 // 넓이 : xxx.xx
		 // 둘레 : xxx.xx

		System.out.printf("\n반지름이 %d인 원의\n", r);
		System.out.printf("넓이 : %.2f\n", a);
		System.out.printf("둘레 : %.2f\n", l);

	}

} // 런타임에러! 얘는 컴파일만 하면 됨! 컴파일시 circleTest.class 만들어짐, 대신 main메소드 없어서 실행은 안됨