/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스
===========================================*/

public class Test130
{
	public static void main(String[] args)
	{
		byte b = 3;
		int i = 256;

		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);

		System.out.println(b2);
		System.out.println(i2);
		//--==>> 3
		//		 256

		print(b2);
		print(i2);
		
		// Byte 클래스의 byteValue() 메소드 호출
		byte b3 = b2.byteValue();
		
		// Integer 클래스의 intValue() 메소드 호출
		int i3 = i2.intValue();

		System.out.println(b3);
		System.out.println(i3);
		//--==>> 3
		//		 256

		// check~!!!
		int i4 = b2.byteValue(); //@ b2 byte, b2.bytevalue~: 기본 byte타입 b2 -> 3
		//byte b4 = i2.intValue(); //@ i2 integer, 즉 객체. i2.intValue: int 타입으로 반환 //--==>> 에러 발생
		//@ 변환 막하면안됨.... int를 byte에 담을수 없음
		byte b4 = i2.byteValue();  //--==>> 반드시 확인

		// check~!!!
		System.out.println(i4);
		System.out.println(b4);

	}
	/*
	static void print(Byte b)
	{
		//매개변수로 뭘 넘겨받아서 구성해야 하는지 api도큐먼트 참조하기...
		....;
	}

	static void print(Integer i)
	{
		...;
	}

	static void print(int i)
	{
		...;
	}

	static void print(Object o)
	{
		...;
	}
	*/

	// java.lang.Number 클래스(추상 클래스)는      Number ob = new Number(); (x)
	// 모든 Wrapper 클래스의 부모 클래스
	// (슈퍼 클래스, 상위 클래스)이다.
	// b2, i2 자료형이 Number n 에 넘어오면서
	// Auto-Boxing 이 일어나게 된다.
	public static void print(Number n)
	{
		System.out.println(n);
		System.out.println(n.intValue());
	}


}