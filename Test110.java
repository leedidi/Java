/*===========================
   ���� Ŭ���� ��� ����
   - ���(Inheritance)
 ============================*/

 /*
 �� �޼ҵ� �������̵�(Method Overriding)�� Ư¡

    - �޼ҵ� �̸�, ����Ÿ��, �Ķ���� ���� Ÿ���� ������ ��ġ�ؾ� �Ѵ�.
	- �ݵ�� ��� ���谡 �־�� �Ѵ�.

	- �����ǵ� ���� Ŭ������ �޼ҵ� �������������ڴ�
	  ���� Ŭ������ �޼ҵ� �������������ں��� ������ ũ�ų� ���ƾ� �Ѵ�.
	  ���� ���, ���� Ŭ���� �޼ҵ��� �������������ڰ� ��protected���� ���
	  ���� Ŭ������ �� �޼ҵ带 �������̵�(Overriding)�ϴ� ���
	  �������������ڴ� ��protected�� �Ǵ� ��public�� �̾�� �Ѵ�.		
	//@ ���� ���� ������O, �������ž� ������ X~!! 

	- ��static��, ��final��, ��private�� �޼ҵ�� �������̵�(Overriding) �� �� ����.
	//@ static..Ŭ���� �޼ҵ�.. �������� �ϼ��Ǿ �̹� �޸� ��ƹ����� �ٽ� ������X
	//@ final ������ �ٿ��� ���ȭ... �޼ҵ忡�� ���ϼ�O.. �������̴ϱ� �ٸ� ���·� �������� ��. �ٽ� Ʃ���Ҽ� ���� �Ѵٰ� ����
	//@ private.. ���� ����. �ƿ� ��� ��󿡼� ���ܵȴٰ� �����ϱ�~!!! �ƿ� �����Ҽ� ���µ� Ʃ���Ҽ� ����!

	- Exception �� �߰��� �Ұ����ϴ�.
	  ��, ���� Ŭ������ �޼ҵ尡 ������ �ִ� ���� ���� ���׿�
	  ���ο� Exception �� �߰��ϴ� ���� �Ұ����ϴٴ� ���̴�.

 */

// �θ� Ŭ����(���� Ŭ����, super class)
 class SuperTest110
 {
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super... write() : " + a + " : " + b + " : " + c);
	}
 }

// �ڽ� Ŭ����(���� Ŭ����, sub class)
 class SubTest110 extends SuperTest110
 {
	/*
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super... write() : " + a + " : " + b + " : " + c);
	}
	*/

	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub... print() : " + a + " : " + b + " : " + c);
		//--==>> ���� �߻�(������ ����)
		//-- ���� Ŭ�������� ����� ���� a ���� ������ �� ����.
		//   �� private �����̱� ������...

		System.out.println("Sub... print() : " + b + " : " + c);

		//System.out.println("Sub... print() : " + b);
		//System.out.println("Sub... print() : " + this.b);
		//System.out.println("Sub... print() : " + super.b);
		//-- ���� b�� ���� ����� ���� �ٸ� b�� ���� �� ����� �̷������.
		//   ���� Ŭ�������� ����� b, ���� Ŭ�������� ����� b

		//System.out.println("Sub... print() : " + c);			//@ ��
		//System.out.println("Sub... print() : " + this.c);		//@ �� ��
		//System.out.println("Sub... print() : " + super.c);	//@ �θ�κ��� �������� �� = �� ��
		//-- ���� c�� �����ϴµ� �ƹ��� ����� ������ ����.
		//   ���� Ŭ�������� ����� c
	}

//@ ����� ������ī�� Ʃ��~!!!
		@Override
		public void write()
		{
			//System.out.println("Sub... write() : " + a + " : " + b + " : " + c); 
			//--==>> ���� �߻�(������ ����)
			//-- ���� Ŭ�������� ����� ���� a ���� ������ �� ����.
			//    �� private �����̱� ������...
			System.out.println("Sub... write() : " + b + " : " + c);
		}


 }

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test110
{
	public static void main(String[] args)
	{
		// ���� Ŭ����(SubTest110) �ν��Ͻ� ����
		SubTest110 ob = new SubTest110();

		ob.print();
		//--==>> Sub... print() : 100 : 20

		ob.write();
		//--==>> Super... write() : 5 : 10 : 20 ��

		System.out.println("---------------------------------------- ���м�");
		
		System.out.println(ob.b);
		//--==>> 100
		
		//@ super // - > �̰� ���Ե� Ŭ������ ã�� -> �� �θ� Ŭ������ ã��
		System.out.println(((SuperTest110)ob).b);
		//@ == (char)a, ����ȯ
		//--==>> 10
		// �� ���� �θ�~!!!


		((SuperTest110)ob).write();
		//--==>> Sub... write() : 100 : 20
		//�θ� ���� �޼ҵ� ȣ���ϴ� �� �ƴ�

		// �� �޼ҵ�� ������ ��~!!! �����Ͽ� ������ ��~!!!
		//@ ������ ����, �޼ҵ�� �Ұ���

		

	}
}