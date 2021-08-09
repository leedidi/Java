/*===========================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스
===========================*/

/*
○ Annonymous 클래스(익명의 클래스 : 무명 클래스)

   - awt 나 안드로이드 이벤트 처리에서 일반적으로 사용
   //@ awt: 요즘 실무에선 거의 사용X, 이벤트: 마우스 클릭, 드래그앤드랍..등 손가락으로 하는 모든 것들. 
   //  이벤트는 모두다 자바에서 객체! 이벤트 매우 많이 일어남..1회용 종이컵 쓰고버리는데 이름 붙이지 않는 것처럼,
   //  잠깐 사용하고 마는 것에 이름 붙이지 않는 것
   //@ 얘도 중첩 클래스라... 쓸 일은 많지 않을 것... 이렇게 쓰고 버릴수 있구나< 요 개념 정도만 알기
   - 상위 클래스 메소드를 하나 정도 재정의할 필요성이 있을 때 사용
   - 클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는
     번거로움 때문에 익명의 클래스를 생성하여 처리한다.

○ 형식 및 구조
    new 상위클래스의 생성자()
	{
		접근제어지시자 자료형 메소드()
		{
			...;
		}
	};		// ← 세미콜론 check~!!!

*/

// import java.lang.*;

class Test3 // extends Object //@ ★자바에서 벌어나는 일들중 중요한 일임!
//@ 따로 명시 없이도 모든 클래스는 Object라는 클래스 상속 됨
//@ (like package default; , import java.lang.*;, 생성자명(){super();})
//@ 다중 상속이 아님! 상속시 부모 클래스에 extends Object
//@ Object는 모든 클래스의 조상 클래스. 자바에서 다뤄지는 모든 것은 객체다.
//@ 그냥 class Test3? -> Object의 직접 자식임. (뒤에 뭔가 상속이 되었다면 Object의 손자, 증손자 등..)
{
	/*
	Object 클래스의 멤버들...
	...

	public String toString()
	{
		...;
	}
	*/

	public Object getString()
	{	
		/*
		Object result;
		result = new Object();
		return result;
		*/

		/*
		return new Object();
			   ------------ Object 형
		*/
		//(@ 둘이 같은 내용. 위는 result라고 이름만 붙여 준 것)

		return new Object()
		{	
			@Override
			public String toString()
			{
				return "익명의 클래스...";
			}
		};		//-- 세미콜론 check~!!!

	}//end getString()

}//end class Test3



public class Test121 // extends Object
{
	/*
	Object 가 갖고있는 멤버들...
	*/
	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();
		Test3 ob2 = new Test3();

		System.out.println(ob1.toString());
		//--==>> Test3@15db9742

		Test121 ob3 = new Test121();
		System.out.println(ob3.toString());
		//--==>> Test121@6d06d69c

		System.out.println(ob2.getString());
		//--==>> 익명의 클래스...

	}
}

//@ 중첩클래스 많이 써야하거나.. 직접 설계해야하거나.. 이런 경우 거의 없을 것
//@ 누군가가 이걸 설계 해 뒀을때 아이게 중첩 클래스로 설계한 거구나~! 볼 수 있을 정도면 됨 이마저도 많지않을것..
//@ 이걸 이렇게 컨트롤하면 되겠구나.. 하면 됨. 이마저도 많지 않겠지만....!