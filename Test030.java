/*===================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - if ~ else �� �ǽ�
 ===================================*/

 // ����ڷκ��� ������ ������ �Է¹޾�
 // �Է¹��� ������... ¦������, Ȧ������, ������
 // ����� �Ǻ��Ͽ� ����ϴ� ���α׷��� �����Ѵ�.

 // ���� ��)
 // ������ ���� �Է� : 14
 // 14 �� ¦��
 // ����Ϸ��� �ƹ� Ű��...

 // ������ ���� �Է� : 3
 // 3 �� Ȧ��
 // ����Ϸ��� �ƹ� Ű��...
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;				//--������ ����
		String strResult;	//--�����

		// ���� �� ó��
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
		if(n = 0)
		{ 
			strResult = "0";
		}
		else if( n % 2 = 0);
		{ 
			strResult = "¦��";
		}
		else
		{ 
			strResult = "Ȧ��";
			}
		// ��� �Է�

		*/

		
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test030
{
	public static void main(String[] args) throws IOException
	{
		// �ֿ� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;
		System.out.print("������ ���� �Է� : ");
		n = Integer.parseInt(br.readLine());
/*
		if (n%2==0) // == �ΰ�..!!! '='�� ���Կ�����. �״ϱ� '==','!=' �����!!!
		{
			System.out.println(n + " �� ¦��");
		}
		else if (n%2!=0)
		{
			System.out.println(n + " �� Ȧ��");
		}
		else //@ ����! 0�� �������� 0...! ¦������ 0�� ���� �ɷ����� ��
		{
			System.out.println(n + " �� ��");
		}
		*/

		String strResult = "�Ǻ��Ұ�";

		if(n%2!=0)
		{
			strResult = "Ȧ��";
		}
		else if(n==0)
		{
			strResult = "��";
		}
		else if(n%2==0)
		{
			strResult = "¦��";
				
		}
		System.out.println(n + " �� " + strResult);

	}
}

//���� ���
/*
������ ���� �Է� : 0
0 �� ��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/