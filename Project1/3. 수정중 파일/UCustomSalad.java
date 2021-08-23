import java.util.Vector;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


// Ŀ���� ������ Ŭ����
public class UCustomSalad
{	
	// ISetup �ν��Ͻ� ����
	ISetup is = new ISetup();
	Vector<Ingredient> temp = new Vector<Ingredient>();

	int sel;	// �޴� ���ù��� ����
	
	int uIngSelect;	// ��ǰ ��ȣ ���� ����
	int uNum;		// ��ǰ ���� ���� ����
	int uctSelect;	// ī�װ� ���� ����

	int resultKcal=0;	// �� Į�θ� ����
	int resultMoney=0;	// �� �ݾ� ����
	int vegMax=0, mainMax=0, sourceMax=0, topMax=0;	// ��ä, ����, �ҽ�, ���� ���� ����

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// �޴� ���� �޼ҵ� �ڿϼ���
	public void uCustomMenuSelect() throws IOException
	{
		System.out.println("\n    [�޴� ����]");
		System.out.println();
		System.out.println("1. ��� ����");
		System.out.println("2. ��� ���");
		System.out.println();

		do
		{
			System.out.print("������ ����� �����ϼ���. : "); 
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>2);
		

		switch (sel)
		{
			case Menus.E_ONE : 
				{
					uCustomSelectInput();
					uCustomSelectRun();
					uMoneyResult();
					uCustomReturn();
				} break;			// 1�϶�,  [1. ��� ����] ����.	
			case Menus.E_TWO : 
				{
					uCustomRemoveInput();
					uMoneyResult();
					uCustomRemoveRun();
					uCustomReturn();
				} break;			// 2�϶�,  [2. ��� ���] ����.
		}

	} //end uCustomMenuSelect()


	// Ŀ���� ������ ��� ���(ī�װ���) �ڿϼ���
	public void uCustomSaladStock(int cate)	// cate ������� ã��
	{
		// ��ǰ ��� �ʱ� ����
		is.firstSet();

		System.out.println("\n    [Ŀ���� ������ ���]");
		switch (cate)
		{
		case Menus.E_ONE :
			{
				System.out.println("    [��ä] (�ִ� 5ȸ)");
				System.out.println();

				// ��ä ��� �ݺ���
				for (int n=0; n<is.vVeg.size(); n++)
					System.out.printf("%2d. %5s\n", n+1, is.vVeg.get(n).name);	// ��ȣ. ��ǰ��
				System.out.println();

			} break;
		case Menus.E_TWO : 
			{
				System.out.println("    [����] (�ִ� 3ȸ)");
				System.out.println();

				// ���� ��� �ݺ���
				for (int n=0; n<is.vMain.size(); n++)
					System.out.printf("%2d. %5s\n", n+1, is.vMain.get(n).name);	// ��ȣ. ��ǰ��
				System.out.println();

			} break;
		case Menus.E_THREE :
			{
				System.out.println("    [�ҽ���] (�ִ� 1ȸ)");
				System.out.println();

				// �ҽ� ��� �ݺ���
				for (int n=0; n<is.vSource.size(); n++)
					System.out.printf("%2d. %5s\n", n+1, is.vSource.get(n).name);	// ��ȣ. ��ǰ��
				System.out.println();

			} break;
		case Menus.E_FOUR :
			{
				System.out.println("    [���η�] (�ִ� 3ȸ)");
				System.out.println();

				// ���� ��� �ݺ���
				for (int n=0; n<is.vTop.size(); n++)
					System.out.printf("%2d. %5s\n", n+1, is.vTop.get(n).name);	// ��ȣ. ��ǰ��
				System.out.println();
			}
		}// end switch
		
	}// end uCustomSaladStock


