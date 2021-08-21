import java.util.Vector;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


// Ŀ���� ������ Ŭ����
// üũ���סڡڡڡڡڡڡڡڡڡ� �޴� ���� �޴��� ���� ��ȣ ���� �ٽ� �ϵ���
public class UCustomSalad
{	
	// ISetup �ν��Ͻ� ����
	ISetup is = new ISetup();

	int resultKcal=0;	// �� Į�θ� ����
	int resultMoney=0;	// �� �ݾ� ����
	int vegMax=0, mainMax=0, sourceMax=0, topMax=0;		// ��ä, ����, �ҽ�, ���� ���� ���� (????? üũ)

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// �޴� ���� �޼ҵ� �ڿϼ���
	public void uCustomMenuSelect() throws IOException
	{
		int sel;	// �޴� ���ù��� ����

		System.out.println("\n    [�޴� ����]");
		System.out.println();
		System.out.println("1. ��� ����");
		System.out.println("2. ��� ���");
		System.out.println("3. ��ǰ �ϼ�");
		System.out.println();

		System.out.print("������ ����� �����ϼ���. : "); 
		sel = Integer.parseInt(br.readLine());

		switch (sel)
		{
			case Menus.E_ONE : uCustomSelectInput(); break;	// 1�϶�,  [1. ��� ����] ����.	
			case Menus.E_TWO : System.out.println("����"); break;	// 2�϶�,  [2. ��� ���] ����.
			//case Menus.E_THREE : return xxx; break;				// 3�϶�,  [3. ��ǰ �ϼ�] ����.  �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ� �����ؾ���
		}
	} //end uCustomMenuSelect()


	// Ŀ���� ������ ��� ���(ī�װ���) �ڿϼ���
	public void uCustomSaladStock(int cate)	// cate ������� ã��
	{
		// ��ǰ ��� �ʱ� ����
		is.firstSet();
		is.testSet();

		System.out.println("\n    [Ŀ���� ������ ���]");
		switch (cate)
		{
		case Menus.E_ONE :
			{
				System.out.println("    [��ä] (�ִ� 5ȸ)");
				System.out.println();

				// ��ä ��� �ݺ���
				for (int n=0; n<is.vVeg.size(); n++)
					System.out.printf("%2d. %5s", n+1, is.vVeg.get(n).name);	// ��ȣ. ��ǰ��

			} break;
		case Menus.E_TWO : 
			{
				System.out.println("    [����] (�ִ� 3ȸ)");
				System.out.println();

				// ���� ��� �ݺ���
				for (int n=0; n<is.vMain.size(); n++)
					System.out.printf("%2d. %5s", n+1, is.vMain.get(n).name);	// ��ȣ. ��ǰ��

			} break;
		case Menus.E_THREE :
			{
				System.out.println("    [�ҽ���] (�ִ� 1ȸ)");
				System.out.println();

				// �ҽ� ��� �ݺ���
				for (int n=0; n<is.vSource.size(); n++)
					System.out.printf("%2d. %5s", n+1, is.vSource.get(n).name);	// ��ȣ. ��ǰ��

			} break;
		case Menus.E_FOUR :
			{
				System.out.println("    [���η�] (�ִ� 3ȸ)");
				System.out.println();

				// ���� ��� �ݺ���
				for (int n=0; n<is.vTop.size(); n++)
					System.out.printf("%2d. %5s", n+1, is.vTop.get(n).name);	// ��ȣ. ��ǰ��
			}
		}// end switch
		
	}// end uCustomSaladStock


