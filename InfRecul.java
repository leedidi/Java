
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
		showHi(cnt--);			// showHi(5) ȣ�� (����Ʈ�Ƚ�(��)��) ���ѹݺ�....
		if(cnt==1)
			return;
		*/
		// ��ġ�� �� ���� �ٲ㼭 hi 5�� ������ ������
		
		/*
			public static void showHi(int cnt) // 5
	{
		
		System.out.println("Hi~ ");
		showHi(--cnt);				//-- ������ ���� ����ϰ� ��
		if(cnt==1)
	    return;

		*/
					public static void showHi(int cnt) // 5
	{
		
		System.out.println("Hi~ ");
					
		if(cnt==1)
	    return;

		showHi(--cnt);	//���ǹ� ���� Ȯ���ϰ� �Ʒ��� ��!
		
	}
}