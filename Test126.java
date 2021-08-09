/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Wrapper 클래스
===========================================*/

/*
//@ wrap : 중국집에서 위에 씌워오는 랩. 원래 있는 요소를 한번 class 형태로 덧씌운다는 의미.

○ Wrapper 클래스

   1. 자바에서는 언어 수준에서 제공하는 기본형 데이터를 제외한
      나머지는 클래스로 정의하여 객체 단위로 처리한다.
	  따라서 자바에서는 이러한 기본형 데이터를
	  객체 단위로 처리할 수 있도록 클래스를 제공할 수 밖에 없는데
	  이러한 클래스들을 가리켜 Wrapper 클래스라 한다.

	  "10" → String → 객체 → Object
	  							   ↓
								  객체 → Integer → 메소드 parseInt() → 10
								          ------- (@대표적. wrapper클래스 생각했을 때 이거 떠올려도 됨)
	  Integer.parseInt(br.readLine());
	  Integer.parseInt("10");

	2. 기본 자료형인
	   byte, short, int,     long, float, double, char,      boolean 형에 대응하는 (@ primitive 기본 자료형)
	   Byte, Short, Integer, Long, Float, Double, Character, Boolean 의			   (@ 대응하는 클래스)
	   Wrapper 클래스 및 큰 숫자들을 다루기 위한
	   java.math.BigInteger 와 java.math.BigDecimal 클래스를 제공한다.

	   Wrapper 클래스는 java.lang 패키지에 포함되어 있으므로
	   별도의 import 과정 없이 바로 사용하는 것이 가능하며
	   기본형과 마찬가지로 Wrapper 클래스도 내부 메소드를 통해
	   형 변환이 가능하고 동등 비교와 같은 연산도 가능하다.

	   ex) java.lang.Integer 클래스
	       int 기본 자료형의 Wrapper 클래스로
		   정수를 다루는데 필요한 상수나 메소드, 진수 변환 등에 필요한
		   메소드 등을 포함하고 있다.

		   static int parseInt(String s)
		   문자열 형식으로 저장된 숫자를 정수 형태로 변환한다.
		   
		   static Integer valueOf(int i)
		   int 형을 Integer 형으로 변환한다.

		   byte byteValue(), int intValue(),
		   sohrt shortValue(), long longValue(),
		   float floatValue(), double DoubleValue()
		   해당 기본 자료형으로 형 변환한 값을 반환한다.

*/

/* /@@@ 중요!★★★ 꼼꼼히 보기

○ 오토 박싱(Auto-Boxing)과 오토 언박싱(Auto-Unboxing)
   //@ 오토 박싱   : 이삿짐센터처럼 자동으로 박스에 넣어줌(정형화된 클래스 안에 넣어 자동으로 객체화시킴)
   //@ 오토 언박싱 : 자동으로 박스를 풀어해쳐서 primitive 형식으로 만들어줌
   //@ 클래스는 경직, primitive는 자유로움.. 자유로운 애들을 경직 >> 박스 형식에 넣음

	//BufferedReader br = "abcd"; (X)
	//BufferedReader br = new BufferedReader(); (O)

   일반적으로 레퍼런스 형과 기본 자료형은 호환되지 않으며
   //@ 둘이 올라가는 메모리 다름
   이 경우 발생하는 문제 해결을 위해 자바에서는 Wrapper 클래스를 제공하게 되었다.
   하지만, JDK 1.5 부터 레퍼런스 형과 기본 자료형이
   다음과 같이 형 변환이 가능하게 되었다.

   int a = 10, b;
   Integer ob;		// (like Rect rec = 10;) (@ 주소값 참조)
   ob = a; (@ 객체형 = primitive...원래는 말도 안됨)
   		   (  자유로운 primitiv a를 경직된 객체형 ob에 넣어 줌)
   //-- 기본 자료형(int)이 Integer 형으로 자동 변환(오토 박싱)
   //   실제로는 ... 『ob = new Integer(a);』
	
   b = ob;
   //-- Integer(객체)기 가 기본 자료형인 int 형으로 자동 변환(오토 언박싱)
   //   실제로는 ... 『b = ob.intValue();』

   // 이는 JDK 1.5 이후 추가된 오토 박싱/ 오토 언박싱 이라는
   // 기능으로 인해 가능해진 것이다.

*/

public class Test126
{
	public static void main(String[] args)
	{
		int a = 10, b;
		Integer c;
		Object d;

		b = a;				//-- int 형 데이터(자료) → int 형 변수
		c = new Integer(0);

		// ※ 레퍼런스 형(참조 타입)과 기본 자료형(기본 타입)은 호환되지 않는다. (@이게 디폴트)

		b = c;				//-- Integer 형 데이터(객체) c → int 형 변수(@에 담겠다.)(오토 언박싱)
		b = c.intValue();	//-- 언박싱


		d = new Object();
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : java.lang.Object@15db9742
		
		System.out.println("d            : " + d);
		//--==>> d            : java.lang.Object@15db9742

		d = new Integer(10);	// object d = new Integer(10); //-- 업 캐스팅
		System.out.println("d.toString() : " + d.toString());
		//--==>> d.toString() : 10

		System.out.println("d            : " + d);
		//--==>> d            : 10
		//@@ 이미 덮어쓰기 되어서 오버라이딩 되었기 때문에 d가 10.....!
		//@@ 탭 쓰면 컴파일시 띄어쓰기 다르게 나옴

		d = new Double(12.345); //-- 업 캐스팅
		System.out.println("d.toString() : " + d.toString());
		System.out.println("d            : " + d);
		//--==>> d.toString() : 12.345
		//		 d            : 12.345


		d = 10;					//-- 오토 박싱
		System.out.println("d.toString() : " + d.toString());
		System.out.println("d            : " + d);
		//--==>> d.toString() : 10
		//		 d            : 10
	}
}