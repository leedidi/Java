import java.util.Scanner;

public class MMoneyChange 
{
	Scanner sc = new Scanner(System.in);
	Change ch = new Change();
	ManagerMode mm = new ManagerMode();

	int[] money = new int[5];
	int[] bills = {10000, 5000, 1000, 500, 100};
	int[] changenum = new int[5];
	int[] changemoney = new int[5];		//������ �ִ� �� �ƴϰ� �߰��� ���簡������
	

	//���� ������ ��Ȳ
	public void rightNowChange()
	{
		ch.cInitial();	//���⵵ ��� �ʱ�ȭ�� �Ǵ°� is.firstSet()�̶� ���� �����ϰͰ��ƿ�,,,,,,�ڡڡڡڡڡڡڡڡ�
		System.out.println("===========���� ���� ��Ȳ===============");
		for (int i = 0; i<5 ;i++ )
			System.out.printf("%5d�� : %3d��\n",bills[i],ch.money[i]);
		System.out.println("========================================");
	}


	//������ ���� �Է�(�ִ�100��)
	public void changeInput()
	{
		for (int i = 0;i<5 ;i++ )
		{
			System.out.printf("%d���� ä���ּ���.(�����Է�) : ",bills[i]);
			changenum[i] = sc.nextInt();
			money[i] = changenum[i];
		}System.out.println();

		realChange();
	}

	// ��¥ �������� ����� �޼ҵ�
	public void realChange()
	{
		System.out.println("������ �����Ͻø� [������ ���]�� �Ѿ�ϴ�. ");
		System.out.print("������ �����Ͻðڽ��ϱ�? (Y/N) : ");
		String real = sc.next();
		System.out.println();
		if (real.equals("y")|| real.equals("Y"))
			changeOutput();
		else
			changeInput();
	}


	// �ٲ�� Ȯ���ϴ� �޼ҵ�2
	public void changeOutput()
	{
		System.out.println("===========���� ���� ��Ȳ===============");
		for (int i = 0; i<5 ;i++ )
			System.out.printf("%5d�� : %3d��\n",bills[i],money[i]);
		System.out.println("========================================");

		//������ ���� �̵�...
		mm.mMenuPrint();

	}

	
	//��¥ ä���??
	//�ƴϸ�,,,�ٽ� ���� �Է�?
	//
	//��,,, ����..change����
	//cInitial() ���� ���� ����,,,,
}