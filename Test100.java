/*===================================================
   ���� �޼ҵ� �ߺ�����(Method Overloading) ����
   - Method Overloading �� ������ ���¿� �Ұ����� ����
 ===================================================*/

 //@ X�� �� + ���� �ƶ��Ƽ��� ��!

public class Test100
{
	public static void main(String[] args)
	{
		print('A');

		double result = print(3.14);	//@��ǻ�ʹ� �� double d�� ���� ���մϵ�!!
		print(4.75);
	}

	public static void print() {}
	public static void print(int i) {}
	//public static void print(int j) {}					//-- (��)
	public static void print(char c) {}						//-- �ڵ� �� ��ȯ ��Ģ check~!!!
	public static void print(int i, int j){}				//@ ���� �ٸ��ϱ� ����!
	public static void print(double d) {}					//@ ���� �ٸ��ϱ� ����!
	//public static void print(double d){return 10.0;}		//-- ���� �Ұ� @ - return�ε� void�� ���� �Ұ���!
	//public static double print(double d) {return 10.0;}	//-- (��) //@��ǻ�ʹ� �� double d�� ���� ���մϵ�!!
}