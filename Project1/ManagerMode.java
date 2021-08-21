
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

		// ����� �Է°� �ʱ�ȭ
		sel = 1;
	}
	
	// �ڡڡڿϼ��ڡڡ�
	public void mMenuPrint() // �޴� ��� �޼ҵ�
	{
		System.out.println();
		System.out.println("---------------------------");
		System.out.println("|                         |");
		System.out.println("|       [�޴� ���]       |");
		System.out.println("|                         |");
		System.out.println("|   1. ��û���� Ȯ��      |");
		System.out.println("|   2. ��� ����          |");
		System.out.println("|   3. �ݰ� ����          |");
		System.out.println("|   4. ��� ����          |");
		System.out.println("|                         |");
		System.out.println("---------------------------");
		System.out.println();
	}


	// �ڡڡڿϼ��ڡڡ�
	public void mMenuSelect() throws IOException// �޴� ���� �޼ҵ�
	{
		// 1~4 �ܿ� �ٸ� ���� ������ �ݺ�
		do
		{
			System.out.print(">> �޴� ����(1~4) : ");
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>4);
		
	}


	// �ڡڡڿϼ��ڡڡ�
	public void mMenuRun() throws IOException // �޴� ȣ�� �޼ҵ�
	{
		// Password �ν��Ͻ� ����
		Password pw = new Password();

		// �Է¹��� ���� ���� ����
		switch (sel)
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
			default : System.out.println(">> �޴� ���� ����~!!!"); break;
		}
	}


	// �١١� ������ �١١�
	public void mNote() // ��û���� Ȯ�� �޼ҵ�
	{
		System.out.println("��û���� Ȯ�� �޼ҵ�");
	}


	public void mStorageSelect()
	{
		System.out.println();
		System.out.println("    [�޴� ���]");
		System.out.println();
		System.out.println("1. ��� �߰�/����");
		System.out.println("2. ǰ�� �߰�/����");
		System.out.println();
	}


	// �١١� ������ �١١� (ǰ�� �߰��� �����ͼ� ������ ��)
	public void mStorage() throws IOException // ��� ���� �޼ҵ�
	{
		// Storagechange �ν��Ͻ� ����
		Storagechange stc = new Storagechange();

		mStorageSelect();

		// 1~2 �ܿ� �ٸ� ���� ������ �ݺ�
		do
		{
			System.out.print(">> �޴� ����(1~2) : ");

			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>2);
		

		// �Է¹��� ���� ���� ����
		switch (sel)
		{
			case Menus.E_ONE :				// ��� �߰� / ������
			{
				mStock();

				stc.mStorageChange();

				stc.mStorageCategory();

				stc.mStorageFoodSelect();

				stc.mStorageFoodNum();

				stc.mStorageRun();
			}
			break;
			case Menus.E_TWO : ; break;		// ǰ�� �߰� / ������
			default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); break;
		}

	}


	// �ڡڡڿϼ��ڡڡ�
	public void mStock()
	{
		// ISetup �ν��Ͻ� ����
		ISetup is = new ISetup();

		// �ʱ� ��� ����
		is.firstSet();

		System.out.println("\n    [��� ����]");
		System.out.println();
		System.out.println("�߰��������� ��� ����");
		System.out.println("-----------------------");
		System.out.println("    [��ä]");
		System.out.println();
		
		// ��ä ��� �ݺ���
		for (int n=0; n<is.vVeg.size(); n++)
			System.out.printf("%2d %5s, %3d��\n", n+1, is.vVeg.get(n).name, is.vVeg.get(n).num);
		
		System.out.println("-----------------------");
		System.out.println("    [����]");
		System.out.println();

		// ���� ��� �ݺ���
		for (int n=0; n<is.vMain.size(); n++)
			System.out.printf("%2d %5s, %3d��\n", n+1, is.vMain.get(n).name, is.vMain.get(n).num);
		
		System.out.println("-----------------------");
		System.out.println("    [�ҽ���]");
		System.out.println();

		// �ҽ� ��� �ݺ���
		for (int n=0; n<is.vSource.size(); n++)
			System.out.printf("%2d %5s, %3d��\n", n+1, is.vSource.get(n).name, is.vSource.get(n).num);

		System.out.println("-----------------------");
		System.out.println("    [���η�]");
		System.out.println();
	}


}