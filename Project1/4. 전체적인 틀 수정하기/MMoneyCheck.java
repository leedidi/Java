import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MMoneyCheck // ���� Ȯ�� Ŭ����
{
	private static Scanner sc;
	private static ManagerMode mm;

	static
	{
		sc = new Scanner(System.in);

		mm = new ManagerMode();
	}

		//�ءءءءءءءءء� �߰�4: MMoneyCheck.mMoneyPrint() - ��� ��� ����ϰ� ���� �ؾ���..... + �׸� ��� �ϴ� �̵���...

/*
	public void mMoneyPrint()
	{
		System.out.println("\n    [���� Ȯ��]");
		
		System.out.println("-----------------------");
		System.out.println("    [��ä]");
		System.out.println();
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
*/

 // �߰�4: MMoneyCheck.mMoneyPrint() - ��� ��� + �ڽ� ���� (�Ϸ��)
 	public void mMoneyPrint()
	{
		System.out.println("\n    [���� Ȯ��]");
		
		// �� �κ����� �̿��ϸ� �˸°� �ɵ�! 
		
		//System.out.println("������������������������������������������������������������������������������������");
		//System.out.println("��		                         ��");
		//System.out.println("��               [��ä]                   ��");
		//System.out.println("��		                         ��");
		//System.out.println("��      --------------------------        ��");
		
		//*** �������� �ȵǼ� �ٸ� Ŭ�������� �����غþ ���⼱ ���� ����Ȯ�� ���غôµ�
		// �Ƹ��� �ڽ���� ���� �ɰſ���!!
		

		System.out.println("������������������������������������������������������������������������������������");
		System.out.println("��		                         ��");
		System.out.println("��               [��ä]                   ��");
		System.out.println("��		                         ��");
		
		for (int n=0; n<ISetup.v.size(); n++)
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(i).cate == 1)
				// System.out.printf("%2d %5s, %3d��\n", n+1, ISetup.v.get(n).name, �� �Ǹ� ����, �� �Ǹ� �ݾ�);
				System.out.printf("��%2d. %-10s	" + ": " + "%3d�� / %d����\n", n+1, ISetup.v.get(n).name, �� �Ǹ� ����, �� �Ǹ� �ݾ�);
		}
		
		System.out.println("��		                         ��");
		System.out.println("��      --------------------------        ��");
		System.out.println("��		                         ��");
		System.out.println("��               [����]                   ��");
		System.out.println("��		                         ��");
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(i).cate == 2)
				System.out.printf("��%2d. %-10s	" + ": " + "%3d�� / %d����\n", n+1, ISetup.v.get(n).name, �� �Ǹ� ����, �� �Ǹ� �ݾ�);
		}
		
		System.out.println("��		                         ��");
		System.out.println("��      --------------------------        ��");
		System.out.println("��		                         ��");
		System.out.println("��               [�ҽ�]                   ��");
		System.out.println("��		                         ��");
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(i).cate == 3)
				System.out.printf("��%2d. %-10s	" + ": " + "%3d�� / %d����\n", n+1, ISetup.v.get(n).name, �� �Ǹ� ����, �� �Ǹ� �ݾ�);
		}

		System.out.println("��		                         ��");
		System.out.println("��      --------------------------        ��");
		System.out.println("��		                         ��");
		System.out.println("��               [����]                   ��");
		System.out.println("��		                         ��");
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(i).cate == 4)
				System.out.printf("��%2d. %-10s	" + ": " + "%3d�� / %d����\n", n+1, ISetup.v.get(n).name, �� �Ǹ� ����, �� �Ǹ� �ݾ�);
		}
		// �� �Ǹ� ����, �� �Ǹ� �ݾ� ��ƿ� �� �߰�
		System.out.println("������������������������������������������������������������������������������������");
		

		// 2. �� ���� ���
		System.out.printf("�� �� ���� : %d\n", �� �Ǹ� �ݾ� �հ�); // ���� (��Ằ �� �Ǹ� �ݾ�) �� �հ� ���

	}//end mMoneyPrint()

	public void mMoneyCal()	//�� ���Աݾ� Ȯ�� �� ��� 
	{
				
		//�� ���� �ݾ�
		
		//pay���� �ߺҷ�����~!!!!!!!!!!!!!!!!!!!!!!!!

		System.out.println("�� �� ���� �ݾ� : "+ ������ + " �� �Դϴ�.");

		// ����ϱ�
		System.out.println("����� ���� Ȯ�� �� [������ ���]�� ���ư��ϴ�.��");
		System.out.println("�ڰ��! �ǵ��� �� �����ϴ�.��");
		System.out.println("  ��� �Ͻðڽ��ϱ�? (Y/N) : ");
		String real = sc.next().toUpperCase();

		if (real.equals("Y"))				// UpperClass �� �ϱ�
		{
			System.out.println(sum + "���� ��� �Ǿ����ϴ�.");
			sum = 0;
		
		}

		mm.mMenuPrint(); //��ݿ��� ������� �����ڸ���...
		//������ �����Դϴ�.....�����մϴ�,,,

	}//end mMoneyCal()

}// end class MMoneyCheck