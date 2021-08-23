
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MStorage
{
	String oper;		// +/- �Է� ����
	int ctSelect;		// ī�װ� ���� ����
	int foodNum;		// ��� ��ȣ ����
	int su;				// ��� ����(����) ����
	static int bowl=0;	// ��� ����

	private static BufferedReader br;

	private static ISetup is;

	static
	{
		// BufferedReader �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));

		// ISetup �ν��Ͻ� ����
		is = new ISetup();
	}


	public void mStorageChange() throws IOException // ��� �߰�/���� �Է� �޼ҵ�
	{	
		is.firstSet();

		while(true) 
		{
			System.out.print("��Ḧ �߰��Ͻ÷��� (+), �����Ͻ÷��� (-) : "); // ��Ḧ �߰��Ϸ��� (+), �����Ϸ��� (-) �Է�
			
			oper = br.readLine();
			
			if(oper.equals("+")||oper.equals("-"))	// ���� : (+), (-) �ùٸ��� �Է� ��
			{
				break;		// ������ �Է�ĭ ���
			}
			System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n");	// ������ �ùٸ��� �ʰ� �Է� �� �޼��� ǥ�� �� �ٽ� �Է¹���	
		}

		mStorageCategory();
		
	}// end mStorageChange()


	public void mStorageCategory() throws IOException
	{
		while (true)
		{
			System.out.print("ī�װ��� ������(1:��ä, 2:����, 3:�ҽ�, 4:����, 5:���) : ");	// ��� ī�װ�[1-4] �Է�
			ctSelect = Integer.parseInt(br.readLine());
			
			if(ctSelect>0 && ctSelect<Menus.E_FIVE) //����: ��� ī�װ�[1-4] �ùٸ��� �Է� ��
			{
				break;  // ī�װ� �Է�ĭ ���
			}

			else if (ctSelect==Menus.E_FIVE)
			{
				mBowlChange();
			}
			System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n");	// ī�װ� �ùٸ��� �ʰ� �Է� �� �޼��� ǥ�� �� �ٽ� �Է¹���	
		}

		mStorageFoodSelect();

	}// end mStorageCategory()


	public void mStorageFoodSelect() throws IOException
	{
		while (true)
		{	
			System.out.print("��� ��ȣ : "); // ��� ��ȣ �Է�
			foodNum = Integer.parseInt(br.readLine())-1;
			
			if (ctSelect==Menus.E_ONE)	
			{
				if(foodNum<is.vVeg.size() && foodNum>=0) //����: [1. ��ä/ (1���� ��ä�� ������ ��� ��ȣ) ���� �Է½�] 
				{
					break;  // ��� �Է�ĭ ���
				}
			}
			else if (ctSelect==Menus.E_TWO)
			{
				if(foodNum<is.vMain.size() && foodNum>=0) //����: [2. ����/ (1���� ������ ������ ��� ��ȣ) ���� �Է½�] 
				{
					break;  // ��� �Է�ĭ ���
				}
			}
			else if (ctSelect==Menus.E_THREE)
			{
				if(foodNum<is.vSource.size() && foodNum>=0) //����: [3. �ҽ�/ (1���� �ҽ��� ������ ��� ��ȣ) ���� �Է½�]
				{
					break;  // ��� �Է�ĭ ���
				}
			}
			else if (ctSelect==Menus.E_FOUR)
			{
				if(foodNum<is.vTop.size() && foodNum>=0) //����: [4. ����/ (1���� �ҽ��� ������ ��� ��ȣ) ���� �Է½�]
				{
					break;  // ��� �Է�ĭ ���
				}
			}

			System.out.println("�߸� �Է��ϼ̽��ϴ�.");	// �� ī�װ��� ��� ��ȣ �߸� �Է½� �޼��� ǥ�� �� �ٽ� �Է¹���	

		}

		mStorageFoodNum();

	}// end mStorageFoodSelect()


	public void mStorageFoodNum() throws IOException
	{
		while (true)
		{
			System.out.print("��� ���� : "); // ��� �߰�/ ������ ���� �Է�
			su = Integer.parseInt(br.readLine());
			
			// ��� �߰��� : �� ��� ����(���� ���+�߰� �Է� ���) 50�� ���Ϸ� �Է�
			// ��� ������ : �ش� ����� ���� ���� �̻� �Է��� �� ������ ��
			if (oper.equals("+"))
			{
				
				if (ctSelect==Menus.E_ONE)	
				{
					if((su+is.vVeg.get(foodNum).num)<=50) // [1. ��ä/ ����: �� ���� �� ��� ���� 50�� ������ ��]
					{
						break;  // ��� ��ȣ �Է�ĭ ���
					}
					System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n"); // �ùٸ��� �ʰ� �Է� �� �޼��� ǥ�� �� �ٽ� �Է¹���	
				}
				else if (ctSelect==Menus.E_TWO)
				{
					if((su+is.vMain.get(foodNum).num)<=50) // [2. ����/ ����: �� ���� �� ��� ���� 50�� ������ ��]
					{
						break;  // ��� ��ȣ �Է�ĭ ���
					}
					System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n"); 
				}
				else if (ctSelect==Menus.E_THREE)
				{
					if((su+is.vSource.get(foodNum).num)<=50) // [2. �ҽ�/ ����: �� ���� �� ��� ���� 50�� ������ ��]
					{
						break;  // ��� ��ȣ �Է�ĭ ���
					}
					System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n");
				}
			}

			else
				if (ctSelect==Menus.E_ONE)	
				{
					if(su<=is.vVeg.get(foodNum).num) //����: [1. ��ä/ (1���� �ش� ����� ���� ����)���� �Է½�] 
					{
						break;  // ��� ���� �Է�ĭ ���
					}
					System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n"); // �ùٸ��� �ʰ� �Է� �� �޼��� ǥ�� �� �ٽ� �Է¹���	
				}
				else if (ctSelect==Menus.E_TWO)
				{
					if(su<=is.vMain.get(foodNum).num) //����: [2. ����/ (1���� �ش� ����� ���� ����)���� �Է½�] 
					{
						break;  // ��� ���� �Է�ĭ ���
					}
					System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n"); 	
				}
				else if (ctSelect==Menus.E_THREE)
				{
					if(su<=is.vSource.get(foodNum).num) //����: [3. �ҽ�/ (1���� �ش� ����� ���� ����)���� �Է½�]
					{
						break;  // ��� ���� �Է�ĭ ���
					}
					System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n"); 	
				}

		}

		mStorageRun();


	}// end mStorageFoodNum()

	
	public void mStorageRun() throws IOException // ��� �߰�/���� ���� �޼ҵ�
	{
		if (oper.equals("-")) // �����ڰ� (-) �Է½�
		{
			System.out.println("\n��� �����Ͻðڽ��ϱ�? (Y/N)"); // ��� �����Ͻðڽ��ϱ�? �޼��� ���
			String yn = br.readLine();

			if(yn.equals("y")||yn.equals("Y")) // �����ڰ� Y, y �Է��� ���
			{

				switch (ctSelect)	// (�� ī�װ� 1,2,3 �Է½� �ش� ī�װ� + �� ��ȣ �Է½� �� ��ȣ)����� �������� �Է� ���� ����
				{
					case 1 : is.vVeg.get(foodNum).num = is.vVeg.get(foodNum).num - su; break;
					case 2 : is.vMain.get(foodNum).num = is.vMain.get(foodNum).num - su; break;
					case 3 : is.vSource.get(foodNum).num = is.vSource.get(foodNum).num - su; break;
					default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}

				if (ctSelect == Menus.E_ONE || ctSelect == Menus.E_TWO || ctSelect == Menus.E_THREE) // ��� ���� ������, ���� �޽��� ���
				{
					System.out.println("��ᰡ �����Ǿ����ϴ�.");
				}
				
			}
			else
			{
				System.out.println("��ҵǾ����ϴ�.");	// ��� ������ �������� ���� ���, ��� �޽��� ���
			}
		}
		else
		{
			System.out.print("\n��� �߰��Ͻðڽ��ϱ�? (Y/N) : "); // ��� �߰��Ͻðڽ��ϱ�? �޼��� ���
			String yn = br.readLine();

			if(yn.equals("y")||yn.equals("Y"))	// �����ڰ� Y, y �Է��� ���
			{

				switch (ctSelect) // �� ī�װ� 1,2,3 �Է½� �ش� ī�װ�, �� ��ȣ �Է½� �� ��ȣ�� ��� �������� ���� �߰�
				{
					case Menus.E_ONE : is.vVeg.get(foodNum).num = is.vVeg.get(foodNum).num + su; break;
					case Menus.E_TWO : is.vMain.get(foodNum).num = is.vMain.get(foodNum).num + su; break;
					case Menus.E_THREE : is.vSource.get(foodNum).num = is.vSource.get(foodNum).num + su; break;
					default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
				if (ctSelect == Menus.E_ONE || ctSelect == Menus.E_TWO || ctSelect == Menus.E_THREE) // ��� ���� �߰���, �߰� �޽��� ���
				{
					System.out.println("��ᰡ �߰��Ǿ����ϴ�.");
					System.out.println(is.vVeg.get(0).num);
					System.out.println(is.vMain.get(0).num);
				}
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

			if (bowl+bowlChangeNum <= 50)
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

		String yn = br.readLine();

		// 'y' �Է½� �߰� ����
		if(yn.equals("y")||yn.equals("Y"))
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