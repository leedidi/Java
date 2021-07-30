/*================================
   ■■■ 클래스와 인스턴스 ■■■
   - 클래스 설계
   - 배열 활용
   - 정보 은닉과 접근제어지시자
 =================================*/

 // 사용자로부터 년, 월, 일을 입력받아
 // 해당 날짜의 요일을 출력하는 프로그램을 구현한다.
 // 단, 달력 클래스(Calender)는 사용하지 않는다.
 // 또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다. (→ WeekDay 클래스 설계)
 // 그리고, 배열의 개념도 적용시켜 작성할 수 있도록 한다.
 // 접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.
 // 최종적으로 ...
 // WeekDay 클래스 설계를 통해
 // Test095 클래스의 main() 메소드가 정상적으로 프로그램 실행될 수 있도록 한다.

 // 실행 예)
 // 년 월 일 입력(공백 구분) : 1996 8 16

 // 1996년 8월 16일 → x요일
 // 계속하려면 아무 키나 누르세요...

 // ※ 1년 1월 1일 → 월요일
 // ※ 1년은 365일이 아닐 때도 있다.

 // 1차 시간: ~2시 30분

/*
import java.util.Scanner;

class WeekDay
{
	int year, month, day;
	//String c;
	int n;
	int totaln;

	void input()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.print("년 월 일 입력(공백 구분) : ");

		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();
	}


	String week()
	{	
		char[][] arr = new char[5][7]
		char c = '월';
	}

	int week()
	{	
		int[][] arr = int[5][7]
		int n = 1;
		//...??? 
		// 윤년평년...??

		if
	}

	void print()
	{
		System.out.printf("%d년 %d월 %d일 → %c요일", year, month, day, c);
	}

}

public class Test095
{
	public static void main(String[] args)
	{
		WeekDay ob = new WeekDay();		//-- WeekDay 클래스 기반 인스턴스 생성
		
		ob.input();						//-- 입력 메소드 호출

		String result = ob.week();      //-- 요일 산출 메소드 호출 및 결과 확인(수신)

		ob.print();						//-- 출력 메소드 호출
	}
}
*/

import java.util.Scanner;

class WeekDay
{
  /*
	WeekDay()
	{

	}

	WeekDay(int y,n, d)
	{
		this.y = y;
		this.m = m;
		this.d = d;
	}
	*/


	// 주요 변수 선언
	private int y, m, d;	//-- 사용자가 입력할 년. 월, 일을 담을 변수

	// 메소드 정의 → 입력받기(input)
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("년 월 일 입력(공백 구분) : ");	//2021 7 30
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
	}

	// 메소드 정의 → 요일 산출하기(week)
	//public void week()
	public String week()
	{
		// 각 월의 마지막 날짜(각 월의 최대값)을 배열 형태로 구성
		int[] months = {31, 0 ,31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; //2월은 윤년 평년에 따라서 채워야하는 값 달라짐

		// 테스트
		//System.out.println(months.length);
		//--==>> 12

		// 요일 이름에 대한 배열 구성
		String[] weekNames = {"일", "월", "화", "수", "목", "금", "토"};

		// 날 수를 종합할 변수
		int nalsu=0;

		//@ 날수 나누기 7 해서 나머지 구해서 각각 일월화수목금토..........
		//@ 한꺼번에 계산하려 하지 말고 전체 토막토막 내서 하기
		
		// 1년 1월 1일 ~ 1996년 8월 16일 ===> 전체 날 수
		// ① nalsu = 1.1.1 ~ 1995. 12. 31
		// ② nalsu += 1996.1.1 ~ 1996.7.31
		// ③ nalsu += 1996.8.1 ~ 1996.8.16

		// 윤년에 따른 2월의 날 수 계산
		// 입력 년도가 윤년이라면... 2월의 마지막 날짜를 29일로 설정
		// 입력 년도가 평년이라면... 2월의 마지막 날짜를 28일로 설정
		
		if (y%4==0 && y%100!=0 || y%400 == 0)	//-- 윤년이라면..
		{
			// 2월의 마지막 날짜를 29일로 설정
			months[1] = 29;
		}

		else									//--윤년이 아니라면 ... (평년이라면...)
		{
			// 2월의 마지막 날짜를 28일로 설정
			months[1] = 28;
		}

		// ① 1년 1월 1일 부터 입력받은 년도의 이전 년도 12월 31일 까지의 날 수 계산
		//                     -------------------------
		//                          y-1
		//
		// 2021.7.30 → 1.1.1 ~ 2020.12.31
		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		//100 * 365 + 100/4 - 100/100 + 100/400;

		// 테스트
		//System.out.println("날 수 : " + nalsu);
		//--==>> 년 월 일 입력(공백 구분) : 2021 7 30
		//날 수 : 737790 (1.1.1 ~ 2020.12.31 의 총 날 수)

		// ② 입력받은 월의 이전 월 까지의 날 수 계산 후
		//    이 계산 결과를 1번의 결과에 더하는 연산
		for (int i=0; i<(m-1); i++) // 전날까지의 월수기 때문에!!! m-1. 0부터니까 <. //-- i<(m-1) check~!!!
		{
		  nalsu +=months[i];
		}
		// 테스트
		//System.out.println("날 수 : " + nalsu);
		//--==>> 년 월 일 입력(공백 구분) : 2021 7 30
		//		 날 수 : 737971 (1.1.1 ~ 2021.6.30 의 총 날 수)

		// ③ 입력받은 일의 날짜만큼 날 수 계산 후
		//     2번 결과에 더하는 연산
		nalsu += d;
		
		// 테스트
		//System.out.println("날 수 : " + nalsu);
		//--==>> 년 월 일 입력(공백 구분) : 2021 7 30
		//		 날 수 : 738001 (1.1.1 ~ 2021.7.30 의 총 날 수)



		// -------------- 여기까지 수행하면 날 수 연산 끝~~~!!!

		// 무슨 요일인지 확인하기 위한 연산
		int w = nalsu %7;		// 전체날수 %7 == 0 → 일요일
								// 전체날수 %7 == 1 → 월요일
								//          ：    

		// 테스트
		//System.out.println("w : " + w);
		//-->> 년 월 일 입력(공백 구분) : 2021 7 30
		//		w : 5
		
		return weekNames[w];

	}


	/// 메소드 정의 → 결과 출력하기(print)
	public void print(String day)
	{
		System.out.printf("%d년 %d월 %d일 → %s요일\n", y,m, d, day);
	}
}

public class Test095
{
	public static void main(String[] args)
	{
		WeekDay ob = new WeekDay();		//-- WeekDay 클래스 기반 인스턴스 생성
		
		ob.input();						//-- 입력 메소드 호출
		
		//ob.week();
		String result = ob.week();      //-- 요일 산출 메소드 호출 및 결과 확인(수신)
		
		// 테스트
		//System.out.println(result);

		ob.print(result);						//-- 출력 메소드 호출
	}
}

// 실행 결과
/*
년 월 일 입력(공백 구분) : 1996 8 16
1996년 8월 16일 → 금요일
계속하려면 아무 키나 누르십시오 . . .
*/

/*
년 월 일 입력(공백 구분) : 2021 7 14
2021년 7월 14일 → 수요일
계속하려면 아무 키나 누르십시오 . . .
*/

/*
년 월 일 입력(공백 구분) : 2021 12 24
2021년 12월 24일 → 금요일
계속하려면 아무 키나 누르십시오 . . .
*/