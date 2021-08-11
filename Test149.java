/*=========================================
  ■■■ 예외(Exception) 처리 ■■■
===========================================*/

// 다른 예외 다시 던지기

public class Test149
{	
	public int getValue(int value) throws Exception				// ⑦ 예외 던지기(파란 폭발물)
	{
		int a = 0;
		
		try
		{
			a = getData(-2);									// ③ 예외 발생
		}														//    빨간 폭발물

		catch (Exception e)										// ④ 예외 잡아내기
		{														//    빨간 폭발물
			// ⑤ 예외 처리(빨간 폭발물) -->@ 빨간 폭발물 처리 끝
			System.out.println("printStackTrace................");
			e.printStackTrace();
			
			//throw e;
			throw new Exception("value 가 음수입니다.");
			// ⑥ 예외 발생(파란 폭발물)
		}

		return a;
	}
	public int getData(int data) throws Exception				// ② 예외 던지기
	{															//    빨간 폭발물
		if(data<0)
			throw new Exception("data 가 0 보다 작습니다.");	// ① 예외 발생
																//    빨간 폭발물

		return data + 10;
	}

	public static void main(String[] args)
	{
		Test149 ob = new Test149();

		try
		{
			int a = ob.getValue(-1);								// ⑧ 예외 발생
			System.out.println("a : " + a);							//    파란 폭발물
		}
		catch (Exception e)											// ⑨ 예외 잡아내기
		{															//    파란 폭발물
			// ⑩ 예외 처리(파란 폭발물)
			System.out.println("printStackTrace................");
			e.printStackTrace();
		}

		
	}
}