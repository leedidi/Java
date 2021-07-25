/*==========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - 반복문(while문) 실습
 ==========================================================*/
 
 // ○ 과제
 // 사용자로부터 임의의 정수를 입력받아
 // 1부터 입력받은 그 수 까지의
 // 전체 합과, 짝수의 합과, 홀수의 합을
 // 각각 결과값으로 출력하는 프로그램을 구현한다.

 // 실행 예)
 // 임의의 정수 입력 : 270
 // >> 1 ~ 270 까지 정수의 합 : xxxx
 // >> 1 ~ 270 까지 짝수의 합 : xxxx
 // >> 1 ~ 270 까지 홀수의 합 : xxxx
 // 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test048
{
	public static void main(String[] args) throws IOException
	{	
		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=1;					// 사용자가 입력할 임의의 정수 n
		int i=1;					// while문에 사용할 루프 변수
		int sum, oddsum, evensum;   // 1 ~ 사용자가 입력할 임의의 정수까지 정수, 짝수, 홀수의 각각 합 저장할 변수
		sum = oddsum = evensum = 0;

		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());

		while(i<=n)		
		{	
			sum += i;       // 1 ~ 270 까지 정수의 합 구하기
			
			if(i%2 == 0)	// 1 ~ 270 까지 짝수의 합 구하기
			evensum += i;
			else			// 1 ~ 270 까지 홀수의 값 구하기
			oddsum += i;

			i++;			// i 1씩 증가
		}

		// 결과 출력
			System.out.printf(" >> 1 ~ 270 까지 정수의 합 : %d\n", sum);
			System.out.printf(" >> 1 ~ 270 까지 짝수의 합 : %d\n", evensum);
			System.out.printf(" >> 1 ~ 270 까지 홀수의 합 : %d\n", oddsum);
	}
}

// 실행 결과
/*
임의의 정수 입력 : 3
 >> 1 ~ 270 까지 정수의 합 : 6
 >> 1 ~ 270 까지 짝수의 합 : 2
 >> 1 ~ 270 까지 홀수의 합 : 4
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력 : 270
 >> 1 ~ 270 까지 정수의 합 : 36585
 >> 1 ~ 270 까지 짝수의 합 : 18360
 >> 1 ~ 270 까지 홀수의 합 : 18225
계속하려면 아무 키나 누르십시오 . . .
*/