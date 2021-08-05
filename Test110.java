/*===========================
   ■■■ 클래스 고급 ■■■
   - 상속(Inheritance)
 ============================*/

 /*
 ○ 메소드 오버라이딩(Method Overriding)의 특징

    - 메소드 이름, 리턴타입, 파라미터 수나 타입이 완전히 일치해야 한다.
	- 반드시 상속 관계가 있어야 한다.

	- 재정의된 하위 클래스의 메소드 접근제어지시자는
	  상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
	  예를 들어, 상위 클래스 메소드의 접근제어지시자가 『protected』인 경우
	  하위 클래스가 이 메소드를 오버라이딩(Overriding)하는 경우
	  접근제어지시자는 『protected』 또는 『public』 이어야 한다.		
	//@ 같이 쓰자 넓힐순O, 나만쓸거야 좁힐순 X~!! 

	- 『static』, 『final』, 『private』 메소드는 오버라이딩(Overriding) 할 수 없다.
	//@ static..클래스 메소드.. 한참먼저 완성되어서 이미 메모리 잡아버렸음 다시 재정의X
	//@ final 변수에 붙여서 상수화... 메소드에도 붙일수O.. 최종본이니까 다른 형태로 수정하지 마. 다시 튜닝할수 없게 한다고 이해
	//@ private.. 어제 배운거. 아예 상속 대상에서 제외된다고 이해하기~!!! 아예 접근할수 없는데 튜닝할수 없음!

	- Exception 의 추가가 불가능하다.
	  즉, 상위 클래스의 메소드가 가지고 있는 기존 예외 사항에
	  새로운 Exception 을 추가하는 것은 불가능하다는 것이다.

 */

// 부모 클래스(상위 클래스, super class)
 class SuperTest110
 {
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super... write() : " + a + " : " + b + " : " + c);
	}
 }

// 자식 클래스(하위 클래스, sub class)
 class SubTest110 extends SuperTest110
 {
	/*
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super... write() : " + a + " : " + b + " : " + c);
	}
	*/

	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub... print() : " + a + " : " + b + " : " + c);
		//--==>> 에러 발생(컴파일 에러)
		//-- 슈퍼 클래스에서 선언된 변수 a 에는 접근할 수 없다.
		//   → private 변수이기 때문에...

		System.out.println("Sub... print() : " + b + " : " + c);

		//System.out.println("Sub... print() : " + b);
		//System.out.println("Sub... print() : " + this.b);
		//System.out.println("Sub... print() : " + super.b);
		//-- 변수 b는 접근 방법에 따라 다른 b로 접근 및 출력이 이루어진다.
		//   슈퍼 클래스에서 선언된 b, 서브 클래스에서 선언된 b

		//System.out.println("Sub... print() : " + c);			//@ 차
		//System.out.println("Sub... print() : " + this.c);		//@ 내 차
		//System.out.println("Sub... print() : " + super.c);	//@ 부모로부터 물려받은 차 = 내 차
		//-- 변수 c는 접근하는데 아무런 제약과 제한이 없다.
		//   슈퍼 클래스에서 선언된 c
	}

//@ 노란색 스포츠카로 튜닝~!!!
		@Override
		public void write()
		{
			//System.out.println("Sub... write() : " + a + " : " + b + " : " + c); 
			//--==>> 에러 발생(컴파일 에러)
			//-- 슈퍼 클래스에서 선언된 변수 a 에는 접근할 수 없다.
			//    → private 변수이기 때문에...
			System.out.println("Sub... write() : " + b + " : " + c);
		}


 }

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test110
{
	public static void main(String[] args)
	{
		// 하위 클래스(SubTest110) 인스턴스 생성
		SubTest110 ob = new SubTest110();

		ob.print();
		//--==>> Sub... print() : 100 : 20

		ob.write();
		//--==>> Super... write() : 5 : 10 : 20 ★

		System.out.println("---------------------------------------- 구분선");
		
		System.out.println(ob.b);
		//--==>> 100
		
		//@ super // - > 이거 포함된 클래스를 찾고 -> 얘 부모 클래스를 찾음
		System.out.println(((SuperTest110)ob).b);
		//@ == (char)a, 형변환
		//--==>> 10
		// ※ 슈퍼 부름~!!!


		((SuperTest110)ob).write();
		//--==>> Sub... write() : 100 : 20
		//부모가 가진 메소드 호출하는 게 아님

		// ※ 메소드와 변수를 꼭~!!! 구분하여 정리할 것~!!!
		//@ 변수는 가능, 메소드는 불가능

		

	}
}