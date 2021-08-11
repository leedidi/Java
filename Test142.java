/*=========================================
  ■■■ 자바의 주요(중요) 클래스 ■■■
  - Random 클래스
===========================================*/

/*
○ java.util.Random 클래스는

   여러 형태의 난수를 발생시켜 제공하는 클래스이다.
   Math 클래스의 정적 메소드인 random() 메소드도
   난수를 발생시켜 제공하는 메소드이지만
   0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
   필요한 여러 형태의 난수를 만들어내기 위해서는
   추가적인 연산들을 수행해야 한다.
   그래서 자바는 여러 형태의 난수를 발생시켜주는
   전용 클래스인 Random 클래스를 별도로 제공하고 있다.
*/

// 로또 번호 생성기 (난수 발생 프로그램)
//@ 코테때 한창 많이 생성하라고 했던 부분~! 얼마전에도 함
//@ 로직 사용 방법이 다양! 오래전부터 출제자들에게 사랑받고 있는 유형...
//@ API 도큐먼트 확인하기~!!

// 프로그램이 실행되면 기본적으로 로또를
// 5게임 수행하는 프로그램을 구현한다.

// 실행 예)
// 3 5 12 24 31 41
// 1 2 9 22 35 38
// 4 9 11 13 22 31
// 5 10 13 15 28 40
// 22 31 32 33 40 45
// 계속하려면 아무 키나 누르세요...

//@ 주의! 한 게임 안에서 중복된 숫자 만들어지면 X

// [내가 작성한 코드]
/*
import java.util.Random;

public class Test142
{
	public static void main(String[] args)
	{	
		// 로또 배열 생성
		int[] lot = new int[6];

		// 랜덤으로 숫자 생성
		// 주의! 한 게임 안에서 중복된 숫자 만들어지면 X

		Random rd = new Random();
		
		for (int i=0; i<5; i++)
		{
			for (int j=0; j<6; j++)
			{	
				if (j==0)			// 맨 처음 숫자 1 뽑음
				{
					lot[j] = rd.nextInt(44)+1;
					System.out.printf("%d ",lot[j]);
				}	
				else				// 이후 숫자 2,3,4,5,6 뽑음(앞 숫자들과 같지 않게 비교해야 함)
					do
					{
						lot[j] = rd.nextInt(44)+1;
						System.out.printf("%d ",lot[j]);
					}
					while (lot[j-1] == lot[j]);
			}
			System.out.println();
		}
		

	}
}
*/

//[함께 작성한 코드]

import java.util.Random;
import java.util.Arrays; //@Array가 아니라 Arrays!

class Lotto
{
	// 배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6칸
	private int[] num = new int[6];
	
	//@ 외부에서 값 채울 일 없으므로 setter 필요 x, getter는 필요!
	// getter
	public int[] getNum()
	{
		return num;
	}

	// 6개의 난수를 발생시키는 메소드 정의
	//@ 받기만 할 것이므로 void, 외부에서 사용할 것이므로  public
	public void start()
	{
		Random rd = new Random();

		int n;
		int cnt=0; //@ 카운터 변수
		
		// check~!!!
		jump: //@ 빈번한 사용이 바람직하지 않음...! 코드 너무 길어질 때만 간혹 사용
			  //@ 미리 열어둔 포탈에서 퉁 튀어나옴!

		while (cnt<6)	//웅~ → 0 1 2 3 4 5
		{
			n = rd.nextInt(45)+1;		// 0 ~ 44 → (+1) → 1 ~ 45
			// 45  13  9 

			for (int i=0; i<cnt; i++)	// 쑝~ 0→비교안함 / 1→0 / 2→01 / 3→012 / 4→0123 / 5→01234
			{//            0<1
				if(num[i]==n)
				{
					// 난수를 다시 발생시킬 수 있도록 처리
					continue jump;
				}
			}

			num[cnt++] = n; 
			//num[0] = 45
		}

		//정렬 메소드 호출
		sorting();



	}//end start()

	// 정렬 메소드 정의
	private void sorting()
	{
		Arrays.sort(num);
	}
}

public class Test142
{
	public static void main(String[] args)
	{	
		// Lotto 클래스 기반 인스턴스 생성
		Lotto lotto = new Lotto();

		// 기본 - 5게임
		for (int i=1; i<=5; i++)
		{
			lotto.start();
			
			// 결과 출력
			for (int n : lotto.getNum())
			{
				System.out.printf("%4d", n);
			}
			System.out.println();
		}
	}
}

// 실행 결과
/*
   8  17  33  35  39  42
   2   6  21  27  31  39
  14  20  22  24  32  36
   3  13  16  20  28  42
   7  20  22  24  35  45
계속하려면 아무 키나 누르십시오 . . .
*/