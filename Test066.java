/*====================================
  ���� Ŭ������ �ν��Ͻ� ����
 =====================================*/

 // �� CircleTest.java ���ϰ� ��Ʈ~!!!

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

//[���� ���� �ڵ�]
/*
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test066
{
// ���� ��)
	// ������ �Է� : 13
	public static void main(String[] args) throws IOException // ���� ������ �Է�
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("������ �Է� : ");
	int r = Integer.parseInt(br.readLine());

	CircleTest ob= new CircleTest();
	}

}
*/

//import java.io.BufferedReader;
//import java.io.InputStreamReader; //@ ��� ���⼭ ���°� �ƴϴϱ�.. �� �ص� ��!
import java.io.IOException;			//@ ��� ���⼭ ���ϱ� �ؾ���!

public class Test066
{

	public static void main(String[] args) throws IOException
	{	
		// CircleTest Ŭ���� �ν��Ͻ� ����
		CircleTest ob = new CircleTest();

		// ������ �ν��Ͻ� ob �� ���� ������ �Է� �޼ҵ� ȣ��
		ob.input();

		// ������ �ν��Ͻ� ob �� ���� ���� �޼ҵ� ȣ��
		double b = ob.calArea(); //@ � �̸��̵� �������! like �ǾƳ� ŰƼ

		// ������ �ν��Ͻ� ob �� ���� �ѷ� ���� �޼ҵ� ȣ��
		double t = ob.calLength();

		// ������ �ν��Ͻ� ob �� ���� ��� �޼ҵ� ȣ��
		ob.print(b, t);
	}
}

// ���� ���
/*
������ �Է� : 23

�������� 23�� ����
���� : 1661.90
�ѷ� : 144.51
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/