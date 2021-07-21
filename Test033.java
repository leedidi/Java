/*===================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - if ~ else 문 실습
 ===================================*/

// 사용자로부터 임의의 정수 세 개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 5		//9
// 두 번째 정수 입력 : 15		//5
// 세 번째 정수 입력 : 10		//9

// >> 정렬 결과 : 5 10 15		// 5 9 9
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 및 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;

		// 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : " );
		b = Integer.parseInt(br.readLine());

		System.out.print("세 번째 정수 입력 : " );
		c = Integer.parseInt(br.readLine());
		

		// a b c 숫자 작은 순서대로 정렬

		if(a>b)
		{
			a = a^b; 
			b = b^a; 
			a = a^b;
		}
		if(a>c)
		{
			a = a^c;
			c = c^a;
			a = a^c;
		}
		if(b>c)
		{
			b = b^c;
			c = c^b;
			b = b^c;
		}

		// 결과 출력(@결과 입력 아니고 출력임~!!)

		System.out.printf("\n>> 정렬 결과 : %d %d %d\n", a, b, c);
	}
}

//실행 결과

/*
첫 번째 정수 입력 : 5
두 번째 정수 입력 : 5
세 번째 정수 입력 : 9

>> 정렬 결과 : 5 5 9
계속하려면 아무 키나 누르십시오 . . .
*/