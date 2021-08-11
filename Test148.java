/*=========================================
  ■■■ 예외(Exception) 처리 ■■■
===========================================*/

// 예외 다시 던지기

public class Test148
{
	public static void main(String[] args)
	{
		Test148 ob = new Test148();

		try
		{
			int a = ob.getValue(-2);		// ⑥ 예외 발생
			System.out.println("a : " + a);
		}
		catch (Exception e)					// ⑦ 예외 잡아내기
		{
			System.out.println("ⓑ printStackTrace........");
			e.printStackTrace();
		}

		
	}

	public int getData(int data) throws Exception
	{
		if(data<0)
			throw new Exception("data 가 0보다 작습니다.");
			// ① 예외 발생

		return data + 10;
	}

	public int getValue(int value) throws Exception
	{
		int a = 0;

		try
		{
			a = getData(-2);	// ② 예외 발생
		}
		catch (Exception e) //③ 예외 잡아내기  //@@ 예외 잡음. 잡았는데...
		{	
			// ④ 잡아낸 예외에 대한 처리
			System.out.println("ⓐ printStackTrace........");
			e.printStackTrace();

			// ⑤ 잡아낸 예외를 다시 던지기 //@ 잡은 예외 다시 던져버림!
		    throw e;
			//-- 주석 처리 시(즉, 잡아낸 예외를 다시 던지지 않을 경우)
			//   main() 메소드의 예외 처리 구문은 수행되지 않게 된다.
		}

		return a;
	}
}


// 실행 결과
/*
ⓐ printStackTrace........
java.lang.Exception: data 가 0보다 작습니다.
        at Test148.getData(Test148.java:30)
        at Test148.getValue(Test148.java:42)
        at Test148.main(Test148.java:15)
ⓑ printStackTrace........
java.lang.Exception: data 가 0보다 작습니다.
        at Test148.getData(Test148.java:30)
        at Test148.getValue(Test148.java:42)
        at Test148.main(Test148.java:15)
계속하려면 아무 키나 누르십시오 . . .
*/