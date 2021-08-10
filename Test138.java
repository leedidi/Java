/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Calendar 클래스
===========================================*/

/*
※ Calendar 클래스는 추상클래스이기 때문에 객체를 생성할 수 없다. (@★ 가장 먼저 강조하는 부분!)
   (추상 클래스 : 미완성된 클래스)

   Calender ob = new Calendar();
   → 이와 같은 구문을 통해 인스턴스 생성 불가

○ Calendar 객체(인스턴스)를 생성할 수 있는 방법

   1. Calendar ob1 = Calendar.getInstance();

   2. Calendar ob2 = new GregorianCalendar();
   //@ 그래고리캘린더가 캘린더의 자식클래스, 캘린더가 가지고있는 무언가 오버라이딩해서 완성못한거 완성했겠구나, 업캐스팅~!!

   3. GregorianCalendar ob3 = new GregorianCalendar();

   (※ GregorianCalendar : Calendar 클래스의 하위 클래스)
*/

// 현재의 년, 월, 일, 요일을 Calendar 객체를 활용하여 출력

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test138
{
	public static void main(String[] args)
	{
		// Calenar 클래스 기반 인스턴스 생성
		//Calendar rightNow = new Calendar();	//--(Ⅹ)
		Calendar rightNow = Calendar.getInstance();

		// 생성된 달력(Calendar) 인스턴스를 통해
		// 날짜 관련 정보를 얻어낼 수 있는 메소드 → 『get()』
		int y = rightNow.get(Calendar.YEAR); //@ rightnow.year이 아니고, 대문자 YEAR,,, static final!
		System.out.println(y);
		//--==>> 2021

		int m = rightNow.get(Calendar.MONTH) + 1;		//-- 『+1』 check~!!! //@ 배열처럼 정렬되기 때문에, 꺼내쓸때는 +1 필요!
		System.out.println(m);
		//--==>> 8

		int d = rightNow.get(Calendar.DATE);
		System.out.println(d);
		//--==>> 10

		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(w);
		//--==>> 3

		System.out.println(y + "-" + m + "-" + d + " " + w);
		//--==>> 2021-8-10 3

		// 테스트
		System.out.println(Calendar.SUNDAY);		//--==>> 1 → 일요일
		System.out.println(Calendar.MONDAY);		//--==>> 2 → 월요일
		System.out.println(Calendar.TUESDAY);		//--==>> 3 → 화요일
		System.out.println(Calendar.WEDNESDAY);		//--==>> 4 → 수요일
		System.out.println(Calendar.THURSDAY);		//--==>> 5 → 목요일
		System.out.println(Calendar.FRIDAY);		//--==>> 6 → 금요일
		System.out.println(Calendar.SATURDAY);		//--==>> 7 → 토요일
		
		System.out.println();	// 개행

		String week = "";
		switch (w)
		{
			//case 1: week = "일요일"; break;
			case Calendar.SUNDAY: week = "일요일"; break;

			//case 2: week = "월요일"; break;
			case Calendar.MONDAY: week = "월요일"; break;

			//case 3: week = "화요일"; break;
			case Calendar.TUESDAY: week = "화요일"; break;

			//case 4: week = "수요일"; break;
			case Calendar.WEDNESDAY: week = "수요일"; break;

			//case 5: week = "목요일"; break;
			case Calendar.THURSDAY: week = "목요일"; break;

			//case 6: week = "금요일"; break;
			case Calendar.FRIDAY: week = "금요일"; break;

			//case 7: week = "토요일"; break;
			case Calendar.SATURDAY: week = "토요일"; break;
		
		}

		System.out.println(y + "-" + m + "-" + d + " " + week);
		//--==>> 2021-8-10 화요일


		////////////////////////////////////////////////////////////////////////////////////
		System.out.println();


		// Calendar 객체 생성
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};

		// 달력의 날짜 세팅 → 『set()』 메소드 활용
		rightNow2.set(2021, 11, 24); // 12월 check~!!! (2021년 12월 24일) //@ 배열 인덱스 값에 맞춰 달을 -1 해줘야 함

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//--==>> 6 → 금요일

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> 금요일
		

		// 달력의 날짜 세팅 → 각자의 생년월일
		rightNow2.set(2021, 9, 27); //@<< 2021년 10월 27일생이야!
		
		// 요일 확인
		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>> 수요일
	}
}