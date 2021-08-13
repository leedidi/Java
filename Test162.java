/*======================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

/*
○ List 인터페이스
   - 순서가 있음, 배열과 유사, 중복을 허용
   - 주요 구현 클래스
   ·Vector(동기화 지원)
   ·ArrayList(동기화 지원하지 않음)
   ·LinkedList(체인, 링크, 결합)

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;

public class Test162
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();

		list.add("서울");
		list.add("부산");
		list.add("인천");
		list.add("대구");
		list.add("광주");
		list.add("대전");
		list.add("울산");
		list.add("세종");
		
		// 더미 체크
		System.out.println(list);
		//--==>> [서울, 부산, 인천, 대구, 광주, 대전, 울산, 세종]

		System.out.println("전체 갯수 : " + list.size());
		//--==>> 전체 갯수 : 8

		// 첫 번째 요소만 출력
		System.out.println("첫 번째 요소 : " + list.get(0));
		//--==>> 첫 번째 요소 : 서울

		// 마지막 요소만 출력
		System.out.println("마지막 요소  : " + list.get(list.size()-1));
		//--==>> 마지막 요소  : 세종

		// 처음 위치에 "목포" 추가
		list.add(0, "목포");

		// 더미 체크
		System.out.println(list);
		//--==>> [목포, 서울, 부산, 인천, 대구, 광주, 대전, 울산, 세종]

		// 처음 위치의 데이터(요소)를 "대한민국"으로 변경
		//@ 추가는 add... 덮어쓰는건 set
		list.set(0, "대한민국");

		// 더미 체크
		System.out.println(list);
		//--==>> [대한민국, 서울, 부산, 인천, 대구, 광주, 대전, 울산, 세종]

		// "서울" 존재여부 확인
		if (list.contains("서울"))
			System.out.println("서울이 존재합니다.");
		//--==>> 서울이 존재합니다.

		// "대한민국" 지우기
		//@ 둘다 기억 해두기!
		//list.remove("대한민국");	//--(○)
		list.remove(0);				//--(○)

		System.out.println(list);
		//--==>> [서울, 부산, 인천, 대구, 광주, 대전, 울산, 세종]

		// ArrayList 자료구조 list 의 전체 요소 출력
		System.out.println("전체 출력... ①");
		for (int idx=0; idx<list.size(); idx++)
		{
			System.out.print(list.get(idx) + " ");
		}
		System.out.println();
		//--==>> 전체 출력... ①
		//		 서울 부산 인천 대구 광주 대전 울산 세종

		System.out.println("역순 출력... ②");
		for (int idx=list.size()-1; idx>=0; idx--) //@ size()-1 !
		{
			System.out.print(list.get(idx) + " ");
		}
		System.out.println();
		//--==>> 역순 출력... ②
		//		 세종 울산 대전 광주 대구 인천 부산 서울

		System.out.println("전체 출력... ③");
		for (String s : list)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		//--==>> 전체 출력... ③
		//		 서울 부산 인천 대구 광주 대전 울산 세종

		System.out.println("전체 출력... ④");
		Iterator<String> it = list.iterator();
		while (it.hasNext())
		{
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
		//--==>> 전체 출력... ④
		//		 서울 부산 인천 대구 광주 대전 울산 세종

		System.out.println("전체 출력... ⑤");
		ListIterator<String> li = list.listIterator();
		while (li.hasNext())
		{
			System.out.print(li.next() + " ");
		}
		System.out.println();
		//--==>> 전체 출력... ⑤
		//		 서울 부산 인천 대구 광주 대전 울산 세종

		System.out.println("역순 출력... ⑥");
		while (li.hasPrevious())
		{
			String s = li.previous();
			System.out.print(s + " ");
		}
		System.out.println();
		//--==>> 역순 출력... ⑥
		//		 세종 울산 대전 광주 대구 인천 부산 서울

	}
}