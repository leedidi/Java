/*==========================================================
  ���� ���� �帧�� ��Ʈ��(���, ���ǹ��� �ݺ���) ����
  - �ݺ���(while��) �ǽ�
 ==========================================================*/

// ���� ��)
// 1 ���� 100 ���� ������ �� : 5050
// 1 ���� 100 ���� ¦���� �� : 2550
// 1 ���� 100 ���� Ȧ���� �� : 2500
// ����Ϸ��� �ƹ� Ű�� ��������...

/*
public class Test042
{
	public static void main(String[] args
	{
		// �ֿ� ���� ����
		int n = 1;
		int sum = 0;
		int even = 0;
		int odd = 0;

		// ���� �� ó��
		while (n<=100)
		{
			if(n)
			{
				sum += n;
			}
				else if(n%2 == 0)
			{
					even += n;
			}
				else if(n%2 != 0)
			{	
					odd += n;
			}
				else
				{
					System.out.println("�Ǻ� �Ұ� ������");
					return;
				}

				n++;
		}
		// ��� ���	
		System.out.println("1 ���� 100 ���� ������ �� : " + sum);
		System.out.println("1 ���� 100 ���� ¦���� �� : " + even);
		System.out.println("1 ���� 100 ���� Ȧ���� �� : " + odd);

	}
}
*/


// [���� �ۼ��� �ڵ�]

public class Test042
{
	public static void main(String[] args)
	{
		// �ֿ� ���� ����
		int n = 1, sum, even, odd;
		sum=even=odd=0; //@ �̷� ������ ����! sum�� even�� odd�� 0�̴�(X)
						//@ odd�� 0 ����, �� ���Ե� 0 odd�� even�� ����, �� ���Ե� 0 even�� sum�� ����

		// ���� �� ó��
		while(n<=100)
		{
			// ������ ó��
			sum += n;

			// ¦����/ Ȧ����ó��
			if (n%2==0)
			{
				even += n;
			}
			else if(n%2!=0)
			{
				odd += n;
			}
			else
			{
				System.out.println("�Ǻ� �Ұ� ������");
				return;
			}

			n++;
		}
			
		// ��� ���	
		System.out.println("1 ���� 100 ���� ������ �� : " + sum);
		System.out.println("1 ���� 100 ���� ¦���� �� : " + even);
		System.out.println("1 ���� 100 ���� Ȧ���� �� : " + odd);

		}
}

// ���� ���
/*
1 ���� 100 ���� ������ �� : 5050
1 ���� 100 ���� ¦���� �� : 2550
1 ���� 100 ���� Ȧ���� �� : 2500
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/