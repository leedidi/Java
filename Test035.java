/*==========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - if ~ else 문 실습
 ==========================================================*/

// ○ 과제
// 사용자로부터 알파벳 한 문자를 입력받아 이를 판별하여
// 소문자를 입력받았을 경우... 대문자로 변환하고,
// 대문자를 입력받았을 경우... 소문자로 변환하는
// 프로그램을 작성한다.
// 단, 입력은 『System.in.read()』 메소드를 활용하여 구현한다.

// 실행 예)
// 알파벳 한 문자 입력 : A
// >> a
// 계속하려면 아무 키나...

// 알파벳 한 문자 입력 : c
// >> C
// 계속하려면 아무 키나...

// 알파벳 한 문자 입력 : 7
// >> 입력 오류~~!!!
// 계속하려면 아무 키나...

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test035
{
	public static void main(String[] args) throws IOException
	{		
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int alp;		// 사용자가 입력할 알파벳 변수

		// 연산 및 처리 + 결과 출력
		System.out.print("알파벳 한 문자 입력 : ");
		alp = System.in.read();

		// 대문자 A의 아스키 코드 : 65, 소문자 a의 아스키 코드 : 97
		// 즉, 소문자 알파벳의 아스키 코드값 - 32 = 대문자 알파벳의 아스키 코드값
		//     대문자 알파벳의 아스키 코드값 + 32 = 소문자 알파벳의 아스키 코드값

		if(alp>=65 && alp<=90)			// --> alp이 대문자인 경우
			{
			alp += 32;			// alp을 소문자로 변환
			System.out.printf(">> %c\n", alp);
			}
		else if (alp>=97 && alp <=122)	// --> alp이 소문자인 경우
			{
			alp -= 32;					// alp를 대문자로 변환
			System.out.printf(">> %c\n", alp);
			}
		else							// --> alp이 영문이 아닌 경우
			System.out.println(">> 입력 오류~~!!!");	// 입력 오류 문장 반환
		
		}	
}


// 입력 결과
/*
알파벳 한 문자 입력 : D
>> d
계속하려면 아무 키나 누르십시오 . . .
*/

/*
알파벳 한 문자 입력 : d
>> D
계속하려면 아무 키나 누르십시오 . . .
*/

/*
알파벳 한 문자 입력 : 가
>> 입력 오류~~!!!
계속하려면 아무 키나 누르십시오 . . .
*/