/*=================================
   ■■■ 클래스와 인스턴스 ■■■
   - 클래스와 인스턴스 활용
 =================================*/

 // 2. Sungjuk 클래스
 //    - 인원 수를 입력받아, 입력받은 인원 수 만큼
 //      이름, 국어점수, 영어점수, 수학점수를 입력받고
 //      총점과 평균을 산출하는 클래스로 설계할 것~!!!
 //		 ＊속성 : 인원수, Record 형태의 배열
 //      ＊기능 : 인원 수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력

 //@ Record[] rec;

//[내가 작성한 코드]
/*
import java.util.Scanner;
import java.io.IOException;

 public class Sungjuk
 {

	 // 주요 속성 구성(주요 변수 선언)

	 int snum;
	 //String name;
	 //int kor, eng, mat;
	 //int sum, avr;
	 //String[] name = new String[100];
	 //String[] kor = new String[100];
	 //String[] eng = new String

	 //int[][] score = new int[3][3];

	 // 주요 메소드 정의(기능 구성)
	
	void run()
	{
	 // 인원 수 입력(1~100) : 102
	 // 인원 수 입력(1~100) : -10
	 // 인원 수 입력(1~100) : 3
	
	 Scanner sc = new Scanner(System.in);
	 
	 Record[] rec1 = new Record[100];
	 Record[] rec2 = new Record[100];
	 Record[] rec3 = new Record[100];
	 Record[] rec4 = new Record[100];

	 do
	 {
		 System.out.print("인원 수 입력(1~100) : ");
		 snum = sc.nextInt();
	 }
	 while (snum<1 || snum>100);
	

 // 이름, 국어, 영어, 수학 점수 입력
	
 //ex>
 // 1번째 학생의 이름 입력 : 서승균
 // 국어 점수 : 90
 // 영어 점수 : 80
 // 수학 점수 : 70

	for (int i=0; i<snum; i++)
	{

		System.out.print("1번째 학생의 이름 입력 : ");
		rec1[i] = sc.next();
		System.out.print("국어 점수 : ");
		rec2[i] = sc.nextInt();
		System.out.print("영어 점수 : ");
		rec3[i] = sc.nextInt();
		System.out.print("수학 점수 : ");
		rec4[i] = sc.nextInt();

		sum = rec2[i]+rec3[i]+rec4[i];
		avr = (rec2[i]+rec3[i]+rec4[i])/3;
	}

     // 결과 출력
	 // 서승균 90 80 70 240  xx.xx 2
	System.out.printf("%s %d %d %d %d xx.xx, );



	}

 }
*/
 
import java.util.Scanner;

