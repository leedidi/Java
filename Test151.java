/*======================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

import java.util.Stack;

public class Test151
{
	// 정적 문자열 배열  선언 및 초기화
	private static final String[] colors = {"검정", "노랑", "초록", "파랑", "빨강", "연두"};

	// 사용자 정의 생성자
	public Test151()
	{
		// st 라는 Stack 자료구조 생성
		// 제네릭을 활용하여 자료구조에 담기는 데이터 표현 → <String>
		Stack<String> st = new Stack<String>();

		// st 라는 Stack 자료구조에 데이터 담기
		// st = colors; (Ⅹ)

		for (String color : colors)
		{
			st.push(color);
		}

		st.push("보라");

		//st.push(10);
		//st.push(10.0);
		//--==>> 에러 발생(컴파일 에러)
		//-- 제네릭 표현식을 통해 선언하고 있는
		//   String 이 아닌 다른 자료형(int 나 double)을
		//   스택 st 에 push() 하려고 했기 때문에...

		// 출력 메소드 호출
		popStack(st);
	}


	// 출력 메소드
	private void popStack(Stack<String> st) //@나한테 스택안에 들어있는 string st 넘겨줌ㄴ
	{ //@ 그안에 있는 요소를 출력해줌
		System.out.print("pop : " );
		while(!st.empty())
			System.out.print(st.pop() + " ");
		System.out.println();
	}

	public static void main(String[] args)
	{
		new Test151();
	}
}