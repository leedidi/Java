/*==============================
   ■■■ 클래스 고급 ■■■
   - 인터페이스(Interface)
 ==============================*/

 // ○ 실습 문제
 // 성적 처리 프로그램을 구현한다.
 // 단, 인터페이스를 활용할 수 있도록 한다.

 // 실행 예)
 // 인원 수 입력(1~10) : 2
 // 1번째 학생의 학번 이름 입력(공백 구분) : 2108006 권순모
 // 국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
 // 2번째 학생의 학번 이름 입력(공백 구문) : 2108024 김소연
 // 국어 영어 수학 점수 입력   (공백 구분) : 85 70 65

 // 2108006 권순모    90 100  85      275    91
 //                   수  수  우 
 // 2108024 김소연    85  70  65      220    73
 //                   우  미  양

 // 계속하려면 아무 키나 누르세요...

 // ~ 2시 15분까지 코드 작성
 // [내가 작성한 코드]

 // 속성만 존재하는 클래스 → 자료형 활용

//import java.io.InputStreamReader;
//import java.io.BufferedReader;
//import java.io.IOException;
import java.util.Scanner;
 
 class Record
 {
	 String hak, name;		//-- 학번, 이름
	 int kor, eng, mat;		//-- 국어, 영어, 수학 점수
	 int tot, avg;			//-- 총점, 평균(편의상 정수 처리)
 }

 // 인터페이스
 interface Sungjuk //implements Record //<<< 이거는 안 되는듯,,, 따로 main에 넣어야되나?
 {
	 public void set();		//-- 인원 수 구성
	 public void input();	//-- 상세 데이터 입력
	 public void print();   //-- 결과 출력
 }

// 문제 해결 과정에서 설계해야 할 클래스 → Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl implements Sungjuk //throws IOException
{
		int n=0;
		//BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

		// Scanner sc = new Scanner(System.in);
		// System.out.print("인원 수 입력(1~10) : ");
		//n = sc.nextInt();

	@Override
	public void set() //throws IOException
	{   
		int n=0;
		//BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 입력(1~10) : ");
		n = sc.nextInt();
		int[] hak = new int[n];
		String[] name = new String[n];
		int[] kor = new int[n];
		int[] eng = new int[n];
		int[] mat = new int[n];

		for (int i=0; i<hak.length; i++)
		{
		System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ", i+1);
		hak[i] = sc.nextInt();
		name[i] = sc.next();
		
		System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");
		kor[i] = sc.nextInt();
		eng[i] = sc.nextInt();
		mat[i] = sc.nextInt();
		}
	}

	@Override 
	public void input()
	{   

		int[] total = new int[n];
		int[] avg = new avg[n];

		// tot..avg.. 수우미양가....
		for (int i=0; hak.length; i++)
		{
			tot[i] += kor[i] + eng[i] + mat[i];
		}
		
		for (int i=0; hak.length; i++)
		{
			avg[i] += (kor[i] + eng[i] + mat[i])/3;
		}
	
	}

	@Override
	public void print()
	{
	}
}

// main() 메소드를 포함하는 외부의 다른 클래스
public class Test117_1
{
	public static void main(String[] args)
	{
		Sungjuk ob = new Sungjuk();

		// 문제 해결 과정에서 작성해야 할 ob 구성

		ob.set();
		ob.input();
		ob.print();
	}
}