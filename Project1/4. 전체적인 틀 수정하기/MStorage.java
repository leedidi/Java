
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MStorage
{
	int foodNum;		// ��� ��ȣ ����
	int su;				// ��� ����(����) ����
	static int bowl=0;	// ��� ����

	private static BufferedReader br;

	static
	{
		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));
	}


	// ��� �߰�/���� �Է� �޼ҵ�
	public void mStorageChange() throws IOException
	{	
		while(true)
		{
			System.out.print("��Ḧ �߰��Ͻ÷��� (+), �����Ͻ÷��� (-) : "); // ��Ḧ �߰��Ϸ��� (+), �����Ϸ��� (-) �Է�
			
			Password.op = br.readLine();
			
			if(Password.op.equals("+") || Password.op.equals("-"))	// ���� : (+), (-) �ùٸ��� �Է� ��
				break;		// ������ �Է�ĭ ���

			System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n");	// ������ �ùٸ��� �ʰ� �Է� �� �޼��� ǥ�� �� �ٽ� �Է¹���	
		}

		mStorageFoodSelect();
		
	}// end mStorageChange()


	// ��� �޴� ���� �޼ҵ�
	public void mStorageFoodSelect() throws IOException
	{
		int vegNum=0;
		int mainNum=0;
		int sourceNum=0;
		int topNum=0;

		for (int i=0; i<ISetup.v.size(); i++)
		{
			if (ISetup.v.get(i).cate == 1)
				vegNum++;

			else if (ISetup.v.get(i).cate == 2)
				mainNum++;

			else if (ISetup.v.get(i).cate == 3)
				sourceNum++;

			else if (ISetup.v.get(i).cate == 4)
				topNum++;
		}

		while (true)
		{	
			System.out.print("�� ��� ��ȣ : "); // ��� ��ȣ �Է�
			foodNum = Integer.parseInt(br.readLine())-1;
			
			if (ISetup.v.get(foodNum).cate==Menus.E_ONE)
			{
				//����: [1. ��ä/ (1���� ��ä�� ������ ��� ��ȣ) ���� �Է½�] 
				if(foodNum<vegNum && foodNum>=0)
					break;  // ��� �Է�ĭ ���
			}
			else if (ISetup.v.get(foodNum).cate==Menus.E_TWO)
			{
				//����: [2. ����/ (1���� ������ ������ ��� ��ȣ) ���� �Է½�] 
				if(foodNum<mainNum && foodNum>=0)
					break;  // ��� �Է�ĭ ���
			}
			else if (ISetup.v.get(foodNum).cate==Menus.E_THREE)
			{
				//����: [3. �ҽ�/ (1���� �ҽ��� ������ ��� ��ȣ) ���� �Է½�]
				if(foodNum<sourceNum && foodNum>=0)
					break;  // ��� �Է�ĭ ���
			}
			else if (ISetup.v.get(foodNum).cate==Menus.E_FOUR)
			{
				//����: [4. ����/ (1���� �ҽ��� ������ ��� ��ȣ) ���� �Է½�]
				if(foodNum<topNum && foodNum>=0) 
					break;  // ��� �Է�ĭ ���
			}

			System.out.println("�߸� �Է��ϼ̽��ϴ�.");	// �� ī�װ��� ��� ��ȣ �߸� �Է½� �޼��� ǥ�� �� �ٽ� �Է¹���	

		}

		mStorageFoodNum();

	}// end mStorageFoodSelect()


	// ��� �޴� ���� ���� �޼ҵ�
	public void mStorageFoodNum() throws IOException
	{
		while (true)
		{
			System.out.print("�� ��� ���� : "); // ��� �߰�/ ������ ���� �Է�
			su = Integer.parseInt(br.readLine());
			
			// ��� �߰��� : �� ��� ����(���� ���+�߰� �Է� ���) 50�� ���Ϸ� �Է�
			// ��� ������ : �ش� ����� ���� ���� �̻� �Է��� �� ������ ��
			if (Password.op.equals("+"))
			{
				if(su + ISetup.v.get(foodNum).num<=30) // [�� ���� �� ��� ���� 50�� ������ ��]
					break;  // ��� ��ȣ �Է�ĭ ���

				System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n"); // �ùٸ��� �ʰ� �Է� �� �޼��� ǥ�� �� �ٽ� �Է¹���	
			}

			else
			{
				if(su<=ISetup.v.get(foodNum).num) //����: [���� ���� ���Ϸ� �Է½�] 
					break;  // ��� ���� �Է�ĭ ���

				System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n"); // �ùٸ��� �ʰ� �Է� �� �޼��� ǥ�� �� �ٽ� �Է¹���
			}

		}

		mStorageRun();

	}// end mStorageFoodNum()

	
	public void mStorageRun() throws IOException // ��� �߰�/���� ���� �޼ҵ�
	{
		if (Password.op.equals("+")) // �����ڰ� (-) �Է½�
		{
			System.out.print("\n��� �����Ͻðڽ��ϱ�? (Y/N) : "); // ��� �����Ͻðڽ��ϱ�? �޼��� ���
			Password.con = br.readLine().toUpperCase();

			if(Password.con.equals("Y")) // �����ڰ� Y �Է��� ���
			{
				ISetup.v.get(foodNum).num += su;

				System.out.println("\n<<��ᰡ �߰��Ǿ����ϴ�.>>\n");
			}
			else
			{
				System.out.println("��ҵǾ����ϴ�.");	// ��� ������ �������� ���� ���, ��� �޽��� ���
			}
		}
		else
		{
			System.out.print("\n��� �����Ͻðڽ��ϱ�? (Y/N) : "); // ��� �߰��Ͻðڽ��ϱ�? �޼��� ���
			Password.con = br.readLine().toUpperCase();

			if(Password.con.equals("Y")) // �����ڰ� Y �Է��� ���
			{
				ISetup.v.get(foodNum).num -= su;

				System.out.println("\n<<��ᰡ �����Ǿ����ϴ�.>>\n");
			}
			else
			{
				System.out.println("��ҵǾ����ϴ�."); // ��� ������ �߰����� ���� ���, ��� �޽��� ���
			}
		}

		mStorageReturn();

	}// end mStorageRun()

	
	public void mBowlChange() throws IOException
	{
		int bowlChangeNum;

		while (true)
		{
			System.out.println();
			System.out.print("��⸦ � �߰��ϱ�ڽ��ϱ�? : ");
		
			bowlChangeNum = Integer.parseInt(br.readLine());

			if (bowl+bowlChangeNum <= 30)
			{
				bowl = bowl+bowlChangeNum;
				break;
			}
			else
			{
				System.out.println("�Է¿� ������ �ֽ��ϴ�");
			}
		}

		mStorageReturn();
		
	}

	public void mStorageReturn() throws IOException
	{
		// Password �ν��Ͻ� ����
		Password pw = new Password();

		System.out.print("�߰��� �۾��� �����Ͻðڽ��ϱ�? (Y/N) : ");

		Password.con = br.readLine().toUpperCase();

		// 'Y' �Է½� �߰� ����
		if(Password.con.equals("Y"))
		{
			mStorageChange();
		}
		// �ٸ��� �Է½� ó�� ȭ������
		else
		{
			pw.modeRun();
		}

	}// end mStorageReturn()



}// end class Storagechange