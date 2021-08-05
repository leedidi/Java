/*===========================
   ���� Ŭ���� ��� ����
   - �߻�(Abstract)
 ============================*/

 // [���� �ۼ��� �ڵ� + ������ �ۼ��� �ڵ�]
 // Test111_1�� �̸� �ٲ�� ���� �� ����?

/*
�� �߻� Ŭ����(abstract) ��
   ���� �ְ� ���ǰ� ���� �ϳ� �̻��� �޼ҵ�(�߻� �޼ҵ�)�� ���� Ŭ������
   ���� Ŭ�������� �������̵�(Overriding)�� ������ ����Ǵ� �޼ҵ忡 ����
   �޸� ���� ���� �̸� ȣ�� ��ȹ�� �����α� ���� �����.
   /@ ex> ����, �ٸ� ���� ���� �κ� ���赵 ->> �߻� Ŭ����

Ŭ������ ob = new Ŭ������();

�� ���� �� ����
	[��������������] abstract class Ŭ������
	{
		[��������������] abstract �ڷ��� �޼ҵ��([�Ű�����], ...);
	}
	------------------------------------------------------------------- 
    //@@@
   [��������������] abstract class Ŭ������							//@ �߻� Ŭ����(�߻����� ���赵)
   {
	   [��������������] abstract �ڷ��� �޼ҵ��([�Ű�����], ...);  //@ �߻� �޼ҵ�. 
																       abstract-> �߻��̶�� ������ �� �ٿ��ذ�! 
																				  �Ǽ��� �ƴ϶� �ǵ��� ���� �ص� ��.
		�޼ҵ��2()
		{
		}

		�޼ҵ��3()
		{
		}

		�޼ҵ��4()
		{
		}	
   }

�� Ư¡
   Ŭ������ ��� �ϳ� �̻��� �߻� �޼ҵ带 ������ ��
   �� Ŭ������ Ŭ���� �տ� ��abstract�� Ű���带 �ٿ�
   �߻� Ŭ������ ����ؾ� �ϸ�,
   �߻� Ŭ������ ����� ��쿡��
   �ҿ����� ������ Ŭ�����̹Ƿ� ��ü�� ������ �� ����.
   �߻� �޼ҵ尡 �������� �ʴ� �߻� Ŭ����������
   ��ü�� ������ �� ���� ���̴�.

   ��, �߻� Ŭ������ ���������� ������ �� ���� ������
   ����� ���ؼ��� �����ϸ�
   �߻� Ŭ�������� ��ӹ��� ���� Ŭ����������
   �ݵ�� �߻� �޼ҵ带 �������̵�(Overriding)�ؾ� �Ѵ�.

�� ��abstract�� Ű�����
    Ŭ������ �޼ҵ忡���� ����� �� ������
	��� ������ ���� ���������� ��� �Ұ����ϴ�.
*/

//@ Ŭ������ ��ü�� ����� ���� ���赵..!
//@ Ŭ���� ��ü�� �տ� ��� �ִٰ� ��ü�� ������ �ִ� �Ŵ� �ƴ�...! �̸� �������� �Ѷ��Ѷ� ���� ��
//@ �ν��Ͻ� ������ �޸𸮿� �÷� ��ü�� ����
//@ Ŭ������ ��ü�� ����� ���� ���赵�ν� ����

//@ �߻� Ŭ���� -> �߻����� ���赵... �̿ϼ��� ���赵. �̰� ������� �� ����� �����
//@ ~35�п� ��ȸ�ǽ� ��....


// �߻� Ŭ����
abstract class SortInt111
{
	private int[] value;

	protected void sort(int[] value)
	{
		this.value = value;
		sorting();					 //@�޼ҵ� ���𱸹�! line 79 �߻�޼ҵ�� ����~~~!!!
	}
	
	// �߻� �޼ҵ�
	protected abstract void sorting(); //@ �޼ҵ� ȣ�ⱸ�� �ƴ�! �������������ڳ� ���ϱ����� ��õǾ� �ֱ� ����...
	/*
	{
		.....;
	}
	*/
	
	protected int dataLength()
	{
		return value.length;
	}
	
	// ��final�� Ű����� ����
	// �� Ŭ����(SortInt111)�� ��ӹ޴� Ŭ��������
	// �� �޼ҵ带 ������(Method Overriding)�� �� ����.
	protected final int compare(int i, int j) //@ �޼ҵ�
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if (x>y)
			return 1;
		else
			return -1;
	}
	
	// ��final�� Ű����� ����
	// �� Ŭ����(SortInt111)�� ��ӹ޴� Ŭ��������
	// �� �޼ҵ带 ������(Method Overriding)�� �� ����.
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}


}

/// Sort111(�߻� Ŭ����)�� ��ӹ��� Ŭ���� �� �ϴ��� �߻� Ŭ����
public class Test111 extends SortInt111
{ 
	// ��ӹ��� ����
	/*
	protected void sort(int[] value)
	{
		this.value = value;
		sorting();					 
	}
	
	// �߻� �޼ҵ�          >>>  �ϼ�,,,?
	protected abstract void sorting(); 

	protected int dataLength()
	{
		return value.length;
	}
	
	protected final int compare(int i, int j) 
	{
		int x = value[i];
		int y = value[j];
		if (x==y)
			return 0;
		else if (x>y)
			return 1;
		else
			return -1;
	}
	
	protected final void swap(int i, int j)
	{
		int temp = value[i];
		value[i] = value[j];
		value[j] = temp;
	}
	
	*/

	
	static int[] data = {7, 10, 3, 8, 7};
	
	//@Override
	protected void sorting() // ����....! // *** compare, swap �־ ����
	{
		//~~~ ����
		//i���� value.length����..?
		for (int i=0; i<dataLength()-1; i++)
		{
			for (int j=i+1; j<dataLength(); j++)
			{
				if(compare(i,j)>=1)
				
				swap(i,j);
			}
		}
	}

	public static void main(String[] args) // *** sort �ϳ��� ���
	{	
		// SortInt111 ob = new SortInt111(); //@ �߻�Ŭ����-�Ұ���!
		// Test111 ob = new Test111();		 //@ �߻�Ŭ����-�Ұ���!

		// �ν��Ͻ� �����ؼ� ����ǰ� �� ����
		
		
		//if(compare == 1)
		//	ob.swap();
		
		System.out.print("Sorced data : ");
		for (int n : data)
			System.out.print(n + " ");

		System.out.println();

		Test111 ob = new Test111();
		ob.sort(data);

		System.out.print("Sort Data : ");
		for (int n : data)
			System.out.print(n + " ");
		System.out.println();

	}
}

/*
Sorce Data  : 7 10 3 8 7
Sorted Data : 3 7 7 8 10
����Ϸ��� �ƹ� Ű��...
*/