/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Calendar 클래스
===========================================*/

// ○ 실습 문제
//    오늘을 기준으로 입력받는 날짜만큼 후의 년, 월, 일, 요일을 확인하여
//    결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 오늘 날짜 : 2021-8-11 수요일
// 몇 일 후의 날짜를 확인하고자 하십니까? : 200

// ========[확인결과]=========
// 200일 후 : xxxx-xx-xx x요일
// ===========================
// 계속하려면 아무 키나 누르세요...

// ※ 현재 날짜를 기준으로 날 수를 더하는 연산 메소드
//    『객체.add(Calendar.DATE, 날 수);』 - 얼마만큼의 날 후인지를 알수 있게 됨
//	  10분 후 소회의실, 10분~15분정도 유지

import java.util.Calendar;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test140
{
	public static void main(String[] args) throws IOException
	{
		Calendar cal = Calendar.getInstance();
		
		//int y = rightNow.get(Calendar.YEAR); 
		//System.out.println(y);
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH) +1;
		int d = cal.get(Calendar.DATE);
		int w = cal.get(Calendar.DAY_OF_WEEK);


	String week = "";
	switch (w)
		{
			//case 1: week = "일요일"; break;
			case Calendar.SUNDAY: week = "일요일"; break;
			case Calendar.MONDAY: week = "월요일"; break;
			case Calendar.TUESDAY: week = "화요일"; break;
			case Calendar.WEDNESDAY: week = "수요일"; break;
			case Calendar.THURSDAY: week = "목요일"; break;
			case Calendar.FRIDAY: week = "금요일"; break;
			case Calendar.SATURDAY: week = "토요일"; break;
		
		}
		BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
	
		int plusday;

		// 오늘 날짜 출력
		System.out.printf("오늘 날짜 : %d-%d-%d %s\n", y,m,d,week);
		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? ");
		plusday = Integer.parseInt(br.readLine());
		
		System.out.println();
		System.out.println("========[확인결과]=========");

	// ※ 현재 날짜를 기준으로 날 수를 더하는 연산 메소드
	//    『객체.add(Calendar.DATE, 날 수);』 - 얼마만큼의 날 후인지를 알수 있게 됨

		cal.add(Calendar.DATE, plusday);

		System.out.printf("%d일 후 : ", plusday);
		int fy = cal.get(Calendar.YEAR);
		int fm = cal.get(Calendar.MONTH) +1;
		int fd = cal.get(Calendar.DATE);
		int fw = cal.get(Calendar.DAY_OF_WEEK);

		String week2 = "";
		switch (fw)
		{
			//case 1: week = "일요일"; break;
			case Calendar.SUNDAY: week2 = "일요일"; break;
			case Calendar.MONDAY: week2 = "월요일"; break;
			case Calendar.TUESDAY: week2 = "화요일"; break;
			case Calendar.WEDNESDAY: week2 = "수요일"; break;
			case Calendar.THURSDAY: week2 = "목요일"; break;
			case Calendar.FRIDAY: week2 = "금요일"; break;
			case Calendar.SATURDAY: week2 = "토요일"; break;
		
		}

		System.out.println(fy + "-" + fm + "-" + fd + " " + week2);

		System.out.println("===========================");

		//이런방식 아니면 ymdw에 add 하고 초기화 한번 해줘야함~!!

	}
}