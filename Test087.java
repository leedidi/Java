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
  A B C D E  
  F G H I J 
  K L M N O 
  P Q R S T
  U V W X Y 
����Ϸ��� �ƹ� Ű�� ��������...
*/

 /* // ����...
  A B C D E  00 01 02 03 04
  F G H I J  10 11 12 13 14
  K L M N O  20 
  P Q R S T  30
  U V W X Y  40
����Ϸ��� �ƹ� Ű�� ��������...
*/

public class Test087
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
			 c++;
			}
		}

		// �迭�� �迭 ��ü ��� ���
		for (int i=0; i<arr.length; i++)
		{
			for (int j=0; j<arr[i].length; j++)
				System.out.printf("%3c", arr[i][j]); //* '%c' �ƴϰ� "%c"
			System.out.println();
		}

	}
}

// ���� ���
/*
  A  B  C  D  E
  F  G  H  I  J
  K  L  M  N  O
  P  Q  R  S  T
  U  V  W  X  Y
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/