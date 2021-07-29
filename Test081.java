/*===========================
   ■■■ 배열 ■■■
   - 배열의 배열(2차원 배열)
 ============================*/

 // 배열의 배열(다차원 배열)을 활용하여
 // 다음과 같은 데이터를 요소로 취하는 배열(5x5)를 구성하고.
 // 그 결과를 출력하는 프로그램을 구현한다.

 // 실행 예)
 /*
  1  2  3  4  5
  6  7  8  9 10
 11 12 13 14 15
 16 17 18 19 20
 21 22 23 24 25
 계속하려면 아무 키나 누르세요...
 */
 // 채우는거 따로, 전체 출력 따로...

// [내가 작성한 코드]
/*
public class Test081
{
	public static void main(String[] args)
	{	
		int n=1;

		// 배열 생성
		int[][] arr= new int[5][5];
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++, n++)
			{	
				arr[i][j] = n;
			}
		}

		// 배열 출력
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{	
				if(arr[i][j]%5 == 0)
				System.out.printf("%2d\n", arr[i][j]);

				else
				System.out.printf("%2d ", arr[i][j]);	
			}
		}

	}
}
*/

// [함께 작성한 코드]
public class Test081
{
	public static void main(String[] args)
	{	
		// 배열의 배열 선언
		//int[][] arr;

		// 배열의 배열 메모리 할당
		//arr = new int[5][5];

		// 배열의 배열 선언 + 메모리 할당
		int[][] arr = new int [5][5];

		int n=1;		// 1 2 3 4 5 6 ... 22 23 24 25 26

		//@ 배열의 배열은 반복문의 중첩 구문을 활용하여 구조화
		//@ 배열의 배열부터는 반복문 중첩 사용..그래서 어렵게 느껴지는것! 반복문 여러 방향으로 써봐야 함

		for (int i=0; i<arr.length; i++)		 // 웅 → outer → 0            1           2         3		    4
												 //@ arr.length : 커다란 큰 상자(방) 갯수 얘기, 여기서는 5개
		{
			for (int j=0; j<arr[i].length; j++)   // 쑝 → inner → 0 1 2 3 4 / 0 1 2 3 4 / 0 1 2 3 4/ 0 1 2 3 4/ 0 1 2 3 4
												  //@ arr.length 지금은 되지만 나중에 행열다르면 문제있을수도..
											      //@ arr.length[i]
			//for (int j=0; j<arr[i].length; i++) //* j를 i로 잘못 쓴 오타 오류였습니다...!
			{  
				arr[i][j] = n;
				n++;
			}
		}

		//-- 여기까지 배열의 각 방에 값 채우기 완료~!!!

		// 전체 요소 출력
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d", arr[i][j]);
			System.out.println();
			
		}
		

	}
}

// 실행 결과
/*
 1  2  3  4  5
 6  7  8  9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
계속하려면 아무 키나 누르십시오 . . .
*/