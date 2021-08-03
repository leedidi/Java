/*========================================
   ■■■ 주민등록번호 유효성 검사 ■■■
 =========================================*/

/*
○ 주민등록번호 검증 공식
	
	① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

	 123456-1234567 (주민번호)
	 ****** ****** ------------------------  각 자릿수 곱하기
	 234567	892345  (각 자리에 곱해질 수)

	 ② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.

	 ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
	     * * * * * *   * * * * * * 
		 2 3 4 5 6 7   8 9 2 3 4 5
       -------------------------------------
	   → 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15

	    == 217

	 ③ 더해진 결과값을 11로 나누어 『나머지』를 취한다.

	        19
		 ------
      11 | 217
	       11
          -----
		   107
		    99
          -----
		     8 → 나머지

	 ④ 11에서 나머지(→ 8)를 뺀 결과값을 구한다.
	    
		11 - 8 = 3

		※ ③의 처리 과정에서 나머지가 0 인 경우 → 11 → 1
									   1 인 경우 → 10 → 0

		   이를 다시 10으로 나누어 나머지를 취한다.

    ⑤-> ④의 연산 결과가 주민번호를 구성하는 마지막 숫자와
	     일치하는지의 여부를 확인한다.

		 일치     → 유효한 주민번호
		 불일치   → 잘못된 주민번호
*/

// 실행 예)
// 주민번호 입력(xxxxxx-xxxxxxx) : 123456-12345678 → 입력 갯수 초과
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호 입력(xxxxxx-xxxxxxx) : 123456-123456 → 입력 갯수 미달
// >> 입력 오류~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호 입력(xxxxxx-xxxxxxx) : 750615-1252085 → 유효한 주민번호
// >> 정확한 주민번호~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호 입력(xxxxxx-xxxxxxx) : 750615-1252086 → 유효하지 않은 주민번호
// >> 잘못된 주민번호~!!!
// 계속하려면 아무 키나 누르세요...

// ※ 추가 팁~!!!
//    배열.length			→ 배열의 길이(배열방의 갯수) 반환
//    문자열.length()		→ 문자열의 길이 반환
//	  String str = "abcdefg";
//    str.length()			→ 7
//    "abcdefg".length();	→ 7
//
//    문자열.substring()	→ 문자열 추출

		/*
		String strTemp = "윤유동";
		System.out.println(strTemp.length());
		//--==>> 3

		strTemp = "동해물과 백두산이";
		System.out.println(strTemp.length());
		//--==>> 9

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		//-==>> 10 //@ 특수문자 하나도 길이도 인식 ○

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(3,5)); //@strTemp에서 내가 원하는 indx를 출력함. index는 0부터 시작, (3부터~5에서 하나 짧은거까지)
		//--==>> DE
		// ABC DE FGHIJKLMNOPQRSTUVWXYZ
		// 012 34 56789...

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13,17));
		// ABCDEFGHIJKLM NOPQ RSTUVWXYZ
		//--==>> NOPQ

		//strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13, 85));
		//--==>> 에러 발생(컴파일 에러)
		//       StringIndexOutOfBoundsException (@ 문자열 인덱스 벗어나도 에러 ○)

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(5)); //@ 문자열 5부터 전체 끝까지!
		//--==>> FGHIJKLMNOPQRSTUVWXYZ

		System.out.println(strTemp.substring(5, strTemp.length()));
		//                                      -----------------
		//                                       strTemp 의 전체 길이
		//--==>> FGHIJKLMNOPQRSTUVWXYZ
		*/
		


// [내가 작성한 코드]
/*
import java.util.Scanner;

public class Test102
{
	public static void main(String[] args)
	{
*/
		// 테스트
		

		// 입력 자릿수가 정확하지 않을 경우 >> 입력 오류~!! 출력
		
		/*
		Scanner sc = new Scanner(System.in);

		String num=" ";
		
		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		num = sc.next();
		System.out.println("num.length(): " + num.length());
		
		if(num.length()!=14);
		{
			System.out.println(">> 입력 오류~!!!");
			return;
		}
		*/
		
		/*
		if else()
		{
			System.out.println(">> 정확한 주민번호~!!!");
		}
		else
			{
				System.out.println(">> 잘못된 주민번호~!!!");
			}
		}
		*/
		
		// 주민번호 입력(xxxxxx-xxxxxxx) : 750615-1252085 → 유효한 주민번호
		// >> 정확한 주민번호~!!!
		// 계속하려면 아무 키나 누르세요...

		// 주민번호 입력(xxxxxx-xxxxxxx) : 750615-1252086 → 유효하지 않은 주민번호
		// >> 잘못된 주민번호~!!!
		// 계속하려면 아무 키나 누르세요...
		
		// 주민번호가 올바른지 계산 및 출력

		// 문자열.substring()	→ 문자열 추출
	    
		// 테스트
		//System.out.print(num.substring(0,0));

