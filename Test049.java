/*==========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - 반복문(while문) 실습
 ==========================================================*/
 
 // ○ 과제
 // 사용자로부터 원하는 단(구구단)을 입력받아
 // 해당하는 구구단을 출력하는 프로그램을 구현한다.
 // 단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
 // 프로그램을 종료해 버릴 수 있도록 처리한다.

 // 실행 예)
 // 원하는 단(1~9) 입력 : 7
 // 7 * 1 = 7
 // 7 * 2 = 14
 // 7 * 3 = 21
 //   ：
 // 7 * 9 = 63
 // 계속하려면 아무 키나 누르세요...

 // 원하는 단(1~9) 입력 : 11
 // 1 부터 9 까지의 정수만 입력이 가능합니다.
 // 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test049
{
	public static void main(String[] args) throws IOException
	{	
		//주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;		//	구구단 i 열에 들어갈 사용자 입력 정수
		int j = 1;		//  구구단 x2, 3, 4 ... x9 까지 들어갈 정수
		//int result = 1;	//	구구단 결과

		// 연산 및 처리 + 결과 출력
		System.out.print("원하는 단(1~9) 입력 : ");
		i = Integer.parseInt(br.readLine());

		if(i>=1 && i<=9)									// 구구단 1~9단까지만 가능하게 제한
		{
		while(j<=9)											// x1, 2 ... x 9 까지 구구단 만들 수 있게 j 조건 제한
		{
		System.out.printf("%d * %d = %d\n", i, j, (i*j));	// 구구단 생성
		j++;
		}
		}
		else
		System.out.println("1 부터 9 까지의 정수만 입력이 가능합니다.");

	}
}

// 실행 결과
/*
원하는 단(1~9) 입력 : 2
2 * 1 = 2
2 * 2 = 4
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
2 * 6 = 12
2 * 7 = 14
2 * 8 = 16
2 * 9 = 18
계속하려면 아무 키나 누르십시오 . . .
*/

/*
원하는 단(1~9) 입력 : 11
1 부터 9 까지의 정수만 입력이 가능합니다.
계속하려면 아무 키나 누르십시오 . . .
*/