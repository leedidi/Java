/*======================================================
  ���� �÷��� �����ӿ�ũ(Collection Framework) ����
=======================================================*/

// Vector v = new Vector();
//-- ����ִ� Vector �ڷᱸ�� ����

// Vector v = new Vector(8);
//-- 8���� �ʱ� element �� ���� Vector �ڷᱸ�� ����
//   8���� ��� ä������ �Ǹ�(���ڶ�� �Ǹ�) �ڵ����� Ȯ��ȴ�.

// Vector v = new Vector(3, 5);
//-- 3���� �ʱ� element �� ���� Vector �ڷᱸ�� ����
//   3���� ��� ä������ �Ǹ�(���ڶ�� �Ǹ�) �ڵ����� 5�� ����(Ȯ��)�ȴ�.

// �� ���ʹ� ������ ��ҷμ� ������, �Ǽ���, ���ڿ�... ����
//    ��Ƴ��� ���� �����ϴ�.
//    �� ������ ������ Ȯ�� check~!!!
//@ ��������� ��� ����! �� üũ�ϰ� �Ѿ��

import java.util.Vector;
import java.util.Iterator;

// MyVector Ŭ���� ���� �� Vector Ŭ���� ���
class MyVector extends Vector<Object>
{
	// ����� ���� ������
	MyVector()
	{	
		// Vector(���� Ŭ����) ������ ȣ��
		super(1, 1);
		//-- ù ��° ���� : �־��� �뷮
		//   �� ��° ���� : ������
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}
	void addFloat(float f)
	{
		addElement(new Float(f));
	}
	void addString(String s)
	{
		addElement(s);
	}
	void addCharArray(char[] a)
	{
		addElement(a);
	}

	void write()
	{
		int length = size();
		System.out.println("���� ��� ���� : " + length);
		//--==>> ���� ��� ���� : 4
		
		Object o;

		for (int i=0; i<length; i++)
		{
			o = elementAt(i); //@ �⺻ ������ü�� Objct!

			// ��intstanceof�� ������		check~!!! //@ �� Object�ε� �»��� ����? �� �ѱ�����ε� �׷������ұ��ϰ� ����� ����?
			//-- ó���ؾ� �ϴ� ����� ��ü Ÿ�� Ȯ��
			
			if (o instanceof String)//@ �ѱ�����ε� ������� String�̿���!
			{
				System.out.println("���ڿ� : " + o.toString()); //@ �»��� ���ڿ��̴ϱ� ���ڿ� ó�� ������� ó�����ٰ�!
			}
			else if (o instanceof Integer) //@o�� Integer Ŭ���� ������� ������ ������Ʈ���...
										   //@ �ѱ�����ε� ������� Integer�̿���!
			{
				System.out.println("������ : " + o); //@ ���� ��ڽ� ���ٰ�.... �׷��� ��! ex> object�� 10 �����ڽ����� ��
			}
			else if (o instanceof Float)
			{
				System.out.println("�Ǽ��� : " + o);
			}
			else if(o instanceof char[]) //@ �����ڽ� �ȵ�! wrapper Ŭ���� X, toSting �ȵ�
			{	
				/*
				for (int i; i<((char[])o).length; i++)
				{
					System.out.println((char[]o)[i]);
				}
				*/ //@�ʹ� ����...
				//System.out.println("���� �迭 : " + o);
				//System.out.println("���� �迭 : " + o.toString());
				System.out.println("���� �迭 : " + String.copyValueOf((char[])o));
				//@ object ĳ���͹迭�� ����ȯ, ���ڹ迭 ���� ��� ���ڿ��� ������� ����ϰ� �Ǵ°� copyValueof!
				//@ String.copyValueOf(("���ڹ迭"));
				//@ String.copyValueOf({'a','b','c'});
			}
			else
			{
				System.out.println("Ÿ�� Ȯ�� �Ұ�~!!!");
			}
		}
		




		/*
		Iterator<Object> it = this.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//--==>> 5
		//		 3.14
		//		 �ȳ��ϼ���
		//		 [C@15db9742
		*/
	}

}

public class Test155
{
	public static void main(String[] args)
	{
		// MyVector Ŭ���� ��� �ν��Ͻ� ����
		MyVector v = new MyVector();

		// �ֿ� ���� ���� �� �ʱ�ȭ
		int digit = 5;
		//@ ���ʹ� �»����Ͱ� ����Ÿ��. ��ü ������ ��ҵ鸸 ����� ���Ҽ� ����
		//  �⺻ ������Ƽ�� �ڷ����� ��ҷ� ���Ҽ� ����
		//@ ������ 5 ������ ����. �� int 5���� x �� integer Ÿ���� ��ü�� 5����~! �׷��� ������Ƽ�� �ڷ����� ���Ϳ� �߰��� ��������
		//  �̰� ������Ƽ�� �ڷ����̶�� ���Ͱ� �������� ����..
		float real = 3.14f;
		String s = new String("�ȳ��ϼ���");
		char[] letters = {'s', 't', 'u', 'd', 'y'};

		v.addInt(digit);			//-- ���� �ڷᱸ���� ���� ����
		v.addFloat(real);			//-- ���� �ڷᱸ���� �Ǽ� ����
		v.addString(s);				//-- ���� �ڷᱸ���� ���ڿ� ����
		v.addCharArray(letters);	//-- ���� �ڷᱸ���� ���� �迭 ����

		v.write();
	}
}