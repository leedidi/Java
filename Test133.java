/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - String 클래스
===========================================*/

public class Test133
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
		//--==>> seoul korea

		// ○ 문자열 추출
		System.out.println(s.substring(6, 9));
		//--==>> kor
		//-- 『String.substring(s, e)』
		//     String 문자열을 대상으로
		//     s 번째에서... e-1 번째까지...
		//     (단, 인덱스는 0부터 시작)

		System.out.println(s.substring(7));
		//--==>> orea
		//-- 『String.substring(s)』
		//    String 문자열을 대상으로
		//    s 번째에서 끝까지... (즉, 문자열이 가진 길이만큼...)

		// ○ 문자열의 데이터(값) 비교
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("Seoul Korea"));
		//--==>> true
		//		 false
		//-- 대소문자 구분

		System.out.println(s.equalsIgnoreCase("Seoul KOrea"));
		//--==>> true
		//-- 대소문자 구분 안함

		// ○ 찾고자 하는 대상 문자열(s)에
		//    『kor』 문자열이 존재할까?
		//    존재한다면... 그 위치는 어떻게 될까?

		// "seoul korea"
		System.out.println(s.indexOf("kor"));
		//--==>> 6
		//@ s라는 대상 문자열에 kor이라는 문자열이 존재하면 그 위치는 인덱스 6번째다!

		System.out.println(s.indexOf("ea"));
		//--==>> 9

		System.out.println(s.indexOf("e"));
		//--==>> 1
		//@ 스캐닝 앞에서부터 해나가기 때문에.. 앞에서 찾으면 끝!

		System.out.println(s.indexOf("tt"));
		//--==>> -1
		//-- 찾고자 하는 문자열이 대상 문자열에 존재할 경우
		//   그 문자열의 인덱스를 반환하지만
		//   존재하지 않을 경우 음수를 반환하게 된다. (-1)
	
		
		// ○ 대상 문자열(s)이 『rea』로 끝나는지의 여부 확인
		//    (true / false)
		//@ 어떤 값을 얻어내는지도(반환하는지를) 봐야 함~!!
		System.out.println(s.endsWith("rea"));
		//--==>> true

		System.out.println(s.endsWith("oul"));
		//--==>> false
		
		// ○ 찾고자 하는 대상 문자열(s)에
		//    『e』문자열이 존재할까?
		//     존재한다면 그 위치는 어떻게 될까?
		//     (단, 뒤에서부터 검사)

		// seoul korea
		System.out.println(s.indexOf("e"));
		//--==>> 1

		System.out.println(s.indexOf("o"));
		//--==>> 2

		System.out.println(s.lastIndexOf("e"));
		//--==>> 9
		
		System.out.println(s.lastIndexOf("o"));
		//--==>> 7

		// ○ 대상 문자열(s) 중
		//    『6』번째 인덱스 위치의 문자는?

		// seoul korea
		System.out.println(s.charAt(6)); //@ 캐릭터앳이라고 부름
		//--==>> k

		System.out.println(s.charAt(10));
		//--==>> a

		//System.out.println(s.charAt(22));
		//--==>> 에러 발생(런타임 에러)
		//		 → StringIndexOutOfBoundsException

		// ○ 대상 문자열(s)과 비교 문자열 『seoul corea』 중
		//    어떤 문자열이 더 큰가?
		//    두 문자열이 다르다면 차이를 확인 ( → 사전식 배열)

		System.out.println(s.compareTo("seoul korea"));
		//--==>> 0

		System.out.println(s.compareTo("seoul corea"));
		//--==>> 8 (c ~ k → defghijk)


		// ○ 대상 문자열(s) 중
		//    해당 문자열을 찾아서 원하는 형태로 수정
		s = "우리나라 대한민국 대한독립 만세";
		s = s.replaceAll("대한", "자주");
		System.out.println(s);
		//--==>> 우리나라 자주민국 자주독립 만세

	
		// ○ 공백 제거
		s = "       사         랑        ";
		System.out.println(":" + s + ":");
		//System.out.println(s);
		//--==>> :       사         랑        :

		System.out.println(":" + s.trim() + ":");
		//@ 자바에서의 trim : 양쪽 공백을 제거. (like 손톱깎이 같은 기능! 우리나라 유명했던 손톱깎이 브랜드 trim 있음..)
		//--==>> :사         랑:
		//@ 공백 통으로 잘라내는게아니라 하나하나 또각또각 잘라낸다고 생각하기!
		//-- 양쪽 가장자리 공백 제거

		System.out.println(":" + s.replaceAll(" ", "")+":");
		//--==>> :사랑:


		//int n = Integer.parseInt("30");
		s = Integer.toString(30);
		System.out.println(s);
		//--==>> 30

		int n = 2345678;
		System.out.printf("%d", n);
		System.out.format("%d", n);
		//--==>> 23456782345678

		//@ String.format(); :  사용법 printf와 같음. 대신 출력 X 그 형태의 문자열을 반환함.
		s = String.format("%d", n);
		System.out.println(s);
		//--==>> 2345678

		s = String.format("%, d", n); //@ 숫자표현시 구두점 표현! ex> 1,000원
		System.out.println(s); 
		//--==>> 2,345,678


		System.out.printf("%.2f", 3.141592);
		System.out.println();
		//--==>> 3.14

		s = String.format("%.2f", 3.141592);	// "3.14" @ 가 s에 담김(출력x)
		System.out.println("s 출력 : " + s);
		//--==>> s 출력 : 3.14
		
		
		String[] sArray = "기본,열정,배려".split(","); //@ 문자열 배열로 반환
		
		for (String str: sArray) 
		//@ sArray는 String배열, 이중 하나 꺼내면 String!  << ※ 주의! 하나꺼내면 String 배열이 아님X. 걍 String임
		{
			System.out.print(str + "  ");
		}
		System.out.println();
		//--==>> 기본  열정  배려



	}
}