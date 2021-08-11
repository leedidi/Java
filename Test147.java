/*=========================================
  ���� ����(Exception) ó�� ����
===========================================*/

// Tes146.java ���ϰ� ��~!!!

class Demo2
{
	private int value;

	public void setValue(int value) throws Exception //@ throws(s����! �ٱ����� ���������). Exception�� �������
	{
		if(value<=0)
		{	
			// ���� ����(�߻�) -- @�� ���� ����س���(throw new Exception.. ���Ƿ� ���ܸ� ���� �� �ִ�)
			//(@ ���߹� ������ ���⼭ �� ����)
			throw new Exception("value �� 0���� �۰ų� ���� �� �����ϴ�."); //@�� (���ܸ� �߻���ų�� ���)
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
	public static void main(String[] args) //throws Exception //@�������� ���߹� ���⼭�� ����
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
		
		//@ �׳� Exceptoin�� lang ��Ű���� �־ ���� import���� ������� �ʴ� ��

	}
}