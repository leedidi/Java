import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

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
  

  //XXXX 3. ���� �� ���� ���(5����...1����...500��...) -> ������ ������ ���� ���� �Է¹��� �����ϱ� �ʿ�x -> ����
  //x System.out.println("\n    [���� �� ����]") x;

  public void mMoneyReturn() throws IOException	// 
  {	 
		  // BufferedReader �ν��Ͻ� ����
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		  // 4. ���ư���

		  System.out.print("\n�޴� ���� ȭ������ ���ư��ðڽ��ϱ�? (Y/N) : ");
		  String yn = br.readLine();

		  if(yn.equals("y")||yn.equals("Y"))
		  {
				System.out.println("�޴� ���� ȭ������ ���ư��ϴ�.");
				// -> [3. �ݰ� ���� ȭ������ �ǵ��ư�]
				// -- [3. �ݰ� ���� ȭ��] ������ �߰�
		  }
				else if(yn.equals("N")||yn.equals("n"))
				{
					mMoneyPrint();
					System.out.print("\n�޴� ���� ȭ������ ���ư��� �ʾҽ��ϴ�."); 
					mMoneyReturn();
				}	
				 else
				{	
					 mMoneyPrint();
					 System.out.print("\n�߸� �Է��ϼ̽��ϴ�.");
					 mMoneyReturn();
				}

   }//end mMoneyReturn()

}// end class MMoneyCheck

		//-- XXX Y/N ���� �ϱ�!
		/*
		String ans;
		do
		{	
			System.out.print("�޴� ���� ȭ������ ���ư��ðڽ��ϱ�? (���ư��⸦ ���ϽŴٸ� Y �Է�) : ");
			ans = br.readLine();
		}
		while (!ans.equals("Y"));
					
		System.out.print("�޴� ���� ȭ������ ���ư��ϴ�.");
		// -> [3. �ݰ� ���� ȭ������ �ǵ��ư�]
		// -- [3. �ݰ� ���� ȭ��] ������ �߰�
		*/

	


		