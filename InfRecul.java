
public class InfRecul
{
	public static void main(String[] args)
	{
		showHi(5);
	}
	
	/*
	public static void showHi(int cnt) // 5
	{
		
		System.out.println("Hi~ ");
		showHi(cnt--);			// showHi(5) 호출 (포스트픽스(뒤)라서) 무한반복....
		if(cnt==1)
			return;
		*/
		// 위치만 두 군데 바꿔서 hi 5번 나오게 만들어보기
		
		/*
			public static void showHi(int cnt) // 5
	{
		
		System.out.println("Hi~ ");
		showHi(--cnt);				//-- 앞으로 먼저 계산하게 뺌
		if(cnt==1)
	    return;

		*/
					public static void showHi(int cnt) // 5
	{
		
		System.out.println("Hi~ ");
					
		if(cnt==1)
	    return;

		showHi(--cnt);	//조건문 먼저 확인하게 아래로 뺌!
		
	}
}