/*=========================================
  ■■■ 자바 기본 프로그래밍 ■■■
  - 변수와 자료형
  - 자바의 기본 입출력 : BufferedReader 클래스
 ==========================================*/


import java.io.BufferedReader;
import java.io.InputStreamReader;//@자바야 java 상자안의, io 상자안의, input~ 설계도를 보고 만들어줘!
import java.io.IOException;

public class Test011
{ //@ 프로그램의 시작. 배의 시작
	public static void main(String[] args) throws IOException // @(input,output 입출력 관련한 문제가 생기면 이거 관련문제다, 대처법 모아놓은 교범
															  // ex) 예를 들면 배안 누군가 태우는과정에서 생기는, 내릴때 생기는 문제 생기면
															  // 어떻게 대응하라고 써놓은 선박 메뉴얼
															  // throws : 혹시 승객이 이런 문제를 만든다면 배밖으로 냅다 던져도 돼! 된다고 각서에 서명할게. */
	{
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // @자바에 키보드 연결하는 구문	
						//@ 문자열을 받아옴 / 키값을 문자열로 변환 / 키보드 입력 키값(바이트 단위)
                        //                      ->번역기 역할

		// 주요 변수 선언
		int r;							//-- 반지름
		final double PI = 3.141592;		//-- 원주율
		double a, b;					//-- 넓이, 둘레


		// 연산 및 처리
		// ① 사용자에게 안내 메세지 출력
		System.out.print("원의 반지름 입력 : ");

		// ② 사용자가 입력한 값을 받아와 반지름 변수 r 에 담아내기
		//r = br.readLine(); // @자바 이거 못쓰게 해놓음 자바는 까다로움! 내선박 항해과정 모든걸 내 통제하에 넣어놔야함.
						   // 누군지 모르는 외부인 못믿음. 너 못들어와! >> 에러 >> throws IOException 쓰면 그렇다면 그래. 타게 해줄게.
						   // @ 문자열로 입력("")
		// r = "20";

		// Integer.parseInt() → 매개변수로 넘겨받은 문자열 데이터를 정수형으로 변환
		r = Integer.parseInt(br.readLine());
		// r = Integer.parseInt("20");
		// r = 20;
		// -- 사용자가 입력한 값을 BufferedReader(br) 의 『readLine()』
		//	  메소드를 활용하여 문자열 형태로 읽어 들인 후
		//    그 값을『Integer.parseInt()』를 통해 숫자형(정수형)으로 변환한 후
		//	  정수 형태의 반지름 변수 r에 담아내기

		// ③ 넓이 및 둘레 연산
		a = r * r * PI;
		b = r * 2 * PI;

		// 결과 출력
		//System.out.println(">> 넓이 : " + a);
		//System.out.println(">> 둘레 : " + b);

		//System.out.prntf(">> 넓이 : ○\n", ○에 넣을 값);
		//System.out.prntf(">> 둘레 : ○\n", ○에 넣을 값);

		System.out.printf(">> 넓이 : %.2f\n", a);
		System.out.printf(">> 둘레 : %,2f\n", b);
		//-- 『%f』는 서식 출력용 메소드에서 실수형을 담아내는 옵션 문자
		//	 『%2.f』는 소수점 이하 둘째자리까지 표현하겠다는 의미
			
	} //@ 프로그램의 끝. 자바가 운영하는 배 항해 끝.
}

//실행 결과
/*
원의 반지름 입력 : 25
>> 넓이 : 1963.4950000000001
>> 둘레 : 157.0796
계속하려면 아무 키나 누르십시오 . . .
*/