	// �߰��� ��� ��ȣ,���� �Է¹ޱ�
	public void uCustomSelectInput() throws IOException
	{	
		int uctSelect;	// ī�װ� ���� ����
		int unum;		// ��ǰ ��ȣ ���� ����
		int usu;		// ��ǰ ���� ���� ����

		System.out.println("\n    [��� ����]");

		System.out.println("[��ȣ]  [��ǰ��]  [����]");
		
		for (int i=0; i<is.vCart.size(); i++)	// vCart�� ��������� ����������� ���� => �ϳ��� ä���ְ� ����?? check~!!!�ڡڡڡڡڡڡڡڡڡڡڡ�
		{
			System.out.printf("%d.  %s, %d��\n", (i+1), is.vCart.get(i).cName, is.vCart.get(i).cNum);

			switch (is.vCart.get(i).cCate)
			{
			case 1 :	// ��ä�ϰ��
				{		// vVeg�� ũ�⸸ŭ �ݺ�
					for (int j=0; j<is.vVeg.size(); j++)
					{
						// ��ٱ��Ͽ� ��� ��ǰ��� ��ä�� �ִ� ��ǰ���� ������ ���
						if (is.vCart.get(i).cName.equals(is.vVeg.get(j).name))
						{
							// �� �ݾ�(Į�θ�)�� �ջ�
							resultMoney += is.vCart.get(i).cNum * is.vVeg.get(j).money;
							resultKcal += is.vCart.get(i).cNum * is.vVeg.get(j).kcal;
							break;
						}
					}
				} break;
			case 2 :
				{
					for (int j=0; j<is.vMain.size(); j++)
					{
						if (is.vCart.get(i).cName.equals(is.vMain.get(j).name))
						{
							resultMoney += is.vCart.get(i).cNum * is.vMain.get(j).money;
							resultKcal += is.vCart.get(i).cNum * is.vMain.get(j).kcal;
							break;
						}
					}
				} break;
			case 3 :
				{
					for (int j=0; j<is.vSource.size(); j++)
					{
						if (is.vCart.get(i).cName.equals(is.vSource.get(j).name))
						{
							resultMoney += is.vCart.get(i).cNum * is.vSource.get(j).money;
							resultKcal += is.vCart.get(i).cNum * is.vSource.get(j).kcal;
							break;
						}
					}
				} break;
			case 4 :
				{
					for (int j=0; j<is.vTop.size(); j++)
					{
						if (is.vCart.get(i).cName.equals(is.vTop.get(j).name))
						{
							resultMoney += is.vCart.get(i).cNum * is.vTop.get(j).money;
							resultKcal += is.vCart.get(i).cNum * is.vTop.get(j).kcal;
							break;
						}
					}
				} break;

			}

		} // end for

		System.out.println();
		System.out.printf("���� �ݾ�   : %d\n", resultMoney);
		// vCart�� ��� ��ǰ�� �ݾ��� �Է¹��� ������� ���ؼ� ������ ����
		System.out.printf("���� Į�θ� : %d\n", resultKcal);
		// vCart�� ��� ��ǰ�� Į�θ��� �Է¹��� ������� ���ؼ� ������ ����

		// ī�װ� ����
		System.out.print("�߰��� ����� ī�װ��� ������(1:��ä, 2:����, 3:�ҽ�, 4:����) : ");
		uctSelect = Integer.parseInt(br.readLine());

		// ī�װ��� �ش��ϴ� ��� ���
		uCustomSaladStock(uctSelect);

		// ī�װ� ������ �߰��� ��� ��ȣ ����
		System.out.println("�߰��� ��� ��ȣ: " );
		unum = Integer.parseInt(br.readLine());

		// �߰��� ��� ���� �Է�
		System.out.println("�߰��� ��� ����: " );
		usu = Integer.parseInt(br.readLine());


		// ��� 1�� ���ѷ� : ��ä �� 5��, ���� 3��, �ҽ� 1��, ���� 3��
		switch (uctSelect)
		{
		case 1:		// ��ä�� ���
			{
				vegMax += usu;	// vegMax �� usu(�Է��� ��� ����)��ŭ ���ϸ鼭
				if (vegMax>5)	// 5�� ����
				{
					vegMax -= usu;
					System.out.println("��⿡ ���� �� �ִ� [��ä] ���ѷ��� �Ѿ����ϴ�.");
					System.out.println("([�޴� ����] â���� �ǵ��ư��ϴ�.)");
					uCustomMenuSelect();
				}
			} break;
		case 2:		// ������ ���
			{
				mainMax += usu;	// mainMax �� usu(�Է��� ��� ����)��ŭ ���ϸ鼭
				if (mainMax>3)	// 3�� ����
				{
					mainMax -= usu;
					System.out.println("��⿡ ���� �� �ִ� [����] ���ѷ��� �Ѿ����ϴ�.");
					System.out.println("([�޴� ����] â���� �ǵ��ư��ϴ�.)");
					uCustomMenuSelect();
				}
			} break;
		case 3:		// �ҽ��� ���
			{
				sourceMax += usu;	// sourceMax �� usu(�Է��� ��� ����)��ŭ ���ϸ鼭
				if (sourceMax>1)	// 1�� ����
				{
					sourceMax -= usu;
					System.out.println("��⿡ ���� �� �ִ� [�ҽ�] ���ѷ��� �Ѿ����ϴ�.");
					System.out.println("([�޴� ����] â���� �ǵ��ư��ϴ�.)");
					uCustomMenuSelect();
				}
			} break;
		case 4:		// ������ ���
			{
				topMax += usu;		// topMax �� usu(�Է��� ��� ����)��ŭ ���ϸ鼭
				if (topMax>3)		// 3�� ����
				{
					topMax -= usu;
					System.out.println("��⿡ ���� �� �ִ� [����] ���ѷ��� �Ѿ����ϴ�.");
					System.out.println("([�޴� ����] â���� �ǵ��ư��ϴ�.)");
					uCustomMenuSelect();
				}
			} break;

		}// end switch

	}// end uCustomSelectInput()
	
/*
	public void uCustomSelectRun() //��� �߰� ���� �޼ҵ�
	{
		switch (uctSelect)
		{
			case 1 :
			{
				// �Է¹��� (��ä)�� ��ǰ��� ������ ī�װ��� ��ٱ��� ���Ϳ� ����
				is.vCart.add(new CartIngredient(is.vVeg(unum).name,usu,uctSelect));
			} break;
			case 2 :
			{
				is.vCart.add(new CartIngredient(is.vMain(unum).name,usu,uctSelect));
			} break;
			case 3 :
			{
				is.vCart.add(new CartIngredient(is.vSource(unum).name,usu,uctSelect));
			} break;
			case 4 :
			{
				is.vCart.add(new CartIngredient(is.vTop(unum).name,usu,uctSelect));
			} break;
		}
	}// end uCustomSelectRun()


	// ������ ��� ��ȣ,���� �Է¹ޱ�
	public void uCustomRemoveInput() throws IOException
	{
		System.out.println("\n    [��� ����]");  
		
		System.out.println("���õ� ���");
		System.out.println("[��ȣ]  [����]  [����]");

		// ���� ���õ� ��� ���
		for (int i=0; i<is.vCart.size(); i++)
			System.out.printf("%d.  %5s  %4d��\n", (i+1), is.vCart.get(i).name, is.vCart.get(i).num);

		System.out.println();
		System.out.printf("���� �ݾ�   : %d\n", resultMoney);
		System.out.printf("���� Į�θ� : %d\n", resultKcal);

		do	// ��ٱ����� �������� ���� �Է��ϸ� �ٽ� �Է�
		{
			System.out.println("������ ��� ��ȣ: " );
			unum = Integer.parseInt(br.readLine());

			System.out.println("������ ��� ����: " );
			usu = Integer.parseInt(br.readLine());

			if (is.vCart(unum).num < usu)
			{
				System.out.println("��ٱ����� �������� ���� �Է��ϼ̽��ϴ�.");

			}
		}
		while (is.vCart(unum).num < usu);

	}// end uCustomRemoveInput()

	public void uCustomRemoveRun() // ��� ���� ���� �޼ҵ�
	{

		for (int i=0; i<is.vCart.size(); i++) // ��� �߰����� �������� �ٲٸ� �̰� �ٲ���ԡڡڡڡڡڡڡ�
		{
			switch (is.vCart.get(i).cCate)
			{
				case 1 :	// ��ä�� ���
					{
						for (int j=0; j<is.vVeg.size(); j++)	// ��ä ũ�⸸ŭ �ݺ��ϸ鼭
						{										// ��ٱ��� ��� �̸��� �Է��� ��� �̸��� �����ϸ�
							if (is.vCart.get(i).cName.equals(is.vVeg.get(j).name))
							{
								// �� �ݾ�(Į�θ�) ����
								resultMoney -= usu * is.vVeg.get(j).money;
								resultKcal -= usu * is.vVeg.get(j).kcal;
							}
							
						}
					} break;
				case 2 :
					{
						for (int j=0; j<is.vMain.size(); j++)
						{
							if (is.vCart.get(i).cName.equals(is.vMain.get(j).name))
							{
								resultMoney -= usu * is.vMain.get(j).money;
								resultKcal -= usu * is.vMain.get(j).kcal;
							}
						}
					} break;
				case 3 :
					{
						for (int j=0; j<is.vSource.size(); j++)
						{
							if (is.vCart.get(i).cName.equals(is.vSource.get(j).name))
							{
								resultMoney -= usu * is.vSource.get(j).money;
								resultKcal -= usu * is.vSource.get(j).kcal;
							}
						}
					} break;
				case 4 :
					{
						for (int j=0; j<is.vTop.size(); j++)
						{
							if (is.vCart.get(i).cName.equals(is.vTop.get(j).name))
							{
								resultMoney -= usu * is.vTop.get(j).money;
								resultKcal -= usu * is.vTop.get(j).kcal;
							}
						}
					} break;
			}// end switch
		}// end for

		// ���� ��ٱ��Ͽ� ��� �����̶� �Է� ������ �������
		// ��ٱ��� ��ǰ ��ü�� �����ϰ�
		// �׷��� ������� ������ ���δ�
		if (is.vCart(unum).num == usu)
		{
			is.vCart.remove(unum);
		}
		else
		{
			is.vCart.get(unum).num -= usu;
		}

	}// end uCustomRemoveRun()

	public void uFinalCart() // ���ݱ��� ���� ��ǰ�� �����ִ� �޼ҵ�
	{
		// ���ݱ��� ���� ��ǰ�� ���
		for (int i=0; i<is.vCart.size(); i++)
		{
			System.out.printf("��ǰ��, ���� : %s, %d\n", is.vCart.get(i).cName, is.vCart.get(i).cNum);
		}

		// �� �ݾ�(Į�θ�) ���
		System.out.printf("�� �ݾ�   : %d\n", resultMoney);
		System.out.printf("�� Į�θ� : %d\n", resultKcal);

	}// end uFinalCart()
	
	public void adfasdf() // ��� �߰�/�������� ���� �����
	{
		
	}

	

/*
	// �߰��� ��ǰ ��� ���� �޼ҵ�
	public static Vector<Ingredient> uCustomSalad()
	{	
		// �׽�Ʈ�� ISetup �ν��Ͻ� ����
		// ISetup isu = new ISetup();
		// isu.firstSet();

		Vector<Ingredient> temp = new Vector<Ingredient>();

		// -- ��� ����
		// �����, ��ٸ� �־ 
		// ���� : �α׸� ��ü, �¾����� ������ ���Ϳ��� ���ͼ�.
			
		temp.add(isu.vMain.get(0));	// ����
		temp.add(isu.vMain.get(1));	// ������

		// => ����̸��� ����, Į�θ� ����
		return temp;

	
		
	}
*/
}


/*
üũ�ϰ� �Ѿ���� �͵�

*/