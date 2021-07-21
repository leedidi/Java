/*===================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - if ~ else �� �ǽ�
 ===================================*/

// ����ڷκ��� ������ ���� �� ���� �Է¹޾�
// ���� ������ ū �� ������ ����ϴ� ���α׷��� �����Ѵ�.

// ���� ��)
// ù ��° ���� �Է� : 5		//9
// �� ��° ���� �Է� : 15		//5
// �� ��° ���� �Է� : 10		//9

// >> ���� ��� : 5 10 15		// 5 9 9
// ����Ϸ��� �ƹ� Ű�� ��������...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test033
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� �� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;

		// ���� �� ó��
		System.out.print("ù ��° ���� �Է� : ");
		a = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : " );
		b = Integer.parseInt(br.readLine());

		System.out.print("�� ��° ���� �Է� : " );
		c = Integer.parseInt(br.readLine());
		

		// a b c ���� ���� ������� ����

		if(a>b)
		{
			a = a^b; 
			b = b^a; 
			a = a^b;
		}
		if(a>c)
		{
			a = a^c;
			c = c^a;
			a = a^c;
		}
		if(b>c)
		{
			b = b^c;
			c = c^b;
			b = b^c;
		}

		// ��� ���(@��� �Է� �ƴϰ� �����~!!)

		System.out.printf("\n>> ���� ��� : %d %d %d\n", a, b, c);
	}
}

//���� ���

/*
ù ��° ���� �Է� : 5
�� ��° ���� �Է� : 5
�� ��° ���� �Է� : 9

>> ���� ��� : 5 5 9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/