	// �߰��� ��� ��ȣ,���� �Է¹ޱ�
	public void uCustomSelectInput() throws IOException
	{	
		System.out.println("\n    [��� ����]");

		System.out.println("[��ȣ]  [��ǰ��]  [����]");
		
		for (int i=0; i<temp.size(); i++)
		{
			System.out.printf("%d.  %s, %d��\n", (i+1), temp.get(i).name, temp.get(i).num);
		} // end for

		System.out.println();
		System.out.printf("���� �ݾ�   : %d\n", resultMoney);
		// temp�� ��� ��ǰ�� �ݾ��� �Է¹��� ������� ���ؼ� ������ ����
		System.out.printf("���� Į�θ� : %d\n", resultKcal);
		// temp�� ��� ��ǰ�� Į�θ��� �Է¹��� ������� ���ؼ� ������ ����

		// ī�װ� ����
		System.out.print("�߰��� ����� ī�װ��� ������(1:��ä, 2:����, 3:�ҽ�, 4:����) : ");
		uctSelect = Integer.parseInt(br.readLine());

		// ī�װ��� �ش��ϴ� ��� ���
		uCustomSaladStock(uctSelect);

		// ī�װ� ������ �߰��� ��� ��ȣ ����
		// �Է¹�ȣ�� 1�̸� ���Ϳ����� 0�� ���õǵ���
		System.out.print("�߰��� ��� ��ȣ: " );
		uIngSelect = Integer.parseInt(br.readLine())-1;

		// �߰��� ��� ���� �Է�
		System.out.print("�߰��� ��� ����: " );
		uNum = Integer.parseInt(br.readLine());

/*
		// ��� 1�� ���ѷ� : ��ä �� 5��, ���� 3��, �ҽ� 1��, ���� 3��
		switch (uctSelect)
		{
		case 1:		// ��ä�� ���
			{
				vegMax += uNum;	// vegMax �� uNum(�Է��� ��� ����)��ŭ ���ϸ鼭
				if (vegMax>6)	// 5�� ����
				{
					vegMax -= uNum;
					System.out.println("��⿡ ���� �� �ִ� [��ä] ���ѷ��� �Ѿ����ϴ�.");
					System.out.println("([�޴� ����] â���� �ǵ��ư��ϴ�.)");
					uCustomMenuSelect();
				}
			} break;
		case 2:		// ������ ���
			{
				mainMax += uNum;	// mainMax �� uNum(�Է��� ��� ����)��ŭ ���ϸ鼭
				if (mainMax>4)		// 3�� ����
				{
					mainMax -= uNum;
					System.out.println("��⿡ ���� �� �ִ� [����] ���ѷ��� �Ѿ����ϴ�.");
					System.out.println("([�޴� ����] â���� �ǵ��ư��ϴ�.)");
					uCustomMenuSelect();
				}
			} break;
		case 3:		// �ҽ��� ���
			{
				sourceMax += uNum;	// sourceMax �� uNum(�Է��� ��� ����)��ŭ ���ϸ鼭
				if (sourceMax>2)	// 1�� ����
				{
					sourceMax -= uNum;
					System.out.println("��⿡ ���� �� �ִ� [�ҽ�] ���ѷ��� �Ѿ����ϴ�.");
					System.out.println("([�޴� ����] â���� �ǵ��ư��ϴ�.)");
					uCustomMenuSelect();
				}
			} break;
		case 4:		// ������ ���
			{
				topMax += uNum;	// topMax �� uNum(�Է��� ��� ����)��ŭ ���ϸ鼭
				if (topMax>4)		// 3�� ����
				{
					topMax -= uNum;
					System.out.println("��⿡ ���� �� �ִ� [����] ���ѷ��� �Ѿ����ϴ�.");
					System.out.println("([�޴� ����] â���� �ǵ��ư��ϴ�.)");
					uCustomMenuSelect();
				}
			} break;

		}// end switch
*/
	}// end uCustomSelectInput()
	

	public void uCustomSelectRun() throws IOException //��� �߰� ���� �޼ҵ�
	{
		switch (uctSelect)
		{
			case 1 :
			{
				vegMax += uNum;	// vegMax �� uNum(�Է��� ��� ����)��ŭ ���ϸ鼭
				if (vegMax>5)	// 5�� ����
				{
					vegMax -= uNum;
					System.out.println("��⿡ ���� �� �ִ� [��ä] ���ѷ��� �Ѿ����ϴ�.");
					System.out.println("([�޴� ����] â���� �ǵ��ư��ϴ�.)");
					uCustomMenuSelect();
				}

				// �Է¹��� (��ä)�� ���͸� ī�װ��� ��ٱ��� ���Ϳ� ����
				temp.add(is.vVeg.get(uIngSelect));

				temp.get(temp.size()-1).num = uNum;
			} break;
			case 2 :
			{
				mainMax += uNum;	// mainMax �� uNum(�Է��� ��� ����)��ŭ ���ϸ鼭
				if (mainMax>3)		// 3�� ����
				{
					mainMax -= uNum;
					System.out.println("��⿡ ���� �� �ִ� [����] ���ѷ��� �Ѿ����ϴ�.");
					System.out.println("([�޴� ����] â���� �ǵ��ư��ϴ�.)");
					uCustomMenuSelect();
				}

				temp.add(is.vMain.get(uIngSelect));

				temp.get(temp.size()-1).num = uNum;
			} break;
			case 3 :
			{
				sourceMax += uNum;	// sourceMax �� uNum(�Է��� ��� ����)��ŭ ���ϸ鼭
				if (sourceMax>1)	// 1�� ����
				{
					sourceMax -= uNum;
					System.out.println("��⿡ ���� �� �ִ� [�ҽ�] ���ѷ��� �Ѿ����ϴ�.");
					System.out.println("([�޴� ����] â���� �ǵ��ư��ϴ�.)");
					uCustomMenuSelect();
				}

				temp.add(is.vSource.get(uIngSelect));

				temp.get(temp.size()-1).num = uNum;
			} break;
			case 4 :
			{
				topMax += uNum;	// topMax �� uNum(�Է��� ��� ����)��ŭ ���ϸ鼭
				if (topMax>3)		// 3�� ����
				{
					topMax -= uNum;
					System.out.println("��⿡ ���� �� �ִ� [����] ���ѷ��� �Ѿ����ϴ�.");
					System.out.println("([�޴� ����] â���� �ǵ��ư��ϴ�.)");
					uCustomMenuSelect();
				}

				temp.add(is.vTop.get(uIngSelect));

				temp.get(temp.size()-1).num = uNum;
			} break;
		}
		System.out.println(temp.get(0).name);
		System.out.println(temp.get(0).num);
		System.out.println(temp.get(0).kcal);
		System.out.println(temp.get(0).money);
		System.out.println(resultMoney);
		System.out.println(resultKcal);
	}// end uCustomSelectRun()

	
	// ������ ��� ��ȣ,���� �Է¹ޱ�
	public void uCustomRemoveInput() throws IOException
	{
		System.out.println("\n    [��� ����]");  
		
		System.out.println("���õ� ���");
		System.out.println("[��ȣ]  [����]  [����]");

		// ���� ���õ� ��� ���
		for (int i=0; i<temp.size(); i++)
			System.out.printf("%d.  %5s  %4d��\n", (i+1), temp.get(i).name, temp.get(i).num);

		System.out.println();
		System.out.printf("���� �ݾ�   : %d\n", resultMoney);
		System.out.printf("���� Į�θ� : %d\n", resultKcal);

		do	// ��ٱ����� �������� ���� �Է��ϸ� �ٽ� �Է�
		{
			System.out.print("������ ��� ��ȣ: " );
			uIngSelect = Integer.parseInt(br.readLine())-1;

			System.out.print("������ ��� ����: " );
			uNum = Integer.parseInt(br.readLine());

			if (temp.get(uIngSelect).num < uNum)
			{
				System.out.println("��ٱ����� �������� ���� �Է��ϼ̽��ϴ�.");

			}
		}
		while (temp.get(uIngSelect).num < uNum);

	}// end uCustomRemoveInput()

