import java.util.Vector;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


// Ŀ���� ������ Ŭ����
public class UCustomSalad
{	
	Vector<Ingredient> temp = new Vector<Ingredient>();

	int currentKcal;	// �ǽð� Į�θ� ����
	int currentMoney;	// �ǽð� �ݾ� ����

	int vegMax=0, mainMax=0, sourceMax=0, topMax=0;	// ��ä, ����, �ҽ�, ���� ���� ����

	static BufferedReader br;
	static Scanner sc;

	static
	{
		br = new BufferedReader(new InputStreamReader(System.in));

		sc = new Scanner(System.in);
	}

	// ��
	// �޴� ���� �޼ҵ� 
	public void uCustomMenuSelect() throws IOException
	{
		UserMode um = new UserMode();

		System.out.println();
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.println("��                                         ��");
		System.out.println("��                                         ��");
		System.out.println("��   [Ŀ���� ������]  (���� �޴��� : -1)   ��");
		System.out.println("��                                         ��");
		System.out.println("��      ���� ���� ��� ����� ������       ��");
		System.out.println("��                                         ��");
		System.out.println("��             1. ��� ����                ��");
		System.out.println("��             2. ��� ���                ��");
		System.out.println("��                                         ��");
		System.out.println("��                                         ��");
		System.out.println("��������������������������������������������������������������������������������������");
		System.out.println();

		do
		{
			System.out.print("������ ����� �����ϼ���. : "); 
			Password.sel = Integer.parseInt(br.readLine());
		}
		while ( Password.sel != -1 && ( Password.sel<1 || Password.sel>2 ));
		

		switch (Password.sel)
		{	
			case Menus.E_MINUS : 
				{		
					um.uMenuPrint();		
					um.uMenuSelect();
					um.uMenuRun();
				} break;			// -1�϶�, ���� �ܰ��
			
			case Menus.E_ONE : 
				{
					uCAdd();
				} break;			// 1�϶�,  [1. ��� ���] ����.	
			
			case Menus.E_TWO : 
				{
					uCRemove();
				} break;			// 2�϶�,  [2. ��� ���] ����.
		}

	} //end uCustomMenuSelect()


	// ��
	public void uCCatePrint()	// ī�װ����� ��� ����ؼ� �����ִ� �κ�.
	{
		System.out.println("����������������������������������������������������������������������������������������������������������������");
		System.out.println("��                                                      ��");
		System.out.println("��                      [��� ���]                     ��");
		System.out.println("��                                                      ��");
		System.out.println("��                         [��ä]                       ��");
		System.out.println("��------------------------------------------------------��");
		System.out.print("��");
		for (int n=0; n<ISetup.v.size(); n++)
		{
		   if (ISetup.v.get(n).cate == 1)
		      System.out.printf("\t%s", ISetup.v.get(n).name);
		}
		System.out.println("   ��");
		
		System.out.println("��                                                      ��");
		System.out.println("��                         [����]                       ��");
		System.out.println("��------------------------------------------------------��");
		System.out.print("��");
		for (int n=0; n<ISetup.v.size(); n++)
		{
		   if (ISetup.v.get(n).cate == 2)
		      System.out.printf("\t%5s ", ISetup.v.get(n).name);
		}
		System.out.println("     ��");

		System.out.println("��                                                      ��");
		System.out.println("��                         [�ҽ�]                       ��");
		System.out.println("��------------------------------------------------------��");
		System.out.print("��");
		for (int n=0; n<ISetup.v.size(); n++)
		{
		   if (ISetup.v.get(n).cate == 3)
		      System.out.printf("    %s", ISetup.v.get(n).name);
		}
		System.out.println("  ��");

		System.out.println("��                                                      ��");
		System.out.println("��                         [����]                       ��");
		System.out.println("��------------------------------------------------------��");
		System.out.print("��");
		for (int n=0; n<ISetup.v.size(); n++)
		{
		   if (ISetup.v.get(n).cate == 4)
		     System.out.printf("\t%s ", ISetup.v.get(n).name);
		}
		System.out.println("��");
		System.out.println("��                                                      ��");
		System.out.println("����������������������������������������������������������������������������������������������������������������");
		System.out.println();
	}// uCCatePrint()


