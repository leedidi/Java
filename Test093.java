/*================================
   ■■■ 클래스와 인스턴스 ■■■
   - 정보 은닉과 접근제어지시자
 =================================*/

import java.util.Scanner;

class CircleTest2
{	
	// 정보 은닉(Information Hiding)
	// 멤버 변수, 인스턴스 변수, 전역 변수
	// 『private』 이라는 접근제어지시자의 선언은
	// 클래스 내부에서만 접근 및 참조가 가능하게 하겠다는 의미
	// int형 변수 0으로 초기화 지원
	private int r;

	//int r;

	// getter / setter 구성
	/*
	int getR()
	{
		return r;
	}

	void setR(int r)
	{
		this.r = r;
	}
	*/

	void input() //@ input 메소드
				 // 설탕통에 돌맹이를 넣으면 다시 입력하게 해라.. 제어 가능
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("반지름 입력 : ");
		r = sc.nextInt();

	}

	double calArea()
	{
		return r * r * 3.141592;
	}

	void write(double a)
	{
		System.out.println("반지름 : " + r);
		System.out.println("넓  이 : " + a);
	}
}


public class Test093 //@ CircleTest2 외부의 다른 클래스
{
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();

		//ob1.r = 10;
		//System.out.println("원의 반지름 : " + ob1.r);

		//ob1.setR(10);
		//System.out.println("원의 반지름 : " + ob1.getR());

		//ob1.r = 10000;

		ob1.input();
		double result = ob1.calArea();
		ob1.write(result);
	}
}

// 실행 결과
/*
반지름 입력 : 5000
반지름 : 5000
넓  이 : 7.85398E7
계속하려면 아무 키나 누르십시오 . . .
*/