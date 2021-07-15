/*==================================
  ■■■자바 컴파일 및 실행 ■■■
 =================================*/

public class Test002
{
	public static void main(String[] args)
	{	
		// ①
		//System.out.println("Welcome to JAVA");
		//System.out.println("First JAVA Program");
		
		// ②
		//System.out.print("첫 번째 프로그램");
		//System.out.print("두 번째 프로그램");

		// ③ check~!!
		//System.out.print(첫 번째 프로그램);
		//System.out.print(두 번째 프로그램);
		//->에러 발생

		// ④
		System.out.print("첫 번째\n프로그램\n");
		System.out.print("두 번째 프로그램\n");
		
		// ※ println() 과 print() 메소드의 차이는
		//    라인 스킵(줄바꿈, 개행) 유무
		//	  『\n』 을 문자열에 포함하면 라인 스킵 가능

		System.out.println("\\n");
	
	}
}


// 실행 결과
/* ①
Welcome to JAVA
First JAVA Program
계속하려면 아무 키나 누르십시오 . . .
*/

/* ②
첫 번째 프로그램두 번째 프로그램계속하려면 아무 키나 누르십시오 . . .
*/

// ③
// 에러 발생(컴파일 에러)

// ④
/*
첫 번째
프로그램
두 번째 프로그램
*/