	// ��
	public void uCAdd() throws IOException // ��� �߰� �޼ҵ�
	{
		uCCatePrint();

		System.out.println("������ �ѹ�, �ҽ��� �ι�, ������ ����, ��ä�� �ټ��� ���� �߰� �����մϴ�.");		
		System.out.print("�� ���� ��Ḧ �Է��ϼ��� : " );
		Password.con = br.readLine();
	
		for (int i=0;i<ISetup.v.size();i++)	
		{
			if (ISetup.v.get(i).name.equals(Password.con))
			{	
				switch (ISetup.v.get(i).cate)	
				{
					// ī�װ����� �з�, ���� ī��Ʈ.
					case Menus.E_ONE   : vegMax++;	  break; 
					case Menus.E_TWO   : mainMax++;	  break;				
					case Menus.E_THREE : sourceMax++; break;
					case Menus.E_FOUR  : topMax++;	  break;
				}
			}
		}

		if ( vegMax> 5 )
		{
			vegMax--;
			System.out.println("�� �̻� ��ä�� ���� �� �����ϴ�.");
			System.out.println("(�ִ� ��ä ����Ƚ�� : 5��)");
			uCAddContinue();
		}
				
		else if ( mainMax> 3 )
		{
			mainMax--;
			System.out.println("�� �̻� ������ ���� �� �����ϴ�.");
			System.out.println("(�ִ� ���� ����Ƚ�� : 3��)");
			uCAddContinue();
		}	
		else if ( sourceMax> 2 )
		{
			sourceMax--;
			System.out.println("�� �̻� �ҽ��� ���� �� �����ϴ�.");
			System.out.println("(�ִ� �ҽ� ����Ƚ�� : 2��)");
			uCAddContinue();
		}	
		else if ( topMax> 3 )
		{
			topMax--;
			System.out.println("�� �̻� ������ ���� �� �����ϴ�.");
			System.out.println("(�ִ� ���� ����Ƚ�� : 3��)");
			uCAddContinue();
		}	
		else
			uCAddRun(Password.con);
	}//
	
		

	// ��
	public void uCAddRun(String con) throws IOException // ��� �߰� ���� �޼ҵ�
	{
		for (int i=0;i<ISetup.v.size();i++)
		{
			if (ISetup.v.get(i).name.equals(con))
			{	
				temp.add(ISetup.v.get(i));
				System.out.println("\n<<��ᰡ �߰��ƽ��ϴ�.>>\n" );
			}
		}
	
		uCNow();
		uCAddContinue();

	}//uCAddRun()
	

	// ��
	public void uCAddContinue() throws IOException // ��� �߰� ������� ����� �޼ҵ�
	{
		UserMode um = new UserMode();

		System.out.print("\n ��� �����ðڽ��ϱ�? (Y/N) : ");
		Password.con = sc.next().toUpperCase();
		  
		if (Password.con.equals("Y")) // y�϶���. �ѹ� �� �Է�
			uCAdd();
		else
			um.uDecision(temp);
	}//end uCRemoveContinue()


	// ��
	public void uCRemove() throws IOException // ��� ���� ���� �޼ҵ�
	{
		uCNow();
	
		System.out.print("�� ������ ��Ḧ �Է��ϼ��� : " );
		Password.con = br.readLine();

		for (int i=0;i<temp.size();i++)
		{
			if (temp.get(i).name.equals(Password.con))
			{	
				temp.remove(temp.get(i));
				System.out.println("\n<<��ᰡ �����ƽ��ϴ�.>>\n" );
			}
		}

		uCRemoveContinue();
	}// uCRemove()
	

	// ��
	public void uCRemoveContinue() throws IOException // ��� ���� ������� ����� �޼ҵ�
	{
		UserMode um = new UserMode();

		System.out.print("������ ��� �Ͻðڽ��ϱ�? (Y/N)");
		Password.con = sc.next().toUpperCase();
		  
		if (Password.con.equals("Y")) // y�϶���. �ѹ� �� �Է�
			uCRemove();
		else
			um.uDecision(temp);
	}//end uCRemoveContinue()

	
	// ��	
	public void uCNow() // �ǽð� ���, �ݾ�, Į�θ� ���
	{
		currentMoney = 0;		
		currentKcal = 0;

		for (int i=0; i<temp.size(); i++)
		{
			System.out.printf("%s ", temp.get(i).name);
			currentMoney += temp.get(i).money;
			currentKcal  += temp.get(i).kcal;
		}
		System.out.println();
		System.out.println("\n =======================================");
		System.out.printf(" �� ���� �ݾ�   : %d ��\n ", currentMoney);
		System.out.printf("�� ���� Į�θ� : %d kcal\n ", currentKcal);
		System.out.print("=======================================");
	}// end uCNow()


}//end UCustomSalad