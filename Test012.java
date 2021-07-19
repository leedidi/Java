/*=====================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 퀴즈
    삼각형의 밑변의 길이와 높이를 사용자로부터 입력받아
	이 삼각형의 넓이를 구하는 프로그램을 구현한다.
 ======================================*/

// 실행 예)
// ■ 삼각형의 넓이 구하기 ■
// - 삼각형의 밑변 입력 : 3
// - 삼각형의 높이 입력 : 5

// >> 밑변이 3, 높이가 5인 삼각형의 넓이 : xxxxx
// 계속하려면 아무 키나 누르세요...

// ※ 삼각형의 넓이 = 밑변 * 높이 / 2 
//				      -----------
//		              사용자로부터 데이터를 입력받아 처리 → BufferedReader 활용

/* [내가 풀이한 내용] 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012
{ 
	public static void main(String[] args) throws IOException
	{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//주요 변수 선언
		int a; //삼각형의 밑변
		int b; //삼각형의 높이
		double c; // 삼각형의 넓이

		System.out.println("■ 삼각형의 넓이 구하기 ■");
		System.out.println(" - 삼각형의 밑변 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.println(" - 삼각형의 높이 입력 : ");
		b = Integer.parseInt(br.readLine());

		c =  a * b / 2.0;
		//System.out.println(">> 밑변이 " + a + "," + " 높이가 " + b + "인 삼각형의 넓이 : " + c); (수정)
		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n", a, b, c);
		// ※ 삼각형의 넓이 = 밑변 * 높이 / 2 
		*/
		
		//[같이 풀이한 내용]
		
import java.io.BufferedReader; //@ 한번 위에쓰면 하단 모든 버퍼드~가 강원도 횡성에사는 버퍼드리더로 특정됨
							   //@ 만약 안쓰면 각 버퍼드~ 나올때마다 java.io.BufferedReader... 로 써야됨 귀찮음 
import java.io.InputStreamReader;
// import java.lang.String; //@ lang = language, 얘네들은 자바가 임의로 미리 임포트 해놓음
// import java.lang.System; //@ ->import java.lang.*; (* : 모든 파일) 
// import java.lang.*;

import java.io.IOException;	// 추가~ ^^ - ★감사합니다ㅠㅠ

public class Test012
{
	//public static main(String[] args) throws IOException
	public static void main(String[] args) throws IOException
	{
		// ○ 주요 변수 선언

		//BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int bottomLength, height;	//-- 밑변과 높이
		double area;				//-- 넓이			check~!!!
		

		// ○ 연산 및 처리
		// ① 사용자에게 안내 메시지 출력
		System.out.println(" ■ 삼각형의 넓이 구하기 ■ ");
		System.out.print(" - 삼각형의 밑변 입력 : "); // @★여기서 println 쓰면 커서 아래로내려감! 그니까 print 쓰기

		// ② 사용자가 입력한 데이터를 정수 형태로 변환한 후
		//    변수 bottomLength 에 담아내기
		bottomLength = Integer.parseInt(br.readLine());

		// ③ 다시 사용자에게 안내 메세지 출력
		//System.out.println(" - 삼각형의 높이 입력 : ");
		System.out.print(" - 삼각형의 높이 입력 : ");

		// ④ 사용자가 입력한 데이터를 정수 형태로 변환한 후
		//	  변수 height 에 담아내기 (@ bufferedreader 또 쓸필요 X. 키보드는 한번만 꽂으면 여러번 쓸수있음)
		height = Integer.parseInt(br.readLine());

		// ⑤ 값이 채워진(담겨진) 변수들을 활용하여
		//	  삼각형의 넓이를 구하는 연산 수행
		// ※ 삼각형의 넓이 = 밑변 * 높이 / 2 
		//area = bottomLength * height / 2; // ★나눗셈은 실수기반하려면 2.0으로! 2로 하면 정수로 계산
		//       정수형     정수형 / 정수형  → 정수 기반 연산
		area = bottomLength * height / 2.0; // 후자 실수로 만들면 정수 x 실수 = 실수형  /// check~~!!!
		//        정수형      정수형 / 실수형 → 실수 기반 연산

		// ※ 실수 자료형이 결과값으로 산출되는 과정에서
		//	  실수 기반의 연산이 필요한 상황이다.
		//    정수형 『2』가 아닌 실수형 『2.0』으로 나눗셈 연산을 수행하게 되면
		//	  이 연산은 실수 기반으로 처리된다.


		// ○ 결과 출력
		System.out.println();	  // -- 매개변수 없음 → 개행
		//System.out.print();	  // -- 매개변수 없음 → 에러

		System.out.printf(">> 밑변이 %d, 높이가 %d인 삼각형의 넓이 : %.2f\n", bottomLength, height, area); //★요기 오타였음
		//@ 정수: %d, 실수: %f, 개행: \n

	}
}

// 실행 결과
/*
 ■ 삼각형의 넓이 구하기 ■
 - 삼각형의 밑변 입력 : 15
 - 삼각형의 높이 입력 : 15

>> 밑변이 15, 높이가 15인 삼각형의 넓이 : 112.50
계속하려면 아무 키나 누르십시오 . . .
*/