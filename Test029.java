/*===================================
  ■■■ 실행 흐름의 컨트롤(제어문, 조건문과 반복문) ■■■
  - if ~ else 문 실습
 ===================================*/

 // 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
 // 다음과 같은 형태로 출력하는 프로그램을 작성한다.
 // 등급은 평균 형태를 기준으로 산출하여 처리한다.

 // 90점 ~ 100점 : A		80점 ~ 89점 : B
 // 70점 ~ 79점  : C		60점 ~ 69점 : D
 // 60점 미만	 : F

 // 단, BufferedReader 를 활용하여 데이터를 입력받을 수 있도록 하며,
 // printf() 메소드를 통해 출력할 수 있도록 구현한다.

 // 실행 예)
 // 이름 입력 : 손범석
 // 국어 점수 : 90
 // 영어 점수 : 80
 // 수학 점수 : 70

 // >> 당신의 이름은 손범석입니다.
 // >> 국어 점수는 90,
 // >> 영어 점수는 80,
 // >> 수학 점수는 70.
 // >> 총점은 240이고, 평균은 80입니다.
 // >> 등급은 B 입니다.
 // 계속하려면 아무 키나 누르세요 ...

/* [내가 작성한 코드]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		int kor, eng, mat, tot;
		double avg;
		char grade;

		// 연산 및 처리 (@ 위 선언한 변수들의 값을 담는 과정)

		System.out.print("이름 입력 : ");
		name = br.readLine();
		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 점수 : ");
		mat = Integer.parseInt(br.readLine());

		tot = kor + eng + mat;
		avg = tot / 3.0;

		//grade 값 설정
		// 90점 ~ 100점 : A		80점 ~ 89점 : B
        // 70점 ~ 79점  : C		60점 ~ 69점 : D
        // 60점 미만	 : F

		if( avg > 89 )
		grade = 'A';
	    else if ( avg > 79)
			{ grade = 'B';
			}
			else if (avg > 69)
			{ grade = 'C';
			}
				else if(avg > 59)
				{ grade = 'D';
				}
			else 
				{ grade = 'F';
				}		

		// 결과 입력
		
		System.out.printf(" \n >> 당신의 이름은 %s입니다.\n", name);
		System.out.printf(" >> 국어 점수는 %d,\n",kor);
		System.out.printf(" >> 영어 점수는 %d,\n",eng);   
		System.out.printf(" >> 수학 점수는 %d,\n",mat);
		System.out.printf(" >> 총점은 %d이고, 평균은 %.2f입니다.\n", tot, avg);
		System.out.printf(" >> 등급은 %s 입니다.\n", grade);
		//@ 정수 형태: %d / 실수 형태: %f / 문자열 형태 : %s / \n: 개행

	}
}
*/
// [같이 작성할 코드]


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test029
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name;        //--이름
		int kor, eng, mat;	//-- 국어, 영어, 수학 점수
		int tot;			//-- 총점
		//int tot = 0;
		double avg;			//-- 평균
		//char grade;	
		char grade='F';			//-- 등급 //@ else 안써도 기타등등 안나와도 쓸수있는거 만들어 주는 것

		System.out.print("이름 입력 : ");
		name = br.readLine();

		System.out.print("국어 점수 : ");
		kor = Integer.parseInt(br.readLine());
		//tot += kor;

        System.out.print("영어 점수 : ");
		eng = Integer.parseInt(br.readLine());
		//tot += eng;

		System.out.print("수학 점수 : ");
		mat = Integer.parseInt(br.readLine());
		//tot += mat;

		// 총점 산출
		tot = kor + eng + mat;

		// 평균 산출
		avg = tot / 3.0;		//-- check~!! 피연산자중의 하나 실수로 해야 실수기반의 연산 가능!

		// 등급 산출(@ 주의!)

		// 90 <= 평균 < = 100 / 현실에서는 사용하는 수식이나, Java에서는 문법적으로 존재할수 없는 수식

		// ※ 두 개 이상의 조건 등장 → 논리 연산자
		// 평균이 90점이상 / 평균이 100점이하(조건 두개로 나눔)
		// 평균이 90점이상 and 평균이 100점이하 (@여기 틀려서 or로 썼다고해도 오류 나타나지 않음! 주의)

		/*
		if (avg<=100)
		{
		}
		else
		{
			System.out.println("점수 입력 오류");
		}
		*/

		if (avg>=90)
		{
			// 등급이 A
			grade = 'A';
		}
		//else if (avg>=80 && avg<90) //(80점 ~ 89점 : B) // 80 <= avg < 90 // 얘는 위에서 이미 90이하인게 나타남
		else if (avg>=80)
		{
			//등급이 B
			grade = 'B';
		}
		else if (avg >= 70)
		{
			//등급이 C
			grade = 'C';
		}
		else if (avg>=60)
		{
			//등급이 D
			grade = 'D';
		}
		/* else if (avg<60)
		{
			//등급이 F
			grade = 'F';
		}
		*/

		//@ if(){} ~ else{} : 한 문장. 이 중간에 다른거 들어갈수 X. ~에 또다른 if, else{} 안에 또다른 if 넣는건 가능함
		//@ if~else 구문이 꼭 else로 끝나야 한다? X! 안 그래도 됨. if(){} ~ else{}: 이미 끝난 구문임


		// 최종 결과 출력
		
		System.out.println();
		System.out.printf(">> 당신의 이름은 %s입니다.\n", name);
		System.out.printf(">> 국어 점수는 %d,\n",kor);
		System.out.printf(">> 영어 점수는 %d,\n", eng);
		System.out.printf(">> 수학 점수는 %d,\n", mat);
		System.out.printf(">> 총점은 %d이고, 평균은 %.2f입니다.\n", tot, avg);
		System.out.printf(">> 등급은 %c 입니다.\n", grade);




	}
}

// 실행 결과
/*
이름 입력 : 손범석
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70

>> 당신의 이름은 손범석입니다.
>> 국어 점수는 90,
>> 영어 점수는 80,
>> 수학 점수는 70,
>> 총점은 240이고, 평균은 80.00입니다.
>> 등급은 B 입니다.
계속하려면 아무 키나 누르십시오 . . .
*/


// 실행 결과
/*
이름 입력 : 이다영
국어 점수 : 95
영어 점수 : 90
수학 점수 : 90

 >> 당신의 이름은 이다영입니다.
 >> 국어 점수는 95,
 >> 영어 점수는 90,
 >> 수학 점수는 90,
 >> 총점은 275이고, 평균은 91.67입니다.
 >> 등급은 A 입니다.
*/