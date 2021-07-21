/*===================================
  ■■■ 연산자(Operator) ■■■
  - 삼항 연산자 == 조건 연산자
 ===================================*/

 // 사용자로부터 임의의 정수를 입력받아
 // 입력받은 정수가 양수인지, 음수인지, 0인지 구분하려 (@세갈래길!)
 // 이 결과를 출력하는 프로그램을 구현한다.
 // 단, 입력 데이터는 BufferedReader 의 readLine() 을 통해 넘겨받을 수 있도록 한다.
 // 또한, 조건연산자(삼항연산자)를 활용하여 기능을 구현할 수 있도록 한다.

 // 실행 예)
 // 임의의 정수 입력 : -12
 // -12 → 음수
 // 계속하려면 아무 키나 누르세요...

 // 임의의 정수 입력 : 257
 // 257 → 양수
 // 계속하려면 아무 키나 누르세요...
 
 // 임의의 정수 입력 : 0
 // 0 → 영
 // 계속하려면 아무 키나 누르세요...
/*
[내가 만든 코드]

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test027
{
	public static void main(String[] args) throws IOException
	{
		// 주요 변수 선언
		int n;
		String strResult;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		// 0인지 홀수인지 짝수인지에 대한 판별 연산

		strResult = n==0 ? "영" : ((n<0)? "음수" : "양수");

		// 결과 출력
		System.out.printf("%d → %s\n", n, strResult);
	}
}
*/
//@ 임포트 구문은 꼭 클래스 !앞!에 있어야 함!
//@ 자바야 클래스에서 이거 쓸거니까 경로가서 이거 먼저 공부하고 와~!
//@ 순서는 상관 없다!

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//import java.io.*; //@ 이렇게 쓰는거 가능은 하지만 추천하지 않음
					//@ 1> 시험범위가 챕터 세개인데 자바한테 공부 책 한권 다하라고 하는 거!
					//@    자바가 혹사당함 ㅠㅠ ㅋㅋ 좀더 친절하게 자바한테 안내 해주는 거. 더 효율적임
					//@ 2> 지금 우리가 만든거 사용 X, 있는거 가져다가 사용
					//@    시간 지나면 우리가 만든 설계도 사용할 것
					//@      
					//@  ex)  com > test > Circle
					//@       com > test > Rent
					//@       
					//@       com > run > Circle
					//@       com > run > Rent
					//@      
					//@  
					//@      import com.test.Circle;
					//@      import com.run.rent
					//@  
					//@ 만약 , import com.test.*;
					//@        import com.run.rent 쓴다면 rent가 두번! rent 사용할수X
					//@  
					//@ 3> 세번째, 우리는 input~buffered~ 이름 한번이라도 더 익히고 
					//@	   어디있는지 한번이라도 더 써봐야 하기 때문!
					//@
					//@ *> 우리는 일단 어떤 기능이 있구나 정도 알고 있으면 ㅇㅋㅇㅋ
					//@ 실무에서 배포하는건 class파일. 까보면 어떻게 코딩되어있는지 알수없고, 수정할수도 없음!
					//@ java 파일 : 뜯어볼수 있는 전자제품. 열어보면 어떻게 구성, 설계되어있는지 알수있음 class파일은 열어봐도 알수X
					//@ 이것처럼 io ~~ 도 안에 보기 어려움. 뜯어보려면 힘듬,,,,!! 일단은 어떤 기능이 있구나만 알면 ㅇㅋㅇㅋ
					//@ 카레이서 : 일단 운전기법만 알면 ㅇㅋ. 나중에 완전 발전해서 고급카레이서가되면 차의 역학관계, 구성 알아서
					//@ 종이한장 차이의 초 차이를 줄이려고 하기 위해서 차 구조 알려고 하는것.. 그정도의 레벨임 지금 우리 눈높이에서는
					//@ 운전실력 향상시키는게 일단 도움됨!


//import java.lang,*;

//[같이 실행한 코드]
public class Test027
{
	public static void main(String[] args) throws IOException
	{	
		// 주요 변수 선언
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n;				//-- 사용자 입력값을 담을 변수
		String strResult;	//-- 음수인지 양수인지 영인지 판별 결과를 담을 변수
		
		// 연산 및 처리
		System.out.print("임의의 정수 입력 : ");
		n = Integer.parseInt(br.readLine());
		/*
		n이 0보다 크다 → true	→ n은 양수
					   → false → n이 0이다 → true  → n은 영
					   						 → false → n은 음수
		*/

		strResult = (n>0)? ("양수") : ( (n<0) ? ("음수") : ("영") );
		// 10
		// strResult = (10>0)? ("양수") : ( (n<0) ? ("음수") : ("영") );
		// strResult = (true)? ("양수") : ( (n<0) ? ("음수") : ("영") );
		// strResult = "양수"

		//-4
		// strResult = (-4>0)? ("양수") : ( (n<0) ? ("음수") : ("영") );
		// strResult = (false)? ("양수") : ( (n<0) ? ("음수") : ("영") );
		// strResult = = ( (-4<0) ? ("음수") : ("영") );
		// strResult = ( (true) ? ("음수") : ("영") );
		// strResult = : ( (true) ? ("음수") : ("영") );
		// strResult = ("음수");
		// strResult = "음수";

		//0
		// strResult = (0>0)? ("양수") : ( (n<0) ? ("음수") : ("영") );
		// strResult = (false)? ("양수") : ( (n<0) ? ("음수") : ("영") );
		// strResult = ( (0<0) ? ("음수") : ("영") );
		// strResult = ( false ? ("음수") : ("영") );
		// strResult = ( ("영") );
		// strResult = "영";


		// 결과 출력
		System.out.println(n + " → " + strResult);

	}
}

//[같이 실행한 코드] 실행 결과
/*
임의의 정수 입력 : -11
-11 → 음수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 84
84 → 양수
계속하려면 아무 키나 누르십시오 . . .

임의의 정수 입력 : 0
0 → 영
계속하려면 아무 키나 누르십시오 . . .

*/


//[내가 만든 코드] 실행 결과

/*
임의의 정수 입력 : -12
-12 → 음수
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력 : 10
10 → 양수
계속하려면 아무 키나 누르십시오 . . .
*/

/*
임의의 정수 입력 : 0
0 → 영
계속하려면 아무 키나 누르십시오 . . .

*/