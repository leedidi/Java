/*=================================
   ���� Ŭ������ �ν��Ͻ� ����
   - Ŭ������ �ν��Ͻ� Ȱ��
 =================================*/

 // 2. Sungjuk Ŭ����
 //    - �ο� ���� �Է¹޾�, �Է¹��� �ο� �� ��ŭ
 //      �̸�, ��������, ��������, ���������� �Է¹ް�
 //      ������ ����� �����ϴ� Ŭ������ ������ ��~!!!
 //		 ���Ӽ� : �ο���, Record ������ �迭
 //      ����� : �ο� �� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���

 //@ Record[] rec;

//[���� �ۼ��� �ڵ�]
/*
import java.util.Scanner;
import java.io.IOException;

 public class Sungjuk
 {

	 // �ֿ� �Ӽ� ����(�ֿ� ���� ����)

	 int snum;
	 //String name;
	 //int kor, eng, mat;
	 //int sum, avr;
	 //String[] name = new String[100];
	 //String[] kor = new String[100];
	 //String[] eng = new String

	 //int[][] score = new int[3][3];

	 // �ֿ� �޼ҵ� ����(��� ����)
	
	void run()
	{
	 // �ο� �� �Է�(1~100) : 102
	 // �ο� �� �Է�(1~100) : -10
	 // �ο� �� �Է�(1~100) : 3
	
	 Scanner sc = new Scanner(System.in);
	 
	 Record[] rec1 = new Record[100];
	 Record[] rec2 = new Record[100];
	 Record[] rec3 = new Record[100];
	 Record[] rec4 = new Record[100];

	 do
	 {
		 System.out.print("�ο� �� �Է�(1~100) : ");
		 snum = sc.nextInt();
	 }
	 while (snum<1 || snum>100);
	

 // �̸�, ����, ����, ���� ���� �Է�
	
 //ex>
 // 1��° �л��� �̸� �Է� : ���±�
 // ���� ���� : 90
 // ���� ���� : 80
 // ���� ���� : 70

	for (int i=0; i<snum; i++)
	{

		System.out.print("1��° �л��� �̸� �Է� : ");
		rec1[i] = sc.next();
		System.out.print("���� ���� : ");
		rec2[i] = sc.nextInt();
		System.out.print("���� ���� : ");
		rec3[i] = sc.nextInt();
		System.out.print("���� ���� : ");
		rec4[i] = sc.nextInt();

		sum = rec2[i]+rec3[i]+rec4[i];
		avr = (rec2[i]+rec3[i]+rec4[i])/3;
	}

     // ��� ���
	 // ���±� 90 80 70 240  xx.xx 2
	System.out.printf("%s %d %d %d %d xx.xx, );



	}

 }
*/
 
import java.util.Scanner;

