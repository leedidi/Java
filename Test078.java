/*=======================
   ■■■ 배열 ■■■
   - 배열의 기본적 활용
 ========================*/

 // ○ 과제
 // 사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아서
 // 입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 작성한다.
 // 단, 배열을 활용하여 구현할 수 있도록 한다.

 // 실행 예)
 // 입력할 데이터의 갯수   : 10
 // 데이터 입력(공백 구분) : 74 65 13 91 5 67 41 2 50 11
 // >> 가장 큰 수 → 91
 // 계속하려면 아무 키나 누르세요 ...

import java.util.Scanner;

public class Test078
{
	public static void main(String[] args) 
	{	
		// 입력할 데이터의 갯수 입력받기
		Scanner sc = new Scanner(System.in);
		int numCount=0;	//입력할 데이터의 갯수

		System.out.print("입력할 데이터의 갯수 : ");
		numCount = sc.nextInt();
	
		// 데이터 내용 입력받기
		int[] nums = new int[numCount];	// *여기가 String이 아니라 int

		System.out.print("데이터 입력(공백 구분) : ");
		// 1, 2, 3, 4
		// nums[0] = 1, nums[1] = 2, num[2] = 3, num[3] = 4

		for (int i=0;i<nums.length; i++)
		{
			nums[i] = sc.nextInt();
		}

		// 가장 큰 수 구하기
		int maxN = nums[0];	// 배열의 첫 번째를 maxN에 대입

		for (int i = 1; i<nums.length; i++) // *맨처음칸에 int 빼먹지 말기!!
		{
			if(maxN < nums[i])
			 maxN = nums[i];
		}

		// 출력
		System.out.printf(">> 가장 큰 수 → %d\n", maxN);
		
	}
}

// 실행 결과
/*
입력할 데이터의 갯수 : 10
데이터 입력(공백 구분) : 74 65 13 91 5 67 41 2 50 11
>> 가장 큰 수 → 91
계속하려면 아무 키나 누르십시오 . . .
*/