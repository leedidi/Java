
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Storagechange
{
	String oper;
	int ctSelect;
	int num;
	int su;

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
		
	}// end mStorageChange()


	public void mStorageCategory() throws IOException
	{
		while (true)
		{
			System.out.print("ī�װ��� ������(1:��ä, 2:����, 3:�ҽ�, 4:����) : ");	// ��� ī�װ�[1-4] �Է�
			ctSelect = Integer.parseInt(br.readLine());
			
			if(ctSelect>0 && ctSelect<5) //����: ��� ī�װ�[1-4] �ùٸ��� �Է� ��
			{
				break;  // ī�װ� �Է�ĭ ���
			}
			System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n");	// ī�װ� �ùٸ��� �ʰ� �Է� �� �޼��� ǥ�� �� �ٽ� �Է¹���	
		}
	}// end mStorageCategory()


	public void mStorageFoodSelect() throws IOException
	{
		while (true)
		{	
			System.out.print("��� ��ȣ : "); // ��� ��ȣ �Է�
			num = Integer.parseInt(br.readLine())-1;
			
			if (ctSelect==1)	
			{
				if(num<is.vVeg.size() && num>=0) //����: [1. ��ä/ (1 - ��ä�� ������ ��� ��ȣ) ���� �Է½�] 
				{
					break;  // ��� �Է�ĭ ���
				}
			}
			else if (ctSelect==2)
			{
				if(num<is.vMain.size() && num>=0) //����: [2. ����/ (1 - ������ ������ ��� ��ȣ) ���� �Է½�] 
				{
					break;  // ��� �Է�ĭ ���
				}
			}
			else if (ctSelect==3)
			{
				if(num<is.vSource.size() && num>=0) //����: [3. �ҽ�/ (1 - �ҽ��� ������ ��� ��ȣ) ���� �Է½�]
				{
					break;  // ��� �Է�ĭ ���
				}
			}

			System.out.println("�߸� �Է��ϼ̽��ϴ�.");	// �� ī�װ��� ��� ��ȣ �߸� �Է½� �޼��� ���

		}
	}// end mStorageFoodSelect()


	public void mStorageFoodNum() throws IOException
	{
		while (true)
		{
			System.out.print("��� ���� : "); // ��� �߰�/ ������ ���� �Է�
			su = Integer.parseInt(br.readLine());
			
			//�߰�
			/*
			if(su<50) // ����: 50�� ���Ϸ� �Է½�(*����)
			{
				break;  // ��� �Է�ĭ ���
			}
			System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n")
			*/


			// ��� �߰��� : 50�� ���Ϸ� �Է�
			// ��� ������ : �ش� ����� ���� ���� �̻� �Է½� ����(-)�� �� ������
			if (oper.equals("+"))
			{
				
				if (ctSelect==1)	
				{
					if((su+is.vVeg.get(num).num)<=50) // ����: 50�� ���Ϸ� �Է½�(*����)
					{
						break;  // ��� �Է�ĭ ���
					}
					System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n");
				}
				else if (ctSelect==2)
				{
					if((su+is.vMain.get(num).num)<=50) // ����: 50�� ���Ϸ� �Է½�(*����)
					{
						break;  // ��� �Է�ĭ ���
					}
					System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n");
				}
				else if (ctSelect==3)
				{
					if((su+is.vSource.get(num).num)<=50) // ����: 50�� ���Ϸ� �Է½�(*����)
					{
						break;  // ��� �Է�ĭ ���
					}
					System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n");
				}
			}

			else
				if (ctSelect==1)	
				{
					if(su<=is.vVeg.get(num).num) //����: [1. ��ä/ �ش� ����� ���� �ִ�������� �Է½�] 
					{
						break;  // ��� �Է�ĭ ���
					}
				}
				else if (ctSelect==2)
				{
					if(su<=is.vMain.get(num).num) //����: [2. ����/ �ش� ����� ���� �ִ�������� �Է½�] 
					{
						break;  // ��� �Է�ĭ ���
					}
				}
				else if (ctSelect==3)
				{
					if(su<=is.vSource.get(num).num) //����: [3. �ҽ�/  �ش� ����� ���� �ִ�������� �Է½�]
					{
						break;  // ��� �Է�ĭ ���
					}
				}

		}
	}// end mStorageFoodNum()

	
	public void mStorageRun() throws IOException // ��� �߰�/���� ���� �޼ҵ�
	{
		if (oper.equals("-")) // �����ڰ� (-) �Է½�
		{
			System.out.println("\n��� �����Ͻðڽ��ϱ�? (Y/N)"); // ��� �����Ͻðڽ��ϱ�? �޼��� ���
			String yn = br.readLine();

			if(yn.equals("y")||yn.equals("Y"))
			{
			
				switch (ctSelect)	// �� ī�װ� 1,2,3 �Է½� �ش� ī�װ�, �� ��ȣ �Է½� �� ��ȣ�� ��� �������� ���� ����
				{
					case 1 : is.vVeg.get(num).num = is.vVeg.get(num).num - su; break;
					case 2 : is.vMain.get(num).num = is.vMain.get(num).num - su; break;
					case 3 : is.vSource.get(num).num = is.vSource.get(num).num - su; break;
					default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}

				if (ctSelect == 1 || ctSelect == 2 || ctSelect == 3) // ��� ���� ������, ���� �޽��� ���
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
			System.out.println("\n��� �߰��Ͻðڽ��ϱ�? (Y/N)");
			String yn = br.readLine();

			if(yn.equals("y")||yn.equals("Y"))
			{

				switch (ctSelect) // �� ī�װ� 1,2,3 �Է½� �ش� ī�װ�, �� ��ȣ �Է½� �� ��ȣ�� ��� �������� ���� �߰�
				{
					case 1 : is.vVeg.get(num).num = is.vVeg.get(num).num + su; break;
					case 2 : is.vMain.get(num).num = is.vMain.get(num).num + su; break;
					case 3 : is.vSource.get(num).num = is.vSource.get(num).num + su; break;
					default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
				if (ctSelect == 1 || ctSelect == 2 || ctSelect == 3) // ��� ���� �߰���, ���� �޽��� ���
				{
					System.out.println("��ᰡ �߰��Ǿ����ϴ�.");
				}
			}
			else
			{
				System.out.println("��ҵǾ����ϴ�."); // ��� ������ �߰����� ���� ���, ��� �޽��� ���
			}
		}

	}// end mStorageRun()



}// end class Storagechange