//[함께 작성한 코드]
 public class Sungjuk
 {
	 // 주요 속성 구성(주요 변수 선언)
	 int inwon;			//-- 인원 수
	 Record[] rec;		//-- Record 배열(학생 한 명 당 Record 배열 방 한 개 활용)
	 					//   Record 를 기반으로 생성된 객체만 담아낼 수 있는 배열

	 // 주요 메소드 정의(기능 구성)
	 // ① 인원 수 입력
	 //public void set(int inwon)
	 public void set() //@ 놓고올거 없고(void), 매개변수 직접입력 x고 사용자가 입력할거기때문에 (set()). 매개변수 없어도 됨 
	 {
		 Scanner sc =new Scanner(System.in);

		 do
		 {
			System.out.print("인원 수 입력(1~100) : ");
			inwon = sc.nextInt();
		 }
		 while (inwon<1 || inwon>100); //@ ~ 하는 동안 반복! //@ 동시에 만족하는 숫자 없으니까 OR(||)

		 // check~!!!
		 // Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는
		 // 배열방을 inwon 만큼 생성
		 rec = new Record[inwon];
		 //-- Record 배열방을 inwon 만큼 생성한 것이지
		 //   Record 클래스의 인스턴스를 생성한 것은 아니다.
		
	 }
		// 주요 메소드 정의(기능 구성)
		// ② 상세 데이터 입력(총점 및 평균 산출 기능 포함)
		public void input() //@ 건내주는게 아니라, rec 배열방에 차곡차곡 정리해서 담을거기 때문에(void), 
					   //@ 매개변수 직접입력 x고 사용자가 입력할거기때문에 (input()). 매개변수 없어도 됨
		{
			Scanner sc = new Scanner(System.in);

			String[] title = {"국어 점수 : ", "영어 점수 : ", "수학 점수 : "};
			
			// 인원 수 만큼 반복 → 인원 수에 기반하여 만들어진 배열의 길이만큼 반복
			for (int i=0; i<inwon; i++)	// for (int i=0; i<rec.length; i++) 와 같음	
			{

				// check~!!!
				//@ 배열방 돌때마다 레코드각 객체,인스턴스가 생성되어야 함
				// Record 클래스 기반의 인스턴스 생성
				/*
				Record ob = new Record();
				ob.name
				ob.tot


				rec[i] = ob;
				rec[i].name
				rec[i].tot
				ob.tot
				*/ // 아래줄과 동일함
				rec[i] = new Record();
				

				System.out.printf("%d번째 학생의 이름 입력 : ", (i+1));
				rec[i].name = sc.next();
				
				/*
				System.out.print("국어 점수 : " );
				//rec배열의 i번째방의 국어 = sc.nextInt();
				rec[i].kor = sc.nextInt();
				System.out.print("영어 점수 : " );
				//rec배열의 i번째방의 영어 = sc.nextInt();
				rec[i].eng = sc.nextInt();
				System.out.print("수학 점수 : " );
				//rec배열의 i번째방의 수학 = sc.nextInt();
				rec[i].mat = sc.nextInt();
				*/

				// 다영아~ 위에 있는 구문 대신 아래 있는 구문을 사용한거야~ ㅠㅠ
				// 따흐흑 그래서였구나....ㅠㅠ 감사합니다 ㅠㅠ
				

				for (int j=0; j<title.length; j++) // 0 1 2
				{
					// 안내 메세지 출력
					System.out.print(title[j]);

					// 사용자가 입력한 데이터를 스코어(score) 배열에 담아내기
					rec[i].score[j] = sc.nextInt();		// i번째학생의 score[0] → 국어점수
														// i번째학생의 score[1] → 영어점수
														// i번째학생의 score[2] → 수학점수

				    // 국어, 영어, 수학 점수 데이터를 반복적으로 입력받는 동안
					// 총점 누적하기
					rec[i].tot += rec[i].score[j];
				}

				// 평균 산출하기
				rec[i].avg = rec[i].tot / 3.0;
			}
		 }//end input() <<< 블레이스 주의!

		  // 주요 메소드 정의(기능 구성)
		  // ③ 결과 출력
		  // 1번째 학생의 이름 입력 : 서승균
		  // 국어 점수 : 90
		  // 영어 점수 : 80
		  // 수학 점수 : 70

		  public void print()
		{
			// check~!!!
			// 석차 산출 메소드 호출~!!! (구문 추가)
			ranking();

			  System.out.println();	// 개행

			  // 학생 한 명당 반복 출력구문 구성
			  for (int i=0; i<inwon; i++)
			  {
				  // 이름 출력
				  System.out.printf("%5s", rec[i].name);

				  // 성적(국어, 영어, 수학) 반복 출력
				  for (int j=0; j<3; j++)
					  System.out.printf("%4d", rec[i].score[j]);

				  // 총점, 평균 출력
				  System.out.printf("%5d", rec[i].tot);
				  System.out.printf("%8.2f", rec[i].avg);
				   
				  // check~!!!
				  // 석차 출력구문 추가~!!! (구문 추가)
				  System.out.printf("%5d", rec[i].rank);

				  // 개행
				  System.out.println();
			  }

		}//end print()
 
		// ④ 석차 산출 메소드 추가~!!!
		//    - Record 배열의 rank 속성 초기화 기능 → 반환 자료형 void
		//    - 클래스 내부에서 활용할 메소드로 정의 → 접근제어 지시자 private
		private void ranking()
		{
			//1 2 3 4 5		기준값 비교값
			int i, j;		//-- 루프 변수

			// 모든 학생들의 등수(석차, rank)를 1로 초기화
			for (i=0; i<inwon; i++)
			{
				rec[i].rank = 1;
			}

			// 등수 산출... ex) 4名
			for (i=0; i<inwon-1; i++)		//-- 비교 기준   0        1       2 -> 0 1 2 까지만 돔(@마지막 3은 혼자 남음, 돌 필요 X)
			{
				for (j=i+1; j<inwon; j++)	//-- 비교 대상   0→123   1→23   2→3  
				{
					if(rec[i].avg > rec[j].avg)		//-- 비교기준의 평균이 비교대상의 평균보다 크다면...
					{
						// 비교대상의 rank 를 1만큼 증가
						rec[j].rank++;
					}
					else if (rec[j].avg > rec[i].avg) //-- 비교대상의 평균이 비교기준의 평균보다 크다면...
					{
						// 비교기준의 rank 를 1만큼 증가
						rec[i].rank++;
					}
				}
			}



		}


 }// end class Sungjuk