	public void uCustomRemoveRun() // ��� ���� ���� �޼ҵ�
	{
		switch (uctSelect)
		{
			case 1: vegMax -= uNum; break;
			case 2:	mainMax -= uNum; break;
			case 3:	sourceMax -= uNum; break;
			case 4:	topMax -= uNum;	break;
		}// end switch

		// ���� ��ٱ��Ͽ� ��� �����̶� �Է� ������ �������
		// ��ٱ��� ��ǰ ��ü�� �����ϰ�
		// �׷��� ������� ������ ���δ�
		if (temp.get(uIngSelect).num == uNum)
		{
			temp.remove(uIngSelect);
		}
		else
		{
			temp.get(uIngSelect).num -= uNum;
		}

	}// end uCustomRemoveRun()


	// �� �ݾ� / Į�θ� ���� �޼ҵ�
	public void uMoneyResult()
	{
		if (sel == Menus.E_ONE)
		{
			// �� �ݾ�(Į�θ�)�� ��ٱ��� ���Ϳ��� ���� * �ݾ�(Į�θ�) ��ŭ ���ϱ�
			resultMoney += temp.get(temp.size()-1).num * temp.get(temp.size()-1).money;
			resultKcal += temp.get(temp.size()-1).num * temp.get(temp.size()-1).kcal;
		}
		else
		{
			// �� �ݾ�(Į�θ�)�� ������ ���� * ��ٱ��� ���Ϳ���  �ݾ�(Į�θ�) ��ŭ ����
			resultMoney -= uNum * temp.get(uIngSelect).money;
			resultKcal -= uNum * temp.get(uIngSelect).kcal;
		}
	}

/* Ȯ�� �� �ʿ������ �����
	public void uFinalCart() // ���ݱ��� ���� ��ǰ�� �����ִ� �޼ҵ�
	{
		// ���ݱ��� ���� ��ǰ�� ���
		for (int i=0; i<temp.size(); i++)
		{
			System.out.printf("��ǰ��, ���� : %s, %d\n", temp.get(i).name, temp.get(i).num);
		}

		// �� �ݾ�(Į�θ�) ���
		System.out.printf("�� �ݾ�   : %d\n", resultMoney);
		System.out.printf("�� Į�θ� : %d\n", resultKcal);

	}// end uFinalCart()
*/
	
	// ��� �߰�/�������� ���� �����
	public void uCustomReturn() throws IOException	// ���� ���� �����ؾ��ԡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
	{
		System.out.print("�߰��� �۾��� �����Ͻðڽ��ϱ�? (Y/N) : ");

		String yn = br.readLine();

		// 'y' �Է½� �߰� ����
		if(yn.equals("y")||yn.equals("Y"))
		{
			uCustomMenuSelect();
		}
	}

	public Vector<Ingredient> CustomRun() throws IOException
	{
		uCustomMenuSelect();

		return temp;
	}

}