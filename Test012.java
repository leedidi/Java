/*=====================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - ����
    �ﰢ���� �غ��� ���̿� ���̸� ����ڷκ��� �Է¹޾�
	�� �ﰢ���� ���̸� ���ϴ� ���α׷��� �����Ѵ�.
 ======================================*/

// ���� ��)
// �� �ﰢ���� ���� ���ϱ� ��
// - �ﰢ���� �غ� �Է� : 3
// - �ﰢ���� ���� �Է� : 5

// >> �غ��� 3, ���̰� 5�� �ﰢ���� ���� : xxxxx
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� �ﰢ���� ���� = �غ� * ���� / 2 
//				      -----------
//		              ����ڷκ��� �����͸� �Է¹޾� ó�� �� BufferedReader Ȱ��

/* [���� Ǯ���� ����] 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test012
{ 
	public static void main(String[] args) throws IOException
	{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//�ֿ� ���� ����
		int a; //�ﰢ���� �غ�
		int b; //�ﰢ���� ����
		double c; // �ﰢ���� ����

		System.out.println("�� �ﰢ���� ���� ���ϱ� ��");
		System.out.println(" - �ﰢ���� �غ� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.println(" - �ﰢ���� ���� �Է� : ");
		b = Integer.parseInt(br.readLine());

		c =  a * b / 2.0;
		//System.out.println(">> �غ��� " + a + "," + " ���̰� " + b + "�� �ﰢ���� ���� : " + c); (����)
		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n", a, b, c);
		// �� �ﰢ���� ���� = �غ� * ���� / 2 
		*/
		
		//[���� Ǯ���� ����]
		
import java.io.BufferedReader; //@ �ѹ� �������� �ϴ� ��� ���۵�~�� ������ Ⱦ������� ���۵帮���� Ư����
							   //@ ���� �Ⱦ��� �� ���۵�~ ���ö����� java.io.BufferedReader... �� ��ߵ� ������ 
import java.io.InputStreamReader;
// import java.lang.String; //@ lang = language, ��׵��� �ڹٰ� ���Ƿ� �̸� ����Ʈ �س���
// import java.lang.System; //@ ->import java.lang.*; (* : ��� ����) 
// import java.lang.*;

import java.io.IOException;	// �߰�~ ^^ - �ڰ����մϴ٤Ф�

public class Test012
{
	//public static main(String[] args) throws IOException
	public static void main(String[] args) throws IOException
	{
		// �� �ֿ� ���� ����

		//BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int bottomLength, height;	//-- �غ��� ����
		double area;				//-- ����			check~!!!
		

		// �� ���� �� ó��
		// �� ����ڿ��� �ȳ� �޽��� ���
		System.out.println(" �� �ﰢ���� ���� ���ϱ� �� ");
		System.out.print(" - �ﰢ���� �غ� �Է� : "); // @�ڿ��⼭ println ���� Ŀ�� �Ʒ��γ�����! �״ϱ� print ����

		// �� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
		//    ���� bottomLength �� ��Ƴ���
		bottomLength = Integer.parseInt(br.readLine());

		// �� �ٽ� ����ڿ��� �ȳ� �޼��� ���
		//System.out.println(" - �ﰢ���� ���� �Է� : ");
		System.out.print(" - �ﰢ���� ���� �Է� : ");

		// �� ����ڰ� �Է��� �����͸� ���� ���·� ��ȯ�� ��
		//	  ���� height �� ��Ƴ��� (@ bufferedreader �� ���ʿ� X. Ű����� �ѹ��� ������ ������ ��������)
		height = Integer.parseInt(br.readLine());

		// �� ���� ä����(�����) �������� Ȱ���Ͽ�
		//	  �ﰢ���� ���̸� ���ϴ� ���� ����
		// �� �ﰢ���� ���� = �غ� * ���� / 2 
		//area = bottomLength * height / 2; // �ڳ������� �Ǽ�����Ϸ��� 2.0����! 2�� �ϸ� ������ ���
		//       ������     ������ / ������  �� ���� ��� ����
		area = bottomLength * height / 2.0; // ���� �Ǽ��� ����� ���� x �Ǽ� = �Ǽ���  /// check~~!!!
		//        ������      ������ / �Ǽ��� �� �Ǽ� ��� ����

		// �� �Ǽ� �ڷ����� ��������� ����Ǵ� ��������
		//	  �Ǽ� ����� ������ �ʿ��� ��Ȳ�̴�.
		//    ������ ��2���� �ƴ� �Ǽ��� ��2.0������ ������ ������ �����ϰ� �Ǹ�
		//	  �� ������ �Ǽ� ������� ó���ȴ�.


		// �� ��� ���
		System.out.println();	  // -- �Ű����� ���� �� ����
		//System.out.print();	  // -- �Ű����� ���� �� ����

		System.out.printf(">> �غ��� %d, ���̰� %d�� �ﰢ���� ���� : %.2f\n", bottomLength, height, area); //�ڿ�� ��Ÿ����
		//@ ����: %d, �Ǽ�: %f, ����: \n

	}
}

// ���� ���
/*
 �� �ﰢ���� ���� ���ϱ� ��
 - �ﰢ���� �غ� �Է� : 15
 - �ﰢ���� ���� �Է� : 15

>> �غ��� 15, ���̰� 15�� �ﰢ���� ���� : 112.50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/