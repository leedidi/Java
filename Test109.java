/*===========================
   ���� Ŭ���� ��� ����
   - ���(Inheritance)
 ============================*/

// ������ ���� ���α׷��� �����Ѵ�.
// ��, ����� ������ �����Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ �� ���� �Է�(���� ����) : 20 15
// ������ �Է�(+ - * /) : -
// >> 20 - 15 = 5.00
// ����Ϸ��� �ƹ� Ű�� ��������...

//@ A Ŭ������ �ǵ���x, B Ŭ������ �����ؼ� �غ���....
//@@@ Test109_1(�� ���� ���� �ذ��غ���) ���� �ذ� �ϴ°� Test109�� �����ϴ°ŵ� �����!!
//@@@ ��Ÿ�ӿ����� ��¼��� printf �߸� ���� Ȯ�� ����!!!


// [���� �ۼ��� �ڵ�]
/*
import java.util.Scanner;
import java.io.IOException;

class Aclass
{
	protected int x,y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	}
}

class Bclass extends Aclass
{
	// ��ӹ��� �͵�

	//void write(double result)
	//{
	//	System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	//}
	//
	
	public Bclass()
	{
		super();
	}

	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �� ���� �Է�(���� ����) : ");
		super.x = sc.nextInt();
		super.y = sc.nextInt();

		System.out.print("������ �Է�(+ - * /) : ");
		super.op = (char)System.in.read();
		
	}

	int calc()
	{
		int result = 0;

		switch(op)
		{
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = x / y; break;
		}
		
		return result;

	}


}

public class Test109
{
	public static void main(String[] args) throws IOException
	{
		Bclass bc = new Bclass();
		bc.input();
		int result = bc.calc();
		
	}
}
*/

//[���� �ۼ��� �ڵ�]

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

// super class
class Aclass
{
	protected int x,y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	}
}

// sub class �� Aclass �� ��ӹ޴� Ŭ����
class Bclass extends Aclass
{
	/*
	protected int x,y;
	protected char op;

	void write(double result)
	{
		System.out.printf(">> %d %c %d = %.2f%n", x, op, y, result);
	}
	*/
	
	/*
	Bclass() //@ ����� ���� ������ ���Ծ����� �ڵ� ����
	{
		super();
	}
	*/

	// �Է�
	/////@@@ �� ��������....????? >> return value ���� �Ƹ� boolean�̶�? > ���� ���� �ƴ�!
	boolean input() throws IOException
	{
		//@ bufferedReader�� �Է¹޾� ���ڿ� �߶󳻱� �غ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ �� ���� �Է�(���� ����) : "); // : 20 15
		//int su1 = sc.nextInt();
		//int su2 = sc.nextInt();
		String temp = br.readLine();		 // "20 15" <<@ ���ڿ� ����
		String[] strArr = temp.split("\\s"); // ������ �� ����! //@ " " ��� �ϸ� �ȵ�~!
		// String[] strArr = {"20", "15"}

		// �� ���ڿ�.split("������")
		//    ex) "10 20 30 40".split("\\s"); //@ \s : ����, ���ڿ� �������� \\s�� �ۼ��ؾ� ��
		//										  \t ��, \n ���� \s ġ�� ��ٷ�����! 
		//									      %�� %�� ġ�� ��ٸ��� \�� \�� ���� ��ٸ� > &&,\\ �ۼ�
		//        �� {"10", "20", "30", "40"} ��ȯ

		if (strArr.length != 2)
			return false;

		//-- false �� ��ȯ�ϸ� input() �޼ҵ� ����
		//   �� ������ ������ ���....
		//   �� �ڵ��� �Ʒ��� �����ؾ� �� �ڵ尡 �����ִ���
		//   ������� ��ȯ�ϸ� �޼ҵ�� ����ȴ�.

		//@ return �ڿ� ...; ...; ���� ���� ��

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);

		System.out.print("������ �Է�(+ - * /) : ");
		op = (char)System.in.read();
		
		/*
		if(op != '+' && op != '-' && op != '*' && op != '/')
		{
			return false;
		}
		return true;
		*/

		if (op=='+' || op=='-' || op=='*' || op=='/')
		{
			return true;
		}
		return false;

	}//end input();

	double calc()
	{
		double result = 0;

		switch(op)
		{
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = (double)x / y; break; //@ ���� �ϳ��� �Ǽ����·� �ؼ� �Ǽ����·� ����� ��ȯ
		}
		return result;

	}// end calc()

}//end Bcalss

// main() �޼ҵ带 �����ϴ� �ܺ��� �ٸ� Ŭ����
public class Test109
{
	public static void main(String[] args) throws IOException
	{
		Bclass ob = new Bclass();
		
		if (!ob.input()) //@ false���! //@ IOException ���... ���� ������� ��
		{
			System.out.println("Error...");
			return; // ���α׷� ����
		}
		
		double result = ob.calc();

		ob.write(result);

	}//end main()

}// end class Test109

/*
������ �� ���� �Է�(���� ����) : 25 17
������ �Է�(+ - * /) : -
>> 25 - 17 = 8.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ �� ���� �Է�(���� ����) : 1
Error...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ �� ���� �Է�(���� ����) : 10 20 30
Error...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ �� ���� �Է�(���� ����) : 10 20
������ �Է�(+ - * /) : 2
Error...
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
������ �� ���� �Է�(���� ����) : 25 2
������ �Է�(+ - * /) : *
>> 25 * 2 = 50.00
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
