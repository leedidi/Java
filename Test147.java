/*=========================================
  ■■■ 예외(Exception) 처리 ■■■
===========================================*/

// Tes146.java 파일과 비교~!!!

class Demo2
{
	private int value;

	public void setValue(int value) throws Exception //@ throws(s였음! 바깥으로 집어던지기). Exception을 집어던짐
	{
		if(value<=0)
		{	
			// 예외 생성(발생) -- @★ 구문 기억해놓기(throw new Exception.. 임의로 예외를 만들 수 있다)
			//(@ 폭발물 제작을 여기서 해 버림)
			throw new Exception("value 는 0보다 작거나 같을 수 없습니다."); //@★ (예외를 발생시킬때 사용)
		}

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class Test147
{
	public static void main(String[] args) //throws Exception //@굴러나온 폭발물 여기서도 던짐
	{
		Demo2 ob = new Demo2();

		try
		{
			ob.setValue(-3);
			int result = ob.getValue();
			System.out.println(result);	
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
		//@ 그냥 Exceptoin은 lang 패키지에 있어서 따로 import구분 사용하지 않는 것

	}
}