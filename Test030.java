/*===================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - if ~ else 문 실습
 ===================================*/

 // 사용자로부터 임의의 정수를 입력받아
 // 입력받은 정수가... 짝수인지, 홀수인지, 영인지
 // 결과를 판별하여 출력하는 프로그램을 구현한다.

 // 실행 예)
 // 임의의 정수 입력 : 14
 // 14 → 짝수
 // 계속하려면 아무 키나...

 // 임의의 정수 입력 : 3
 // 3 → 홀수
 // 계속하려면 아무 키나...
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;				//--임의의 정수
		String strResult;	//--결과값

		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		if(n = 0)
		{ 
			strResult = "0";
		}
		else if( n % 2 = 0);
		{ 
			strResult = "짝수";
		}
		else
		{ 
			strResult = "홀수";
			}
		// 결과 입력

		*/

		
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
/*
		if (n%2==0) // == 두개..!!! '='는 대입연산자. 그니까 '==','!=' 사용함!!!
		{
			System.out.println(n + " → 짝수");
		}
		else if (n%2!=0)
		{
			System.out.println(n + " → 홀수");
		}
		else //@ 오류! 0도 나머지가 0...! 짝수보다 0을 먼저 걸러내야 함
		{
			System.out.println(n + " → 영");
		}
		*/

		String strResult = "판별불가";

		if(n%2!=0)
		{
			strResult = "홀수";
		}
		else if(n==0)
		{
			strResult = "영";
		}
		else if(n%2==0)
		{
			strResult = "짝수";
				
		}
		System.out.println(n + " → " + strResult);

	}
}

//실행 결과
/*
임의의 정수 입력 : 0
0 → 영
계속하려면 아무 키나 누르십시오 . . .
*/