/*=============================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 변수와 자료형
  - 자바의 기본 입출력 : BufferedReader 클래스
 ==============================================*/

 // 사용자로부터 이름, 국어점수, 영어점수, 수학점수를 입력받아
 // 이름과 총점을 출력하는 프로그램을 구현한다.

 // 실행 예)
 // 이름을 입력하세요 : 최현정
 // 국어 점수 입력 : 90
 // 영어 점수 입력 : 80
 // 수학 점수 입력 : 70

 // ====[결과]====
 // 이름 : 최현정
 // 총점 : 240
 // 계속하려면 아무 키나 누르세요...

/* [내가 풀이한 내용]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String name;
	int korean, english, math, sum;

	System.out.print("이름을 입력하세요 : ");
	name = br.readLine();

	System.out.print("국어 점수 입력 : ");
	korean = Integer.parseInt(br.readLine());

	System.out.print("영어 점수 입력 : ");
	english = Integer.parseInt(br.readLine());

	System.out.print("수학 점수 입력 : ");
	math = Integer.parseInt(br.readLine());

	System.out.println();
	System.out.println("====[결과]====");
	System.out.println("이름 : " + name);

	sum = korean + english + math;
	System.out.println("총점 : " + sum);

		}
}

	
// 결과 출력
이름을 입력하세요 : 이다영
국어 점수 입력 : 90
영어 점수 입력 : 90
수학 점수 입력 : 90

====[결과]====
이름 : 이다영
총점 : 270
계속하려면 아무 키나 누르십시오 . . .

*/

//[같이 풀이한 내용]
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test013
{
	public static void main(String[] args) throws IOException
	{	
		// ○ 주요 변수 선언

		//BufferedReader 인스턴스 생성
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);			//@ 두 방법 다 사용할수 있어야함! 상황따라 다르게 사용. 
																//@ 지금 외울필요는X

		String strName; //@문자열이니까 String! 난 처음에 int썼음...ㅠㅋㅋ   //-- 이름 변수
		int nkor, nEng, nMat;												 //-- 국어, 영어, 수학 점수 변수
		int nTot;															 //-- 총점 변수

		//추가 변수 선언
		String strTemp;		//-- 문자열 데이터 임시 저장 변수

		// ○ 연산 및 처리
		// - 사용자에게 안내 메세지 출력(이름 입력 안내)
		System.out.print("이름을 입력하세요 : ");

		// - 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strName = br.readLine();

		// - 사용자에게 안내 메세지 출력(국어 점수 입력 안내)
		System.out.print("국어 점수 입력 : ");

		// - 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();				//"90"

		// - 담아낸 값을 필요한 변수에 옮겨 담기
		nkor = Integer.parseInt(strTemp);		// 90 = integer~("90")
		// -- 임시 저장 변수 strTemp 에 담겨있는 값을
		// 형 변환 후... 국어점수 변수에 담아내기

		// - 사용자에게 안내 메세지 출력(영어 점수 입력 안내)
		System.out.print("영어 점수 입력 : ");

		// - 사용자가 입력한 값(외부 데이터)을 변수에 담아내기
		strTemp = br.readLine();				//"80"
		//@원래있던 국어점수 담겼던 strTemp 값은 사라짐. 덮어쓰기 개념
		
		// - 담아낸 값을 필요한 변수에 옮겨 담기
		nEng = Integer.parseInt(strTemp);
		// -- 임시 저장 변수 strTemp 에 담겨있는 값을
		// 형 변환 후... 영어점수 변수에 담아내기

		System.out.print("수학 점수 입력 : ");
		strTemp = br.readLine();
		nMat = Integer.parseInt(strTemp);


		// - 각 점수 변수에 담겨있는 데이터(입력 데이터)들을
		//	 종합하여 총점을 산출하고
		//   그 결과를 총점 변수에 담아내기
		nTot = nkor + nEng + nMat;

		// ○ 결과 출력
		System.out.println("\n====[결과]====");
		//System.out.println("이름 : " + strName);
		System.out.printf("이름 : %s\n", strName); //@ 정수 형태: %d / 실수 형태: %f / 문자열 형태 : %s / \n: 개행
		//System.out.println("총점: " + nTot);
		System.out.printf("총점 : %d\n", nTot);
	}
}
//@ 현재Test 오른쪽 > 다른문서 닫기 : 현재 파일빼고 나머지 닫기 가능
//@ 왼쪽 java class~~ 칸에서 f5 누르면 새로고침해서 새파일들 확인 가능
//@ java 파일들 메모장으로도 볼수 있음!

//결과 출력
/*
이름을 입력하세요 : 이다영
국어 점수 입력 : 90
영어 점수 입력 : 90
수학 점수 입력 : 90

====[결과]====
이름 : 이다영
총점 : 270
계속하려면 아무 키나 누르십시오 . . .
*/