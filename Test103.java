/*========================================
   ■■■ 정렬(Sort) 알고리즘 ■■■
   - 선택 정렬(Selection Sort)
 =========================================*/

/*
○ 정렬
   : 데이터를 특정한 규칙(기준)에 맞게 순서대로 나열(오름차순, 내림차순)

○ 정렬의 목적
   : 데이터 처리 과정의 편의성이나 가독성을 높이기 위함
     → 보기 좋게... 검색하기 위함

○ 정렬의 종류
   : 선택 정렬, 버블 정렬, 삽입 정렬, 힙 정렬, 퀵 정렬, 쉘 정렬....

   //@ 왜 이렇게 종류 다양?
   //@ 1-정렬은 부하가 심함... 많은 리소스가 필요함. 리소스 소모가 심함!
   //@   정렬시키는 기능 실행하면 전자기기가 뜨거워짐
   
   //@ 상황에 따라 나은 정렬은 딱히 없음! like if, switch문...
*/

// 실행 예)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// 계속하려면 아무 키나 누르세요...

public class Test103
{
	public static void main(String[] args)
	{
		int[] a = {52, 42, 12, 62, 60};
		/*										i→0
		42 52 12 62 60          0   1				j→1
		== -- 
		12 52 42 62 60          0   2				j→2
		==    -- 
		12 52 42 62 60          0   3				j→3
		==       -- 
		12 52 42 62 60          0   4				j→4
		==          -- 
		---------------------------------------- 1회전(@ 왼쪽 가장 작은 수는 이미 픽스) (웅~)
		12 42 52 62 60          1   2
		   == -- 
		12 42 52 62 60          1   3
		   ==    -- 
	    12 42 52 62 60          1   4
		   ==       -- 
		---------------------------------------- 2회전
		12 42 52 62 60          2   3
		      == -- 
		12 42 52 62 60          2   4
		      ==    -- 
	    ----------------------------------------- 3회전
		
		12 42 52 60 62          3   4
		         == -- 
		----------------------------------------- 4회전
		*/
		
		// [내가 작성한 코드]

		/*

		System.out.print("Source Data : ");
		for (int i=0; i<a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		int j=0;

		for (int i=0; i<a.length; i++)
		{
			for (j=i+1; j<a.length; j++)
			{
				if (a[i]>a[j]) 
				{
					a[i] = a[j]^a[i];
					a[j] = a[i]^a[j];
					a[i] = a[j]^a[i];
				}
			}
		}

		System.out.print("Sorted Data : ");
		for (int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();

		*/
		
		int i,j;


		System.out.print("Source Data : ");
		/*
		for (i=0; i<a.length; i++)
			System.out.print(a[i] + " " );
		System.out.println();
		*/
		//--==>> Source Data : 52 42 12 62 60


		// 향상된 for 문 (forEach 구문)
		//@ 첫번째부터 마지막까지 순차적으로 끌어낼 때 사용

		for (int n : a) //@ 세미콜론 아니고 콜론 :! //@ (해당 형태 n(아무이름이든 상관x) : 접근해야하는 대상)
			System.out.print(n + " ");
		System.out.println();
		//--==>> Source Data : 52 42 12 62 60

		// Selection Sort
		for (i=0; i<a.length-1; i++)			// 웅~ (비교기준데이터) → 0    1   2   3		//@ 마지막데이터는 기준으로 활용 X			
		{
			for (j=i+1; j<a.length; j++)		// 쑝~ (비교대상데이터) → 1234 234 34  4
			{
				if(a[i] > a[j])		//-- 오름차순
				//if(a[i] < a[j])   //-- 내림차순
				{
					// 자리 바꾸기
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}
			}
		}

		System.out.print("Sorted Data : ");
		/*
		for (i=0; i<a.length; i++)
			System.out.print(a[i] + " " );
		System.out.println();
		*/
		//--==>> Sorted Data : 52 42 12 62 60

		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
		//--==>> Sorted Data : 52 42 12 62 60

	}
}

// 실행 결과
/*
Source Data : 52 42 12 62 60
Sorted Data : 12 42 52 60 62
계속하려면 아무 키나 누르십시오 . . .
*/