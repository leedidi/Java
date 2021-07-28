/*==================================
   ■■■ 클래스와 인스턴스 ■■■
   - 생성자(Constructor)
 ===================================*/

public class Test072
{	
	//int val1;
	//double val2;
	int x;
	double y;

	Test072()
	{	
		//val1=0;
		//val2=0;
		x=0;
		y=0;
		System.out.println("매개변수 없는 생성자...");
	}

	Test072(int x)
	{	
		//val1=x;
		//val2=0;
		this.x=x;
		y=0;
		System.out.println("int형 데이터를 매개변수로 받는 생성자...");
	}

		Test072(double y)
	{	
		//val1=0;
		//val2=y;
		x=0;
		this.y=y;
		System.out.println("double형 데이터를 매개변수로 받는 생성자...");	
	}

		Test072(int x, double u)
	{	
		//val1=x;
		//val2=y;
		this.x=x;
		this.y=y;
		System.out.println("int형 변수와 double형 변수를 매개변수로 받는 생성자...");
	}

	public static void main(String[] args)
	{
		Test072 ob1 = new Test072();
		//--==>> 매개변수 없는 생성자...

		Test072 ob2 = new Test072(4);
		//--==>> int형 데이터를 매개변수로 받는 생성자...

		Test072 ob3 = new Test072(4.0);
		//--==>> double형 데이터를 매개변수로 받는 생성자...

		Test072 ob4 = new Test072(4, 4.0);
		//--==>> int형 변수와 double형 변수를 매개변수로 받는 생성자...

		//System.out.println(ob1.val1 + ", " + ob1.val2);
		System.out.println(ob1.x + ", " + ob1.y);
		//--==>> 0, 0.0
	
		//System.out.println(ob2.val1 + ", " + ob2.val2);
		System.out.println(ob2.x + ", " + ob2.y);
		//--==>> 4, 0.0
		
		//System.out.println(ob3.val1 + ", " + ob3.val2);
		System.out.println(ob3.x + ", " + ob3.y);
		//--==>> 0, 4.0
	
		//System.out.println(ob4.val1 + ", " + ob4.val2);
		System.out.println(ob4.x + ", " + ob4.y);
		//--==>> 4, 4.0

	}
}

// 실행 결과
/*
매개변수 없는 생성자...
int형 데이터를 매개변수로 받는 생성자...
double형 데이터를 매개변수로 받는 생성자...
int형 변수와 double형 변수를 매개변수로 받는 생성자...
0, 0.0
4, 0.0
0, 4.0
4, 0.0
계속하려면 아무 키나 누르십시오 . . .
*/