/*
	}
}
*/

// 추가

// 같이 작성한 코드

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test102
{
	public static void main(String[] args) throws IOException
	{	
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받는 주민번호(문자열 형태)
		String str;

		// 주민번호의 각 자릿수에 곱하게 될 수 → 배열 형태로 구성
		//           7  5  0  6  1  5  -  1  8  6  2  1  3  3
		//           *  *  *  *  *  *  *  *  *  *  *  *  *
 		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		//                             --
		//                           check~!!

		// 곱셈 연산 후 누적합(즉, 각 곱셈의 결과를 더해 나갈 수 있도록 처리...)
		int tot = 0;

		System.out.print("주민번호 입력(xxxxxx-xxxxxxx) : ");
		//str = Integer.parseInt(br.readLine());
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.println(">> 입력 오류~!!!");
			return;		//-- 메소드 종료 → main() 메소드 종료 → 프로그램 종료 //* break가 아니라 return 쓰기!
		}

		// 테스트
		//System.out.println(">> 자릿수 적합~!!!");
		
		// ex) "750615-1232085"
		/*
		str.substring(0, 1);
		"7"
		Integer.parseInt("7");

		tot += chk[0] * 7;
		-
		str.substring(1, 2);
		"5"
		Integer.parseInt("5");

		tot += chk[1] * 5;
		-
		str.substring(2, 3);
		"0"
		Integer.parseInt("7");

		tot += chk[0] * 7;
		*/
		
		for (int i=0; i<13; i++)
		{
			//System.out.print(i + " " ); // 0~12
			
			if (i==6)
			{
				continue; // (뒷부분 무시하고... + ) 계속해라(//@ i가 6인거 무시하고 7부터 실행해라)
			}
			
			tot += chk[i] * Integer.parseInt(str.substring(i, (i+1)));					 //-- 뒷부분
			//         0 → 2                              0   1 → "7" => tot += 2 * 7
			//         1 → 3							   1   2 → "5" => tot += 3 * 5  
			//                               ：
			//        12 → 5							  12  13 → "8" => tot += 5 * 8
		}

		//------------------------------------- 여기까지 수행하면 ① 과 ② 를 모두 끝낸 상황이며
		//                                      규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한 값은
		//                                      변수 tot 에 담겨 있는 상황이 된다.

		int su = 11 - tot % 11;

		// 테스트
		//System.out.println(su);
		// 10
		// 11
		
		// 최종 결과 출력 이전에... 추가 연산 필요~!!!
		// su 에 대한 연산 결과가 두 자리로 나올 경우(10 또는 11)
		// 주민번호 마지막 자리의 숫자와 비교할 수 없는 상황
		su = su % 10; // su %= 10;
		
		//------------------------------- 여기까지 수행하면 ③ 과 ④ 를 모두 끝낸 상황이며
		//								  최종 연산 결과는 변수 su 에 담겨있는 상황이 된다.

		//if (su==주민등록번호마지막한자리숫자)
		if (su==Integer.parseInt(str.substring(13)))
			System.out.println(">> 정확한 주민번호~!!!");
		else
			System.out.println(">> 잘못된 주민번호~!!!");
	}
}

// 입력 결과
/*
주민번호 입력(xxxxxx-xxxxxxx) : 750615-1252085
>> 정확한 주민번호~!!!
계속하려면 아무 키나 누르십시오 . . .
*/

/*
주민번호 입력(xxxxxx-xxxxxxx) : 750615-1234567
>> 잘못된 주민번호~!!!
계속하려면 아무 키나 누르십시오 . . .
*/

/*
주민번호 입력(xxxxxx-xxxxxxx) : 1922222-2222222
>> 입력 오류~!!!
계속하려면 아무 키나 누르십시오 . . .
*/