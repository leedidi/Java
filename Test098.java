/*=================================
   ■■■ 클래스와 인스턴스 ■■■
   - 클래스와 인스턴스 활용
 =================================*/

 //@@ 속도가 늦어도 되니까 차분하게 코드 작성하기~ 오타 주의!!
 //@@ 블레이스 여닫는거! 띄어쓰기, 들여쓰기 확실히 되어있어야 함
 //@@ 블레이스에 마우스 찍으면 하늘색으로 어느 블레이스랑 닫혀있는지 나옴! 끝에 정리하기
 //@@ 에러나면 바로 화면코드 부르기보단 스스로 해결해보는 습관 들여보기! 시간 필요하면 줌 
 //@@ 들여쓰기 주의! 품고있으면 들여쓰기

 // @
 //class 클래스
 //{
 //		//클래스 내부
 //		변수 선언;
 //		메소드() 정의
 //		{
 //			// 메소드 내부
 //			for
 //			{
 //				while()
 //				{
 //				}
 //			}
 //		}
 //	}		

 // 1 ~ 3 사이의 난수를 발생시켜서
 // 가위, 바위, 보 게임 프로그램을 구현한다.
 // 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
 // 또한, 배열을 활용하여 처리할 수 있도록 한다.
 // 최종적으로 RpsGame 클래스를 완성할 수 있도록 한다.

 // ※ 기준 데이터 → 1: 가위, 2: 바위, 3: 보

 // 실행 예)
 // 1:가위  2:바위  3:보  중 입력(1~3) : 4
 // 1:가위  2:바위  3:보  중 입력(1~3) : -2
 // 1:가위  2:바위  3:보  중 입력(1~3) : 2

 // - 유저   : 바위
 // - 컴퓨터 : 보

 // >> 승부 최종 결과 : 컴퓨터가 이겼습니다~!!!
 // 계속하려면 아무 키나 누르세요 ...

/*
//[내가 작성한 코드]

import java.util.Scanner;
import java.util.Random;

 class RpsGame
 {
	 private int user;
	 private int com;
	 String result="";

	 // 배열에는 가위 바위 보

	 public void set()
	 {
		 do
		 { 
			Scanner sc = new Scanner(System.in);
			System.out.print("1:가위  2:바위  3:보  중 입력(1~3) : "); //1,2,3
			user = sc.nextInt();
		 }
		 while (user<1 || user>3);
	
	 }

	 public void input()
	 {
		String[] hand = {"가위", "바위", "보"}; //0, 1, 2
		 //int hand[] = new hand[3];
		 //int[] score = new int[3];	// score[0] = 국어, score[1] = 영어, score[2] = 수학
		 
		 //랜덤 이용한 컴퓨터가 낸 모습 계산
		 Random rd = new Random();
		 com = rd.nextInt(3)+1;

		 // 가위 바위 보 이기고 지고 계산
		 if(user == com)
		 {
			 result = "비겼습니다.";
			 else if (user=1)
			 {
			 }
		 }

	 }
	
		
		// 가위바위보 가위 바위 보  가위1-가위1(비김)	바위2-가위1(이김)	 보3-가위1(짐)
		//                                바위2(짐)			  바위2(비김)		 바위2(이김)
		//								  보  3(이김)         보  3(짐)          보  3(비김)
		

	 public void print()
	 {
	 }

 }

public class Test098
{
	public static void main(String[] args)
	{	
		RpsGame ob = new RpsGame();
		ob.set();
		ob.input();
		ob.print();

	}
}
*/

//[같이 작성한 코드]

import java.util.Random;
import java.util.Scanner;

 class RpsGame
 {
	 private int user;
	 private int com;

	 private void runCome()
	 {
		 Random rd = new Random();
		 com = rd.nextInt(3)+1;		//-- 0 1 2 → 1 2 3
	 }

	 public void input()
	 {
		 runCome();

		 Scanner sc = new Scanner(System.in);

		 do
		 {
			 System.out.print("1:가위  2:바위  3:보  중 입력(1~3) : ");
			 user = sc.nextInt();
		 }
		 while (user<1 || user>3);

	 }//end input()
	
	 // 중간 결과 출력
	 public void middleCalc()
	 {

		 String[] str = {"가위", "바위", "보"};

		 System.out.println();
		 System.out.println("- 유저    : " + str[user-1]); //str[1] str[2] str[3] → str[0] str[1] str[2]
		 System.out.println("- 컴퓨터  : " + str[com-1]);  //str[1] str[2] str[3] → str[0] str[1] str[2]

	 }

	 // 승부에 대한 결과 연산
	 public String resultCalc()
	 {
		 String result = "무승부 상황입니다~!!!";

		 //if ((유저 가위 && 컴 보) || (유저 바위 && 컴 가위) || (유저 보 && 컴 바위)) // 사용자가 승리한 상황
		 if ((user==1 && com==3) || (user==2 && com==1) || (user==3 && com==2)) 
		 {
			 result = "당신이 승리했습니다~!!!";
		 }
		 //else if ((유저 가위 && 컴 바위) || (유저 바위 && 컴 보) || (유저 보 && 컴 가위)) // 컴퓨터가 승리한 상황
		 else if ((user==1 && com==2) || (user==2 && com==3) || (user==3 && com==1))
		 {
			 result = "컴퓨터가 승리했습니다.ㅠㅠ";
		 }

		 return result;

	 }//end resultCalc()
	 
	 // 최종 결과 출력
	 public void print(String str)
	 {
		 System.out.printf("\n>> 승부 최종 결과 : %s\n", str);
	 }

 }

 
 // main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test098
{
	public static void main(String[] args)
	{	
		RpsGame ob = new RpsGame();

		ob.input();
		ob.middleCalc();
		String result = ob.resultCalc();
		ob.print(result);
	}
}

// 실행 결과
/*
1:가위  2:바위  3:보  중 입력(1~3) : 2

- 유저    : 바위
- 컴퓨터  : 보

>> 승부 최종 결과 : 컴퓨터가 승리했습니다.ㅠㅠ
계속하려면 아무 키나 누르십시오 . . .
*/

/*
1:가위  2:바위  3:보  중 입력(1~3) : 2

- 유저    : 바위
- 컴퓨터  : 바위

>> 승부 최종 결과 : 무승부 상황입니다~!!!
계속하려면 아무 키나 누르십시오 . . .
*/

/*
1:가위  2:바위  3:보  중 입력(1~3) : 1

- 유저    : 가위
- 컴퓨터  : 보

>> 승부 최종 결과 : 당신이 승리했습니다~!!!
계속하려면 아무 키나 누르십시오 . . .
*/
