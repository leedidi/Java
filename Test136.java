/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - StringTokenizer Ŭ����
===========================================*/

/*
�� StringTokenizer Ŭ������
   ���ڿ� �Ľ�(parsing)�� ���� ������ �����ϴ� Ŭ������
   �Ľ�(parsing)�ϰ��� �ϴ� ���ڿ��� ���ڷ� �޾� �����ϴµ�,
   ���⿡�� �Ľ�(parsing)�̶� �ϳ��� ���ڿ��� ���� ���ڿ���
   ������ �۾��� �ǹ��ϰ� �Ǹ�, �� �� ������ ������ �Ǵ�
   ���ڿ��� ��ū(token)�̶�� �Ѵ�.

   StringTokenizer Ŭ������ ����ϱ� ���ؼ���
   java.util ��Ű���� StringTokenizer �� import �ؾ� �Ѵ�.
	
   //@ �ڿ�Ⱑ �߿�! ���������� ������~�ϴ� �������� ���Ǵ°� �ƴ�!
   //    ���ְ� ������ ���ָ� �������� �̰� ����ؼ� ���� �͵��� ����Ǿ����... �׷��� ���� ����
   //    �ǹ������� ������� �ʴ´ٰ� ���� ��! ��������� ���ư��� ��
   //    -> ��� ���� �Ǵ� Ŭ������! ��ġ��... �� �����ԵǴ� �÷��� �����ӿ�ũ(�ſ��߿�) �̰� �����ϴ� ��������
   //       ��Ʈ����ū�� ����Ǵ� ��İ� ������ ������� ����Ǵ� �ֵ��� ����. �̰� ���� ���ؼ� �ѹ� ���� �Ѿ�� ��
   StringTokenizer Ŭ������ ȣȯ���� �����ϴ� ��������
   ���� �����ǰ� ������ ���ڿ��� �Ľ�(parsing)�ϱ� ���ؼ���
   String Ŭ������ split() �޼ҵ峪 java.util.regex ��Ű����
   ����� ���� �����ϰ� �ִ�.


�� ������
  - ����
    StringTokenizer(String str)
	StringTokenizer(String str, String delim)
	StringTokenizer(String str, String delim, boolean returnDelims)
	�� �־��� ���ڿ� str �� �ܾ�� �и��ϴ� ��ü�� �����ϸ�
	   ����(����)���ڴ� delim �� ���Ե� ���ڷ� ó���ϰ� �ȴ�.
	   ���� returnDelims �� true ���
	   ���� ���ڵ� �и��� �����ͷ� ó���ϰ� �ȴ�.
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test136
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String[] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�Ľ��� ���ڿ� �Է�(�ĸ�����) : ");	// "���,����,�ٳ���,�丶��"
		strTemp = br.readLine();

		// StringTokenizer Ŭ���� �ν��Ͻ� ����
		StringTokenizer st = new StringTokenizer(strTemp, ",");
		//-- strTemp �� ��� ���ڿ���...
		//   ��,���� �����ڷ�...

		strArr = new String[st.countTokens()];		// st.countTokens() �� 4
		//-- int countTokens()
		//   : �Ľ̵� ���ڿ��� ������ ��ȯ(����)�Ѵ�.
		

		//st "���,����,�ٳ���,�丶��"
		// st.countTokens() �� 4
		n=0;
		while (st.hasMoreTokens()) // true/ false (������ ���� �ִ��� ������ true false ��ȯ!)
		{
			strArr[n++] = st.nextToken();
		}
		//-- ��hasMoreTokens()�� //@ ���� �����ϰ� ���� ���� ����! ������ �������õ� �� nextToken, ���� ��ġ�°ŵ� nextToken��..
		//    : ����� �� �ִ� ��ū�� �����ִ� ��� true �� ��ȯ.
		//      �� �̻� ����� ��ū�� �������� ���� ��� false �� ��ȯ.
		//      Ȯ�� ����� ��ȯ�� ��...
		//      ���� ������ �о���̴� ���(��)�� �̵���Ű�� �ʴ´�.

		//-- ��nextToken()��
		//    : ���� ��ū�� ���´�.
		//      ���� ��ū�� ������ ���(��)�� �̵���Ű�� �ȴ�.
		//      �����ڸ� �ٲپ��� ��� ���� ȣ�⿡��
		//      �ٲ� �����ڸ� �̿��Ͽ� ��ū�� �и��Ѵ�.

		System.out.print("�Ľ̵� ��ū(���ڿ�) : " );
		for (String str : strArr)
			System.out.print(str + " ");
		System.out.println();
		//--==>> �Ľ��� ���ڿ� �Է�(�ĸ�����) : �±�,����,��ȭ,����
		//		 �Ľ̵� ��ū(���ڿ�) : �±� ���� ��ȭ ����
		//		 ����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

	}
}