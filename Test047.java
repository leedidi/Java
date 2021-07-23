/*==========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - 반복문(while문) 실습
 ==========================================================*/

 // 사용자로부터 임의의 두 정수를 입력받아
 // 작은 수부터 큰 수 까지의 합을 구하여
 // 결과를 출력하는 프로그램을 구현한다.

 // 실행 예)
 // 첫 번째 정수 입력 : 10
 // 두 번째 정수 입력 : 20
 // >> 10 ~ 20 까지의 합 : xxx
 // 계속하려면 아무 키나 누르세요...

 // 첫 번째 정수 입력 : 10
 // 두 번째 정수 입력 : 2
 // >> 2 ~ 10 까지의 합 : 54
 // 계속하려면 아무 키나 누르세요...


// [내가 작성한 코드]
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test047
{
	public static void main(String[] args) throws IOException
	{
		// ○ 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;			// 사용자로부터 입력받을 임의의 정수 a, b
		int i;			
		int result = 0;		//	a, b의 연산 결과값 
		
		// ○ 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());
		
		// 입력된 a 값이 b보다 클 때 a, b 작은 수에서 큰 수대로 정렬

		if(a>b)
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}

		// 정수들의 총 합 계산
		
		i = a;			// 결과값에 출력할 a는 놔두고, 연산용 필요한 i 값 생성
		while (i<=b)
		{
			result += i;
			i++;
		}

		// ○ 결과 출력
		System.out.printf(" >> %d ~ %d 까지의 합 : %d\n", a, b, result);
		
	}
}
*/

// [함께 작성한 코드]




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test047
{
	public static void main(String[] args) throws IOException
	{
		// ○ 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;				//-- 루프 변수로 활용할 변수(@ 반복문을 제어할 변수)
		int su1, su2;		//-- 첫 번째, 두 번재 입력값을 담을 변수
		int result = 0;		//-- 누적합을 담을 변수(@ 작은 수부터 큰 수까지의)

		// ○ 연산 및 처리
		System.out.print("첫 번째 정수 입력 : ");
		su1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		su2 = Integer.parseInt(br.readLine());

		// 입력받은 두 수의 크기 비교 및 자리 바꿈
		// 즉, su1 이 su2 보다 큰 경우 두 수의 자리를 바꿀 수 있도록 처리

		if (su1 > su2)
		{
			// 자리 바꿈
			su1 = su1^su2;
			su2 = su2^su1;
			su1 = su1^su2;
		}

		// 반복 연산 수행
		// 반복 연산을 수행하기 전에
		// 작은 수를 따로 저장하여 루프 변수로 활용한다.
		// (결과 출력 과정에서 필요하기 때문에...)
		//@ 10
		//@ 2
		//@ 2 ~ 10 >> a : 2 3 4 5 6.... 값이 바뀌어버림, 마지막에 결과값 창에서 a 원래 수 표시하려면 따로 담아둬야 함

		n = su1;

		while(n<=su2)
		{
			result += n;
			n++;
		}	

		// ○ 결과 출력
		System.out.printf(">> %d ~ %d 까지의 합 : %d\n", su1, su2, result);
	}
}



// 실행 결과

/*
첫 번째 정수 입력 : 2
두 번째 정수 입력 : 10
 >> 2 ~ 10 까지의 합 : 54
계속하려면 아무 키나 누르십시오 . . .
*/

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2
 >> 2 ~ 10 까지의 합 : 54
계속하려면 아무 키나 누르십시오 . . .
*/
