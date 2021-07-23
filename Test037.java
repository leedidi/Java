/*==========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - switch 문 실습
 ==========================================================*/

 // 1 부터 3 까지의 정수 중 하나를 사용자로부터 입력받아
 // 입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 작성한다.
 // 단, 두 가지 방법으로 구현할 수 있도록 한다.

 // ① switch 문의 일반 모델을 사용하여 해결한다.
 // ② switch 문의 기본 모델을 사용하되,
 //	   『break;』 를 딱 한 번만 사용할 수 있도록 구성한다.
 // @ ： << 문자 입력 방법 : ㄱ + 한자 + 7번!
 // 쉬프트 + end 키나 ctrl+R, 왼쪽 숫자 누르면 한 줄 다 클릭 가능!!

 // 실행 예)
 // 임의의 정수 입력(1~3) : 3
 // ★★★
 // 계속하려면 아무 키나...

  // 임의의 정수 입력(1~3) : 1
  // ★
  // 계속하려면 아무 키나...

  // 임의의 정수 입력(1~3) : 7
  // 입력 오류~!!!
  // 계속하려면 아무 키나...


  //내가 만든 코드

/*

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{	
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n;	// 사용자가 입력할 임의의 정수(1~3)

		// 연산 및 처리
		System.out.print("임의의 정수 입력(1~3) : ");
		n = Integer.parseInt(br.readLine());
		
		// 결과 출력

		//① switch 문의 일반 모델을 사용 >> break 사용 O

*/
		/*
		switch(n)
		{
		case 1 : System.out.print("★\n"); break;
		case 2 : System.out.print("★★\n"); break;
		case 3 : System.out.print("★★★\n"); break;
		default : System.out.print("입력 오류~!!!\n"); break;
		}
		*/

/*
		//② switch 문의 기본 모델을 사용 >> break 딱 한번만 사용 O
		switch(n)
		{
		default : System.out.print("입력 오류~!!!\n"); break;
		case 3: System.out.print("★");
		case 2: System.out.print("★");
		case 1: System.out.print("★");
		System.out.println();
		}

		
	}
}
		
	*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test037
{
	public static void main(String[] args) throws IOException
	{	
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			int n ;

			System.out.print("임의의 정수 입력(1~3) : ");
			n = Integer.parseInt(br.readLine());

			// ①
			/*
			switch (n)
			{
			case 1 : System.out.println("★"); break;
			case 2 : System.out.println("★★"); break;
			case 3 : System.out.println("★★★"); break;
			default : System.out.println("입력 오류~!!!"); break; //(@얘네들에 println 쓰면 따로 \n추가 안해도 됨!)
			}
			*/

			// ②
			switch (n)
			{
			default : System.out.println("입력 오류~!!!"); 
			
			break; //@ 위로 올려도 ㅇㅋ  아래로 내려도 ㅇㅋ! default ~ case 321 사이에 break만 있으면 됨
			
			case 3 : System.out.print("★"); 
			case 2 : System.out.print("★"); 
			case 1 : System.out.print("★\n"); 

		
			}



			}
	}

// 함께 작성한 코드


/*
임의의 정수 입력(1~3) : 1
★
계속하려면 아무 키나 누르십시오 . . . 
*/

/*
임의의 정수 입력(1~3) : 2
★★
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력(1~3) : 3
★★★
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력(1~3) : 7
입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .
*/