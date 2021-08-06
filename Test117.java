/*===========================
  ■■■ 클래스 고급 ■■■
  - 인터페이스(Interface)
===========================*/

// ○ 실습 문제
// 성적 처리 프로그램을 구현한다.
// 단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 2108006 권순모
// 국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2108024 김소연
// 국어 영어 수학 점수 입력   (공백 구분) : 85 70 65

// 2108006 권순모    90 100  85      275      91
//                   수  수  우
// 2108024 김소연    85  70  65      220      73
//                   우  미  양

// 계속하려면 아무 키나 누르세요...

import java.util.Scanner;

// 속성만 존재하는 클래스 → 자료형 활용
class Record
{
	/*
	public void set();		//-- 인원 수 구성
	public void input();	//-- 상세 데이터 입력
	public void print();	//-- 결과 출력
	*/

	String hak, name;		//-- 학번, 이름
	int kor, eng, mat;		//-- 국어, 영어, 수학 점수
	int tot, avg;			//-- 총점, 평균(편의상 정수 처리)
}

// 인터페이스
interface Sungjuk
{
	public void set();		//-- 인원 수 구성
	public void input();	//-- 상세 데이터 입력
	public void print();	//-- 결과 출력
}

// 문제 해결 과정에서 설계해야 할 클래스 → Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk
{
	int inwon;
	Record[] rc;
	String[][] rank;

	@Override
	public void set()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수 입력(1~10) : ");
		inwon = sc.nextInt();

		rc = new Record[inwon];
		rank = new String[inwon][3];
	}

	@Override
	public void input()
	{
		Scanner sc = new Scanner(System.in);

		int i=0;

		do
		{
			rc[i] = new Record();

			System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", i+1);
			rc[i].hak = sc.next();
			rc[i].name = sc.next();

			System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");
			rc[i].kor = sc.nextInt();
			rc[i].eng = sc.nextInt();
			rc[i].mat = sc.nextInt();

			rc[i].tot = rc[i].kor + rc[i].eng + rc[i].mat;
			rc[i].avg = rc[i].tot / 3;

			rank[i][0] = panjung(rc[i].kor);
			rank[i][1] = panjung(rc[i].eng);
			rank[i][2] = panjung(rc[i].mat);

			i++;
		}
		while (i<inwon);

	}

	private String panjung(int score)
	{
		String result;

		switch (score / 10)
		{
		case 10 : case 9 : result = "수"; break;
		case 8 : result = "우"; break;
		case 7 : result = "미"; break;
		case 6 : result = "양"; break;
		default : result = "가"; break;
		}

		return result;
	}

	@Override
	public void print()
	{
		for (int i=0; i<inwon; i++)
		{
			System.out.printf("%s %3s   %3d %3d %3d      %d      %d\n",
							rc[i].hak, rc[i].name, rc[i].kor, rc[i].eng, rc[i].mat, rc[i].tot, rc[i].avg);
			System.out.printf("                  %s  %s  %s\n", 
							rank[i][0], rank[i][1], rank[i][2]);
		}
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test117
{
	public static void main(String[] args)
	{
		Sungjuk ob = new SungjukImpl();

		// 문제 해결 과정에서 작성해야 할 ob 구성

		ob.set();
		ob.input();
		ob.print();
	}
}