 /*==========================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 자바의 기본 입출력 : java.util.Scanner
 ===========================================*/

// ※ java.util.Scanner
//	  단락 문자 패턴을 사용하여 입력을 토큰에 따라 분할하며
//	  디폴트(default)로 사용되는 단락문자는 공백이다.
//	  작성된 다음 토큰은 『next()』 메소드를 사용
//	  다른 형태(자료형)의 값으로 변환할 수 있다.

// 입력 : "사과 딸기 바나나" // 사과, 딸기, 바나나 로 분할!
//	      "10 20 30"


//@ >> 컴퓨터에서 기능이 많으면 성능이 떨어짐! (ex, 1분에 얼마나 빨리 많이 출력하느냐, 흑백프린터A, 와이파이개념 탑재된 컬러프린터 B)
												//->> 기능은 B가 많고, 성능은 A가 좋음!

import java.util.Scanner; //@ 설계도면대로 자바야 니가 만들어줘!
//import java.lang.Integer; //@ 이미 자바안 내장되어있음 따로안써도 ㅇㅋㅇㅋ

public class Test016
{
	public static void main(String[] args) // throws IOException //@ Scanner는 자바와 이미 탑승시키기로 계약 끝냄!
																 //@ IOException 사용 없이도 외부 승객 탑승 자바가 허용.
	{	
		// ○ 주요 변수 선언

		// Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in); //@ 자바야 니가 읽어온 설계도대로 니가 퍼 올려줘!
											 //@ Scanner는 안에 통역기능 이미 장착, System.in 그대로 넘겨줘도 가능.
											 //@ buffered~ 는 구형모델, Scanner는 신형 모델
											 //@ But 당분간은 buffered 쓸거.. Scanner는 나중에 자주 쓸거기 때문
											 //@ 한번 구성한 스캐너로 계속 읽어옴!

		String name;		//-- 이름
		int kor, eng, mat; //--국어, 영어, 수학 점수

		// ○ 연산 및 처리
		System.out.print("이름을 입력하세요 : ");
		//br.readLine();
		name = sc.next(); //@ 윙~~ 하며 사과 다음 딸기 다음 바나나 읽어주는 처리 해줌

		System.out.print("국어점수 입력 : ");
		//kor = Integer.parseInt(br.readLine()); /@ Integer 상자 안에 있는 parseInt!
		//kor = Integer.parseInt(sc.next());
		//sc.nextInt() : 정수타입
		//sc.nextDouble() : 실수타입
		//sc.next() : 문자열
		kor = sc.nextInt();

		System.out.print("영어점수 입력 : ");
		eng = sc.nextInt();

		System.out.print("수학점수 입력 : ");
		mat = sc.nextInt();

		// ○ 결과 출력
		System.out.println();
		System.out.println(">> 이름 : " + name);
		//@ System.out.println(">> 총점 : " + kor + eng + mat); //@ 908070.. 총점~ 문자기 때문에!
		System.out.println(">> 총점 : " + (kor + eng + mat)); //@(kor + eng + mat) : 정수, 총점~문자와 결합해도 무사히 나옴

	}
}

// 실행 결과
/*
이름을 입력하세요 : 이다영
국어점수 입력 : 90
영어점수 입력 : 90
수학점수 입력 : 90

>> 이름 : 이다영
>> 총점 : 270
계속하려면 아무 키나 누르십시오 . . .
*/