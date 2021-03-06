/*===================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - if ~ else 문 실습
 ===================================*/

// ○ 과제
// 사용자로부터 알파벳 한 문자를 입력받아
// 이를 판별하여 입력받은 알파벳이 모음인 경우에만
// 결과를 출력하는 프로그램을 구현한다.
// 단, 대소문자를 모두 적용할 수 있도록 처리한다.
// 또한, 알파벳 이외의 문자가 입력되었을 경우
// 입력 오류에 대한 내용을 사용자에게 안내해 줄 수 있도록 한다.

// 실행 예)
// 알파벳 한 문자 입력 : A
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요...

// 실행 예)
// 알파벳 한 문자 입력 : e
// >> 모음 OK~!!!
// 계속하려면 아무 키나 누르세요...

// 실행 예)
// 알파벳 한 문자 입력 : B			(@모음 x 경우)
// 계속하려면 아무 키나 누르세요...

// 알파벳 한 문자 입력 : t
// 계속하려면 아무 키나 누르세요...

// 알파벳 한 문자 입력 : 1
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int alp;		// 사용자가 입력할 알파벳 변수, 아스키 코드 값으로 변환;

		// 연산 및 처리 + 결과 출력

		System.out.print("알파벳 한 문자 입력 : ");
		alp = System.in.read();

		if ((alp>=65 && alp<=90) || (alp>=97 && alp <=122))
			{
			if(alp==65 || alp == 69 || alp ==73 || alp ==79 || alp == 85 || alp == 97 || alp ==101 || alp == 105 || alp == 117)
					 System.out.println(" >> 모음 OK~!!!");
			  }
		else
			{	
			System.out.println(" >> 입력 오류~!!!");
			}
	  }
}


		// 실행 결과

		/*
		알파벳 한 문자 입력 : E
		 >> 모음 OK~!!!
		계속하려면 아무 키나 누르십시오 . . .
		*/

		/*
		알파벳 한 문자 입력 : i
		>> 모음 OK~!!!
		계속하려면 아무 키나 누르십시오 . . .
		*/

		/*
		알파벳 한 문자 입력 : 가
		>> 입력 오류~!!!
		계속하려면 아무 키나 누르십시오 . . .
		*/

