/*======================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

/*
○ 큐(Queue)
   
   큐(Queue)는 FIFO(First Input First Output, 선입선출) 구조로
   //@ 먼저 들어간 게 먼저 나오는 구조. 피포구조라는 말 자주 쓰임. 자바 입출력(io) 구조가 이 피포구조 취함
   먼저 입력된 자료를 먼저 출력하며,
   Queue 인터페이스를 구현한 클래스는 큐와 관련된 다양한 기능을 제공한다.

※ Queue 인터페이스 인스턴스를 생성하기 위해서는
   new 연산자를 이용하여 Queue 인터페이스를 구현한(implements)
   클래스의 생성자를 호출한다.

   ex) Queue ob = new LinkedList();

○ 주요 메소드

   - E element()
     큐의 head 요소를 반환하며 삭제하지 않는다.

   - boolean offer(E o)
     지정된 요소를 큐에 삽입한다.

   - E peek()
	 큐의 head 요소를 반환하고 삭제하지 않으며
	 큐 자료구조가 empty 인 경우 null 을 반환한다.

   - E poll()
     큐의 head 요소를 반환하고 삭제하며
	 큐 자료구조가 empty 인 경우 null 을 반환한다.

   - E remove()
     큐의 head 요소를 반환하고 삭제한다.

*/

import java.util.Queue;
import java.util.LinkedList;

public class Test152
{
	public static void main(String[] args)
	{
		// Queue 자료구조 생성
		// Queue myQue = new Queue();   //--(Ⅹ), @인터페이스라서!
		Queue<Object> myQue = new LinkedList<Object>();

		// 데이터 준비
		String str1 = "이지영";
		String str2 = "장민지";
		String str3 = "권순모";
		String str4 = "김소연";

		// myQue 라는 Queue 자료구조에 데이터 추가
		myQue.offer(str1);
		myQue.offer(str2);
		myQue.offer(str3);
		boolean test = myQue.offer(str4);
		//@ myQue.offer : 자료구조 안에는 매개변수 넘겨준 것 적재, 이게 제대로 적재되었냐 아니냐 true/false 반환해주는 구조

		System.out.println(myQue);
		//--==>> [이지영, 장민지, 권순모, 김소연]
		//@ 보이지만...실제 데이터라고 생각하면 X. 더미 데이터임!
		//  원본 데이터를 끌어오는게 아니라, 원본데이터를 투영한 더미데이터를 보는 중.. 
		//  그래서 이거 건드려서 데이터를 컨트롤하면 안 됨. 데이터의 직접컨트롤 더미로 하면 X
		//  컬렉션의 각 방에는 한 명의 학생의 정보가 다 들어감~~!!!
		//@ 유리로 만든 그릇, 밖에서 보면 내용이 보임(딸기, 포도, 바나나).. 이게 보인다고 딸기포도바나나를 가져온거X, 이걸 요리할수X
		//  딸기포도바나나가 있다는 정보만 보여준 것! 실제로 이것 이용할수 X ←이게 더미 데이터.

		System.out.println(test);
		//--==>> true

		// Queue 자료구조에서 요소를 제거하지 않고 head 요소 반환
		System.out.println("값1 : " + (String)myQue.element());
		System.out.println("값2 : " + (String)myQue.element());
		//@ myQue.element() : 오브젝트!
		//--==>> 값1 : 이지영
		//		 값2 : 이지영

		//@like String[] arr = {"홍길동", "이순신", "강감찬"}; //@ 스트링(문자열) 배열.. "홍길동" 하나는? 스트링!

		System.out.println();

		String val;
		
		// ①
		// peek()
		//-- 큐의 head 요소 변환. 제거 안함.
		//   큐가 empty 일 경우 null 반환.
		/*
		while (myQue.peek() != null)
		{	
			// poll()
			//-- 큐의 head 요소 반환. 제거함.
			//   큐가 empty 일 경우 null 반환.
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		*/
		//--==>> 요소 : 이지영
		//		 요소 : 장민지
		//		 요소 : 권순모
		//		 요소 : 김소연

		// 테스트
		/*
		while (myQue.poll() != null)
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		*/
		//--==>> 요소 : 장민지
		//		 요소 : 김소연

		// ②
		/*
		while (true)
		{
			val = (String)myQue.poll();

			if(val==null)
				break;
			else
				System.out.println("요소 : " + val);
		}
		System.out.println();
		*/
		//--==>> 요소 : 이지영
		//		 요소 : 장민지
		//		 요소 : 권순모
		//		 요소 : 김소연

		// ③
		while ( !myQue.isEmpty())
		{
			val = (String)myQue.poll();
			System.out.println("요소 : " + val);
		}
		System.out.println();
		//--==>> 요소 : 이지영
		//       요소 : 장민지
		//		 요소 : 권순모
		//		 요소 : 김소연



	}
}
