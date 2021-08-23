import java.util.Scanner;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Random;
import java.util.Vector;
import java.io.IOException;
import java.util.Iterator;

// ���� ������ Ŭ����
public class URandomSalad
{
   private static Integer sel;         // ���� ���� ���� ����
   private static String con;   
   
   // �ӽ÷� ����� �ҷ�����
   public static ISetup isu = new ISetup();

   // �ӽ÷� ���� ����, ��ä, �ҽ� ����
   Vector<Ingredient> temp = new Vector<Ingredient>();    // �������� ���� �׸�
   Vector<Ingredient> mtemp = new Vector<Ingredient>();   // ����
   Vector<Ingredient> vtemp = new Vector<Ingredient>();   // ��ä
   Vector<Ingredient> stemp = new Vector<Ingredient>();   // �ҽ�
   Vector<Ingredient> ttemp = new Vector<Ingredient>();   // ����
   // ���� Į�θ� �Է¹��� ����
   int limitkcal;  
   int sumkcal;	// Į�θ� �������� ���� ����

   // ������ ������ ���� ���� (�ҽ��� ���� ����)
   String limitMain;
   String[] limitVeg = new String[2];
   String[] limitTop = new String[2];


   // Į�θ��� ��� �Է�
   public void limitCal() throws IOException
   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		System.out.println();
       	System.out.println("\t�Է��Ͻ� Į�θ����� ���� Į�θ��� �����带 �����ص帳�ϴ�.");
		System.out.println("\t(���� ��� 1���� / ����� 1�� / �ҽ� 1���� �⺻ ����)");
		System.out.println("\t� ��ᰡ �� �� �������� �ƹ��� �𸣴� ��~ ��~ ������");
		System.out.println();

		//System.out.printf("%2d. %5s, �� %3d��, �� %d��\n", n+1, is.vMain.get(n).name, xxx, xxx); 
		// ��� ��ȣ, ��� �̸�, �� �Ǹ� ����, �� �Ǹ� �ݾ�


		// [��� ���]
		System.out.println("\n    [��� ���]");
		System.out.println();

		// ����
		System.out.println("-----------------------");
		System.out.println("        [����]");
		System.out.println();
		for (int n=0; n<isu.vMain.size(); n++)
			System.out.printf("%2d. %5s\n", n+1, isu.vMain.get(n).name);


		// ��ä
		System.out.println("-----------------------");
		System.out.println("        [��ä]");
		System.out.println();
		for (int n=0; n<isu.vVeg.size(); n++)
			System.out.printf("%2d. %5s\n", n+1, isu.vVeg.get(n).name);

		// ����
		System.out.println("-----------------------");
		System.out.println("        [���η�]");
		for (int n=0; n<isu.vTop.size(); n++)
			System.out.printf("%2d. %5s\n", n+1, isu.vTop.get(n).name);
		System.out.println("-----------------------");
		System.out.println();
		System.out.println();

		// Į�θ� ���� �Է�
		do         
		{
			System.out.print("������ Į�θ��� �Է��ϼ��� (200~400): "); 
			limitkcal = sc.nextInt();
		}
		while (limitkcal < 200 || limitkcal > 400);
	  

		// ���� ������ ��� �Է�(�ִ� 1��)
		
		System.out.print("������ [����]��� �Է� (�ִ� 1��): ");
		limitMain = br.readLine();
		System.out.println();
	
		   
		// ��ä ������ ��� �Է�(�ִ� 2��)
		int i = 0 ;   // ���� ����
		System.out.print("������ [��ä]��� �Է� (�ִ� 2��) : ");
		limitVeg [i] = br.readLine();

		System.out.print("���ܸ� ��� �Ͻðڽ��ϱ�? (Y/N)");
		con = sc.next().toUpperCase();
		  
		if (con.equals("Y")) // y�϶���. �ѹ� �� �Է�
		{
			i++;
			System.out.print("������ [��ä]��� �Է� (�ִ� 2��) : ");
			limitVeg [i] = br.readLine();

			/* ����� ���� ( �� ������ ��~!!!)
			for (int x=0; x<limitVeg.length; x++)
				System.out.printf("limtieVeg[%d] : %s ", x, limitVeg[x]);
			*/
		}
		System.out.println();



		// ���� ������ ��� �Է�(�ִ� 2��)
		i = 0;
		System.out.print("������ [����]��� �Է� (�ִ� 2��) : ");
		limitTop [i] = br.readLine();

		System.out.print("���ܸ� ��� �Ͻðڽ��ϱ�? (Y/N)");
		con = sc.next().toUpperCase();

		if (con.equals("Y")) // y�϶���. �ѹ� �� �Է�
		{
			i++;
			System.out.print("������ [����]��� �Է� (�ִ� 2��) : ");
			limitTop [i] = br.readLine();
		}
		System.out.println();
		System.out.println();

   }  //end limitCal()


    public void cancel()
	{
		// ��ü ��� ���
		mtemp = isu.vMain;
		vtemp = isu.vVeg;
		stemp = isu.vSource;
		ttemp = isu.vTop;


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
		for (int i=0; i<limitVeg.length; i++)
		{
			for (int j=0; j<vtemp.size(); j++)
			{
				// ��ü ��ῡ�� �Է¹��� �� ����
				if (vtemp.get(j).name.equals(limitVeg[i]))
					vtemp.remove(vtemp.get(j));
			}
		}

		// ������� ����
		for (int i=0; i<limitTop.length; i++)
		{
			for (int j=0; j<ttemp.size(); j++)
			{
				// ��ü ��ῡ�� �Է¹��� �� ����
				if (ttemp.get(j).name.equals(limitTop[i]))
					ttemp.remove(ttemp.get(j));
			}
		}

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

		// �������� �̱� ����
		Random rd = new Random();
		do
		{
			temp.clear();
			sumkcal = 0;
			
			// �� ���ΰ� �ҽ� : ������ 1�� 
			temp.add(mtemp.get(rd.nextInt(mtemp.size())));
			temp.add(stemp.get(rd.nextInt(stemp.size())));
			//                 ---------------------------
			//                 �������� 1���� �̾Ƽ� temp(���α׸�)�� ���

			// �� ��ä�� ���� : ������ ����, Ƚ���� ����
			for (int i=0; i<rd.nextInt(5)+1; i++)
			{
				int idx = rd.nextInt(vtemp.size());		
				temp.add(vtemp.get(idx));
			}
			for (int i=0; i<rd.nextInt(3)+1; i++)
			{
				int idx = rd.nextInt(ttemp.size());		
				temp.add(ttemp.get(idx));
			}
	 
	 		// �� �� Į�θ� ���
			for (int i=0; i<temp.size(); i++)
				sumkcal += temp.get(i).kcal;
		}
		while (sumkcal>limitkcal || sumkcal < 200);

		return temp;
	}
}


