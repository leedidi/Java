 /*==========================================
  ���� �ڹ� �⺻ ���α׷��� ����
  - �ڹ��� �⺻ ����� : java.util.Scanner
 ===========================================*/

// �� java.util.Scanner
//	  �ܶ� ���� ������ ����Ͽ� �Է��� ��ū�� ���� �����ϸ�
//	  ����Ʈ(default)�� ���Ǵ� �ܶ����ڴ� �����̴�.
//	  �ۼ��� ���� ��ū�� ��next()�� �޼ҵ带 ���
//	  �ٸ� ����(�ڷ���)�� ������ ��ȯ�� �� �ִ�.

// �Է� : "��� ���� �ٳ���" // ���, ����, �ٳ��� �� ����!
//	      "10 20 30"


//@ >> ��ǻ�Ϳ��� ����� ������ ������ ������! (ex, 1�п� �󸶳� ���� ���� ����ϴ���, ���������A, �������̰��� ž��� �÷������� B)
												//->> ����� B�� ����, ������ A�� ����!

import java.util.Scanner; //@ ���赵���� �ڹپ� �ϰ� �������!
//import java.lang.Integer; //@ �̹� �ڹپ� ����Ǿ����� ���ξȽᵵ ��������

public class Test016
{
	public static void main(String[] args) // throws IOException //@ Scanner�� �ڹٿ� �̹� ž�½�Ű��� ��� ����!
																 //@ IOException ��� ���̵� �ܺ� �°� ž�� �ڹٰ� ���.
	{	
		// �� �ֿ� ���� ����

		// Scanner �ν��Ͻ� ����
		Scanner sc = new Scanner(System.in); //@ �ڹپ� �ϰ� �о�� ���赵��� �ϰ� �� �÷���!
											 //@ Scanner�� �ȿ� �뿪��� �̹� ����, System.in �״�� �Ѱ��൵ ����.
											 //@ buffered~ �� ������, Scanner�� ���� ��
											 //@ But ��а��� buffered ����.. Scanner�� ���߿� ���� ���ű� ����
											 //@ �ѹ� ������ ��ĳ�ʷ� ��� �о��!

		String name;		//-- �̸�
		int kor, eng, mat; //--����, ����, ���� ����

		// �� ���� �� ó��
		System.out.print("�̸��� �Է��ϼ��� : ");
		//br.readLine();
		name = sc.next(); //@ ��~~ �ϸ� ��� ���� ���� ���� �ٳ��� �о��ִ� ó�� ����

		System.out.print("�������� �Է� : ");
		//kor = Integer.parseInt(br.readLine()); /@ Integer ���� �ȿ� �ִ� parseInt!
		//kor = Integer.parseInt(sc.next());
		//sc.nextInt() : ����Ÿ��
		//sc.nextDouble() : �Ǽ�Ÿ��
		//sc.next() : ���ڿ�
		kor = sc.nextInt();

		System.out.print("�������� �Է� : ");
		eng = sc.nextInt();

		System.out.print("�������� �Է� : ");
		mat = sc.nextInt();

		// �� ��� ���
		System.out.println();
		System.out.println(">> �̸� : " + name);
		//@ System.out.println(">> ���� : " + kor + eng + mat); //@ 908070.. ����~ ���ڱ� ������!
		System.out.println(">> ���� : " + (kor + eng + mat)); //@(kor + eng + mat) : ����, ����~���ڿ� �����ص� ������ ����

	}
}

// ���� ���
/*
�̸��� �Է��ϼ��� : �̴ٿ�
�������� �Է� : 90
�������� �Է� : 90
�������� �Է� : 90

>> �̸� : �̴ٿ�
>> ���� : 270
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/