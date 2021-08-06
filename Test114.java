/*==============================
   ���� Ŭ���� ���� ����
   - �������̽�(Interface)
 ==============================*/

// �������̽�
interface ADemo
{
	public void write();
}

// �������̽�
interface BDemo
{
	public void print();
}

// �� �������̽��� 2�� �̻��� ����(implements)�� �� �ִ�.
//   �� ���� ����� ���� �ʴ� �κ��� ����(����)�ϴ� ����

// Ŭ����
//class DemoImpl
//class DemoImpl extends ADemo, BDemo
//class DemoImpl implements ADemo, BDemo
//  ��
// �߻� Ŭ����
//abstract class DemoImpl implements ADemo, BDemo
//  ��
// Ŭ���� - �� �������̽��� ������ Ŭ����
class DemoImpl implements ADemo, BDemo
{
	/*
	public abstract void write();

	public abstract void print();
	*/

	// �� JDK 1.5(5.0)������ �������̽� �޼ҵ带
	//    �������̵�(Overriding) �� ��
	//    ��@Override�� ������̼�(annotation)�� ����� �� ����.
	//    JDK 1.6(6.0) ���ĺ��� ���� ������ �����̴�.
	//    ��, ��ӹ��� Ŭ������ �޼ҵ带
	//    �������̵�(Overriding)�� ������
	//    JDK 1.5(5.0)������ ��@Override�� ������̼�(annotation)
	//    ����� �����ϴ�.

	@Override
	public void write()
	{
		System.out.println("ADemo �������̽� �޼ҵ� write()...");
	}

	@Override
	public void print()
	{
		System.out.println("BDemo �������̽� �޼ҵ� print()...");
	}
}

//main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test114
{
	public static void main(String[] args)
	{
		//ADemo ob = new ADemo();	//-- �������̽� �� �ν��Ͻ� ���� �Ұ�
		//BDemo ob = new BDemo();	//-- �������̽� �� �ν��Ͻ� ���� �Ұ�
		
		// ADemo, BDemo �������̽��� ����(implements)�� Ŭ���� (��DemoImpl)
		// ����� �ν��Ͻ� ����
		DemoImpl ob1 = new DemoImpl();

		ob1.write();
		ob1.print();
		//--==>> ADemo �������̽� �޼ҵ� write()...
		//       BDemo �������̽� �޼ҵ� print()...

		ADemo ob2 = new DemoImpl();		//-- �� ĳ����
		BDemo ob3 = new DemoImpl();		//-- �� ĳ����

		//ob2.print();					//@ ���������� �ڽİ�ü����, Ademo Ÿ�Կ����� print ���ǰ� ����.
										//--==>> ���� �߻�. //@ �θ�� �ڽĿ��� �̷����� �ִ��ٵ� ��
		//ob3.write();					//--==>> ���� �߻�

		ob3.print();
		ob2.write();
		//--==>> BDemo �������̽� �޼ҵ� print()...
		//       ADemo �������̽� �޼ҵ� write()...
		
		((BDemo)ob2).print();
		((ADemo)ob3).write();
		//--==>> BDemo �������̽� �޼ҵ� print()...
		//       ADemo �������̽� �޼ҵ� write()...
		//-- DemoImpl Ŭ������ �� �������̽��� ��� �����߱� ������ �����ϴ�.
		//   ���� Demoimpl Ŭ������ �̵� �� �� �������̽��� ������ ��Ȳ�̶��
		//   �� ������ ��Ÿ�� ���� �߻��ϴ� ������ �ȴ�.
		
		// �ٿ� ĳ����
		((DemoImpl)ob3).write();
		//--==>> ADemo �������̽� �޼ҵ� write()...


	}
}