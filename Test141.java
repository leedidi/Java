/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - Math Ŭ����
===========================================*/
//@ �� �̷� �͵��� �ֱ���~ ���� �Ѿ�� OKOk
//@ �ð� ���� ������ API ��ť��Ʈ ��� ���� Ŭ����..���������.. �鿩�ٺ���

/*
�� java.lang.Math Ŭ������

   ����(Mathematics)�� ���õ� ������ �Ӽ��� �Լ����� �����ϴ� Ŭ������
   �����ڰ� �ֱ� ������... ��private������ ����Ǿ� �ֱ� ������
   �ܺο��� ��ü(�ν��Ͻ�)�� ������ �� ����.
   ��, ��� �޼ҵ尡 ��static������ ���ǵǾ� �����Ƿ�
   ��ü�� �������� �ʰ� �ٷ� �����Ͽ� ����ϴ� ���� �����ϴ�.

�� java.lang.Math Ŭ������ �ֿ� ��� �� �޼ҵ�

   - public static final double E = 2.71....;
     : �ڿ� �α� ���

   - public static final double PI = 3.141592...;
     : ������(��)	// ��

   - public static double sin(double a)
   - public static double cos(double a)
   - public static double tan(double a)
     : sin(a), cos(a), tan(a) ���� ��ȯ�Ѵ�. (�ﰢ�Լ�)

   - public static double asin(double a)
   - public static double acos(double a)
   - public static double atan(double a)
     : asin(a), acos(a), atan(a) ���� ��ȯ�Ѵ�. (�ﰢ�Լ��� ���Լ�)

   - public static double toRadians(double angdeg)
     : ����(angdeg)�� ����(radian)���� �ٲپ� ��ȯ�Ѵ�.
   - public static double toDegrees(double angrad)
     : ����(angrad)�� ������ �ٲپ� ��ȯ�Ѵ�.

   - public static double exp(double a)
     : e �� a ���� ���Ͽ� ��ȯ�Ѵ�.

   - public static double log(double a)
     : �α�(log) ���� ���Ͽ� ��ȯ�Ѵ�.

   - public static double sqrt(double a)
     : a �� �������� ���Ͽ� ��ȯ�Ѵ�.

   - public static double ceil(double a)
     : a ���� ũ�ų� ���� ������ ��ȯ�Ѵ�.(�ø��� ����)

   - public static double floor(double a)
     : a ���� �۰ų� ���� ������ ��ȯ�Ѵ�.(������ ����)

   - public static double pow(double a, double b)
     : a �� b ���� ���Ͽ� ��ȯ�Ѵ�.

   - public static int round(float a)
   - public static long round(double a)
     : a �� �ݿø��Ͽ� ������� ��ȯ�Ѵ�.

   - public static double random()
     : 0.0 ~ 1.0 ������ ����(������ �Ǽ�)�� �߻����� ��ȯ�Ѵ�.


*/


public class Test141
{
	public static void main(String[] args)
	{
		System.out.println("������     : " + Math.PI);
		System.out.println("2�� ������ : " + Math.sqrt(2));
		//--==>> ������ : 3.141592653589793
		//--==>> 2�� ������ : 1.4142135623730951

		System.out.println("���̿� ���� Degree : " + Math.toDegrees(Math.PI));		
		System.out.println("2���̿� ���� Degree : " + Math.toDegrees(2.0 * Math.PI));
		//--==>> ���̿� ���� Degree : 180.0
		//--==>> 2���̿� ���� Degree : 360.0

		double radian45 = Math.toRadians(45);
		// ������ �������� ��ȯ~!!!

		System.out.println("����   45 : " + Math.sin(radian45));
		System.out.println("�ڽ��� 45 : " + Math.cos(radian45));
		System.out.println("ź��Ʈ 45 : " + Math.tan(radian45));
		//--==>> ����   45 : 0.7071067811865475
		//		 �ڽ��� 45 : 0.7071067811865476
		//		 ź��Ʈ 45 : 0.9999999999999999
		
		System.out.println("��ũ 25   : " + Math.log(25));
		//--==>> ��ũ 25   : 3.2188758248682006

		System.out.println("2�� 4��   : " + Math.pow(2,4));
		//--==>> 2�� 4��   : 16.0

		for (int i=0; i<=10; i++)
		{
			System.out.println("0.0 ~ 1.0 ������ ���� : " + Math.random());
		}
		//--==>> 0.0 ~ 1.0 ������ ���� : 0.9207911669879862
		//		 0.0 ~ 1.0 ������ ���� : 0.9211290063262414
		//		 0.0 ~ 1.0 ������ ���� : 0.5197894561934694
		//		 0.0 ~ 1.0 ������ ���� : 0.6365790863251779
		//		 0.0 ~ 1.0 ������ ���� : 0.8906219790738378
		//		 0.0 ~ 1.0 ������ ���� : 0.7772277498021544
		//		 0.0 ~ 1.0 ������ ���� : 0.06984461969567646
		//		 0.0 ~ 1.0 ������ ���� : 0.6877170431628375
		//		 0.0 ~ 1.0 ������ ���� : 0.9648943059243007
		//		 0.0 ~ 1.0 ������ ���� : 0.5953762128815326
		//		 0.0 ~ 1.0 ������ ���� : 0.17995386840194771
		

	} 
}