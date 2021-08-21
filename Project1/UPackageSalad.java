import java.util.Vector;
import java.util.Scanner;
import java.io.IOException;


// ��Ʈ����
// ��Ű�� ������ Ŭ����
public class UPackageSalad	
{
	private static Integer sel;			// ���� ���� ���� ����
	private static String con;	

	Vector<Ingredient> salmon = new Vector<Ingredient>();
	Vector<Ingredient> cajun = new Vector<Ingredient>();
	Vector<Ingredient> chicbr = new Vector<Ingredient>();

	public static void uPackageStock() // �޴� ���� �޼ҵ�
	{
		// ���� ��� �������� ������ ���� �ؾ���
		ISetup is = new ISetup();	
		is.firstSet();		

		// ���� ������ : ����, �����, ���, ����, ������Ż, ���� (-500��)
		salmon.add(isu.vMain.get(0));	// ����
		salmon.add(isu.vVeg.get(0));	// �����
		salmon.add(isu.vVeg.get(1));	// ���				
		salmon.add(isu.vVeg.get(2));	// ����
		salmon.add(isu.vVeg.get(3));	// ����
		salmon.add(isu.vSource.get(1)); // ������Ż
		salmon.add(new Ingredient("��Ʈ ����",100,0,-500));	// ��Ʈ����
		// ��Ʈ���� Ȯ�� ���غ�!

		// ������ ������ : ������, ��ϸӽ�Ÿ��, �����, ����, ��� (-500��)
		cajun.add(is.vMain.get(1));		// ������
		cajun.add(is.vSource.get(3));	// ��ϸӽ�Ÿ��
		cajun.add(is.vVeg.get(0));		// �����
		cajun.add(is.vVeg.get(2));		// ����丶��
		cajun.add(is.vVeg.get(1));		// ���
		cajun.add(new Ingredient("��Ʈ ����",100,0,-500));	// ��Ʈ����

		// �߰����� ������ : ����, �߰�����, �����, ����, ���, �߻�� (-500��)
		chicbr.add(is.vMain.get(2));	// �߰�����
		chicbr.add(is.vVeg.get(4));		// ����
		chicbr.add(is.vVeg.get(0));		// �����
		chicbr.add(is.vVeg.get(2));		// ����丶��
		chicbr.add(is.vSource.get(0));	// �߻��
		chicbr.add(new Ingredient("��Ʈ ����",100,0,-500));	// ��Ʈ����
	}//end uPackageStock()	
	

	public static void uPackagePrint()
	{
		System.out.println("-------------------------");
		System.out.println("    [��Ű¡ ������]");
		System.out.println();
		System.out.println("1. ���� ������");
		System.out.println("2. ������ ������");
		System.out.println("3. �߰����� ������");
		System.out.println("-------------------------");
	}//end uPackagePrint()
	

	public static Vector<Ingredient> uPackageSalad()
	{
		// 1. ��Ű¡ �������� ������ �����Ͽ� ���
		//���� uPackageStock() ��ȯ
		uPackageStock();
		uPackagePrint();
		
		// 2. �����ڰ� �����ϰ� ���� �������� ��ȣ �Է�
		while (true)
		{
			System.out.print("�޴� ���� : ");
			sel = sc.nextInt();

			if(sel>0 && sel<4)		// �޴� ��ȣ �ùٸ��� �Է� ��
				break;			    // �ݺ��� Ż��
			System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n");	// �ùٸ��� �ʰ� �Է� �� �޼��� ǥ�� �� �ٽ� �Է¹���	
		}
		
		switch (sel)
		{
			case : E_ONE = return salmon;	break;	// 1�϶�, ���� ������ ����.	
			case : E_TWO = return cajun;	break;	// 2�϶�, ������ ������ ����.
			case : E_THREE = return chicbr; break;	// 3�϶�, �߰���������� ����. 
		}

	}//end uPackageSalad()
}