/*========================================
   ���� �ֹε�Ϲ�ȣ ��ȿ�� �˻� ����
 =========================================*/

/*
�� �ֹε�Ϲ�ȣ ���� ����
	
	�� ������ �ڸ��� ������ ���ڸ� ���� ��Ģ�� �°� ���Ѵ�.

	 123456-1234567 (�ֹι�ȣ)
	 ****** ****** ------------------------  �� �ڸ��� ���ϱ�
	 234567	892345  (�� �ڸ��� ������ ��)

	 �� ��Ģ�� �°� ���� ������ ������ ����� ��� ���Ѵ�.

	 ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
	     * * * * * *   * * * * * * 
		 2 3 4 5 6 7   8 9 2 3 4 5
       -------------------------------------
	   �� 14 + 15 + 0 + 30 + 6 + 35 + 8 + 72 + 12 + 6 + 4 + 15

	    == 217

	 �� ������ ������� 11�� ������ ������������ ���Ѵ�.

	        19
		 ------
      11 | 217
	       11
          -----
		   107
		    99
          -----
		     8 �� ������

	 �� 11���� ������(�� 8)�� �� ������� ���Ѵ�.
	    
		11 - 8 = 3

		�� ���� ó�� �������� �������� 0 �� ��� �� 11 �� 1
									   1 �� ��� �� 10 �� 0

		   �̸� �ٽ� 10���� ������ �������� ���Ѵ�.

    ��-> ���� ���� ����� �ֹι�ȣ�� �����ϴ� ������ ���ڿ�
	     ��ġ�ϴ����� ���θ� Ȯ���Ѵ�.

		 ��ġ     �� ��ȿ�� �ֹι�ȣ
		 ����ġ   �� �߸��� �ֹι�ȣ
*/

// ���� ��)
// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-12345678 �� �Է� ���� �ʰ�
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 123456-123456 �� �Է� ���� �̴�
// >> �Է� ����~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1252085 �� ��ȿ�� �ֹι�ȣ
// >> ��Ȯ�� �ֹι�ȣ~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1252086 �� ��ȿ���� ���� �ֹι�ȣ
// >> �߸��� �ֹι�ȣ~!!!
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� �߰� ��~!!!
//    �迭.length			�� �迭�� ����(�迭���� ����) ��ȯ
//    ���ڿ�.length()		�� ���ڿ��� ���� ��ȯ
//	  String str = "abcdefg";
//    str.length()			�� 7
//    "abcdefg".length();	�� 7
//
//    ���ڿ�.substring()	�� ���ڿ� ����

		/*
		String strTemp = "������";
		System.out.println(strTemp.length());
		//--==>> 3

		strTemp = "���ع��� ��λ���";
		System.out.println(strTemp.length());
		//--==>> 9

		strTemp = "study-hard";
		System.out.println(strTemp.length());
		//-==>> 10 //@ Ư������ �ϳ��� ���̵� �ν� ��

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(3,5)); //@strTemp���� ���� ���ϴ� indx�� �����. index�� 0���� ����, (3����~5���� �ϳ� ª���ű���)
		//--==>> DE
		// ABC DE FGHIJKLMNOPQRSTUVWXYZ
		// 012 34 56789...

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(13,17));
		// ABCDEFGHIJKLM NOPQ RSTUVWXYZ
		//--==>> NOPQ

		//strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		//System.out.println(strTemp.substring(13, 85));
		//--==>> ���� �߻�(������ ����)
		//       StringIndexOutOfBoundsException (@ ���ڿ� �ε��� ����� ���� ��)

		strTemp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(strTemp.substring(5)); //@ ���ڿ� 5���� ��ü ������!
		//--==>> FGHIJKLMNOPQRSTUVWXYZ

		System.out.println(strTemp.substring(5, strTemp.length()));
		//                                      -----------------
		//                                       strTemp �� ��ü ����
		//--==>> FGHIJKLMNOPQRSTUVWXYZ
		*/
		


