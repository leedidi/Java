/*===========================
   ■■■ 배열 ■■■
   - 배열의 배열(2차원 배열)
 ============================*/

 // ○ 과제
 // 배열의 배열(다차원 배열)을 활용하여
 // 다음과 같은 데이터를 요소로 취하는 배열(5x5)를 구성하고.
 // 그 결과를 출력하는 프로그램을 구현한다.

  // 실행 예)
 /*
  A			
  C	B
  D E F
  J I H G
  K L M N O
계속하려면 아무 키나 누르세요...
*/

public class Test089
{
	public static void main(String[] args)
	{
		// 배열의 배열 선언 및 메모리 할당
		char[][] arr = new char[5][5];

		// 배열의 배열 요소 규정
		char c = 'A';
		

		 /*
		  A				00
		  C	B			10 11
		  D E F			20 21 22
		  J I H G		30 31 32 33
		  K L M N O     40 41 42 43 44
		계속하려면 아무 키나 누르세요...
		*/

		for (int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{	
				if(i>=j)
				{
					if(i%2 == 0)	// i가 짝수인 경우
					{ 
						arr[i][j] = c;
						c++;
					}	
					else			// i가 홀수인 경우 
					{	
												// arr[1][0],      [1][1]       [3][0]       [3][1]     ..// 원래대로라면... j
						arr[i][i-j] = c;		//	  [1][1] -> B, [1][0] -> C, [3][3] -> G, [3][2]-> H.. // 이 조건으로...  i-j
												//    j => i-j
						c++;					//* 두줄 이상이면 괄호 빼먹지 않게 주의!
					}
				}
			}
		}

		// 배열의 배열 전체 요소 출력

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3c", arr[i][j]);
			System.out.println();

		}

	}
}

// 실행 결과
/*
  A
  C  B
  D  E  F
  J  I  H  G
  K  L  M  N  O
계속하려면 아무 키나 누르십시오 . . .
*/