/*==========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - break
  	멈춘다. (+ 그리고 빠져나간다.)
 ==========================================================*/

 // 아래와 같은 처리가 이루어지는 프로그램을 구현한다.
 // 단, 입력받는 정수는 1 ~ 100 범위 안에서만
 // 가능하도록 작성한다.

 // 실행 예)

 // 임의의 정수 입력 : -20

 // 임의의 정수 입력 : 0
 
 // 임의의 정수 입력 : 2021
 
 // 임의의 정수 입력 : 10
 // >> 1 ~ 10 까지의 합 : 55
 // 계속하시겠습니까(Y/N)? : y

  // 임의의 정수 입력 : 100
 // >> 1 ~ 100 까지의 합 : 5050
 // 계속하시겠습니까(Y/N)? : n
 // 계속하려면 아무 키나 누르세요 ... → 프로그램 종료

/*
import java.io.IOException;

 public class Test060
{
	public static void main(String[] args) throws IOException
	{	
		// 변수 선언 및 초기화
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// num = sc.nextInt()
		int n;				// 사용자가 입력한 임의의 정수
		int i;				// 루프변수 i
		int sum = 0;		// 1 ~ 임의의 정수까지의 합
		char yn = 'y';		// 사용자가 입력할 Y/N

		// 연산 및 처리

		do
		{
		System.out.print("임의의 정수 입력 : ");
		n = sc.nextInt();
		
		if(n<0 || n>100)
		break;

		else
		{
			for(i=1;i<=n;i++)
		{
			sum += i;		
		}
		System.out.printf(" >> 1 ~ %d 까지의 합 : %d\n", n-1, sum);

		System.out.print("계속하시겠습니까(Y/N)? : ");
		yn = (char)System.in.read(); //(char)sc.nextInt();
		}
		while(yn == 'y' || yn == 'Y');
		}
		*/

		/*
		if(yn = 'y' || yn = 'Y')
		{
			for(n=1;n<=100;n++)
		{
			sum += n;		
		}
		System.out.printf(" >> 1 ~ %d 까지의 합 : %d\n", n-1, sum);
		}
		
		else if(yn = 'N' || yn = 'n')
		break;

		else 
		System.out.println("문자를 잘못 입력하셨습니다.");
		*/

		// 여기서 break를 어디에 어떤 방식으로 쓰지...??

		// 결과 출력

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test060
{
	public static void main(String[] args) throws IOException
	{	
		//주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n, s, i; //@ 이렇게 간단하게 초기화도 가능! // int n, s=0, i;
		//-- n : 외부로부터 사용자의 입력값으 담아둘 변수
		//   s : 누적합 연산 결과를 담아둘 변수
		//   i : 1부터 1 씩 사용자의 입력값까지 증가할 변수

		char ch;
		//-- 계속 진행할지 말지에 대한 의사표현 결과를 담아둘 변수

		while (true) // 무한 반복을 실행하는 루프
		{
			

		do
		{ 
			System.out.print("\n임의의 정수 입력 : ");
			n = Integer.parseInt(br.readLine());
		}
		while (n<1 || n>100);

		// 테스트
		//System.out.println("유효한 정수 입력 완료~~!!!");

		s = 0;	//-- 누적합 변수의 초기화 위치    check~!! /@ 산출하기 전에 초기화!

		// 누적합 산출
		for (i=1; i<=n; i++)
		{
			s += i;
		}
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", n, s);

		System.out.print("계속하시겠습니까(Y/N)? : ");
		ch = (char)System.in.read();
		// bufferedreader로 가져오면 문자열로 가져오고, 아직우리는 문자열 크기비교 할수X
		// 지금은 ch = System.in.read(); 로 받아야 함. 2바이트 문자형 =  4바이트 정수형 >> 2바이트 문자형 = char(4바이트 정수형)


		// 그만할래 의사표현
		//if(ch == 'N' || ch=='n')  //@ >> 요거 반대로 바뀌니까 ||도 &&로 바뀜! 
		if (ch!='Y' && ch!='y')	// 논리 연산자 check~!!! || 이 되면, y를 입력해도 이건 Y가 아니잖아! 하고 인식해버림
		//@ 이게 일반적 의사표현에 대한 확인방법임! m,s, ... , 를 눌러도 아니야! 라는 말이 될수 있도록!
		{
			// 반복문(while)을 빠져나갈 수 있는 코드 작성 필요
			// -- 위와 같은 의사표현을 했다면
			//    그동안 수행했던 반복문을 멈추고 빠져나가야 한다.

			break; // @얘를 감싸는 가장 가까운 반복문... while 문 빠져나감
			// -- 멈춘다 ( + 그리고 빠져나간다.) check~!!!
		}


		// Y + 엔터 / y + 엔터  //@ -> br.readLine() 맨위가 엔터값 가져옴..! 이건 Int값이 아니라 Int로 변환 can't >> 여기서 에러남
		//                      //@ NumberFormatException 에러

		// 엔터값(\r\n) 처리					check~!!!
		System.in.skip(2);		//@ 엔터는 키값이 2개기 때문에 이 2개 버려야 함
		
		
		} // end while




	} //end main()
}//end class Test060

// 실행 결과
/*

임의의 정수 입력 : 10
>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까(Y/N)? : y

임의의 정수 입력 : 10
>> 1 ~ 10 까지의 합 : 55
계속하시겠습니까(Y/N)? : y

임의의 정수 입력 : 100
>> 1 ~ 100 까지의 합 : 5050
계속하시겠습니까(Y/N)? : n
계속하려면 아무 키나 누르십시오 . . .

*/