
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ManagerMode 
{
	private static BufferedReader br;
	private static Integer sel;				//-- ���� ��

	static
	{
		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));
	}
	
	// �ڡڡڿϼ��ڡڡ�
	public void mMenuPrint() // �޴� ��� �޼ҵ�
	{
		System.out.println();
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.println("��                                         ��");
		System.out.println("��       [�޴� ���] (�����޴� : -1)       ��");
		System.out.println("��                                         ��");
		System.out.println("��            1. ��û���� Ȯ��             ��");
		System.out.println("��            2. ��� ����                 ��");
		System.out.println("��            3. �ݰ� ����                 ��");
		System.out.println("��            4. ��� ����                 ��");
		System.out.println("��                                         ��");
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.println();
	}// end mMenuPrint()


	// �ڡڡڿϼ��ڡڡ�
	public void mMenuSelect() throws IOException// �޴� ���� �޼ҵ�
	{
		// 1~4 �ܿ� �ٸ� ���� ������ �ݺ�
		do
		{
			System.out.print(">> �޴� ����(1~4) : ");
			Password.sel = Integer.parseInt(br.readLine());
		}
		while (Password.sel<1 || Password.sel>4);
		
	}// end mMenuSelect()


	// �١١ٹ̿ϼ��١١� (�ݰ������� �־����)
	public void mMenuRun() throws IOException // �޴� ȣ�� �޼ҵ�
	{
		// Password �ν��Ͻ� ����
		Password pw = new Password();

		// �Է¹��� ���� ���� ����
		switch (Password.sel)
		{
			case Menus.E_ONE : mNote(); break;		// ��û���� Ȯ������
			case Menus.E_TWO : mStorage(); break;	// ��� ������
			case Menus.E_THREE : ; break;			// �ݰ� ������
			case Menus.E_FOUR :						// pw��� ��������
			{
				pw.modePrint();
				pw.modeSelect();
				pw.modeRun();
			}
			break;
		}
	}// end mMenuRun()


	// �ڡڡڿϼ��ڡڡ�
	public void mNote() throws IOException // ��û���� Ȯ�� �޼ҵ�
	{
		System.out.println(ISetup.sbNote);

		mMenuRun();

	}// end mNote()
	

	//�ءءءءءءءءء� �߰�2: ManagerMode.mStorageSelect() - �ڽ� �߰� (�Ϸ��)
	// �ڡڡڿϼ��ڡڡ� 
	public void mStorageSelect()
	{	
		System.out.println();
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.println("��                                         ��");
		System.out.println("��       [�޴� ���] (�����޴� : -1)       ��");
		System.out.println("��                                         ��");
		System.out.println("��            1. ��� �߰�/����            ��");
		System.out.println("��            2. ǰ�� �߰�/����            ��");
		System.out.println("��                                         ��");
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.println();

	}// end mStorageSelect()


	// �ڡڡڿϼ��ڡڡ�
	public void mStorage() throws IOException // ��� ���� �޼ҵ�
	{
		// Storagechange �ν��Ͻ� ����
		MStorage stc = new MStorage();

		MStorageNew msn = new MStorageNew();

		mStorageSelect();

		// 1~2 �ܿ� �ٸ� ���� ������ �ݺ�
		do
		{
			System.out.print(">> �޴� ����(1~2) : ");

			Password.sel = Integer.parseInt(br.readLine());
		}
		while (Password.sel<1 || Password.sel>2);
		

		// �Է¹��� ���� ���� ����
		switch (Password.sel)
		{
			case Menus.E_ONE :				// ��� �߰� / ������
			{
				mStock();

				stc.mStorageChange();
			} break;
			case Menus.E_TWO : 
			{
				mStock();

				msn.mAddRemove();
			} break;		// ǰ�� �߰� / ������
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); break;
		}

	}// end mStorage()

	
	//�ءءءءءءءءء� �߰�3: ManagerMode.mStock() - ��� ��� ����ϰ� ���� �Ϸ�! + �׸� ��� �Ϸ� (�Ϸ��)
	// �ڡڡڿϼ��ڡڡ�
	public void mStock()
	{
		System.out.println("\n          [��� ����]");
		System.out.println();
		System.out.println("     �߰��������� ��� ����");
		
		System.out.println("��������������������������������������������������������������");
		System.out.println("��		              ��");
		System.out.println("��          [��ä]             ��");
		System.out.println("��		              ��");
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(n).cate == 1)
				System.out.printf("��%2d. %-10s	" + ":" + "%3d����\n", n+1, ISetup.v.get(n).name, ISetup.v.get(n).num);

				// �׽�Ʈ��(MMoneyCheck)
				//System.out.printf("��%2d. %-10s	" + ": " + "%3d�� / %d����\n", n+1, ISetup.v.get(n).name, 100, 20000);
		}
		System.out.println("��		              ��");
		System.out.println("��   -----------------------   ��");
		System.out.println("��		              ��");
		System.out.println("��          [����]             ��");
		System.out.println("��		              ��");
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(n).cate == 2)
				System.out.printf("��%2d. %-10s	" + ":" + "%3d����\n", n+1, ISetup.v.get(n).name, ISetup.v.get(n).num);
		}
		System.out.println("��		              ��");
		System.out.println("��   -----------------------   ��");
		System.out.println("��		              ��");
		System.out.println("��          [�ҽ�]             ��");
		System.out.println("��		              ��");
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(n).cate == 3)
				System.out.printf("��%2d. %-10s	" + ":" + "%3d����\n", n+1, ISetup.v.get(n).name, ISetup.v.get(n).num);
		}
		System.out.println("��		              ��");

		System.out.println("��   -----------------------   ��");
		System.out.println("��		              ��");
		System.out.println("��          [����]             ��");
		System.out.println("��		              ��");;
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(n).cate == 4)
				System.out.printf("��%2d. %-10s	" + ":" + "%3d����\n", n+1, ISetup.v.get(n).name, ISetup.v.get(n).num);
		}
		System.out.println("��������������������������������������������������������������");
		
	}// end mStock()


}// end class