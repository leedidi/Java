/*==========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - 반복문(while문) 실습
 ==========================================================*/

// 실행 예)
// 1 부터 100 까지 정수의 합 : 5050
// 1 부터 100 까지 짝수의 합 : 2550
// 1 부터 100 까지 홀수의 합 : 2500
// 계속하려면 아무 키나 누르세요...

/*
public class Test042
{
	public static void main(String[] args
	{
		// 주요 변수 선언
		int n = 1;
		int sum = 0;
		int even = 0;
		int odd = 0;

		// 연산 및 처리
		while (n<=100)
		{
			if(n)
			{
				sum += n;
			}
				else if(n%2 == 0)
			{
					even += n;
			}
				else if(n%2 != 0)
			{	
					odd += n;
			}
				else
				{
					System.out.println("판별 불가 데이터");
					return;
				}

				n++;
		}
		// 결과 출력	
		System.out.println("1 부터 100 까지 정수의 합 : " + sum);
		System.out.println("1 부터 100 까지 짝수의 합 : " + even);
		System.out.println("1 부터 100 까지 홀수의 합 : " + odd);

	}
}
*/


// [같이 작성한 코드]

public class Test042
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		int n = 1, sum, even, odd;
		sum=even=odd=0; //@ 이런 구문도 가능! sum과 even과 odd는 0이다(X)
						//@ odd에 0 대입, 이 대입된 0 odd를 even에 대입, 이 대입된 0 even을 sum에 대입

		// 연산 및 처리
		while(n<=100)
		{
			// 정수합 처리
			sum += n;

			// 짝수합/ 홀수합처리
			if (n%2==0)
			{
				even += n;
			}
			else if(n%2!=0)
			{
				odd += n;
			}
			else
			{
				System.out.println("판별 불가 데이터");
				return;
			}

			n++;
		}
			
		// 결과 출력	
		System.out.println("1 부터 100 까지 정수의 합 : " + sum);
		System.out.println("1 부터 100 까지 짝수의 합 : " + even);
		System.out.println("1 부터 100 까지 홀수의 합 : " + odd);

		}
}

// 실행 결과
/*
1 부터 100 까지 정수의 합 : 5050
1 부터 100 까지 짝수의 합 : 2550
1 부터 100 까지 홀수의 합 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/