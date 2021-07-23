/*==========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - 반복문(while문) 실습
 ==========================================================*/

 // 사용자로부터 임의의 정수를 입력받아
 // 입력받은 정수가 소수인지 아닌지를 판별하여
 // 결과를 출력하는 프로그램을 구현한다.

 // 실행 예)
 // 임의의 정수 입력 : 10
 // 10 → 소수 아님
 // 계속하려면 아무 키나 누르세요...

 // 임의의 정수 입력 : 11
 // 11 → 소수
 // 계속하려면 아무 키나 누르세요...

 // ※ 소수 : 1 또는 자기 자신의 값 이외의 어떤 수로도 나누어 떨어지지 않는 수.
 //			  단, 1은 소수 아님.

//[내가 작성한 코드]

/*

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test046
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=1;			// 사용자가 입력할 임의의 정수 n
		int a=1;			// n을 나누는 데 사용할 정수 a
		String result;	// 입력한 정수가 소수인지, 아닌지 대한 결과 판별값

		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		
		// n/(n-1) 나누기, 한번 나눠서 떨어지면 그 뒤는 할 필요 없음!
		// 1 입력시 -> 소수 아님 나와야 함
		*/
		
	/*
		while(a<n)
		{ 
		if(n == 1)
			result = "소수 아님";
			else if(n%a == 0)
			{
				result = "소수 아님";
				break;
			}
				else
					result = "소수";
		}
		n++;
		
		// 결과 출력
		System.out.printf("%d → %s", n, result);
		*/

/*

		while(a<n)
		{ 
			if(n%a == 0)
			{
				System.out.println(n + "→ 소수 아님");
				break;
			}
					else
						System.out.println(n + "→ 소수");
						a++;
		}


	*/

//% : 수업 힌트! 어떤 방식으로 코드 써봐야 할 지 길잡이

		// 결과 출력
		//System.out.printf("%d → %s", n, result);

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test046
{
	public static void main(String[] args) throws IOException
	{
		// ○ 주요 변수 선언 및 초기화
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num;	// -- 사용자 입력값을 담아낼 변수
		
		// ○ 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		int n = 2;		// -- 입력값을 대상으로 나눗셈 연산을 수행한 변수
						// (1씩 증가)   5 → 2 3 4

		boolean flag = true;	//-- 우왓~ 소수다~!!!

		while(n < num)	// num = 5 → n = 2~4 // num = 15 → n=2~14
 		{	
			// 입력값(num)이 n(2, 3, 4)으로 나누어 떨어지는지 확인..
			// 번거롭고 귀찮아도 주석화해서 한글로 어떤 과정인지 표현 해보기!!
			// 내 머릿속 생각을 자바 코드로 바꿔 나가는 것. 지금 이 작업 많이 해 봐야함! 번거롭고 귀찮지만 중요한 과정
			if (num%n == 0)
			{
				// break ; // 여기 break 사용하면 flag false 로 바꿀수 없음!
			    // 
				// 한번에 결론 내릴수 없을때, 
				// plag변수 -  깃발변수. 여기저기 꽂아놓고 청기올려 백기올려! 
				// 모두다 파란색이면 최종적으로 파란깃발이면, 마지막 깃발 전까지는 최종적으로 파란 깃발이라고 할 수 없음!
				
				// num 은 소수가 아니다.
	
				flag = false; // 에이~ 소수 아니었네~!!!
				break;	// if문 빠져나가는게 X, 얘를 감싸고있는 가장 가까운 반복문(while)빠져나감

			}

			 n++;

		}
		// 추가 확인

		//% flag 체크

		// 추가 확인

		//% flag 체크
		
		
		
		// ○ 결과 출력(출력 전에 수행해야 할 추가 확인 → 1인지 아닌지에 대한 추가 검토)
		if (flag && num!=1) //flag == true 쓸필요가 없음! flag는 현재 기본 존재 자체로써 true, false 반환, num은 숫자바뀌지만 true는 노노)
			System.out.printf("%d → 소수~!!!\n", num);
		else
			System.out.printf("%d → 소수 아님~!!!\n", num);
		
		//% flag 종합 > 종합적인 판단 결과


	}
}

// 결과 출력

/*
임의의 정수 입력 : 100
100 → 소수 아님~!!!
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력 : 97
97 → 소수~!!!
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력 : 1
1 → 소수 아님~!!!
계속하려면 아무 키나 누르십시오 . . .
*/