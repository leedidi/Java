/*==========================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 자바의 기본 입출력 : System.in.read()
 ===========================================*/

// 실행 예)
// 한 문자 입력 : A
// 한 자리 정수 입력 :7

// >> 입력한 문자 : A
// >> 입력한 정수 : 7
// 계속하려면 아무 키나...

/*
『System.in.read()』 메소드는 한 문자만 가져온다.
단, 하나의 문자를 입력받아 입력받은 문자의
ASCII Code 값을 반환한다.
*/

import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		char ch;		//-- 입력받은 문자를 담을 변수
		int n;			//-- 입력받은 정수를 담을 변수

		char temp;		//@ char로도 가능!
	
		// 연산 및 처리
		// - 사용자에게 안내 매세지 출력 및 입력값 얻어오기
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read(); // 자바 안받아줌! java.io.IO~, throws IOException 처리 해줘야함
		//ch = 65; //@A를 입력한다면, 'A' 가져오는게 아니라 A의 아스키코드 65 데려옴. ->4바이트 정수 int형, 2바이트 ch로 담을수X
				   // 형변환 char 해서 가능!
				   // --> @ 입력대기열에 있는 아이를 데려오라.
				   // A → 65 → A
				 
		// ※ 입력 대기열에 남아있는 『\r』과 『\n』을 스킵(건너뛰기)
		System.in.skip(2);
		// -- 매개변수(2)에 의해 두 글자를 읽지 않고 건너뛴다. (버린다.)

		// - 사용자에게 안내 메세지 출력 및 입력값 얻어오기
		System.out.print("한 자리 정수 입력 : ");
		n = System.in.read();

		//@ 아스키코드로 출력
		// 1 → 49
		// 2 → 50
		// 3 → 51
		//   ...
		// 9 → 57

		// n을 48만큼 감소시켜라
		//n -= 48;

		temp = (char)n;

		// 결과 출력
		System.out.println();
		System.out.println(">> 입력한 문자 : " + ch);
		//System.out.println(">> 입력한 정수 : " + n);
		System.out.println(">> 입력한 정수 : " + temp);
	}
}

// 실행 결과
/*
한 문자 입력 : C
한 자리 정수 입력 : 6

>> 입력한 문자 : C
>> 입력한 정수 : 6
계속하려면 아무 키나 누르십시오 . . .
*/