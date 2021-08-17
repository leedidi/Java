/*================================================
  ���� ��ü ����ȭ(Object Serialization) ����
=================================================*/

//@@ ��ũ�γ������̼��� ����ȭ, �þ�������̼��� ����ȭ

/*
�� ��ü ����ȭ(Object Serialization)��
   
   �޸𸮿� ������ Ŭ���� ��ü�� ��� ������ ���� ���¸�
   �״�� �����ؼ� ���Ͽ� �����ϰų�
   ��Ʈ��ũ�� ���� ������ �� �ִ� �������
   ��� ������ ���� �����Ѵٰų�
   �ٸ� ��Ʈ��ũ�� �ִ� ȣ��Ʈ�� ���� ���� ��� ����ϰ� �ȴ�.

   ��, ��ü ����ȭ�� ���빰�� ����Ʈ ������ ��ȯ�Ͽ�	//@ ���빰 : ��ü�� �����ϴ� �����͵�
   ���� �Ǵ� ��Ʈ��ũ�� ���� �ۼ���(��Ʈ��)�� �����ϰ�
   ������ִ� ������ �� ��, ��ü�� ��� ������ �޸𸮸�����
   ������ ���� ���Ѵ�.

   ����, �޼ҵ�� �����ڴ� ��ü ����ȭ�� ��󿡼� ���ܵȴ�~!!! //-- check~!!!
   //@ �������� �Ž����� �޴�����, ��� ������ ���� ��-> ���� ����� X / ���� ���, ��, �Ǹŷ� ���� ��-> ��� O


�� ��ü ����ȭ�� ����

   ��ü ��ü�� ������ ����� ���Ŀ� ���ֹ��� �ʰ�
   ��ü�� ���Ͽ� ���������ν� ���Ӽ��� ������ �� ������
   ��ü ��ü�� ��Ʈ��ũ�� ���� �ս��� ��ȯ�� �� �ְ� �ȴ�.

   ��ü ����ȭ�� �ڹ� 1.1 ���Ŀ� ���ԵǾ��µ� //@ ��â PDA�� ���������� ���޵Ǵ� �ñ�...
   �� ������ RMI �� Bean �����̾���.		  //@ RMI : �������. Bean : �̷��� ���������� ����~ �ϴ� ��Ģ.
   RMI�� ���� ��ü ����� �����ؾ� �ϱ� ������
   ��ü�� �״�� �̵��� �� �־�� �Ѵ�.
   ���� �̸� �����ϱ� ���ؼ��� ��ü ����ȭ�� �ʼ����̾���.

   ���� Bean �� ���� �� ���¿� ���� ������ ������ ��
   �� ��ü ����ȭ�� ����ϸ� ���ϰ� ��ü ���¸� ������ �� �ִ�.

�� RMI(Remote Method Invocation) //@ ũ�� �Ű� �Ƚᵵ ��
   ���� �ٸ� ���� �����ġ�� �����ϴ� �Լ���
   ȣ���ϰ� �����ϴ� ����� ����Ѵ�.
   ���� �ٸ� ��� ������ ��ġ�� ������ ���� ��ü�� ����
   ��� ������ �����ϴ� �������� �����ϸ� ���ڴ�.
  
�� Bean(��) //@ �Ű� �� ����
   C/S(Client �� Server) ������ �𵨿��� ������ ������ �ش��ϸ�
   ���� ������ ����Ʈ���� ��ü�� ���� �� �ְ� �ϴ� ������Ʈ ���.
   �ۼ��� ��ü�� ������ �����ϸ� ������Ʈ�� ���� ���Խ�ų �� �ֵ��� �Ѵ�.
   Ŭ���̾�Ʈ���� ���̶�� ���α׷� ������Ʈ�� �й��ϴ� ������� ó��

//@ ������Ʈ ���� : like ���Ӻ���... ���ӱ⿡ �Ѹ� ��ü�Ͽ� �ٸ� ���� �Ҽ��ִ� ����
//@ �������̽�+��.. ���� ���� ���� ���ڸ��� �װ� ������������ O, �װ����� ���� ���ڸ��� ���� ������������ O

�� Serializable �������̽�
  
   ��ü ����ȭ�� �ϱ� ���� ���� ��ü ����ȭ�� �����ϵ���
   java.io.Serializable �������̽��� ������ �־�� �Ѵ�.
   �� �������̽��� ��ü ����ȭ�� �����Ǿ�� �Ѵٴ� �����
   JVM ���� �˷��ִ� ������ �����Ѵ�.
   ����, Serializable �������̽���
   �ٸ� �������̽��� �޸� �����ؾ� �� �޼ҵ尡 ���� ������
   ���� ���� ���ָ� �ȴ�.

   ����)
   ��
   public class Ŭ������ implements Serializable
   {
	   // ,,,
	}

	��
	Serializable �������̽��� ������ ��
	ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ �̿��Ͽ�
	��ü ������ ������� �����ϰ� �ȴ�.

	�� ��� ������ static ���� ����� ���
	   (��, Ŭ���� ������ ���)
	   ��ü ����ȭ�� ��󿡼� ���ܵȴ�.


�� Object Stream
 
   java.io.ObjectInputStream
   ObjectInputStream Ŭ������ ObjectOutputStream Ŭ������ ����
   ���Ͽ� ����Ǿ� �ִ� ��ü�� ��Ʈ��ũ�� ���� ���޵� ��ü��
   ����ȭ�� �����ϴ� ����� �����Ѵ�.
   ��, java.io.Serializable �������̽���
   java.io.Enternalizable �������̽��� �������ִ� ��ü�� ���ؼ���
   ����� �����ϴ�.
   ��, Serializable �������̽��� Enternalizable �������̽���
   ������ ��ü������ ����� �����ϴٴ� ���̴�.
   �� ��, readObject() �޼ҵ带 �̿��Ͽ�
   ��Ʈ�����κ��� ����ȭ�� ��ü�� ���� �� ������
   �̷��� ���� ��ü�� �迭, ���ڿ� �Ǵ� �� ��ü ��
   ������ ��(Type)���� ĳ���� �� �־�� �Ѵ�.

*/

