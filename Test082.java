/*===========================
   ���� �迭 ����
   - �迭�� �迭(2���� �迭)
 ============================*/

 // �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
 // ������ ���� �����͸� ��ҷ� ���ϴ� �迭(5x5)�� �����ϰ�.
 // �� ����� ����ϴ� ���α׷��� �����Ѵ�.

 // ���� ��)
 /*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
����Ϸ��� �ƹ� Ű�� ��������...
*/

 /*
  n
 ��
  1  2  3  4  5		i=0 �� n�� 1���� ���� �� n=i+1
  2  3  4  5  6		i=1 �� n�� 2���� ���� �� n=i+1
  3  4  5  6  7		i=2 �� n�� 3���� ���� �� n=i+1
  4  5  6  7  8		i=3 �� n�� 4���� ���� �� n=i+1
  5  6  7  8  9		i=4 �� n�� 5���� ���� �� n=i+1
*/
 
 // [���� �ۼ��� �ڵ�]

/*public class Test082
{
	public static void main(String[] args)
	{	
		// �迭�� �迭 ���� + �޸� �Ҵ�
		int[][] arr = new int[5][5];
		int n=1;
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
					arr[i][j]= i+j+1;
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
			{
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}


	}
}
*/

 // [�Բ� �ۼ��� �ڵ�]

public class Test082
{
	public static void main(String[] args)
	{	
		// �迭�� �迭 ���� �� �޸� �Ҵ�
		int[][] arr = new int[5][5];

		int n; // n ���⼭ �ʱ�ȭ�ϸ� �ʱ�ȭ�Ұ�!!

		for (int i=0; i<arr.length; i++)
		{
			 n=i+1;

			for (int j=0; j<arr[i].length; j++)	//@ �̹����� �ٽ�! ��Ģ ã��
			{
			arr[i][j] = n;
			n++;
			}
		}

		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3d", arr[i][j]);
			System.out.println();
			
		}
		
	}
}


// ���� ���
/*
  1  2  3  4  5
  2  3  4  5  6
  3  4  5  6  7
  4  5  6  7  8
  5  6  7  8  9
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/