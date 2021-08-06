/*===========================
  ■■■ 클래스 고급 ■■■
  - 중첩 클래스
===========================*/

// outer
class Test2
{
	static int a = 10;	// 전역변수, Test2의 멤버변수, static변수(class변수, 클래스변수)
	int b = 20;			// 전역변수, Test2의 멤버변수, non-static변수(instance변수, 인스턴스변수)

	void write()		// ▶ 첫 번째 write() 메소드 (@인스턴스 메소드: (동생임..) 형아누나언니! static: 어~)
	{
		System.out.println("write()...①");
		final int c = 30;	// 지역변수, 상수화된 변수(값이 변하지 않는 변수)
		int d = 40;			// 지역변수, 값이 수시로 변할 수 있는 변수
		
		//d++;
		//d++;
		//d=20;
		//d--;
		//@-> d가 10년뒤에도 40이라고 확신할수X. write()가 태어날 시점에 d가 얼마나 늙어있을지 잘 모름...! 
		//@   확정할수 없기 때문에 d의 접근을 아예 막아둔거라고 이해하기.
		
		// 메소드 안에 존재하는 또다른 클래스(로컬 클래스, 지역 클래스, local class)(@보통 로컬 클래스라고 부름)
		// inner
		class LocalTest
		{
			void write()	// ▶ 두 번째 write() 메소드
			{
				System.out.println("write()...②"); 
				System.out.println("a : " + a);
				System.out.println("b : " + b);
				System.out.println("c : " + c);		//@★1 왜 에러가 나는가?
				//System.out.println("d : " + d);	//--==>> 에러 발생(컴파일 에러)
			}
		}//end class LocalTest
		
		//@★1 왜 에러가 나는가?
		// ※ 변수 c 와 변수 d 는 둘 다 지역변수 이지만...
		//    c 는 final 변수이기 때문에...
		//    두 번째 write() 메소드에서 접근하는 시점에 언제이더라도(즉, 언제 접근하더라도)
		//    30의 고정된 값임을 보장받을 수 있다.
		//    반면에, d 는 그 값이 수시로 변동될 수 있는 상황이므로 
		//    LocalTest 클래스의 인스턴스 생성 시점을 
		//    강제로 확정할 수 없기 때문에(즉, 언제다 라고 보장할 수 없기 때문에)
		//    d 에 접근하는 것은 피해야 한다.


				
		//d=  20;	   //-- 20

		LocalTest ob1 = new LocalTest();
		ob1.write();	//-- 두 번째 write() 메소드 호출

		d+= 10;    //-- 30

	}//end write()

}//end Test2

// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test119
{
	public static void main(String[] args)
	{
		Test2 ob2 = new Test2();
		ob2.write(); //@★2 누구의 어디있는 write 메소드냐? >> 두가지만 알면 됨! //-- 첫 번째 write() 메소드 호출
																				 //@@ 첫번째 write 안에서 두번째 write 메소드 실행되는듯
		//--==>> write()...①
		//       write()...②
		//       a : 10
		//       b : 20
		//       c : 30
	}
}