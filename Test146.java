/*=========================================
  ���� ����(Exception) ó�� ����
===========================================*/

// Tes147.java ���ϰ� ��~!!!

class Demo
{
	private int value;
	//@ �⺻������ 0���� �ʱ�ȭ

	public void setValue(int value)
	{
		if(value<=0)
			return;		//-- ���� �� �޼ҵ� ����

		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

public class Test146
{
	public static void main(String[] args)
	{
		Demo ob = new Demo();
		ob.setValue(-3);
		int result = ob.getValue();
		System.out.println(result);
	}
}