// [���� �ۼ��� �ڵ�]
/*
import java.util.Scanner;

public class Test102
{
	public static void main(String[] args)
	{
*/
		// �׽�Ʈ
		

		// �Է� �ڸ����� ��Ȯ���� ���� ��� >> �Է� ����~!! ���
		
		/*
		Scanner sc = new Scanner(System.in);

		String num=" ";
		
		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : ");
		num = sc.next();
		System.out.println("num.length(): " + num.length());
		
		if(num.length()!=14);
		{
			System.out.println(">> �Է� ����~!!!");
			return;
		}
		*/
		
		/*
		if else()
		{
			System.out.println(">> ��Ȯ�� �ֹι�ȣ~!!!");
		}
		else
			{
				System.out.println(">> �߸��� �ֹι�ȣ~!!!");
			}
		}
		*/
		
		// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1252085 �� ��ȿ�� �ֹι�ȣ
		// >> ��Ȯ�� �ֹι�ȣ~!!!
		// ����Ϸ��� �ƹ� Ű�� ��������...

		// �ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1252086 �� ��ȿ���� ���� �ֹι�ȣ
		// >> �߸��� �ֹι�ȣ~!!!
		// ����Ϸ��� �ƹ� Ű�� ��������...
		
		// �ֹι�ȣ�� �ùٸ��� ��� �� ���

		// ���ڿ�.substring()	�� ���ڿ� ����
	    
		// �׽�Ʈ
		//System.out.print(num.substring(0,0));

/*
	}
}
*/

// �߰�

// ���� �ۼ��� �ڵ�

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Test102
{
	public static void main(String[] args) throws IOException
	{	
		// BufferedReader �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �Է¹޴� �ֹι�ȣ(���ڿ� ����)
		String str;

		// �ֹι�ȣ�� �� �ڸ����� ���ϰ� �� �� �� �迭 ���·� ����
		//           7  5  0  6  1  5  -  1  8  6  2  1  3  3
		//           *  *  *  *  *  *  *  *  *  *  *  *  *
 		int[] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		//                             --
		//                           check~!!

		// ���� ���� �� ������(��, �� ������ ����� ���� ���� �� �ֵ��� ó��...)
		int tot = 0;

		System.out.print("�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : ");
		//str = Integer.parseInt(br.readLine());
		str = br.readLine();

		if (str.length() != 14)
		{
			System.out.println(">> �Է� ����~!!!");
			return;		//-- �޼ҵ� ���� �� main() �޼ҵ� ���� �� ���α׷� ���� //* break�� �ƴ϶� return ����!
		}

		// �׽�Ʈ
		//System.out.println(">> �ڸ��� ����~!!!");
		
		// ex) "750615-1232085"
		/*
		str.substring(0, 1);
		"7"
		Integer.parseInt("7");

		tot += chk[0] * 7;
		-
		str.substring(1, 2);
		"5"
		Integer.parseInt("5");

		tot += chk[1] * 5;
		-
		str.substring(2, 3);
		"0"
		Integer.parseInt("7");

		tot += chk[0] * 7;
		*/
		
		for (int i=0; i<13; i++)
		{
			//System.out.print(i + " " ); // 0~12
			
			if (i==6)
			{
				continue; // (�޺κ� �����ϰ�... + ) ����ض�(//@ i�� 6�ΰ� �����ϰ� 7���� �����ض�)
			}
			
			tot += chk[i] * Integer.parseInt(str.substring(i, (i+1)));					 //-- �޺κ�
			//         0 �� 2                              0   1 �� "7" => tot += 2 * 7
			//         1 �� 3							   1   2 �� "5" => tot += 3 * 5  
			//                               ��
			//        12 �� 5							  12  13 �� "8" => tot += 5 * 8
		}

		//------------------------------------- ������� �����ϸ� �� �� �� �� ��� ���� ��Ȳ�̸�
		//                                      ��Ģ�� �°� ���� ������ ������ ����� ��� ���� ����
		//                                      ���� tot �� ��� �ִ� ��Ȳ�� �ȴ�.

		int su = 11 - tot % 11;

		// �׽�Ʈ
		//System.out.println(su);
		// 10
		// 11
		
		// ���� ��� ��� ������... �߰� ���� �ʿ�~!!!
		// su �� ���� ���� ����� �� �ڸ��� ���� ���(10 �Ǵ� 11)
		// �ֹι�ȣ ������ �ڸ��� ���ڿ� ���� �� ���� ��Ȳ
		su = su % 10; // su %= 10;
		
		//------------------------------- ������� �����ϸ� �� �� �� �� ��� ���� ��Ȳ�̸�
		//								  ���� ���� ����� ���� su �� ����ִ� ��Ȳ�� �ȴ�.

		//if (su==�ֹε�Ϲ�ȣ���������ڸ�����)
		if (su==Integer.parseInt(str.substring(13)))
			System.out.println(">> ��Ȯ�� �ֹι�ȣ~!!!");
		else
			System.out.println(">> �߸��� �ֹι�ȣ~!!!");
	}
}

// �Է� ���
/*
�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1252085
>> ��Ȯ�� �ֹι�ȣ~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 750615-1234567
>> �߸��� �ֹι�ȣ~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
�ֹι�ȣ �Է�(xxxxxx-xxxxxxx) : 1922222-2222222
>> �Է� ����~!!!
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/