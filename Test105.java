/*========================================
   ���� ����(Sort) �˰��� ����
   - ���� ���� ����(Bubble Sort)
 =========================================*/

/*
�� �տ��� Ȯ���� �� Selection Sort(Test103) �� Bubble Sort(Test104)�� ������ ����.
	(�� �ݺ��� Ƚ���� ����)
	������, ���� Bubble Sort �� ��� �������� ������ ����
    �Ϲ� Bubble Sort �� Selection Sort ���� ������ ���� �� �ִ�.

���� ������ : 61 15 20 22 30	
			  15 20 22 30 61	- 1ȸ�� (���� �߻� �� true) �� ���� ȸ�� ���� ��
			  15 20 22 30 61	- 2ȸ�� (���� �߻� �� false) �� ���� ȸ�� ���� ��

==> 1ȸ�� ����... 2ȸ�� ����... �� �غ��Ҵ���...
	2ȸ������ ����(�ڸ��ٲ�)�� ���� �Ͼ�� �ʾұ� ������
	���ʿ��� �߰� ����(�� �̻��� ȸ��)�� ���ǹ��� ������ �Ǵ��Ͽ�
	�������� �ʴ´�.
*/

// ���� ��)
// Source Data : 10 50 20 30 40
// Sorted Data : 10 20 30 40 50
// ����Ϸ��� �ƹ� Ű�� ��������...

public class Test105
{
	public static void main(String[] args)
	{
		int[] a = {10, 50, 20, 30, 40};

		//[���� �ۼ��� �ڵ�]
		//boolean flag = false;

		/*
		10 50 20 30 40          0   1
		== --
		10 20 50 30 40          1   2
		   == --
		10 20 30 50 40          2   3
		      == --
		10 20 30 40 50          3   4
		         == --
		-------------------------------------------------- 1ȸ�� �� ���� �߻�
		
		10 20 30 40 50          0   1
        == --
		10 20 30 40 50          1   2
           == --
		10 20 30 40 50          2   3
              == --
		-------------------------------------------------- 2ȸ�� �� ���� �߻����� ����
						��
						��
		-------------------------------------------------- 3ȸ�� �� ��
						��
	   --------------------------------------------------- 4ȸ�� �� ��
		*/

		// true / false
		
		/*
		// ���� �迭 ���
		System.out.print("Source data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
		
		int bun=0;

		// ���� ���� ����
		//-- ���� �߻����� ������ �������� ���� > if��..? �տ� return?
		for (int i=1; i<a.length; i++)
		{
			for (int j=0; j<a.length-i; j++)
			{	
				flag = false;

				if (a[j]>a[j+1])
				{	
					
					a[j] = a[j+1]^a[j];
					a[j+1] = a[j]^a[j+1];
					a[j] = a[j+1]^a[j];
					
					flag = true;
					//�׽�Ʈ
				}
			}
			bun++;

			if (flag == false) // ������ �߻����� ������...
			{
				break;
			}
			
		}
		System.out.println("�� Ƚ�� : " + bun);

		// ���� �迭 ���
		System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();

*/

		//[�Բ� �ۼ��� �ڵ�]
	
		System.out.print("Source Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
		
		boolean flag;
		int temp;
		int pass=0;

		// ���� Bubble Sort ����
		do
		{
			flag = false;
			pass++;
			
			for (int i=0; i<a.length-pass; i++)
			{	
				// �׽�Ʈ
				// System.out.println(i + "��");

				if (a[i]> a[i+1])  // 01  12  23  34
				{				   // 01  12  23
					// �ڸ� �ٲٱ� // 01  12
					temp = a[i];   // 01
					a[i] = a[i+1];
					a[i+1] = temp;

					flag = true;
					//-- �� �� ���̶� ����(�ڸ��ٲ�)�� �߻��ϰ� �Ǹ�
					//   flag ������ true �� ����~!!!
				}
			}

			// �׽�Ʈ
			// System.out.println("��~!!!");
			
		}
		while (flag);
		//-- flag ������ false ��� ����
		//   ȸ���� ���������� �߻��ϴ� ���� ������ �Ͼ�� ���� ����
		//   �� �̻��� �ݺ��� ������ ���ǹ��� ������ �Ǵ� ����~!!!

		System.out.print("Sorted Data : ");
		for (int n : a)
			System.out.print(n + " ");
		System.out.println();
	}
}

// ���� ���
/*
Source Data : 10 50 20 30 40
Sorted Data : 10 20 30 40 50
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/