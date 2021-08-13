/*======================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

// List → Vector, ArrayList, ...
// ·순서 있음
// ·배열과 유사
// ·중복 허용

/*
○ ArrayList 클래스

   - ArrayList 와 Vector 클래스는
     List 를 크기 변경이 가능한 배열로 구현한 것으로
	 차이점은 Vector 클래스의 객체는 기본적으로 동기화 되지만,
	 ArrayList 는 그렇지 않다는 점이다.

   - 비동기화 컬렉션은 동기화된 컬렉션보다 더 나은 성능을 제공하ㅕ
     스레드들이 컬렉션을 공유하지 않는 프로그램에서는
	 일반적으로 ArrayList 를 Vector 보다 더 선호하며,
	 ArrayList 는 동기화를 고려하지 않은 Vector 처럼 동작함으로써
	 스레드 동기화에 따르는 부담을 가지지 않기 때문에
	 Vector 보다 더 빠르게 실행된다.

   - null 을 포함한 모든 요소를 허용하며
     List 인터페이스를 구현하는 것 외에 리스트에 격납하기 위해
	 내부적으로 사용되는 배열의 사이즈를 조작하는 메소드를 제공한다.

	 //@ 비동기 클래스... 벡터보다 성능이 좋음! 나머지는 배열과 비슷
*/

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Test161
{
	public static void main(String[] args)
	{
		// ArrayList 자료구조 인스턴스 생성
		//ArrayList<String> list = new ArrayList<String>();
		//Vector<String> list = new Vector<String>();
		//List<String> list = new Vector<String>();
		List<String> list1 = new ArrayList<String>(); 

		// list1 에 요소 추가 → add()
		list1.add("나이브스아웃");
		list1.add("인셉션");
		list1.add("인터스텔라");

		// ArrayList 자료구조 인스턴스 생성
		//@ list2는 list1이 가진 요소들 승계.. 거기에 모가디슈 추가
		List<String> list2 = new ArrayList<String>(list1);

		// list2 에 요소 추가
		list2.add("모가디슈");

		// ArrayList 자료구조 인스턴스 생성
		List<String> list3 = new ArrayList<String>();

		// list3 에 list2 의 전체 요소 추가 → addAll();
		list3.addAll(list2);

		// "인셉션" 앞에 "분노의질주" 추가
		// ① "인셉션" 찾기 → indexOf() → 위치값 인덱스 반환
		int n = list3.indexOf("인셉션");
		
		// 테스트
		System.out.println("인셉션 위치 : " + n);
		//--==>> 인셉션 위치 : 1

		// ② "인셉션" 찾은 인덱션 위치에 "분노의 질주" 투입(삽입)
		list3.add(n, "분노의질주");

		// 출력 → 더미 데이터 확인
		System.out.println("==============================");
		System.out.println(list1);
		//--==>> [나이브스아웃, 인셉션, 인터스텔라]
		System.out.println(list2);
		//--==>> [나이브스아웃, 인셉션, 인터스텔라, 모가디슈]
		System.out.println(list3);
		//--==>> [나이브스아웃, 인셉션, 인터스텔라, 모가디슈]
		//--==>> [나이브스아웃, 분노의질주, 인셉션, 인터스텔라, 모가디슈]

		System.out.println();

		// 출력 → listIterator() 메소드를 활용하여 출력
		System.out.println("==============================");
		ListIterator<String> li = list3.listIterator();
		while (li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();
		//--==>> 나이브스아웃 분노의질주 인셉션 인터스텔라 모가디슈

		System.out.println();
		
		// 출력 → 역순으로 출력
		System.out.println("==============================");
		while (li.hasPrevious())
		{
			System.out.print(li.previous() + " ");
		}
		System.out.println();
		//--==>> 모가디슈 인터스텔라 인셉션 분노의질주 나이브스아웃

	}
}