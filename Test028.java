/*===================================
  ■■■ 연산자(Operator) ■■■
  - 삼항 연산자 == 조건 연산자
 ===================================*/

 // 사용자로부터 임의의 연도를 입력받아
 // 입력받은 연도가... 윤년인지 평년인지 판별하여
 // 그 결과를 출력하는 프로그램을 구현한다.
 // 단, 입력은 BufferedReader 를 활용하고,
 // 처리 과정은 조건 연산자를 활용하여 수행할 수 있도록 한다.

 // 실행 예)
 // 임의의 연도 입력 : 2021
 // 2021년 → 평년
 // 계속하려면 아무 키나 누르세요...

 // 임의의 연도 입력 : 2020
 // 2020년 → 윤년
 // 계속하려면 아무 키나 누르세요...

 // 임의의 연도 입력 : 2012
 // 2012년 → 윤년
 // 임의의 연도 입력 : 2020

 // ※ 2월이 28일까지 있는 해 → 평년
 //			 29일까지 있는 해 → 윤년

 //@ 개발자는 프로그램 통해 달력 구현할 필요 있음! 날짜에 대한 컨트롤이 잘 되어야 함

 // ※ 윤년의 판별 조건
 //	   연도가 4의 배수이면서 100의 배수가 아니거나
 //    400의 배수이면 윤년~!!!
 //	   그렇지 않으면 평년~!!!

 /*
 [내가 작성한 코드]

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		//주요 변수 선언
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 int n;				// 입력년도
		 String strResult;  // 결과 값 

		//연산 및 처리
		 System.out.print("임의의 연도 입력 : ");
		 n = Integer.parseInt(br.readLine());
		 strResult = (n%4 == 0)? (n%100 == 0? (n%400 == 0? "윤년" : "평년") : "윤년" ) : "평년";

		//결과 출력
		System.out.println( n + "년 → " + strResult);
	}
}
*/

// 함께 작성한 코드
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test028
{
	public static void main(String[] args) throws IOException
	{
		//주요 변수 선언
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 int year;			//-- 사용자가 입력하는 연도를 담아둘 변수
		 String strResult;  //-- 윤년 평년에 대한 판별 결과를 담아둘 변수

		 //@ 처음부터 모든식재료를 다 갖춰두고 할 생각XX 
		 //@ 그때그때 아 당근 필요하겠다! 그때그때 올라와서 씻어서 추가해도 ㅇㅋ

		 System.out.print("임의의 연도 입력 : ");
		 year = Integer.parseInt(br.readLine());

		 // (연도가 4의 배수 연도가 100의 배수 아님 연도가 4000의 배수) ? () : ();
		 // (year가 4의 배수 year가 100의 배수 아님 year가 4000의 배수) ? () : ();
		 // (year%4==0       year%100!=0            year%400==0) ? () : ();
		 
		 //@ ★꼭 기억! 한공간에 두개이상의 조건이 등장하면 !무조건! !반드시! 논리연산자가 와야함

		 // (year%4==0 && year%100!=0 || year%400==0) ? () : (); (&&: and/ ||: or)
		 // (year%4==0 && year%100!=0 || year%400==0) ? ("윤년") : ("평년"); 


		 // 2021
		 // (year%4==0 && year%100!=0 || year%400==0) ? ("윤년") : ("평년"); 
		 // (2021%4==0 && year%100!=0 || year%400==0) ? ("윤년") : ("평년"); 
		 // (false && year%100!=0 || year%400==0) ? ("윤년") : ("평년"); 
		 // (false || year%400==0) ? ("윤년") : ("평년"); 
		 // (false || 2021%400==0) ? ("윤년") : ("평년"); 
		 // (false || false) ? ("윤년") : ("평년"); 
		 // false ? ("윤년") : ("평년"); 
		 // "평년";

		 strResult = (year%4==0 && year%100!=0 || year%400==0) ? ("윤년") : ("평년");

		 System.out.printf("%d년 → %s\n", year, strResult);
		
	}
}


//@책을 가까이합시다! 인터넷보다 기억 잘남
// 실행 결과

/*
임의의 연도 입력 : 2021
2021년 → 평년
계속하려면 아무 키나 누르십시오 . . 
*/

/*
임의의 연도 입력 : 2020
2020년 → 윤년
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 연도 입력 : 2000
2000년 → 윤년
계속하려면 아무 키나 누르십시오 . . .
*/
