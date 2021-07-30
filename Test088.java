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
  B	C			
  D E F			
  G H I K      
  K L M N O
계속하려면 아무 키나 누르세요...
*/

//@ 기본 배열 구성
/*
public class Test088
{	
	public static void main(String[] args)
	{	
		// 배열의 배열 선언 및 메모리 할당
		char[][] arr = new char[5][5];

		// 배열의 배열 요소 규정
		char c= 'A';

		for (int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{
				arr[i][j] = c;
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
*/

public class Test088
{	
	public static void main(String[] args)
	{	
		// 배열의 배열 선언 및 메모리 할당
		char[][] arr = new char[5][5];

		// 배열의 배열 요소 규정
		char c= 'A';

		 /*
		  A				00
		  B	C			10 11
		  D E F			21 22 23
		  G H I K      
		  K L M N O
		계속하려면 아무 키나 누르세요...
		*/

		for (int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{	
				if(i>=j)
				{
				arr[i][j] = c;
				c++;
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
  B  C
  D  E  F
  G  H  I  J
  K  L  M  N  O
계속하려면 아무 키나 누르십시오 . . .
*/