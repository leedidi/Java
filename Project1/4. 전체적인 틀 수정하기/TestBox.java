import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class TestBox 
{
	private static ManagerMode mm;
	static
	{
		sc = new Scanner(System.in);

		mm = new ManagerMode();
	}

	public void mMoneyPrint()
	{
		System.out.println("\n    [���� Ȯ��]");
		
		System.out.println("��������������������������������������������������������������");
		System.out.println("��		              ��");
		System.out.println("��          [��ä]             ��");
		System.out.println("��		              ��");
		for (int n=0; n<ISetup.v.size(); n++)
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(i).cate == 1)
				// System.out.printf("%2d %5s, %3d��\n", n+1, ISetup.v.get(n).name, �� �Ǹ� ����, �� �Ǹ� �ݾ�);
				System.out.printf("%2d. %-10s	" + ": " + "%3d�� / %d��\n", n+1, ISetup.v.get(n).name, �� �Ǹ� ����, �� �Ǹ� �ݾ�);
		}

		System.out.println("-----------------------");
		System.out.println("    [����]");
		System.out.println();
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(i).cate == 2)
				System.out.printf("%2d. %-10s	" + ": " + "%3d�� / %d��\n", n+1, ISetup.v.get(n).name, �� �Ǹ� ����, �� �Ǹ� �ݾ�);
		}

		System.out.println("-----------------------");
		System.out.println("    [�ҽ�]");
		System.out.println();
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(i).cate == 3)
				System.out.printf("%2d. %-10s	" + ": " + "%3d�� / %d��\n", n+1, ISetup.v.get(n).name, �� �Ǹ� ����, �� �Ǹ� �ݾ�);
		}

		System.out.println("-----------------------");
		System.out.println("    [����]");
		System.out.println();
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(i).cate == 4)
				System.out.printf("%2d. %-10s	" + ": " + "%3d�� / %d��\n", n+1, ISetup.v.get(n).name, �� �Ǹ� ����, �� �Ǹ� �ݾ�);
		}
		// �� �Ǹ� ����, �� �Ǹ� �ݾ� ��ƿ� �� �߰�
		

		// 2. �� ���� ���
		System.out.printf("�� ���� : %d\n", �� �Ǹ� �ݾ� �հ�); // ���� (��Ằ �� �Ǹ� �ݾ�) �� �հ� ���

	}//end mMoneyPrint()
}
