/*===========================
   ■■■ 배열 ■■■
   - 배열의 배열(2차원 배열)
 ============================*/
 
 // 배열의 배열(다차원 배열)을 활용하여
 // 다음과 같은 데이터를 요소로 취하는 배열(5x5)를 구성하고.
 // 그 결과를 출력하는 프로그램을 구현한다.

 // 실행 예)
 /*
  E J O T Y			00 01 02 03 04
  D I N S X			10 11 12 13 14
  C H M R W			20 21 22 23 24
  B G L Q V			30 31 32 33 34
  A	F K P U			40 41 42 43 44..

계속하려면 아무 키나 누르세요...
*/
 // ~15분까지 풀이
 // 15분부터 소회의실

/*
public class Test085
{
public static void main(String[] args)
	{

	int[][] arr = new int[5][5];
	int n = 65; 

		for (int i=0; i<5; i++)			
		{
			for (int j=0; j<5 ; j++)		
			{
				arr[4-j][i] = (char)n;  // 40 --> 65
				n++;			
			}
		}

	
	for (int i=0; i<arr.length; i++)
	{
		for (int j=0; j<arr[i].length; j++)
			System.out.printf("%3c", arr[i][j]);
		System.out.println();
	}

	}
}
*/

public class Test085
{
public static void main(String[] args)
	{
		// 배열의 배열 선언 및 메모리 할당
		char[][] arr = new char[5][5];

		// 배열의 배열 요소 구성
		char c ='A';
		for (int i=0; i<5; i++)			// 웅~ i → 0 1 2 3 4
		{
			for (int j=4; j>=0; j--)	// 쑝~ j → 4 3 2 1 0
				arr[j][i] = c++;

		}
		// 배열의 배열 전체 요소 출력
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3c",arr[i][j]);
			System.out.println();
		}


	}
}

/*
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
계속하려면 아무 키나 누르십시오 . . .


*/

/*
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
계속하려면 아무 키나 누르십시오 . . .
*/