/*===================================
    ■■■ 클래스와 인스턴스 ■■■
	- 정보 은닉과 접근제어지시자
	- 배열 활용
	- 정보 은닉과 접근제어지시자
===================================*/

// 사용자로부터 년, 월, 일을 입력받아
// 해당 날짜의 요일을 출력하는 프로그램을 구현한다.
// 단, 달력 클래스(Calender)는 사용하지 않는다.
// 또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다. (-> WeekDay 클래스 설계)
// 그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.
// 접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.
// 최종적으로...
// WeekDay 클래스 설계를 통해
// Test095 클래스의 main() 메소드가 정상적으로 프로그램 실행될 수 있도록 한다.

// 실행 예)
// 년 월 일 입력(공백 구분) : 1996 8 16

// 1996년 8월 16일 → x요일
// 계속하려면 아무 키나 누르세요...

// ※ 1년 1월 1일 → 월요일
// ※ 1년은 365일이 아닐 때도 있다.

import java.util.Scanner;

class WeekDay
{
	// 주요 변수 선언
	private int y,m,d;		//-- 사용자가 입력한 년, 월, 일 변수
	
	// 메소드 정의 -> 입력받기(input)
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("년 월 일 입력(공백 구분) : ");		// 2021 7 30
		y=sc.nextInt();
		m=sc.nextInt();
		d=sc.nextInt();
	}
	
	// 메소드 정의 → 요일 산출하기()
	//public String week()
	public String week()
	{
		// 각 월의 마지막 날짜(각 월의 최대값)을 배열 형태로 구성
		int[] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		// 테스트
		//System.out.println(months.length);
		//--==>> 12

		// 요일 이름에 대한 배열 구성
		String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};

		// 날 수를 종합할 변수
		int nalsu;

		
		if ((y%4==0 && y%100!=0) || y%400==0)
		{
			months[1] = 29;			//윤년 29일
		}
		else
		{
			months[1] = 28;			//평년 28일
		}
		


		nalsu = ((y-1)*365);			// 입력받은 년도 전년도 까지 총 날짜

		for (int i=0; i<m-1; i++)
		{
			nalsu += months[i];		// 입력받은 년도 1월 1일부터  입력받은 월의 전 월까지의 날짜
		}
			
		nalsu += d;					// 입력받은 월 1일부터 d까지의 날짜

		int temp = nalsu % 7 ;			// 총 날짜 를 7로 나눈 나머지 값 temp에 저장
		
		return weekNames[temp];			// 나머지 0 일때 -> 일요일

				
		
	}

	public void print(String week)
	{
		System.out.printf("%d년 %d월 %d일 → %s\n", y, m, d, week);
	}

}


public class Test095
{
	public static void main(String[] args)
	{
		WeekDay ob = new WeekDay();

		ob.input();

		String result = ob.week();

		ob.print(result);
	}
}