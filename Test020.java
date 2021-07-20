/*==========================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 변수와 자료형
  - 실수형 데이터타입의 정밀도 테스트 실습
 ===========================================*/

public class Test020
{
	public static void main(String[] args)
	{
		// 주요 변수 선언
		float a = 0;
		double b = 0;

		// 연산 및 처리 → 100000(십만) 번 반복
		for (int i=1; i<=100000; i++)
		{
			a += 100000;
			b += 100000;

		}

		// 결과 출력
		System.out.println("float : " + (a/100000)); //@ 오차 발생!
		System.out.println("double : " + (b/100000)); //@ 실수형 데이터 쓸때는 속도가 조금 더 느리더라도 double 사용이 좋음
	}
}

//실행 결화
/*
float : 99996.055
double : 100000.0
계속하려면 아무 키나 누르십시오 . . .
*/