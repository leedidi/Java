/*=========================================
  ���� ����(Exception) ó�� ����
===========================================*/

/*
�� ���α׷����� �߻��ϴ� ������

  �� �߸��� ������ ����ϰų� ���� ���� �������� ���� ���¿���
     ��������ν� ������ �ܰ迡�� �߻��ϴ� �������� ����

  �� ���α׷��� �����ϴ� �������� �߰ߵǴ� ��Ÿ�� ����
     �� ���� �� �ִ�.
		
	 - �����ڰ� ���� �м��� �߸��ϰų� �Ǽ��� ���� 
	   ������ ����� �������� �Ǵ� ������ ������

	 - �ý��� �̻󿡼� �߻��Ǵ� �ý��� ����, �׸���

	 - ���α׷� ���� �� �߻��Ǵ� ���������� ��Ȳ�� �ǹ��ϴ�
	   ���ܻ���(Exception)�� �ִ�.

	   ���� ���,
	   �� � ���� 0���� �����ų�...
	   �� �迭 ÷�ڸ� ����� ��Ȳ�� �߻��ϰų�...
	   �� �������� ���� ������ �����Ͽ� �о���δٰų�...

    ==> �����ڰ� �̷� ���� ������ �߻��� ��츦 �̸� �����Ͽ�
	    ������ �����ϱ� ���� ������ �����ϵ��� ������ ������ ���� ��.
		��.��.ó.��.

		//@ Exception ��ư� ������ �ʿ� ����~!!! 
		//  � ��Ȳ�� �ְ�, �׻�Ȳ�� ��� ��ó�Ѵٸ� �����س����� ����� ��Ʈ �ƴ�

		//@ �� �� ä�� ����. �迡�� ����, ����ȯ�� ���� ���� �� ��� ��� ó���ؾ� �Ѵ�...(������, 1�����ػ��....) �޴��� ����
		//  �̷� �޴����� ��� �����ϰ�, �̰ſ� ���� �츮�� ��� �����ؾ� �ϴ���! �̰� ���� ���� O
		//  ���������� ���ظ� �ϱ� ���ؼ� �츮�� � ����� ����� �ϴ��� �̰� ���� ���ǰ� X

�� ������ ���� ����~!!! (�� Exception Ŭ����)
   
   - ���ܴ� ���α׷� ���� �߿� �߻��� �� �ִ�
     ��ɾ��� �������� �帧�� �����ϴ� �̺�Ʈ��
	 �ڹٿ��� ���ܴ� �ϳ��� ������Ʈ(Object, ��ü)�̴�.

   - ���α׷� ���� �߿� �޼ҵ� �ȿ��� ������ �߻��ϰ� �� ���,
     �޼ҵ�� �� ������ �ش��ϴ� ���� ������Ʈ�� �����
	 �װ��� �ڹ� ��Ÿ�� �ý���(Runtime System)�� ������ �ش�.

   - �ڹٿ����� ��� ���ܴ� Throwable Ŭ������
     Throwable Ŭ������ ���� Ŭ������ ��ӹ޾� ����Ѵ�.

   - Throwable Ŭ������ ���ܸ� �����ϴ� �����̳�
     ���ܰ� �߻��� ���� ���α׷��� ���¿� ���� ������ �����ϰ� �ִ�.

   - Throwable Ŭ�������� �Ļ��� Ŭ����

     ��Exception Ŭ����
	   Exception ���� Ŭ������ �Ϲ������� ���α׷��ӿ� ����
	   ������ �� �ִ� ���� ��Ȳ����
	   �޼ҵ尡 ���� �߿� ������ ���ܸ� ����Ų��.
		
 	 ��Error Ŭ����
	 �ɰ��� ������ ���·� �����ڰ� ������ �� ���� ������ �����̴�.
				
			   //@ ��1 ������, ��Ÿ�� ���� ���� ����Ÿ�� �����ϴ°� x
�� ������ ���� //@ ��2
  
    - checked exception
	  �޼ҵ� ������ ���ܰ� �߻��� ���
	  �޼ҵ带 ������ �� ��throws�� ���� �޼ҵ� ������ �߻��� �� �ִ�
	  ���ܵ��� ������ְų� �Ǵ� �� ���ܸ� ��try~catch���ؼ�
	  ó�����־�߸� �ϴ� �����̴�.
	  �����Ϸ��� ������ �ϴ� �������� ��checked exception����
	  ��throws���Ǵ°��� ���� Ȥ�� ��try~catch���Ǵ����� ���θ� �Ǵ��Ͽ�
	  ���α׷����� ���ܸ� � ������ε� ó������ ������
	  ������ ��ü�� �Ұ����ϴ�.

   - unchecked exception
     ������ ó������ �ʾƵ� �����Ϸ��� üũ���� �ʴ�
	 ��Ÿ�� �ÿ� �߻��� �� �ִ� �����̴�.
*/

