/*===========================
   ���� �迭 ����
   - �迭�� �迭(2���� �迭)
 ============================*/
 
 // �迭�� �迭(������ �迭)�� Ȱ���Ͽ�
 // ������ ���� �����͸� ��ҷ� ���ϴ� �迭(5x5)�� �����ϰ�.
 // �� ����� ����ϴ� ���α׷��� �����Ѵ�.

 // ���� ��)
 /*
  E J O T Y			00 01 02 03 04
  D I N S X			10 11 12 13 14
  C H M R W			20 21 22 23 24
  B G L Q V			30 31 32 33 34
  A	F K P U			40 41 42 43 44..

����Ϸ��� �ƹ� Ű�� ��������...
*/
 // ~15�б��� Ǯ��
 // 15�к��� ��ȸ�ǽ�

/*
public class Test085
{
public static void main(String[] args)
	{

	int[][] arr = new int[5][5];
	int n = 65; 

		for (int i=0; i<5; i++)			
		{
			for (int j=0; j<5 ; j++)		
			{
				arr[4-j][i] = (char)n;  // 40 --> 65
				n++;			
			}
		}

	
	for (int i=0; i<arr.length; i++)
	{
		for (int j=0; j<arr[i].length; j++)
			System.out.printf("%3c", arr[i][j]);
		System.out.println();
	}

	}
}
*/

public class Test085
{
public static void main(String[] args)
	{
		// �迭�� �迭 ���� �� �޸� �Ҵ�
		char[][] arr = new char[5][5];

		// �迭�� �迭 ��� ����
		char c ='A';
		for (int i=0; i<5; i++)			// ��~ i �� 0 1 2 3 4
		{
			for (int j=4; j>=0; j--)	// ��~ j �� 4 3 2 1 0
				arr[j][i] = c++;

		}
		// �迭�� �迭 ��ü ��� ���
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3c",arr[i][j]);
			System.out.println();
		}


	}
}

/*
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


*/

/*
  E  J  O  T  Y
  D  I  N  S  X
  C  H  M  R  W
  B  G  L  Q  V
  A  F  K  P  U
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/