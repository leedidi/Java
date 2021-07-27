/*====================================
  ■■■ 지역변수와 전역변수 ■■■
  - 전역변수의 초기화 테스트 실습
 =====================================*/

// Test063.java 와 비교~!!!

public class Test064
{	
	// 전역 변수 a 선언
	int a;
	//-- 자동 0으로 초기화 지원

	// 전역 변수 b 선언
	boolean b;

	// 전역 변수 c 선언
	char c;

	// 전역 변수 d 선언
	double d;


	public static void main(String[] args)
	{
		// Test064 인스턴스 생성
		Test064 ob = new Test064();

		System.out.println("ob.a : " + ob.a);
		//--==>> ob.a : 0

		System.out.println("ob.b : " + ob.b);
		//--==>> ob.b : false

		System.out.println("ob.c : " + ob.c);
		//--==>> ob.c :

		System.out.println("ob.d : " + ob.d);
		//--==>> ob.d : 0.0

	}
}