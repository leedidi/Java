/*===========================
  ���� Ŭ���� ��� ����
  - ��ø Ŭ����
===========================*/

// outer
class InnerOuterTest
{
	static int a = 10;
	int b = 20;
	 
	 // inner
	class InnerNested
	{
		int c = 30;

		void write()
		{
			System.out.println("inner �� write()...");
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			System.out.println("c : " + c);
		}
	}// end class InnerNested

	void write()
	{
		System.out.println("outer �� write()...");
		InnerNested ob1 = new InnerNested();
		ob1.write();
	}
}//end class InnerOuterTest

// main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test120
{
	public static void main(String[] args)
	{
		// outer �� �ν��Ͻ� ����
		InnerOuterTest ob2 = new InnerOuterTest();
		ob2.write();		//-- outer �� write() �޼ҵ� ȣ��
		//@ 1. �ܺ� �ν��Ͻ� �����ϸ� ���� write()�� �ν��Ͻ� ���� O
		
		// Test118.java ���� ������ ������� �õ�
		//InnerOuterTest.InnerNested ob3 = new InnerOuterTest.InnerNested();
		//--==>> ���� �߻�(������ ����)
		
		// �Ϲ����� �ν��Ͻ� ���� ������� �õ�
		//InnerNested ob4 = new InnerNested();
		//--==>> ���� �߻�(������ ����)

		// �� ��ø ���� Ŭ����(static ��ø Ŭ����)�ʹ� �޸�
		//    �ܺ� Ŭ������ �ν��Ͻ�(��ü)�� ������� �ʰ�
		//    �ܵ����� ���� Ŭ������ �ν��Ͻ��� �����ϴ� ���� �Ұ����ϴ�.
		
		// �� check~!!!
		// �� Test118.java ���ϰ� ���� ��~!!!

		//@ �� ����صα�! Test120������ �̰� �ϳ��� ����س��� ������ ��!
		// ��new InnerOuterTest().new InnerNested();��

		InnerOuterTest.InnerNested ob5 = ob2.new InnerNested();
		ob5.write();
		//--==>> inner �� write()...
		//		 a : 10
		//       b : 20
		//		 c : 30

		InnerOuterTest.InnerNested ob6 = new InnerOuterTest().new InnerNested();
		ob6.write();
		//--==>> inner �� write()...
		//		 a : 10
		//		 b : 20
		//		 c : 30
	
		
		//outerŬ������.innerŬ������ ���������� = new outer������().new inner������();
		
		//@ (���Ʒ� ��~!!)
		// cf) static �� ��ø ���� Ŭ����
		// Test.StaticNested ob = new Test.StaticNested();

		// outerŬ������.innerŬ������ ���������� = new outerŬ������.inner������();
	}
}

//@ ��ø Ŭ���� �����! �׸��� �߿����� ����!!!! �ٸ� �͵鰰�� ������ ������ �ʿ� ����
//@ ���� ġ�鼭 �����ϱ�... �������̽��� ���� �Ű� ����! �������̽��� ��øŬ�������� 500�� �߿���!