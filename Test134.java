/*=========================================
  ���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
  - StringBuffer Ŭ����
===========================================*/

/*
�� StringBuffer Ŭ������ ���ڿ��� ó���ϴ� Ŭ������
   String Ŭ�������� ��������
   String Ŭ������ ���� ���ڿ� �������� ������ �Ұ���������
   StringBuffer Ŭ������ ���ڿ��� ����� ��
   ���� ���ڿ��� ���� �ܰ�(��Ÿ�� ����)���� ������ �� �ִ�.
   
   ��, StringBuffer ��ü�� �������� ���̸� �����Ƿ�
   ��ü�� �����ϴ� �������� �̸� �� ũ�⳪ ���� �����ϰų�
   ���� ������ ������ ũ�⸦ �ٲ� �� �ִ� ����� �����Ѵ�.

   ����, JDK 1.5 ���ĺ��ʹ�
   ���ڿ��� ó���ϴ� StringBuilder ��� Ŭ������ �����Ѵ�.
   StringBuilder Ŭ������ ����� StringBuffer Ŭ������ ����������
   ���� ū �������� multi-thread unsafe ��� ���̴�.
   ��, Syncronization�� ���� ������
   StringBuffer ���� ������ ���ü�(����ȭ) ������ ���ٸ�
   StringBuilder �� ����ϴ� ���� ������ ����ų �� �ִ�.

*/

