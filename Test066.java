/*====================================
  ■■■ 클래스와 인스턴스 ■■■
 =====================================*/

 // ※ CircleTest.java 파일과 세트~!!!

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

//[내가 만든 코드]
/*
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test066
{
// 실행 예)
	// 반지름 입력 : 13
	public static void main(String[] args) throws IOException // 원의 반지름 입력
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("반지름 입력 : ");
	int r = Integer.parseInt(br.readLine());

	CircleTest ob= new CircleTest();
	}

}
*/

//import java.io.BufferedReader;
//import java.io.InputStreamReader; //@ 얘네 여기서 쓰는게 아니니까.. 안 해도 됨!
import java.io.IOException;			//@ 얘는 여기서 쓰니까 해야함!

public class Test066
{

	public static void main(String[] args) throws IOException
	{	
		// CircleTest 클래스 인스턴스 생성
		CircleTest ob = new CircleTest();

		// 생성된 인스턴스 ob 를 통해 반지름 입력 메소드 호출
		ob.input();

		// 생성된 인스턴스 ob 를 통해 연산 메소드 호출
		double b = ob.calArea(); //@ 어떤 이름이든 상관없음! like 피아노 키티

		// 생성된 인스턴스 ob 를 통해 둘레 연산 메소드 호출
		double t = ob.calLength();

		// 생성된 인스턴스 ob 를 통해 출력 메소드 호출
		ob.print(b, t);
	}
}

// 실행 결과
/*
반지름 입력 : 23

반지름이 23인 원의
넓이 : 1661.90
둘레 : 144.51
계속하려면 아무 키나 누르십시오 . . .
*/