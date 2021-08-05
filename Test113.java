/*=========================================
   ■■■ 클래스 고급 ■■■
   - 인터페이스(Interface)
 =========================================*/

/*
○ 인터페이스(Interface)란
   완전히 미완성된 채로 남겨져
   인터페이스 안에 존재하는 그 어떤 메소드도
   몸체(정의부)가 없기 때문에 사실상 실행 부분이 존재하지 않는다.
   클래스를 위한 템플릿으로써의 기능을 수행하는			//@ 템플릿 : 틀만 만듬! 내용 뚫려 있음
   추상 클래스의 한 종류이다.

○ 인터페이스는 클래스와 달리 다중 상속이 가능하며
   인터페이스 자체도 상속된다.
   기존의 C++ 언어 등에서 지원되는 다중 상속이
   사용 과정에서 많은 문제점을 노출시켰기 때문에
   자바에서는 다중 상속의 개념을 인터페이스라는 개념으로 변형하여
   인터페이스를 통해 다중 상속을 구현하는 방법을 지원한다.

○ 인터페이스는 상수와 추상 메소드만 가질 수 있으며
   인터페이스 안의 메소드들은 접근제어지시자를 명시하지 않아도
   『public』으로 설정되어 클래스에서 구현(implements)함으로써
   바로 접근이 이루어질 수 있다.
   //@ 인터페이스는 다양하게 사용되는게 최고기 때문에! 접근 제한 X, public
	//@ like 만능 케이스

○ 특징
   - 추상 클래스의 일종으로 선언만 있고 정의가 없다.
   - final 변수는 가질 수 있다. (상수의 개념)
   - 인터페이스는 『public static final』 상수만 만들 수 있다.
   - 인터페이스를 구현하기 위해서는 『extends』 대신에
     『implements』를 이용한다.
   - 하나 이상의 인터페이스를 implements 할 수 있다. (//@ == 다중상속 가능하다.)
   - 인터페이스를 implements 한 클래스는
     인터페이스의 모든 메소드를 Overriding 해야 한다.
	 //@ ->>> 모든 메소드 오버로딩 작성하면 abstract 꼬리표 떼고, 추상클래스 아니게 되고, 
	 //@      그래야 외부에서 이 클래스 기반으로 인스턴스 생성 가능!
   - 인터페이스가 다른 인터페이스를 상속받을 수 있으며
     이 때, 『extends』 키워드를 사용한다.
	 또한, 클래스와 달리 인터페이스는 다중 상속이 가능하다.

*/

// 인터페이스 
interface Demo
{
	public static final double PI = 3.141592;
	
	// 인터페이스의 멤버 변수는
	// 『static final』을 별도로 명시하지 않아도
	// 자동으로 『static final』인 상태~!!! (@@@ 주의! 이거 사용할때 일반 int a라고 생각하면 안됨. 
	//											 interface 내부에서도 그냥 이렇게 쓰기 가능)
	public int a = 10;
	
	// 인터페이스의 메소드는 선언만 가능(정의 불가)
	// 자동으로 『abstract』인 상태 (@따로 명시하지 않아도 abstract!)
	//public abstract void print();
	public void print();
	/*
	{
		System.out.println("PI : " + PI);
	}
	*/
	//@ 선언만 가능, 정의는 불가능
}

//class DemoImpl
//class DemoImpl extends Demo (Ⅹ)
//abstract class DemoImpl extends Demo (Ⅹ)
//class DemoImpl implements Demo (Ⅹ)
abstract class DemoImpl implements Demo
{
}

public class Test113
{
	public static void main(String[] args)
	{
	}
}