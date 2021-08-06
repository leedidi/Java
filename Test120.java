/*===========================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스
===========================*/

// outer
class InnerOuterTest
{
	static int a = 10;
	int b = 20;
	 
	 // inner
	class InnerNested
	{
		int c = 30;

		void write()
		{
			System.out.println("inner 의 write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}// end class InnerNested

	void write()
	{
		System.out.println("outer 의 write()...");
		InnerNested ob1 = new InnerNested();
		ob1.write();
	}
}//end class InnerOuterTest

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test120
{
	public static void main(String[] args)
	{
		// outer 의 인스턴스 생성
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();		//-- outer 의 write() 메소드 호출
		//@ 1. 외부 인스턴스 생성하며 내부 write()도 인스턴스 생성 O
		
		// Test118.java 에서 생성한 방법으로 시도
		//InnerOuterTest.InnerNested ob3 = new InnerOuterTest.InnerNested();
		//--==>> 에러 발생(컴파일 에러)
		
		// 일반적인 인스턴스 생성 방법으로 시도
		//InnerNested ob4 = new InnerNested();
		//--==>> 에러 발생(컴파일 에러)

		// ※ 중첩 내부 클래스(static 중첩 클래스)와는 달리
		//    외부 클래스의 인스턴스(객체)를 사용하지 않고
		//    단독으로 내부 클래스의 인스턴스를 생성하는 것은 불가능하다.
		
		// ※ check~!!!
		// ※ Test118.java 파일과 비교할 것~!!!

		//@ ★ 기억해두기! Test120번에서 이거 하나만 기억해놔도 성공한 것!
		// 『new InnerOuterTest().new InnerNested();』

		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		//--==>> inner 의 write()...
		//		 a : 10
		//       b : 20
		//		 c : 30

		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();
		//--==>> inner 의 write()...
		//		 a : 10
		//		 b : 20
		//		 c : 30
	
		
		//outer클래스명.inner클래스명 참조변수명 = new outer생성자().new inner생성자();
		
		//@ (위아래 비교~!!)
		// cf) static → 중첩 내부 클래스
		// Test.StaticNested ob = new Test.StaticNested();

		// outer클래스명.inner클래스명 참조변수명 = new outer클래스명.inner생성자();
	}
}

//@ 중첩 클래스 어려움! 그리고 중요하지 않음!!!! 다른 것들같은 레벨로 이해할 필요 없음
//@ 툭툭 치면서 이해하기... 인터페이스에 좀더 신경 쓰기! 인터페이스가 중첩클래스보다 500배 중요함!