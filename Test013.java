/*=============================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - ������ �ڷ���
  - �ڹ��� �⺻ ����� : BufferedReader Ŭ����
 ==============================================*/

 // ����ڷκ��� �̸�, ��������, ��������, ���������� �Է¹޾�
 // �̸��� ������ ����ϴ� ���α׷��� �����Ѵ�.

 // ���� ��)
 // �̸��� �Է��ϼ��� : ������
 // ���� ���� �Է� : 90
 // ���� ���� �Է� : 80
 // ���� ���� �Է� : 70

 // ====[���]====
 // �̸� : ������
 // ���� : 240
 // ����Ϸ��� �ƹ� Ű�� ��������...

/* [���� Ǯ���� ����]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String name;
	int korean, english, math, sum;

	System.out.print("�̸��� �Է��ϼ��� : ");
	name = br.readLine();

	System.out.print("���� ���� �Է� : ");
	korean = Integer.parseInt(br.readLine());

	System.out.print("���� ���� �Է� : ");
	english = Integer.parseInt(br.readLine());

	System.out.print("���� ���� �Է� : ");
	math = Integer.parseInt(br.readLine());

	System.out.println();
	System.out.println("====[���]====");
	System.out.println("�̸� : " + name);

	sum = korean + english + math;
	System.out.println("���� : " + sum);

		}
}

	
// ��� ���
�̸��� �Է��ϼ��� : �̴ٿ�
���� ���� �Է� : 90
���� ���� �Է� : 90
���� ���� �Է� : 90

====[���]====
�̸� : �̴ٿ�
���� : 270
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/

//[���� Ǯ���� ����]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{	
		// �� �ֿ� ���� ����

		//BufferedReader �ν��Ͻ� ����
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);			//@ �� ��� �� ����Ҽ� �־����! ��Ȳ���� �ٸ��� ���. 
																//@ ���� �ܿ��ʿ��X

		String strName; //@���ڿ��̴ϱ� String! �� ó���� int����...�Ф���   //-- �̸� ����
		int nkor, nEng, nMat;												 //-- ����, ����, ���� ���� ����
		int nTot;															 //-- ���� ����

		//�߰� ���� ����
		String strTemp;		//-- ���ڿ� ������ �ӽ� ���� ����

		// �� ���� �� ó��
		// - ����ڿ��� �ȳ� �޼��� ���(�̸� �Է� �ȳ�)
		System.out.print("�̸��� �Է��ϼ��� : ");

		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strName = br.readLine();

		// - ����ڿ��� �ȳ� �޼��� ���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();				//"90"

		// - ��Ƴ� ���� �ʿ��� ������ �Ű� ���
		nkor = Integer.parseInt(strTemp);		// 90 = integer~("90")
		// -- �ӽ� ���� ���� strTemp �� ����ִ� ����
		// �� ��ȯ ��... �������� ������ ��Ƴ���

		// - ����ڿ��� �ȳ� �޼��� ���(���� ���� �Է� �ȳ�)
		System.out.print("���� ���� �Է� : ");

		// - ����ڰ� �Է��� ��(�ܺ� ������)�� ������ ��Ƴ���
		strTemp = br.readLine();				//"80"
		//@�����ִ� �������� ���� strTemp ���� �����. ����� ����
		
		// - ��Ƴ� ���� �ʿ��� ������ �Ű� ���
		nEng = Integer.parseInt(strTemp);
		// -- �ӽ� ���� ���� strTemp �� ����ִ� ����
		// �� ��ȯ ��... �������� ������ ��Ƴ���

		System.out.print("���� ���� �Է� : ");
		strTemp = br.readLine();
		nMat = Integer.parseInt(strTemp);


		// - �� ���� ������ ����ִ� ������(�Է� ������)����
		//	 �����Ͽ� ������ �����ϰ�
		//   �� ����� ���� ������ ��Ƴ���
		nTot = nkor + nEng + nMat;

		// �� ��� ���
		System.out.println("\n====[���]====");
		//System.out.println("�̸� : " + strName);
		System.out.printf("�̸� : %s\n", strName); //@ ���� ����: %d / �Ǽ� ����: %f / ���ڿ� ���� : %s / \n: ����
		//System.out.println("����: " + nTot);
		System.out.printf("���� : %d\n", nTot);
	}
}
//@ ����Test ������ > �ٸ����� �ݱ� : ���� ���ϻ��� ������ �ݱ� ����
//@ ���� java class~~ ĭ���� f5 ������ ���ΰ�ħ�ؼ� �����ϵ� Ȯ�� ����
//@ java ���ϵ� �޸������ε� ���� ����!

//��� ���
/*
�̸��� �Է��ϼ��� : �̴ٿ�
���� ���� �Է� : 90
���� ���� �Է� : 90
���� ���� �Է� : 90

====[���]====
�̸� : �̴ٿ�
���� : 270
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/