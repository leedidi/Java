/*=================================
   ■■■ 클래스와 인스턴스 ■■■
   - 클래스와 인스턴스 활용
 =================================*/

 // 1. Record 클래스
 //    - 속성만 존재하는 클래스로 설계할 것~!!!


//[내가 작성한 코드]
/*
public class Record
{
	Static String name;
	Staitc int kor, eng, mat;
	Static int sum, avr;
}
*/


//[함께 작성한 코드]
public class Record
{
	// 학생 한 명을 표현할 수 있는 속성들로 구성~!!! check~!!!

	String name;				//-- 이름
    //int kor, eng, mat;		//-- 각 과목의 점수(국어, 영어, 수학) 
	int[] score = new int[3];	// score[0] = 국어, score[1] = 영어, score[2] = 수학
	int tot;					//-- 총점
	double avg;					//-- 평균
	int rank;					//-- 석차(등수)
}
