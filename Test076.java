/*=======================
   ���� �迭 ����
   - �迭�� ����� �ʱ�ȭ
   - �迭�� �⺻�� Ȱ��
 ========================*/

 // ��char�� �ڷ����� �迭�� �����
 // �� �迭�� �� �濡 ���ĺ� �빮�ڸ� ä���
 // ä���� �� �迭�� ��ü ��Ҹ� ����ϴ� ���α׷��� �����Ѵ�.
 // ��, ä��� ������ ����ϴ� ������ ���� �и��Ͽ� ó���Ѵ�.

 // ���� ��)
 // A B C D E F G ... W X Y Z
 // ����Ϸ��� �ƹ� Ű�� �������� ...

public class Test076
{
	public static void main(String[] args)
	{	
		
		// [���� �ۼ��� �ڵ�]
		/*
		char[] arr = new char[26];

		for(int i=65; i<=90; i++)
		{
			arr[i-65] = (char)i;
		}

		for(int i=65; i<=90; i++)
		{
			System.out.print(arr[i-65] + " ");
		}
		System.out.println();
		*/
		
		
		// [�Բ� �ۼ��� �ڵ�]

		// ���� ���ĺ� �빮�� �迭 ����

		// ��� ��
		/*
		char[] arr1;
		arr1 = new char[26];

		arr1[0] = 'A';
		arr1[1] = 'B';
		arr1[2] = 'C';
		   ��
		arr1[24] = 'X';
		arr1[24] = 'Y';
	    arr1[25] = 'Z';

		// ��� ��
		char[] arr2 = {'A', 'B', 'C', ... 'X', 'Y', 'Z'}
		*/

		// ��� ��
		char[] arr3 = new char[26];					
		for (int i=0, ch=65; i<arr3.length; i++, ch++) //@ �Ǿոǵ� � �־ ��� x, �߰����ǽĵ�! �߰����ǽ��� �������� ����ϰ� ������ true false ������!
													   //@ �ٵ� �ʹ����̳����� ������ �鿡���� ���� ����!
			arr3[i] = (char)ch; // (char)65;  (char)66;  (char)67; ... (char)90;
		
		// �迭 ��� ��ü ��� (@ ��� �� ����!)
		for (int i=0; i<arr3.length; i++)
			System.out.print(arr3[i] + " ");
		System.out.println();
	}
}

// ���� ���
/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/