public class Test134
{
	public static void main(String[] args)
	{
		StringBuffer sb1 = new StringBuffer("korea");
		StringBuffer sb2 = new StringBuffer("korea");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
		//--==>> false
		//		 false
		//@@@ string�� �ٸ���, StringBuffer�� �������̵� ���� ���� -> equals�� �ּҰ� ��

		System.out.println(sb1);
		//--==>> korea
		//@ toString�� �������̵� �ߴ�

		System.out.println(sb1.toString());
		//--==>> korea
		//@ sb1.toStrig() : ���ڿ�

		System.out.println(sb1.toString().equals(sb2.toString()));
		//--==>> true
		//@ ������ equals�� String�� equals

		StringBuffer sb3 = new StringBuffer();
		//-- StringBuffer �⺻ ������ ȣ�� ��(�ν��Ͻ� ���� ����)
		//   �⺻������ �����Ǵ� ���� ũ�� ��16��

		// capacity()
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 16
		//@@ �������� ĳ�۰� ������� �Ǵ��� �𸣰ڳ�~! (�ɷ� ���� ����? ���⼭ ���� ĳ�۰� �� ĳ��)

		///////////////////////////////////////////////////////////////////////

		System.out.println(sb3);
		//--==>> ��
		
		/*
		String name = "ȫ�浿";
		name += "�̼���";
		name += "������";
		System.out.println(name);
		*/

		sb3.append("seoul");		// sb3 += "seoul"; (@ �� �̱���̶� �����ϵ�)
		sb3.append("korea");
		sb3.append("�츮����");
		sb3.append("���ѹα�");

		System.out.println(sb3);
		System.out.println(sb3.toString());
		//--==>> seoulkorea�츮������ѹα�
		//		 seoulkorea�츮������ѹα�

		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34 (@ �����Ͱ� Ŀ���� ����ũ�� �ڵ����� �÷���!)

		///////////////////////////////////////////////////////////////////////////

		String temp1 = "java and oracle";
		System.out.println(temp1.toUpperCase());
		//--==>> JAVA AND ORACLE

		String temp2 = "JAVA AND ORACLE";
		System.out.println(temp2.toLowerCase());
		//--==>> java and oracle

		//System.out.println(sb3.toUpperCase());
		//System.out.println(sb3.toLowerCase());
		//--==>> ���� �߻�(������ ����)
		//@ sb3�� StringBuffer�� ��װ��� �޼ҵ� �������� X(String�� ����)

		String temp3 = sb3.toString();
		System.out.println(temp3.toUpperCase());
		//--==>> SEOULKOREA�츮������ѹα�

		// seoulkorea�츮������ѹα�
		//@ ������ �̰�! sb3�� ����ü�� �ٲ�� X
		System.out.println(sb3);
		//--==>> seoulkorea�츮������ѹα�

		// �� ��� ���ڿ�(sb3) �� seoul �տ�
		//    ��"�ѱ�"���̶�� ���ڿ� �߰�
		sb3.insert(0, "�ѱ�");
		System.out.println("seoul �տ� ���ѱ��� �߰� : " + sb3.toString());
		//--==>> seoul �տ� ���ѱ��� �߰� : �ѱ�seoulkorea�츮������ѹα�

		// �ѱ�seoulkorea�츮������ѹα�
		
		// �� ��� ���ڿ�(sb3) �� korea ���ڿ� �ڿ�
		//    ��"���"���̶�� ���ڿ� �߰�
		//    ��, ��� ���ڿ��� �ε����� ���� Ȯ������ ����...

		//[���� ���� �ڵ�]
		/*
		//sb3.insert(sb3.lastIndexOf("korea"),"���");
		//sb3.insert(sb3.indexOf("�츮����"),"���");
		//sb3.insert(sb3.indexOf("korea") + "korea".length(),"���");
		
		//sb3.insert(sb3.indexOf("korea")+"korea".length(),"���");
		//System.out.println("korea �ڿ� ������� �߰� : " + sb3.toString());
		*/

		// �׽�Ʈ ��
		//System.out.println(sb3.toString());
		//--==>> �ѱ�seoulkorea�츮������ѹα�

		// �׽�Ʈ ��
		//sb3.insert(12, "���");
		//System.out.println("korea �ڿ� ������� �߰� : " + sb3.toString());
		//--==>>korea �ڿ� ������� �߰� : �ѱ�seoulkorea����츮������ѹα�

		// �׽�Ʈ ��
		//sbs.indexOf("korea");
		//System.out.println(sb3.indexOf("korea"));
		//--==>> 7

		// �׽�Ʈ ��
		//System.out.println(sb3.insert(sb3.indexOf("korea"), "���"));
		//--==>> �ѱ�seoul���korea�츮������ѹα�
		
		// �׽�Ʈ ��
		//System.out.println(sb3.insert(sb3.indexOf("korea") + 5, "���"));
		//--==>> �ѱ�seoulkorea����츮������ѹα�

		//sb3.insert("korea"���ڿ� �ε��� + "korea"���ڿ�����, "���");
		sb3.insert(sb3.indexOf("korea") + "korea".length(), "���");
		//         --------------------    ----------------
		//                  7                     5
		
		System.out.println(sb3);
		//--==>> �ѱ�seoulkorea����츮������ѹα�


		// �� ���츮���� ���ڿ� ����
		//sb3.delete(14, 18);
		//System.out.println(sb3);
		//--==>> �ѱ�seoulkorea������ѹα�
		
		//[���� ���� �ڵ�]
		//@ ���� ã���ʰ�!
		/*
		sb3.delete(sb3.indexOf("�츮����"), sb3.indexOf("�츮����")+"�츮����".length());
		System.out.println("�츮���� ���ڿ� ���� : " + sb3);
		//--==>> �츮���� ���ڿ� ���� : �ѱ�seoulkorea������ѹα�
		*/
						
		sb3.delete(sb3.indexOf("�츮����"), sb3.indexOf("�츮����")+"�츮����".length());
		System.out.println(sb3);
		//--==>> �ѱ�seoulkorea������ѹα�

		// �� ��� ���ڿ�(sb3) ����
		//    ��korea�� ���� ���ڿ� ����(korea ����)
		//    ��, ó�� ��� ���ѱ�seoul���� ������...

		//[���� �ۼ��� �ڵ�]
		/*
		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		//--==>> �ѱ�seoul
		*/

		//sb3.delete(7, 18);
		//System.out.println(sb3);
		//--==>> �ѱ�seoul

		sb3.delete(sb3.indexOf("korea"), sb3.length());
		System.out.println(sb3);
		//--==>> �ѱ�seoul

		///////////////////////////////////////////////////////////////////////////

		// ���� ũ�� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 34
		//@ �ȿ� �� �� ū�� ������ ���� ����ũ�� �پ ����ũ��� ���� ����....

		// ���ڿ�(sb3)�� ���� Ȯ��
		System.out.println("���ڿ��� ���� : " + sb3.length());
		//--==>> ���ڿ��� ���� : 7

		// ���� ũ�� ����
		// �� ���� ���ڿ��� ��Ƶ� �� �ִ� ������ ũ���...
		sb3.trimToSize();
		//@ ������ �����ŭ �߶�

		// ���� ũ�� ���� ���� ���� ũ�� �ٽ� Ȯ��
		System.out.println("���� ũ�� : " + sb3.capacity());
		//--==>> ���� ũ�� : 7


	}
}