import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Enumeration;

public class Test173
{
	public static void main(String[] args) throws Exception
	{
		String appDir = System.getProperty("user.dir");

		// �׽�Ʈ(Ȯ��)
		//System.out.println(appDir);
		//--==>> C:\JavaStudy

		// ���� ��ü ����
		File f0 = new File(appDir, "\\data\\test.ser");
		//-- appDir �� C:\JavaStudy
		//-- appDir ��ġ(���)�� �߽����� "\\data\\test.ser"��
		//   �����ϰڴٴ� �ǹ�.
		//-- ��������� ��C:\JavaStudy\data\test.ser�� ����
		
		// �׽�Ʈ(Ȯ��)
		// ��
		//System.out.println(f0.getParentFile().exists());
		//--==>> false
		//@ �� ���� ����X

		// �׽�Ʈ(Ȯ��)
		// �� ��C:\JavaStudy�� ��ο� ��data�� ���͸� ���� �� Ȯ��
		//System.out.println(f0.getParentFile().exists());
		//--==>> true
		//@ �� ���� ����O

		// ���͸� ������ �������� �ʴ� ��Ȳ�̶��...
		if (!f0.getParentFile().exists())
		{
			// ���͸��� ����ڴ�.
			f0.getParentFile().mkdirs();
		}

		// Hastable �ڷᱸ�� �ν��Ͻ� ����
		Hashtable<String, String> h1 = new Hashtable<String, String>();

		// ������ h1 �̶�� Hashtable �ڷᱸ���� ��� �߰�
		h1.put("3", "�չ���");
		h1.put("4", "ä����");
		h1.put("2", "������");
		h1.put("5", "�Ǽ���");
		h1.put("1", "�����");

		// �׽�Ʈ(Ȯ��)
		//System.out.println(h1.get("1"));
		//--==>> �����
		//@ �׽�Ʈ�Ѱ� �Ĳ��� �ּ�ó���ϸ鼭 ��������~!

		
		// ���� ���� ��� ��Ʈ�� ����(�������� ����)
		FileOutputStream fos = new FileOutputStream(f0); //@ ���������� f0 �� ���
		//-- ���� ���� ��� ��Ʈ��(���ٱ�)��
		//   f0 ��� ���� ��ü�� ���ڴ�...  (��� ������ �� �ֵ���...)
		//InputStreamReader isr = new InputStreamReader(System.in);
		
		// ��ü ���� ��� ��Ʈ�� ����
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//-- ��ü ���� ��� ��Ʈ��(���ٱ�)����
		//   fos ��� ���� ���� ��� ��Ʈ���� ���ΰڴ�.
		//BufferedReader br = new BufferedReader(isr);

		// ���� ������ ������ ����
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));

		// ���� ����� ���� ���������� ������ ����
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �� ObjectOutputStream Ŭ������
		//    ��ü���� ����ϴ� ����� �����ϴ� Ŭ������
		//    ��� ��Ʈ���� ����ϱ� ����
		//    ���������� ��ü ����ȭ�� �����ϰ� �ȴ�.
		//    �ڹ� �⺻�� ������ �Ǵ� ��ü����
		//    ���Ͽ� �����ϰų� ��Ʈ��ũ�� ���� �����ϱ� ����
		//    ������ ��ü�� ����ȭ�ϴ� ����� �����ϴ� ���̴�.

		// ������ ��Ʈ���� ������ ��ü�� ���
		oos.writeObject(h1);

		oos.close();
		//-- ObjectOutputStream ���ҽ� �ݳ�

		fos.close();
		//-- FileOutputStream ���ҽ� �ݳ�

		// �������� ��~!!!

		// ------------------------------------------------------------------------------ ����ȭ

		// �о���̱� ����~!!!

		if (f0.exists())		//-- f0 ���� ��ü�� �����Ѵٸ�...
		{
			FileInputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);

			// ois(ObjectInputStream)�� ���� �о���� ��ü(Object)�� (�� readObject �� ���� ó��)
			// ������ ��(Hashtable)���� ĳ�����Ͽ�
			// h2 ��� Hashtable �ڷᱸ���� ��Ƴ���
			Hashtable h2 = (Hashtable)ois.readObject();

			//@Hashtable h2 = ois.readObject(); //@ ��ĳ����.(hashtable�� object ��ü�� �о����)
			//@           ois = objectinputstream
			//@           ois.readObject() = object
			//@hashtable							==> �̷��� ��Ƴ��� X

			//Object obj = ois.readObject();
			//Hashtable h2 = (Hashtable)obj;

			ois.close();
			//-- ois ���ҽ� �ݳ� �� ObjectInputStream ���ҽ� �ݳ�

			fis.close();
			//-- fis ���ҽ� �ݳ� �� FileInputStream ���ҽ� �ݳ�



			//----------------------------------------------------------------- ������� �����ϸ� �о���̴� �۾� ��~!!!

			// �о���� h2 ��ü�� ���� Ȯ��
			String key;
			String value;

			// �� Iterator ����� �� ����

			Enumeration e = h2.keys();

			while (e.hasMoreElements())
			{
				key = (String)e.nextElement();
				//-- key ���� �о���̴� ����

				// Ȯ��
				//System.out.println(key);
				//--==>>
				/*
				5
				4
				3
				2
				1
				*/


				value = (String)h2.get(key);
				//-- key �� Ȱ���Ͽ� value ��� ����

				System.out.println(key + " �� " + value);
				//--==>>
				/*
				5 �� �Ǽ���
				4 �� ä����
				3 �� �չ���
				2 �� ������
				1 �� �����
				*/
				//@ ������ �ǹ̰� ����...

				//@ �ڹ� ��!
			}
		}

		




	}
}