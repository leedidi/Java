/*====================================
  ���� Ŭ������ �ν��Ͻ� ����
 =====================================*/

 // �� Test066.java ���ϰ� ��Ʈ~!!!


 // ���� ���̿� �ѷ� ���ϱ�
 // ���� ���̿� �ѷ��� ���� �� �ִ� Ŭ������ �����Ѵ�.
 // (Ŭ������ : CircleTest) �� CircleTest.java
 // Test065.java ������ �����ϵ�
 // ���� ���� �� ���� ���Ϸ� ������ �۾��� �����Ѵ�.
 // ����, BufferedReaeder �� Ȱ���Ѵ�.

 // ���� ���� = ������ * ������ * 3.141592
 // ���� �ѷ� = ������ * ������ * 2 * 3.141592

 // ���� ��)
 // ������ �Է� : 13

 // �������� 13�� ����
 // ���� : xxx.xx
 // �ѷ� : xxx.xx
 // ����Ϸ��� �ƹ� Ű�� ��������...

 /*
// [���� �ۼ��� �ڵ�]
public class CircleTest // �� Ŭ���� ����
{
	int cirArea()
	{
		int result = 0;
		result = r * r * 3.141592;
		return result;
	}
	
	int cirLength()
	{
		int result = 0;
		result = r * r * 2 * 3.141592;
		return result;
	}
	
 // �������� 13�� ����
 // ���� : xxx.xx
 // �ѷ� : xxx.xx
 // ����Ϸ��� �ƹ� Ű�� ��������...
	void print(double a=, double b)
	System.out.printf("�������� %d�� ����\n", r);
	System.out.printf("���� : %.2f\n", a);
	System.out.printf("�ѷ� : %.2f\n",b);

}
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CircleTest // �� Ŭ���� ����
{
	// �ֿ� �Ӽ�
	int r;						//-- ������
	final double PI = 3.141582;	//-- ���ֿ� (������ ���ȭ)

	// ���(����, ����)
	// ������ �Է� ���
	void input() throws IOException // IOException �޼ҵ忡 ���̴� ��!
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//@ ���۵帮�� ���⼭�� �ʿ�. ���⼭ ����. ���� �ٸ����� �� ������ clas �ϴܿ� �ٷξ��°� ��������..
		//@ �ٸ� Ŭ�������� �ҷ��ö� buffered���� �޸𸮿� �ֱ� ����... ���������� �����Ǵ� �� �ƴ�
		System.out.print("������ �Է� : ");
		r = Integer.parseInt(br.readLine());
	}

	// ���� ���� ���
	double calArea() //@ �޾ƿ;��� �Ű�����X, ��ȯ�ؾ��ϴ� ���� double
	{
		double result = 0;	//@ �߰����� �ٸ� �۾��Ҽ� �����Ƿ�.... �ʱ�ȭ�س����� ���� �� ����. ���� ����� ��Ÿ���� �� �ʱ�ȭ���ѳ�!
		result = r * r * PI;
		return result;

	}

	// �ѷ� ���� ���
	double calLength()
	{
		double result = 0;
		result = r * 2 * PI;
		return result;
	}

	// ��� ���
	void print(double a, double l)
	{
		 // �������� 13�� ����
		 // ���� : xxx.xx
		 // �ѷ� : xxx.xx

		System.out.printf("\n�������� %d�� ����\n", r);
		System.out.printf("���� : %.2f\n", a);
		System.out.printf("�ѷ� : %.2f\n", l);

	}

} // ��Ÿ�ӿ���! ��� �����ϸ� �ϸ� ��! �����Ͻ� circleTest.class �������, ��� main�޼ҵ� ��� ������ �ȵ