//[�Բ� �ۼ��� �ڵ�]
 public class Sungjuk
 {
	 // �ֿ� �Ӽ� ����(�ֿ� ���� ����)
	 int inwon;			//-- �ο� ��
	 Record[] rec;		//-- Record �迭(�л� �� �� �� Record �迭 �� �� �� Ȱ��)
	 					//   Record �� ������� ������ ��ü�� ��Ƴ� �� �ִ� �迭

	 // �ֿ� �޼ҵ� ����(��� ����)
	 // �� �ο� �� �Է�
	 //public void set(int inwon)
	 public void set() //@ ����ð� ����(void), �Ű����� �����Է� x�� ����ڰ� �Է��Ұű⶧���� (set()). �Ű����� ��� �� 
	 {
		 Scanner sc =new Scanner(System.in);

		 do
		 {
			System.out.print("�ο� �� �Է�(1~100) : ");
			inwon = sc.nextInt();
		 }
		 while (inwon<1 || inwon>100); //@ ~ �ϴ� ���� �ݺ�! //@ ���ÿ� �����ϴ� ���� �����ϱ� OR(||)

		 // check~!!!
		 // Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ�
		 // �迭���� inwon ��ŭ ����
		 rec = new Record[inwon];
		 //-- Record �迭���� inwon ��ŭ ������ ������
		 //   Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.
		
	 }
		// �ֿ� �޼ҵ� ����(��� ����)
		// �� �� ������ �Է�(���� �� ��� ���� ��� ����)
		public void input() //@ �ǳ��ִ°� �ƴ϶�, rec �迭�濡 �������� �����ؼ� �����ű� ������(void), 
					   //@ �Ű����� �����Է� x�� ����ڰ� �Է��Ұű⶧���� (input()). �Ű����� ��� ��
		{
			Scanner sc = new Scanner(System.in);

			String[] title = {"���� ���� : ", "���� ���� : ", "���� ���� : "};
			
			// �ο� �� ��ŭ �ݺ� �� �ο� ���� ����Ͽ� ������� �迭�� ���̸�ŭ �ݺ�
			for (int i=0; i<inwon; i++)	// for (int i=0; i<rec.length; i++) �� ����	
			{

				// check~!!!
				//@ �迭�� �������� ���ڵ尢 ��ü,�ν��Ͻ��� �����Ǿ�� ��
				// Record Ŭ���� ����� �ν��Ͻ� ����
				/*
				Record ob = new Record();
				ob.name
				ob.tot


				rec[i] = ob;
				rec[i].name
				rec[i].tot
				ob.tot
				*/ // �Ʒ��ٰ� ������
				rec[i] = new Record();
				

				System.out.printf("%d��° �л��� �̸� �Է� : ", (i+1));
				rec[i].name = sc.next();
				
				/*
				System.out.print("���� ���� : " );
				//rec�迭�� i��°���� ���� = sc.nextInt();
				rec[i].kor = sc.nextInt();
				System.out.print("���� ���� : " );
				//rec�迭�� i��°���� ���� = sc.nextInt();
				rec[i].eng = sc.nextInt();
				System.out.print("���� ���� : " );
				//rec�迭�� i��°���� ���� = sc.nextInt();
				rec[i].mat = sc.nextInt();
				*/

				// �ٿ���~ ���� �ִ� ���� ��� �Ʒ� �ִ� ������ ����Ѱž�~ �Ф�
				// ������ �׷���������....�Ф� �����մϴ� �Ф�
				

				for (int j=0; j<title.length; j++) // 0 1 2
				{
					// �ȳ� �޼��� ���
					System.out.print(title[j]);

					// ����ڰ� �Է��� �����͸� ���ھ�(score) �迭�� ��Ƴ���
					rec[i].score[j] = sc.nextInt();		// i��°�л��� score[0] �� ��������
														// i��°�л��� score[1] �� ��������
														// i��°�л��� score[2] �� ��������

				    // ����, ����, ���� ���� �����͸� �ݺ������� �Է¹޴� ����
					// ���� �����ϱ�
					rec[i].tot += rec[i].score[j];
				}

				// ��� �����ϱ�
				rec[i].avg = rec[i].tot / 3.0;
			}
		 }//end input() <<< ���̽� ����!

		  // �ֿ� �޼ҵ� ����(��� ����)
		  // �� ��� ���
		  // 1��° �л��� �̸� �Է� : ���±�
		  // ���� ���� : 90
		  // ���� ���� : 80
		  // ���� ���� : 70

		  public void print()
		{
			// check~!!!
			// ���� ���� �޼ҵ� ȣ��~!!! (���� �߰�)
			ranking();

			  System.out.println();	// ����

			  // �л� �� ��� �ݺ� ��±��� ����
			  for (int i=0; i<inwon; i++)
			  {
				  // �̸� ���
				  System.out.printf("%5s", rec[i].name);

				  // ����(����, ����, ����) �ݺ� ���
				  for (int j=0; j<3; j++)
					  System.out.printf("%4d", rec[i].score[j]);

				  // ����, ��� ���
				  System.out.printf("%5d", rec[i].tot);
				  System.out.printf("%8.2f", rec[i].avg);
				   
				  // check~!!!
				  // ���� ��±��� �߰�~!!! (���� �߰�)
				  System.out.printf("%5d", rec[i].rank);

				  // ����
				  System.out.println();
			  }

		}//end print()
 
		// �� ���� ���� �޼ҵ� �߰�~!!!
		//    - Record �迭�� rank �Ӽ� �ʱ�ȭ ��� �� ��ȯ �ڷ��� void
		//    - Ŭ���� ���ο��� Ȱ���� �޼ҵ�� ���� �� �������� ������ private
		private void ranking()
		{
			//1 2 3 4 5		���ذ� �񱳰�
			int i, j;		//-- ���� ����

			// ��� �л����� ���(����, rank)�� 1�� �ʱ�ȭ
			for (i=0; i<inwon; i++)
			{
				rec[i].rank = 1;
			}

			// ��� ����... ex) 4٣
			for (i=0; i<inwon-1; i++)		//-- �� ����   0        1       2 -> 0 1 2 ������ ��(@������ 3�� ȥ�� ����, �� �ʿ� X)
			{
				for (j=i+1; j<inwon; j++)	//-- �� ���   0��123   1��23   2��3  
				{
					if(rec[i].avg > rec[j].avg)		//-- �񱳱����� ����� �񱳴���� ��պ��� ũ�ٸ�...
					{
						// �񱳴���� rank �� 1��ŭ ����
						rec[j].rank++;
					}
					else if (rec[j].avg > rec[i].avg) //-- �񱳴���� ����� �񱳱����� ��պ��� ũ�ٸ�...
					{
						// �񱳱����� rank �� 1��ŭ ����
						rec[i].rank++;
					}
				}
			}



		}


 }// end class Sungjuk
