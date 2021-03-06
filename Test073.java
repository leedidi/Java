/*==========================================================
   ■■■ 클래스와 인스턴스 ■■■
   - 생성자(Constructor)와 초기화 블럭(Initialized Block)
 ===========================================================*/

public class Test073
{
	//int n=100;	//@ 얘네는 가능
	//int m=200;
	
	/*			
	int n;			//@ 얘네 불가능함. 변수선언 후 연산이기 때문.. 클래스에서는 연산이 불가능! << 기억해두기★
	int m;

	n=100;		
	m=200;
	*/

	int n;
	int m;
	
	// 생성자(Constructor)
	Test073()
	{
		n=1000;
		m=2000;
		System.out.println("생성자 실행...");
	}

	// 초기화 블럭(Initialized Block) //@ 블레이스, 블럭 안에 두면? 클래스에서도 연산 가능!
	{				
		n=100;		
		m=200;
		System.out.println("초기화 블럭 실행...");
	}

	// 생성자(Constructor)
	Test073(int n, int m)
	{
		this.n=n;
		this.m=m;
		System.out.println("매개변수 있는 생성자 실행...");
	}
	

	// 출력 메소드 정의
	void write()
	{
			System.out.println("n:"+n + ", m:" + m);
	}

	
	public static void main(String[] args)
	{
		Test073 ob1 = new Test073();
		//--==>> 초기화 블럭 실행...
		//		 생성자 실행...

		ob1.write();
		//--==>> n:1000, m:2000

		Test073 ob2 = new Test073(1234, 4567);
		//--==>> 초기화 블럭 실행...
		//		  매개변수 있는 생성자 실행...

		ob2.write();
		//--==>> n:1234, m:4567
	}
}

// 실행 결과
/*
초기화 블럭 실행...
생성자 실행...
계속하려면 아무 키나 누르십시오 . . .
*/
// --> 생성자가 나중에 실행되기 때문에 우선순위는 생성자가 더 높음!
//     초기화블럭이 어떤 일을 하든 나중에 생성자가 갈아엎을 수 있음
//     초기화블럭, 생성자 위치 순서는 관계없이 생성자가 우선순위 높음!

/*
초기화 블럭 실행...
생성자 실행...
n:1000, m:2000
초기화 블럭 실행...
매개변수 있는 생성자 실행...
n:1234, m:4567
계속하려면 아무 키나 누르십시오 . . .
*/