/*
�� java.lang.Throwable Ŭ������ �ֿ� �޼ҵ�
   
   - String toString()
     : Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�.
   - void printStackTrace(PrintStream s)
   - void printStackTrace(PrintWriter w)
     : ǥ�� ��� ��Ʈ���� ���� ȣ�� ����� ������ �޼ҵ���� ����Ѵ�.

�� �ֿ� ��Ÿ�� ���� Ŭ����
   
   - ArithmeticException
     : ��ġ ������ ����
   - ArrayStoreException
     : �迭�� �߸��� ������ ���� �����Ϸ� ���� ��� �߻��ϴ� ����
   - IndexOutOfBoundsException
     : �迭, ���ڿ�, ���� ��� �ε��� ������ ��� ��� �߻��ϴ� ����
   - ClassCastExcetpion
     : Ŭ���� ��ȯ�� �߸��� ��� �߻��ϴ� ����
   - NullPointerException
     : �� ��ü�� �����ϴ� ���(�ʱ�ȭ ���� ���� ���� ��� ��)
	   �߻��ϴ� ����
   - SecurityException
     : �ڹ��� ���� ���� ������ �����Ͽ��� ��� �߻��ϴ� ����
	          
			  :

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test143
{										   // �� ���ܸ� ó���ϴ� ù ��° ���
	public static void main(String[] args) //throws IOException
	{
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// �ֿ� ���� ����
		int a, b, c;
		

		// �� ���ܸ� ó���ϴ� �� ��° ���
		/*
		try //@ �õ��غ��ٰ�
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);	
		}
		catch (IOException e) //@����� �Ͼ�� ĳġ�ض�!
		{	
			// IOException �� checked exception
			//-- �޼ҵ带 �����ϴ� �������� throws �� ����.
			//	 ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�.
			System.out.println(e.toString());
			//@Throwable Ŭ�������� toString �������̵� ��~!
		}
		*/


		//�� ���ܸ� ó���ϴ� �� ��° ���
		/*
		try //@ �õ��غ��ٰ�
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);	
		}
		catch (IOException e1) //@����� �Ͼ�� ĳġ�ض�!
		{	
			// IOException �� checked exception
			//-- �޼ҵ带 �����ϴ� �������� throws �� ����.
			//	 ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�.
			System.out.println(e1.toString());
			//@Throwable Ŭ�������� toString �������̵� ��~!
		}

		catch (NumberFormatException e2)
		{
			System.out.println(e2.toString());
			System.out.println("���� ������ �����͸� �Է��ؾ� �մϴ�.~!!!");
		}
		*/


		//�� ���ܸ� ó���ϴ� �� ��° ���
		/*
		try //@ �õ��غ��ٰ�
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);	
		}
		catch (Exception e) //@����� �Ͼ�� ĳġ�ض�!
		{
			System.out.println(e.toString()); //@String�� toString()?
			System.out.println(e.getMessage());

			System.out.println("printStackTrace...");
			e.printStackTrace();
		}
		*/


		// etc... ��Ÿ ���

		try //@ �õ��غ��ٰ�
		{
			System.out.print("ù ��° ���� �Է� : ");
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է� : ");
			b = Integer.parseInt(br.readLine());

			c = a + b;

			System.out.println("��� : " + c);	
		}
		catch (Exception e) //@����� �Ͼ�� ĳġ�ض�!
		{	
			System.out.println(e.toString());
		}
		finally // check~!!!
		{
			// ���ܰ� �߻��ϰų� �߻����� �ʰų�...
			// ������ ����Ǵ� ����~!!!

			System.out.println("��� �����̽��ϴ�. ���� ���ְ� �����ô�.");
		}

	}
}