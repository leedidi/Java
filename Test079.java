/*=======================
   ■■■ 배열 ■■■
   - 배열의 기본적 활용
 ========================*/

 // ○ 과제
 // 사용자로부터 학생 수를 입력받고
 // 그만큼의 점수(정수 형태)를 입력받아
 // 전체 학생 점수의 합, 평균, 편차를 구하여
 // 결과를 출력하는 프로그램을 구현한다.
 // 단, 배열을 활용하여 처리할 수 있도록 한다.

 // 실행 예)
 // 학생 수 입력 : 5
 // 1번 학생의 점수 입력 : 90
 // 2번 학생의 점수 입력 : 82
 // 3번 학생의 점수 입력 : 64
 // 4번 학생의 점수 입력 : 36
 // 5번 학생의 점수 입력 : 98

 // >> 합 : 370
 // >> 평균 : 74.0
 // >> 편차
 // 90 : 16.0
 // 82 : 8.0
 // 64 : -10.0
 // 36 : -38.0
 // 98 : 24.0
 // 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

public class Test079
{
	public static void main(String[] args)
	{
	  // 사용자로부터 학생 수 입력받기
		
	  int n=0;				// 사용자로부터 입력받은 학생 수
	  int hap=0; 			// 학생들 점수의 합
	  double avg=0, dev=0;	// 학생들 점수의 평균, 편차

	  Scanner sc = new Scanner(System.in);
	  System.out.print("학생 수 입력 : ");
	  n = sc.nextInt();

	  // 사용자로부터 점수 입력받기
	  
	  int[] score = new int[n]; //배열 생성
		
	  for (int i=0; i<score.length; i++)
	  {
		 System.out.printf("%d번 학생의 점수 입력 : ", (i+1));
		 score[i] = sc.nextInt();
	  }

	  // 합, 평균, 편차 구하기

	  for (int i=0; i<n; i++) // (i<n == i<score.length)
	  {
		  hap += score[i];
	  }
		  avg = hap/n;

	  // 결과 출력
	  System.out.println();
	  System.out.printf(">> 합 : %d\n", hap);
	  System.out.printf(">> 평균 : %.1f\n", avg);
	  System.out.println(">> 편차");
	  for (int i=0; i<score.length; i++)
	  {
		  dev = score[i]-avg;
		  System.out.printf("%d : %.1f\n", score[i], dev); // printf의 실수형 : 『%f』 //*printf - f 빼먹지 말기!
	  }

	}
}

// 실행 결과
/*
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 36
5번 학생의 점수 입력 : 98

>> 합 : 370
>> 평균 : 74.0
>> 편차
90 : 16.0
82 : 8.0
64 : -10.0
36 : -38.0
98 : 24.0
계속하려면 아무 키나 누르십시오 . . .

*/