/*==============================
   ■■■ 클래스 고급 ■■■
   - 인터페이스(Interface)
 ==============================*/

// 인터페이스
interface ADemo
{
	public void write();
}

// 인터페이스
interface BDemo
{
	public void print();
}

// ※ 인터페이스는 2개 이상을 구현(implements)할 수 있다.
//   → 다중 상속이 되지 않는 부분을 보완(보충)하는 개념

// 클래스
//class DemoImpl
//class DemoImpl extends ADemo, BDemo
//class DemoImpl implements ADemo, BDemo
//  ↓
// 추상 클래스
//abstract class DemoImpl implements ADemo, BDemo
//  ↓
// 클래스 - 두 인터페이스를 구현한 클래스
class DemoImpl implements ADemo, BDemo
{
	/*
	public abstract void write();

	public abstract void print();
	*/

	// ※ JDK 1.5(5.0)에서는 인터페이스 메소드를
	//    오버라이딩(Overriding) 할 때
	//    『@Override』 어노테이션(annotation)을 사용할 수 없다.
	//    JDK 1.6(6.0) 이후부터 적용 가능한 문법이다.
	//    단, 상속받은 클래스의 메소드를
	//    오버라이딩(Overriding)할 때에는
	//    JDK 1.5(5.0)에서도 『@Override』 어노테이션(annotation)
	//    사용이 가능하다.

	@Override
	public void write()
	{
		System.out.println("ADemo 인터페이스 메소드 write()...");
	}

	@Override
	public void print()
	{
		System.out.println("BDemo 인터페이스 메소드 print()...");
	}
}

//main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test114
{
	public static void main(String[] args)
	{
		//ADemo ob = new ADemo();	//-- 인터페이스 → 인스턴스 생성 불가
		//BDemo ob = new BDemo();	//-- 인터페이스 → 인스턴스 생성 불가
		
		// ADemo, BDemo 인터페이스를 구현(implements)한 클래스 (→DemoImpl)
		// 기반의 인스턴스 생성
		DemoImpl ob1 = new DemoImpl();

		ob1.write();
		ob1.print();
		//--==>> ADemo 인터페이스 메소드 write()...
		//       BDemo 인터페이스 메소드 print()...

		ADemo ob2 = new DemoImpl();		//-- 업 캐스팅
		BDemo ob3 = new DemoImpl();		//-- 업 캐스팅

		//ob2.print();					//@ 실제생성은 자식객체지만, Ademo 타입에서는 print 정의가 없다.
										//--==>> 에러 발생. //@ 부모는 자식에게 이런정의 있는줄도 모름
		//ob3.write();					//--==>> 에러 발생

		ob3.print();
		ob2.write();
		//--==>> BDemo 인터페이스 메소드 print()...
		//       ADemo 인터페이스 메소드 write()...
		
		((BDemo)ob2).print();
		((ADemo)ob3).write();
		//--==>> BDemo 인터페이스 메소드 print()...
		//       ADemo 인터페이스 메소드 write()...
		//-- DemoImpl 클래스가 두 인터페이스를 모두 구현했기 때문에 가능하다.
		//   만약 Demoimpl 클래스가 이들 중 한 인터페이스만 구현한 상황이라면
		//   이 구문은 런타임 에러 발생하는 구문이 된다.
		
		// 다운 캐스팅
		((DemoImpl)ob3).write();
		//--==>> ADemo 인터페이스 메소드 write()...


	}
}
