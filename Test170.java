/*=======================================
  ���� �ڹ��� �⺻ �����(I/O) ����
========================================*/

// Reader �ǽ�
// Test168.java ���ϰ� ��~!!! 

import java.io.Reader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test170
{
	public static void main(String[] args) throws IOException
	{
		int data;
		char ch;
		
		// System.in	     : �ڹ� ǥ�� �Է� ��Ʈ�� �� ����Ʈ ��� ��Ʈ��
		// InputStreamReader : ����Ʈ ��� ��Ʈ���� �� ���� ��� ��Ʈ������
		//                     ��ȯ���ִ� ���� ����
		// Reader			 : ���� ��� ��Ʈ�� ��ü

		Reader rd = new InputStreamReader(System.in);

		System.out.println("���ڿ� �Է�(���� : Cntl+z)");

		while ((data = rd.read()) != -1) //@@@ ���� ��� ��Ʈ�� ����! (*test168�� ����Ʈ���! ��)
		{
			ch = (char)data;
			//System.out.write(ch);
			//--==>> 
			/*
			���ڿ� �Է�(���� : Cntl+z)
			abcd
			abcd
			1234
			1234
			�����ٶ�
			 ��|
			^Z
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/

			System.out.print(ch);
			//--==>>
			/*
			���ڿ� �Է�(���� : Cntl+z)
			abcd
			abcd
			1234
			1234
			�����ٶ�
			�����ٶ�
			^Z
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			*/
		}
	}
}