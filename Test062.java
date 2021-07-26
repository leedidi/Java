/*==========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - return
 ==========================================================*/

// ※ retrun 키워드가 지니는 두 가지 의미
//	  1. 값의 반환
//    2. 메소드 종료

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test062
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n,s ;

		System.out.print("임의의 정수 입력(10 이상) : ");
		n = Integer.parseInt(br.readLine());

		if(n<10)
		{
			System.out.println("10 이상의 정수를 입력해야 합니다.");
			return;
			//-- 메소드 종료 → main() 메소드 종료 → 프로그램 종료
		}

		s=0;
		for (int i=1; i<=n; i++)
			s+=i;

		System.out.println("결과 : " + s);
	}
}

// 실행 결과

/*
임의의 정수 입력(10 이상) : 100
결과 : 5050
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력(10 이상) : 5
10 이상의 정수를 입력해야 합니다.
계속하려면 아무 키나 누르십시오 . . .
*/