/*==========================================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - switch 문 실습
 ==========================================================*/

/*
○ 다중 선택문이라 하며, swith 문 다음의 수식 값에 따라
   실행 순서를 여러 방향으로 분기할 때 사용하는 문장이다.

○ 형식 및 구조
   switch(수식)
   {
	   case 상수1: 문장1; [break;] (@ []: 있어도 되고 없어도 되는 문장)
	   case 상수2: 문장2; [break;]
				.
				.
	   [defalt : 문장n+1; [break;]]
	   }

	   switch 문의 『수식』 과 case의 『상수』는
	   byte, short, int, long 이어야 한다.

	   case 문 뒤에 『break;』 가 없는 형태의 경우
	   다음 case 문의 문장을 계속해서(이어서) 수행하게 된다. (→ 기본 모델)

*/

// 당신의 이름은 서승균 입니다.
// 총점은 xx, 평균은 xx 입니다.
// 등급은 A 입니다.


//
/*
if() >> true/ flase
{
}

switch(n) >> 상수
{	(@기본형)
	case 1 : ....; ( @n=1 이면 이쪽으로 들어감, 진입지점. 이후 2,3 도 진행함. 1만 진행하는게 X) 
						ex>> 책에 붙여놓은 포스트잇. 표시한 포스트잇 이후부터 끝까지 책 봄! 					
	case 2 : .....;
	case 3 : .....; (@n=3 이면 이쪽으로 들어감, 3만 진행) (case 3 : ... case 1 ... case 2... 순서도 가능!)

	default : ......; (@ n이 1도 아니고 2도 아니고 3도 아닐때 시작하는 지점) (default 없어도, 맨 위여도, 중간에 껴있어도 가능)
																		     (다만 default 맨위일경우 n=7이면 default, 1,2,3 순서대로 다수행)
	(@일반형)
	default : ....; (@ n=7일때 얘만 수행)
			 break;
	case 3 : ....;  (@ n=3 3부터 2까지 수행)
	case 2 : ....;	(@ n = 2 2만 수행)
			 break;
	case 1 : ....;
			 break;
	}

	>> break 만나면 해당 위 연산 수행후 여기로 switch문 빠져나옴!
	

	-- break; : 멈춘다. + (★...그리고 빠져나간다) << 항상 이렇게 생각하기!!
	-- continue; : (★뒷부분 무시하고....) + 계속한다. << 항상 이렇게 생각하기!!
	
	(@또다른 형태)
	case 1 : case 2 : case 3:
			.....;    (@ 포스트잇 책옆부분말고 책 윗부분에도 붙일수 있음! 같은페이지에도 붙일수 있음!)

			
	case 1 : System.out.println("Simple JAVA");
					break;
	case 2 : System.out.println("Simple JAVA");
					break;
	case 3 : System.out.println("Simple JAVA");
					break;

					(=)

	case 1 : case 2 : case 3: System.out.println("Simple JAVA");
					break;

*/


/*
// [내가 만든 코드]
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

*/
		

/*	[오류나서 복붙후 수정용] - 오류확인수정 완료!
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어점수 입력 : 
		System.out.print("영어점수 입력 : ");
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학점수 입력: ");
		int mat = Integer.parseInt(br.readLine);
*/
		
/*
		System.out.print("이름 입력 : ");
		String name = br.readLine();

		System.out.print("국어점수 입력 : " );
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어점수 입력 : " );
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학점수 입력 : " );
		int mat = Integer.parseInt(br.readLine());

		// 평균 - 평의상 정수로 처리
		int avg = (kor+eng+mat) / 3;

		char grade;

		switch(avg/10)
		{
			case 10 : case 9:
			grade = 'A';
			break;
			case 8:
			grade = 'B';
			break;
			case 7 :
			grade = 'C';
			break;
			case 6 :
			grade = 'D';
			break;
			default :
			grade = 'F';
		}

		System.out.printf("\n당신의 이름은 %s 입니다.", name);
		System.out.printf("\n총점은 %d, 평균은 %d 입니다.", (kor+eng+mat),avg);
		System.out.printf("\n등급은 %c 입니다.\n", grade);

	}
}
*/

//같이 작성한 코드


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test036
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름 입력 : ");
		String name = br.readLine();

		System.out.print("국어점수 입력 : " );
		int kor = Integer.parseInt(br.readLine());
		System.out.print("영어점수 입력 : " );
		int eng = Integer.parseInt(br.readLine());
		System.out.print("수학점수 입력 : " );
		int mat = Integer.parseInt(br.readLine());

		// 평균 - 평의상 정수로 처리
		int avg = (kor+eng+mat) / 3;

		char grade = 'F';
	
		/*
		if (avg>=90)
			grade = 'A';
		else if(avg >=80)
			grade = 'B';
		else if(avg >=70)
			grade = 'C';
		else if(avg >=60)
			grade = 'D';
		//else 
		//	grade = 'F';
		*/

		/*
		switch (avg)
		{
			case 100: grade ='A'; break;
			case 99: grade ='A'; break;
			case 98: grade ='A'; break;
			         ..
			case 2: grade ='F'; break;
			case 1: grade ='F'; break;
			case 0: grade ='F'; break;
	
		}
		*/
		
		/*switch (avg/10)
		{
			case 10: grade ='A'; break;
			case 9: grade ='A'; break;
			case 8: grade ='B'; break;
			case 7: grade ='C'; break;
			case 6: grade ='D'; break;
			case 5: grade ='F'; break;
			case 4: grade ='F'; break;
			case 3: grade ='F'; break;
			case 2: grade ='F'; break;
			case 1: grade ='F'; break;
			case 0: grade ='F'; break;
	
		}
		*/
		
		/*
		switch (avg/10)
		{
			case 10: grade ='A'; break;
			case 9: grade ='A'; break;
			case 8: grade ='B'; break;
			case 7: grade ='C'; break;
			case 6: grade ='D'; break;
			default : grade = 'F'; break;
	
		}

		*/

			switch (avg/10)
		{
			case 10: case 9: grade ='A'; break;
			case 8: grade ='B'; break;
			case 7: grade ='C'; break;
			case 6: grade ='D'; break;
			// default : grade = 'F'; break;
	
		}
	
		// 결과 출력
		System.out.printf("\n당신의 이름은 %s 입니다.\n", name);
		System.out.printf("총점은 %d, 평균은 %d 입니다.\n", (kor+eng+mat), avg);
		System.out.printf("등급은 %c 입니다.\n", grade);


	}
}


// 실행 결과

/*
당신의 이름은 이다영 입니다.
총점은 255, 평균은 85 입니다.
등급은 B 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/

/*
이름 입력 : 이중호
국어점수 입력 : 98
영어점수 입력 : 97
수학점수 입력 : 55

당신의 이름은 이중호 입니다.
총점은 250, 평균은 83 입니다.
등급은 B 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/