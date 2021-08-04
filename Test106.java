/*========================================
   ■■■ 정렬(Sort) 알고리즘 ■■■
   - 향상된 버블 정렬(Bubble Sort)
 =========================================*/

 // 사용자로부터 여러 학생의 성적 데이터를 입력받아
 // 점수가 높은 순에서 낮은 순으로 등수를 부여하여
 // 결과를 출력하는 프로그램을 구현한다.
 // 단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.

 // 실행 예)
 // 인원 수 입력 : 5
 // 이름 점수 입력(1) : 김진령 90
 // 이름 점수 입력(2) : 장진하 80
 // 이름 점수 입력(3) : 이윤서 85
 // 이름 점수 입력(4) : 이찬호 75
 // 이름 점수 입력(5) : 정미화 95
 /*
 ---------------------
 1등 정미화 95
 2등 김진령 90
 3등 이윤서 85
 4등 장진하 80
 5등 이찬호 75
 ---------------------
 계속하려면 아무 키나 누르세요...
 */

 //@ 석차 별 정렬
 //@ 향상된 버블 소트 쓰는 편이 좋음! 그래도 어떤 정렬이든 사용해도 됨
 //@ ~11:30 문제 해결/ 그후 소회의실, 같이 안 풀거임! 소회의실 안에서 코드 공유하기

import java.util.Scanner;

public class Test106
{	
	
	public static void main(String[] args)
	{
		int n=0;
		// String name;
		// int score;
		// i번째 이름 배열, i번째 점수 배열 저장
		// 이후 점수 순으로 배열...

		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 입력 : ");
		n = sc.nextInt();

		int[] score = new int[n];
		String[] name = new String[n];
		boolean flag = false;

		int[] ns = new int[n];

		for (int i=0; i<n; i++)
		{
			System.out.printf("이름 점수 입력(%d) : ", i+1);
			name[i] = sc.next();
			score[i] = sc.nextInt();			
		}
		
		// 테스트
		/*
		for (int i=0; i<n; i++)
			{
			System.out.printf("%d번째 이름 점수 : %s, %d\n", i+1, name[i], score[i]);   
			}
		*/

		// 출력
		System.out.println("---------------------");

		String temp = " ";
		
		// -- 성적 순서대로 출력 순서 배열하기
		for (int i=0; i<score.length-1; i++)			//* 앞 조건에 int 빼먹지 않게 주의~!!
		{	
			//flag = false;
			
			for (int j=i+1; j<score.length; j++)
			{ 
				if (score[i]<score[j])
				{
				score[i] = score[j]^score[i];		//* ; 빼먹지 않게 주의~!!
				score[j] = score[i]^score[j];
				score[i] = score[j]^score[i];

				//flag = true;
				temp = name[i];  
				name[i] = name[j];
				name[j] = temp;	
				}
				
				// flag 넣어서 flag = true면 이름도 바꾸기
				
				/*
				if (flag == true)
				{
					//name[i] = name[j]^name[i];
					//name[j] = name[i]^name[j];
					//name[i] = name[j]^name[i];
							
				}
				*/

			
			}
		}
		
		for (int i=0; i<score.length; i++)
		{
			System.out.printf("%d등 %s %d\n", i+1, name[i], score[i]);
		}
		

		System.out.println("---------------------");
		

	}
}

// 실행 결과 // 된다 ㅠㅠ!!
/*
인원 수 입력 : 5
이름 점수 입력(1) : 김진령 90
이름 점수 입력(2) : 장진하 80
이름 점수 입력(3) : 이윤서 85
이름 점수 입력(4) : 이찬호 75
이름 점수 입력(5) : 정미화 95
---------------------
1등 정미화 95
2등 김진령 90
3등 이윤서 85
4등 장진하 80
5등 이찬호 75
---------------------
계속하려면 아무 키나 누르십시오 . . .
*/ 