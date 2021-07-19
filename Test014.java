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
	
		// 연산 및 처리
		// - 사용자에게 안내 매세지 출력
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read(); // 자바 안받아줌! java.io.IO~, throws IOException 처리 해줘야함
		//ch = 65; //@A를 입력한다면, 'A' 가져오는게 아니라 A의 아스키코드 65 데려옴. ->4바이트 정수 int형, 2바이트 ch로 담을수X
				   // 형변환 char 해서 가능!

		// 결과 출력
	}
}