import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class MMoneyCheck // ���� Ȯ�� Ŭ����
{
	public void mMoneyPrint()
	{
		System.out.println("\n    [���� Ȯ��]");
		
		// 1. ī�װ��� ��� ��ȣ, ��� �̸�, �� �Ǹ� ����, �� �Ǹ� �ݾ� ���
		ISetup is = new ISetup();
		is.firstSet();
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("    [��ä]");
		System.out.println();
		
		// ��ä ��� �ݺ���
		for (int n=0; n<is.vVeg.size(); n++)
		System.out.printf("%2d. %5s\n", n+1, is.vVeg.get(n).name);
		//System.out.printf("%2d. %5s, �� %3d��, �� %d��\n", n+1, is.vVeg.get(n).name, xxx, xxx); 
														// ��� ��ȣ, ��� �̸�, �� �Ǹ� ����, �� �Ǹ� �ݾ�
		// �� �Ǹ� ����, �� �Ǹ� �ݾ� ��ƿ� �� �߰�
		
		System.out.println("-----------------------");
		System.out.println("    [����]");
		System.out.println();

		// ���� ��� �ݺ���
		for (int n=0; n<is.vMain.size(); n++)
		System.out.printf("%2d. %5s\n", n+1, is.vMain.get(n).name);
		//System.out.printf("%2d. %5s, �� %3d��, �� %d��\n", n+1, is.vMain.get(n).name, xxx, xxx); 
														// ��� ��ȣ, ��� �̸�, �� �Ǹ� ����, �� �Ǹ� �ݾ�
		System.out.println("-----------------------");
		System.out.println("    [�ҽ���]");
		System.out.println();

		// �ҽ� ��� �ݺ���
		for (int n=0; n<is.vSource.size(); n++)
		System.out.printf("%2d. %5s\n", n+1, is.vSource.get(n).name);
		//System.out.printf("%2d. %5s, �� %3d��, �� %d��\n", n+1, is.vMain.get(n).name, xxx, xxx); 
														// ��� ��ȣ, ��� �̸�, �� �Ǹ� ����, �� �Ǹ� �ݾ�
		System.out.println("-----------------------");
		System.out.println("    [���η�]");
		// ���� �߰� �� �߰�
		System.out.println();

	  // 2. �� ���� ���
	  System.out.printf("�� ���� : %d\n", 1); // ���� (��Ằ �� �Ǹ� �ݾ�) �� �հ� ���
	}//end mMoneyPrint()
  
  public void mMoneyCal()	//�� ���Աݾ� Ȯ�� �� ��� 
	{
				
			//�� ���� �ݾ�
			
			//pay���� �ߺҷ�����~!!!!!!!!!!!!!!!!!!!!!!!!


			//System.out.println(" �� ���� �ݾ� : "+ ������ + " �� �Դϴ�.");

			
			// ����ϱ�
			System.out.println("����� ���� Ȯ�� �� [������ ���]�� ���ư��ϴ�.��");
			System.out.println("�ڰ��! �ǵ��� �� �����ϴ�.��");
			System.out.println("  ��� �Ͻðڽ��ϱ�? (Y/N) : ");
			//String real = sc.next();

			/*
			if (real.equals("y")||real.equals("Y"))				// UpperClass �� �ϱ�
			{
				System.out.println(sum + "���� ��� �Ǿ����ϴ�.");
				sum = 0;
			}
			*/


			//mm.mMenuPrint(); //��ݿ��� ������� �����ڸ���...
			//������ �����Դϴ�.....�����մϴ�,,,
	}


}// end class MMoneyCheck