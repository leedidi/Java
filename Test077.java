/*=======================
   ■■■ 배열 ■■■
   - 배열의 선언과 초기화
   - 배열의 기본적 활용
 ========================*/

 // 사용자로부터 처음 입력받은 인원 수 만큼의
 // 학생 이름과 전화번호를 입력받고
 // 입력받은 내용을 전체 출력하는 프로그램을 구현한다.
 // 단, 배열을 활용하여 처리할 수 있도록 한다. 

 // 실행 예)
 // 입력 처리할 학생 수 입력(명, 1~10) : 24
 // 입력 처리할 학생 수 입력(명, 1~10) : 3
 // 이름 전화번호 입력[1](공백 구분) : 손범석 010-1111-1111
 // 이름 전화번호 입력[2](공백 구분) : 채지윤 010-2222-2222
 // 이름 전화번호 입력[3](공백 구분) : 최현정 010-3333-3333

 // -------------------
 // 전체 학생 수 : 3명
 // -------------------
 //  이름    전화번호
 // 손범석 010-1111-1111
 // 채지윤 010-2222-2222
 // 최현정 010-3333-3333
 // ---------------------
 // 계속하려면 아무 키나 누르세요...

 //@ 이름을 저장할 배열과 전화번호를 저장할 배열은 따로 저장!

/*
import java.util.Scanner;
import java.io.IOException;

public class Test077
{
	public static void main(String[] args) throws IOException
	{
		
	int n;				// 사용자에게 입력받을 학생 수
	//String name;		// 사용자에게 입력받을 이름
	//String phone;		// 사용자에게 입력받을 전화번호
	String[] arr1 = new String[10];
	String[] arr2 = new String[10];
	Scanner sc = new Scanner(System.in);

	// 입력 처리할 학생 수 입력받기 (10명까지 아니면 다시)
	do
	{
	System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
	n = sc.nextInt();
	}
	while(n<1 || n>10);

	// 이름, 전화번호 입력
	for (int i=0; i<n; i++)
	{
	System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", (i+1));
	arr1[i] = sc.next();
	arr2[i] = sc.next();
	}

	// 출력
	 // -------------------
	 // 전체 학생 수 : 3명
	 // -------------------
	 //  이름    전화번호
	 // ㅇㅇㅇ 010-1111-1111
	 // ㅁㅁㅁ 010-2222-2222
	 // ㅂㅂㅂ 010-3333-3333
	 // ---------------------
	System.out.println("---------------------");
	System.out.printf("전체 학생 수 : %d명\n", n);
	System.out.println("---------------------");
	System.out.println(" 이름    전화번호 ");

	for (int i=0; i<n; i++)
	{
	System.out.printf("%s %s\n", arr1[i], arr2[i]);
	}

	System.out.println("---------------------");
	}
}

// 하던부분은 지우지말고 나중에 못푼부분 더 풀어보고, 다르게풀었으면 참고해보고...
   각주표시해서 보존해 놓는게 바람직함!
*/

import java.util.Scanner;

public class Test077
{							// int[], 문자열 각 방에 넣을수있는 배열 args
	public static void main(String[] args)
	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		//@			스캐너 생성자 호출(생성자에게 System.in 매개변수를 넘겨줌! 매개변수 넘겨받는 생성자 호출)

		// 사용자가 입력하는 학생 수를 담아둘 변수
		int memCount = 0;
		
		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1~10) : ");
			memCount = sc.nextInt();
		}
		while (memCount<1 || memCount>10); // ~ 하는 동안 위 입력하시오 반복하기. 두조건 한꺼번에 만족하는 수 없으니 or!

		// 테스트
		//System.out.print("사용자가 입력한 인원수 확인 : " + memCount);
		
		// 배열 생성(이름 배열, 전화번호 배열)
		// - 사용자로부터 입력받은 인원수 만큼의 배열방 구성

		// 이름 저장 배열
		String[] names = new String[memCount];	//@ 입력한 숫자만큼!

		// 전화번호 저장 배열
		String[] tels = new String[memCount];
		// 『String[] tels = new String[names.length];』 와 동일한 구문
		// 숫자로 입력되더라도 맨앞에 0 들어갈 가능성 있으면 절대로! int로 만들면 X (@음수 될수 있음, 밀레니엄 00년 사태...))
		// --->> 문자열 형태로 만들기
		
		for (int i=0; i<memCount; i++)
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ", (i+1));
			// 손범석 010-1111-1111
			names[i] = sc.next();
			tels[i] = sc.next();
		}
		
		// 최종 결과(이름, 전화번호) 출력
		System.out.println();
		System.out.println("------------------");
		System.out.printf("전체 학생 수 : %d명\n", memCount);
		System.out.println("------------------");
		System.out.println("  이름    전화번호");

		for (int m=0; m<memCount; m++)
			System.out.printf("%4s %14s\n", names[m], tels[m]);
		//요기 확인 -> 확인 완료!
		System.out.println("------------------");
	}
}
	





// 실행 결과
/*
입력 처리할 학생 수 입력(명, 1~10) : 3
이름 전화번호 입력[1](공백 구분) : 김일일 010-1111-1111
이름 전화번호 입력[2](공백 구분) : 김이이 010-2222-2222
이름 전화번호 입력[3](공백 구분) : 김삼삼 010-3333-3333
---------------------
전체 학생 수 : 3명
---------------------
 이름    전화번호
김일일 010-1111-1111
김이이 010-2222-2222
김삼삼 010-3333-3333
---------------------
계속하려면 아무 키나 누르십시오 . . .

*/

/*
입력 처리할 학생 수 입력(명, 1~10) : 3
이름 전화번호 입력[1](공백 구분) : 김일일 010-1111-1111
이름 전화번호 입력[2](공백 구분) : 김이이 010-2222-2222
이름 전화번호 입력[3](공백 구분) : 김삼삼 010-3333-3333

------------------
전체 학생 수 : 3명
------------------
  이름    전화번호
 김일일  010-1111-1111
 김이이  010-2222-2222
 김삼삼  010-3333-3333
------------------
계속하려면 아무 키나 누르십시오 . . .
*/