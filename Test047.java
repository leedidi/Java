/*==========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - �ݺ���(while��) �ǽ�
 ==========================================================*/

 // ����ڷκ��� ������ �� ������ �Է¹޾�
 // ���� ������ ū �� ������ ���� ���Ͽ�
 // ����� ����ϴ� ���α׷��� �����Ѵ�.

 // ���� ��)
 // ù ��° ���� �Է� : 10
 // �� ��° ���� �Է� : 20
 // >> 10 ~ 20 ������ �� : xxx
 // ����Ϸ��� �ƹ� Ű�� ��������...

 // ù ��° ���� �Է� : 10
 // �� ��° ���� �Է� : 2
 // >> 2 ~ 10 ������ �� : 54
 // ����Ϸ��� �ƹ� Ű�� ��������...


// [���� �ۼ��� �ڵ�]
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test047
{
	public static void main(String[] args) throws IOException
	{
		// �� �ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b;			// ����ڷκ��� �Է¹��� ������ ���� a, b
		int i;			
		int result = 0;		//	a, b�� ���� ����� 
		
		// �� ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		b = Integer.parseInt(br.readLine());
		
		// �Էµ� a ���� b���� Ŭ �� a, b ���� ������ ū ����� ����

		if(a>b)
		{
			a = a^b;
			b = b^a;
			a = a^b;
		}

		// �������� �� �� ���
		
		i = a;			// ������� ����� a�� ���ΰ�, ����� �ʿ��� i �� ����
		while (i<=b)
		{
			result += i;
			i++;
		}

		// �� ��� ���
		System.out.printf(" >> %d ~ %d ������ �� : %d\n", a, b, result);
		
	}
}
*/

// [�Բ� �ۼ��� �ڵ�]




import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test047
{
	public static void main(String[] args) throws IOException
	{
		// �� �ֿ� ���� ���� �� �ʱ�ȭ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;				//-- ���� ������ Ȱ���� ����(@ �ݺ����� ������ ����)
		int su1, su2;		//-- ù ��°, �� ���� �Է°��� ���� ����
		int result = 0;		//-- �������� ���� ����(@ ���� ������ ū ��������)

		// �� ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		su1 = Integer.parseInt(br.readLine());
		System.out.print("�� ��° ���� �Է� : ");
		su2 = Integer.parseInt(br.readLine());

		// �Է¹��� �� ���� ũ�� �� �� �ڸ� �ٲ�
		// ��, su1 �� su2 ���� ū ��� �� ���� �ڸ��� �ٲ� �� �ֵ��� ó��

		if (su1 > su2)
		{
			// �ڸ� �ٲ�
			su1 = su1^su2;
			su2 = su2^su1;
			su1 = su1^su2;
		}

		// �ݺ� ���� ����
		// �ݺ� ������ �����ϱ� ����
		// ���� ���� ���� �����Ͽ� ���� ������ Ȱ���Ѵ�.
		// (��� ��� �������� �ʿ��ϱ� ������...)
		//@ 10
		//@ 2
		//@ 2 ~ 10 >> a : 2 3 4 5 6.... ���� �ٲ�����, �������� ����� â���� a ���� �� ǥ���Ϸ��� ���� ��Ƶ־� ��

		n = su1;

		while(n<=su2)
		{
			result += n;
			n++;
		}	

		// �� ��� ���
		System.out.printf(">> %d ~ %d ������ �� : %d\n", su1, su2, result);
	}
}



// ���� ���

/*
ù ��° ���� �Է� : 2
�� ��° ���� �Է� : 10
 >> 2 ~ 10 ������ �� : 54
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
ù ��° ���� �Է� : 10
�� ��° ���� �Է� : 2
 >> 2 ~ 10 ������ �� : 54
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
