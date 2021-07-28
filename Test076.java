/*=======================
   ■■■ 배열 ■■■
   - 배열의 선언과 초기화
   - 배열의 기본적 활용
 ========================*/

 // 『char』 자료형의 배열을 만들어
 // 그 배열의 각 방에 알파벳 대문자를 채우고
 // 채워진 그 배열의 전체 요소를 출력하는 프로그램을 구현한다.
 // 단, 채우는 구문과 출력하는 구문을 따로 분리하여 처리한다.

 // 실행 예)
 // A B C D E F G ... W X Y Z
 // 계속하려면 아무 키나 누르세요 ...

public class Test076
{
	public static void main(String[] args)
	{	
		
		// [내가 작성한 코드]
		/*
		char[] arr = new char[26];

		for(int i=65; i<=90; i++)
		{
			arr[i-65] = (char)i;
		}

		for(int i=65; i<=90; i++)
		{
			System.out.print(arr[i-65] + " ");
		}
		System.out.println();
		*/
		
		
		// [함께 작성한 코드]

		// 영문 알파벳 대문자 배열 구성

		// 방법 ①
		/*
		char[] arr1;
		arr1 = new char[26];

		arr1[0] = 'A';
		arr1[1] = 'B';
		arr1[2] = 'C';
		   ：
		arr1[24] = 'X';
		arr1[24] = 'Y';
	    arr1[25] = 'Z';

		// 방법 ②
		char[] arr2 = {'A', 'B', 'C', ... 'X', 'Y', 'Z'}
		*/

		// 방법 ③
		char[] arr3 = new char[26];					
		for (int i=0, ch=65; i<arr3.length; i++, ch++) //@ 맨앞맨뒤 몇개 넣어도 상관 x, 중간조건식도! 중간조건식은 논리연산자 사용하고 최종적 true false 들어가야함!
													   //@ 근데 너무많이넣으면 가독성 면에서는 좋지 않음!
			arr3[i] = (char)ch; // (char)65;  (char)66;  (char)67; ... (char)90;
		
		// 배열 요소 전체 출력 (@ 얘는 늘 같음!)
		for (int i=0; i<arr3.length; i++)
			System.out.print(arr3[i] + " ");
		System.out.println();
	}
}

// 실행 결과
/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
계속하려면 아무 키나 누르십시오 . . .
*/

/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
계속하려면 아무 키나 누르십시오 . . .
*/