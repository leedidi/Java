/*===================================================
   ���� �޼ҵ� �ߺ�����(Method Overloading) ����
 ===================================================*/

 /*
 �� �޼ҵ� �����ε�(Method Overloading) ����

	�޼ҵ� �����ε��̶� 
	�޼ҵ尡 ó���ϴ� ����� ����
	�޼ҵ� ��ȣ �ӿ� ���� �μ�(����, �Ű�����, �Ķ����)�� ������ �ٸ��ų�
	�ڷ���(Data Type)�� �ٸ� ���
	�޼ҵ��� �̸��� ������ �̸����� �ο��Ͽ� �޼ҵ带 ������ �� �ֵ���
	���������� ����ϰ� �Ǵµ�
	�̸� �޼ҵ� �����ε�(Method Overloading)�̶�� �Ѵ�.
 */

public class Test099
{
	public static void main(String[] args)
	{
		drawLine();
		//--==>> ====================

		drawLine('+');
		//--==>> ++++++++++++++++++++

		drawLine('>');
		//--==>> >>>>>>>>>>>>>>>>>>>>

	}

	// ���� �׸��� �޼ҵ� ����
	public static void drawLine()
	{
		System.out.println("====================");
	}

	// ���� ���¸� �ٲپ� �׸��� �޼ҵ� ����
	// -> �޼ҵ� �����ε� �ƴ�!
	/*
	public static void drawLine()
	{
		System.out.println("++++++++++++++++++++");
	}
	*/

	// ���� ���¸� �ٲپ� �׸��� �޼ҵ� ����
	public static void drawLine(char c)
	{
		for (int i=0; i<20; i++)
		{
			System.out.print(c);
		}
		System.out.println();
	}



}