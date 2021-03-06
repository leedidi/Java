/*==========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - 반복문(for문) 실습
 ==========================================================*/

// 1 부터 100 까지의 정수 중에서
// 4의 배수만 출력하는 프로그램을 구현한다.
// 단, for 문을 활용해야 하며,
// 한 줄에 5개씩 출력할 수 있도록 한다.

// 실행 예)
//	 4  8 12 16 20
//  24 28 32 36 40
//        ：
// 계속하려면 아무 키나 누르세요...

// [내가 만든 코드]

/*

public class Test053
{
	public static void main(String[] args)
	{
		// 주요 변수 선언	
		// 연산 및 처리
		for(int a=4; a<=100; a+=4)
		{
				System.out.printf("%d    ", a);
				if(a%20 == 0)
					System.out.println();
		}

		
	}
}

*/


public class Test053
{
	public static void main(String[] args)
	{
		for (int n=4; n<=100; n+=4)
		{
			System.out.printf("%4d",n);
			
			if(n%(4*5)==0) // n이 20의 배수가 될 때
			//{
			System.out.println();	// 개행
			//}					// 한줄이니까 생략 가능
		}
		System.out.println();
	}
}

//@ 지금은 코드에 집중 XXXX, 어떻게 생각하고 접근하는지에 집중!

// 결과 출력
/*
4    8    12    16    20
24    28    32    36    40
44    48    52    56    60
64    68    72    76    80
84    88    92    96    100
계속하려면 아무 키나 누르십시오 . . .
*/

