
import java.util.Scanner;


	Scanner sc = new Scanner(System.in);
	ManagerMode mm = new ManagerMode();
			
	public void mMoneyCal()	//�� ���Աݾ� Ȯ�� �� ��� 
	{
				
			//�� ���� �ݾ�
			
			//pay���� �ߺҷ�����~!!!!!!!!!!!!!!!!!!!!!!!!


			System.out.println(" �� ���� �ݾ� : "+ ������ + " �� �Դϴ�.");

			
			// ����ϱ�
			System.out.println("����� ���� Ȯ�� �� [������ ���]�� ���ư��ϴ�.��");
			System.out.println("�ڰ��! �ǵ��� �� �����ϴ�.��");
			System.out.println("  ��� �Ͻðڽ��ϱ�? (Y/N) : ");
			String real = sc.next();


			if (real.equals("y")||real.equals("Y"))				// UpperClass �� �ϱ�
			{
				System.out.println(sum + "���� ��� �Ǿ����ϴ�.");
				sum = 0;
			}

			mm.mMenuPrint(); //��ݿ��� ������� �����ڸ���...
			//������ �����Դϴ�.....�����մϴ�,,,
	}
