/*===========================
   ■■■ 클래스 고급 ■■■
   - 추상(Abstract)
 ============================*/

 // [내가 작성한 코드 + 팀원이 작성한 코드]
 // Test111_1로 이름 바꿔야 오류 안 날듯?

/*
○ 추상 클래스(abstract) 는
   선언만 있고 정의가 없는 하나 이상의 메소드(추상 메소드)를 갖는 클래스로
   하위 클래스에서 오버라이딩(Overriding)할 것으로 예상되는 메소드에 대해
   메모리 낭비 없이 미리 호출 계획을 세워두기 위해 만든다.
   /@ ex> 몸통, 다리 구조 빠진 로봇 설계도 ->> 추상 클래스

클래스명 ob = new 클래스명();

○ 형식 및 구조
	[접근제어지시자] abstract class 클래스명
	{
		[접근제어지시자] abstract 자료형 메소드명([매개변수], ...);
	}
	------------------------------------------------------------------- 
    //@@@
   [접근제어지시자] abstract class 클래스명							//@ 추상 클래스(추상적인 설계도)
   {
	   [접근제어지시자] abstract 자료형 메소드명([매개변수], ...);  //@ 추상 메소드. 
																       abstract-> 추상이라는 견출지 딱 붙여준거! 
																				  실수가 아니라 의도로 선언만 해둔 것.
		메소드명2()
		{
		}

		메소드명3()
		{
		}

		메소드명4()
		{
		}	
   }

○ 특징
   클래스가 적어도 하나 이상의 추상 메소드를 포함할 때
   그 클래스는 클래스 앞에 『abstract』 키워드를 붙여
   추상 클래스로 명시해야 하며,
   추상 클래스로 선언된 경우에는
   불완전한 형태의 클래스이므로 객체를 생성할 수 없다.
   추상 메소드가 존재하지 않는 추상 클래스마저도
   객체를 생성할 수 없는 것이다.

   즉, 추상 클래스는 독립적으로 존재할 수 없기 때문에
   상속을 위해서만 존재하며
   추상 클래스에서 상속받은 하위 클래스에서는
   반드시 추상 메소드를 오버라이딩(Overriding)해야 한다.

※ 『abstract』 키워드는
    클래스와 메소드에서만 사용할 수 있으며
	멤버 변수와 로컬 변수에서는 사용 불가능하다.
*/

//@ 클래스는 객체를 만들기 위한 설계도..!
//@ 클래스 자체를 손에 쥐고 있다고 객체를 가지고 있는 거는 아님...! 이를 바탕으로 한땀한땀 조립 후
//@ 인스턴스 생성해 메모리에 올려 객체를 생성
//@ 클래스는 객체를 만들기 위한 설계도로써 존재

//@ 추상 클래스 -> 추상적인 설계도... 미완성된 설계도. 이거 가지고는 뭘 만들기 어려움
//@ ~35분에 소회의실 염....


// 추상 클래스
abstract class SortInt111
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();					 //@메소드 선언구문! line 79 추상메소드와 구분~~~!!!
	}
	
	// 추상 메소드
	protected abstract void sorting(); //@ 메소드 호출구문 아님! 접근제어지시자나 리턴구문이 명시되어 있기 때문...
	/*
	{
		.....;
	}
	*/
	
	protected int dataLength()
	{
		return value.length;
	}
	
	// 『final』 키워드로 인해
	// 이 클래스(SortInt111)를 상속받는 클래스에서
	// 이 메소드를 재정의(Method Overriding)할 수 없다.
	protected final int compare(int i, int j) //@ 메소드
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if (x>y)
			return 1;
		else
			return -1;
	}
	
	// 『final』 키워드로 인해
	// 이 클래스(SortInt111)를 상속받는 클래스에서
	// 이 메소드를 재정의(Method Overriding)할 수 없다.
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}


}

/// Sort111(추상 클래스)를 상속받은 클래스 → 일단은 추상 클래스
public class Test111 extends SortInt111
{ 
	// 상속받은 내용
	/*
	protected void sort(int[] value)
	{
		this.value = value;
		sorting();					 
	}
	
	// 추상 메소드          >>>  완성,,,?
	protected abstract void sorting(); 

	protected int dataLength()
	{
		return value.length;
	}
	
	protected final int compare(int i, int j) 
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if (x>y)
			return 1;
		else
			return -1;
	}
	
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
	
	*/

	
	static int[] data = {7, 10, 3, 8, 7};
	
	//@Override
	protected void sorting() // 정렬....! // *** compare, swap 넣어서 돌림
	{
		//~~~ 정의
		//i부터 value.length까지..?
		for (int i=0; i<dataLength()-1; i++)
		{
			for (int j=i+1; j<dataLength(); j++)
			{
				if(compare(i,j)>=1)
				
				swap(i,j);
			}
		}
	}

	public static void main(String[] args) // *** sort 하나만 출력
	{	
		// SortInt111 ob = new SortInt111(); //@ 추상클래스-불가능!
		// Test111 ob = new Test111();		 //@ 추상클래스-불가능!

		// 인스턴스 생성해서 실행되게 해 보기
		
		
		//if(compare == 1)
		//	ob.swap();
		
		System.out.print("Sorced data : ");
		for (int n : data)
			System.out.print(n + " ");

		System.out.println();

		Test111 ob = new Test111();
		ob.sort(data);

		System.out.print("Sort Data : ");
		for (int n : data)
			System.out.print(n + " ");
		System.out.println();

	}
}

/*
Sorce Data  : 7 10 3 8 7
Sorted Data : 3 7 7 8 10
계속하려면 아무 키나...
*/