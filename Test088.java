/*===========================
   ���� �迭 ����
   - �迭�� �迭(2���� �迭)
 ============================*/

 // �� ����
 // �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
 // ������ ���� �����͸� ��ҷ� ���ϴ� �迭(5x5)�� �����ϰ�.
 // �� ����� ����ϴ� ���α׷��� �����Ѵ�.

  // ���� ��)
 /*
  A				
  B	C			
  D E F			
  G H I K      
  K L M N O
����Ϸ��� �ƹ� Ű�� ��������...
*/

//@ �⺻ �迭 ����
/*
public class Test088
{	
	public static void main(String[] args)
	{	
		// �迭�� �迭 ���� �� �޸� �Ҵ�
		char[][] arr = new char[5][5];

		// �迭�� �迭 ��� ����
		char c= 'A';

		for (int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{
				arr[i][j] = c;
			}
		}

		// �迭�� �迭 ��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3c", arr[i][j]);
			System.out.println();
		}

	}
}
*/

public class Test088
{	
	public static void main(String[] args)
	{	
		// �迭�� �迭 ���� �� �޸� �Ҵ�
		char[][] arr = new char[5][5];

		// �迭�� �迭 ��� ����
		char c= 'A';

		 /*
		  A				00
		  B	C			10 11
		  D E F			21 22 23
		  G H I K      
		  K L M N O
		����Ϸ��� �ƹ� Ű�� ��������...
		*/

		for (int i=0; i<5; i++)
		{
			for (int j=0; j<5; j++)
			{	
				if(i>=j)
				{
				arr[i][j] = c;
				c++;
				}
			}
		}

		// �迭�� �迭 ��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3c", arr[i][j]);
			System.out.println();
		}

	}
}

// ���� ���

/*
  A
  B  C
  D  E  F
  G  H  I  J
  K  L  M  N  O
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/