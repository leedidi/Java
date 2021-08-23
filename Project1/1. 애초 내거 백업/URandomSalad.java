
import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
import java.io.IOException;

// ���� ������ Ŭ����
public class URandomSalad
{
	private static Integer sel;			// ���� ���� ���� ����
	private static String con;	
	
	// �ӽ÷� ����� �ҷ�����
	public static ISetup isu = new ISetup();

	// �ӽ÷� ���� ����, ��ä, �ҽ� ����
	Vector<Ingredient> temp = new Vector<Ingredient>();    // �������� ���� �׸�
	Vector<Ingredient> mtemp = new Vector<Ingredient>();   // ����
	Vector<Ingredient> vtemp = new Vector<Ingredient>();   // ��ä
	Vector<Ingredient> stemp = new Vector<Ingredient>();   // �ҽ�

	
	int limitkcal;  // ���� Į�θ� �Է¹��� ����
	int sumkcal;	// Į�θ� �������� ���� ���� 


	// ������ ������ ���� ���� (�ҽ��� ���� ����)
	String limitMain;
	String[] limitVeg = new String[2];
	//  String[] limitTop = new String[2];


	// Į�θ��� ��� �Է�
	public void limitCal()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
       	System.out.println("\t�Է��Ͻ� Į�θ� �Ʒ��� �����带 �����ص帳�ϴ�.");
		System.out.println("\t(���� ��� 1���� / ����� 1�� / �ҽ� 1���� �⺻ ����)");
		System.out.println("\t � ��ᰡ �� �� �������� �ƹ��� �𸣴� ��~��~ ������");
		
		do			// Į�θ� ���� �Է�
		{
			System.out.print("Į�θ� ���� (200~400): "); 
			limitkcal = sc.nextInt();
		}
		while (limitkcal < 200 || limitkcal > 400);


		int i = 0 ;	// ���� ���� 
		   
		System.out.print("������ [����]��� �Է� (�ִ� 1��) : ");
		limitMain = sc.next();
		
		System.out.print("������ [��ä]��� �Է� (�ִ� 2��) : ");
		limitVeg [i] = sc.next();

		System.out.print("���ܸ� ��� �Ͻðڽ��ϱ�? (Y/N)");
		con = sc.next().toUpperCase();
		
		if (con.equals("Y")) // y�϶���. �ѹ� �� �Է�
		{
			i++;
			System.out.print("������ [��ä]��� �Է� (�ִ� 2��) : ");
			limitVeg [i] = sc.next();
			return;
		}

	}//end limitCal()


	public void cancel()
	{
		// ��ü ��� ���
		mtemp = isu.vMain;
		vtemp = isu.vVeg;
		stemp = isu.vSource;


		// ������� ����
		for (int i=0; i<mtemp.size(); i++)
		{
			for (int j=0; j<1; j++)
			{
				// ��ü ��ῡ�� �Է¹��� �� ����
				if (mtemp.get(i).name.equals(limitMain))
					mtemp.remove(mtemp.get(i));
			}
		}

		// ��ä��� ����
		for (int i=0; i<vtemp.size(); i++)
		{
			for (int j=0; j<limitVeg.length; j++)
			{
				// ��ü ��ῡ�� �Է¹��� �� ����
				if (vtemp.get(i).name.equals(limitVeg[j]))
					vtemp.remove(vtemp.get(i));
			}
		}

		// ������� ���� (�� ���� �ؾ� ��)
		randomRun();   // ��� �̱� ����
	}


	public Vector<Ingredient> randomRun()
	{
		// ��� �������� ����
		// ���� 1
		// ����ߴ� 1 or 2 
		// ����߸� ������ ��ä�� ���� 1 ~ 5 
		// �ҽ��� 1 
		 
		// �� � �������, �� �� �� ������ ����.
		// ��� ����� Į�θ� ���� ������ �����ʵ���

		do
		{
			// �������� �̱� ����
			Random rd = new Random();
			// �� ���� (�ӽñ׸�) 
			// ������ 1��   �ĺ������� ����
			temp.add(mtemp.get(rd.nextInt(mtemp.size())));
			//                           ---------------
			//                           �ӽñ׸��� �ִ� ��� ��ü ��

			// �� �ҽ� (�ӽñ׸�)
			// �ҽ� 1
			temp.add(stemp.get(rd.nextInt(stemp.size())));


			// �� ��ä (�ӽñ׸�)
			// ����ߴ� 1 or 2�� /   (����� ���� ��ä) 012345
			// ����� for�� (������ 1~2 �� ���)
			//int idx = isu.vVeg.indexof("�����");
			for (int i=0; i<rd.nextInt(2)+1; i++)      
			 temp.add(isu.vVeg.get(0));


			// ������ ��� (���� �������� ���, ����ߴ� ������ ����)
			int idx;
			for (int i=0; i<rd.nextInt(5)+1; i++)
			{
				 idx = rd.nextInt(vtemp.size());

				 // ���� ���� �� �߿� ����߸� �ٽ� ��Ƽ��
				 if (vtemp.get(idx).name == "�����")
					continue;

				 // �� �ܿ��� ��ä�׸��� �߰�
				 temp.add(vtemp.get(idx));
			}

			// ���ǿ� �´� Į�θ� ����
			for (int i=0; i<temp.size(); i++)
				sumkcal += temp.get(i).kcal;
			
		}
		while (sumkcal<limitkcal || sumkcal<200);
		
		return temp;
	  }
   }