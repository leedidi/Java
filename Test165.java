/*======================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

// Set → HashSet, TreeSet
// - 순서 없음.
// - 중복을 허용하지 않는 구조(기본)

/*
○ TreeSet<E> 클래스
   
   java.util.TreeSet<E> 클래스는
   Set 인터페이스를 상속한 SortedSet 인터페이스를 구현한 클래스로
   데이터를 추가하면 데이터들이 자동으로 오름차순 정렬이 수행된다.

   //@ 자주 사용하지 않음! 정렬기능은 사용하면 성능이 많이 떨어지기 때문..
*/

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;

public class Test165
{
	public static void main(String[] args)
	{
		// TreeSet 자료구조 인스턴스 생성
		TreeSet<String> set = new TreeSet<String>();

		// TreeSet 자료구조 set 에 요소 추가 → add();
		set.add("하울의움직이는성");
		set.add("이웃집토토로");
		set.add("아기공룡둘리");
		set.add("귀멸의칼날");
		set.add("겨울왕국");
		set.add("짱구는못말려");
		set.add("인사이드아웃");
		set.add("미래소년코난");
		set.add("원령공주");

		// Iterator 를 활용한 set 요소 전체 출력
		
		/*
		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			String s = it.next();
			System.out.print(s + " ");
		}
		System.out.println();
		*/

		Iterator<String> it = set.iterator();
		while (it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		//--==>> 겨울왕국 귀멸의칼날 미래소년코난 아기공룡둘리 원령공주 이웃집토토로 인사이드아웃 짱구는못말려 하울의움직이는성


		//TreeSet 자료구조 인스턴스 생성
		//TreeSet<String> set2 = new TreeSet<String>();
		
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyComparator<GradeVO>());

		//set2.add(GradeVO); -@ x. gradevo 기반으로 하는 인스턴스가 들어가는 것!
		//GradeVO ob = new GradeVO();
		
		set2.add(new GradeVO("20211523", "김진희", 90, 80, 70));
		set2.add(new GradeVO("20211524", "최현정", 91, 81, 71));
		set2.add(new GradeVO("20211525", "이다영", 98, 78, 88));
		set2.add(new GradeVO("20211529", "박효빈", 72, 49, 99));
		set2.add(new GradeVO("20211672", "정효진", 56, 31, 90));
		
		// Iterator 를 활용한 set 요소 전체 출력
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while(it2.hasNext())
			System.out.print(it2.next() + " ");
		System.out.println();
		*/
		//--==>> 에러 발생

		// MyComparator 클래스 설계 / TreeSet 생성 구문 변경후 다시 실행
		
		/*@ -> 안되는거
		Iterator<GradeVO> it2 = set2.iterator();
		while(it2.hasNext())
			System.out.print(it2.next() + " ");
		System.out.println();
		*/
		/*@ -> 되는거. 다시치니까 됨
		Iterator<GradeVO> it2 = set2.iterator();
		while(it2.hasNext())
			System.out.print(it2.next() + " ");
		System.out.println();
		*/

		//@->?? 원래 여러개 나와야하는거같은데 하나만 나옴 > 해결 완료! 다시치니까됨 어딘가의 오타였나봄..
		//--==>> GradeVO@15db9742 GradeVO@6d06d69c GradeVO@7852e922 GradeVO@4e25154f GradeVO@70dea4e
	
		Iterator<GradeVO> it2 = set2.iterator();
		while(it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %4d %6d\n"
			                  , vo.getHak(), vo.getName()
							  , vo.getKor(), vo.getEng(), vo.getMat()
							  , vo.getTot());

		}
		System.out.println();

	}

}

//@@@ 나중에 클래스..인터페이스..등등 호출하는법 다시 알아보고 정리해보기

//@ 지금은 하나의 퍼즐조각만.... 나중에 디테일하게 볼 것!
//@ 하나의 큰 클래스보다 여러개의 작은 클래스들 조합사용이 더 효율적
//@ VO, DTO는 거의 같은 개념... 데이터를 전송하려면(DTO) 데이터에 담아야함(VO). 실무에서 굳이 엄격히 구별X
//@ 나중에 이 개념 확장해서 다른 부분 배울것......

// VO	→ Value Object
// DTO	→ Data Transfer Object
// DAT	→ Data Access Object

class GradeVO
{
	// 주요 속성 구성
	private String hak;			//-- 학번
	private String name;		//-- 이름
	private int kor, eng, mat;	//-- 국어점수, 영어점수, 수학점수

	// 생성자(사용자 정의 생성자 → 5개의 매개변수를 가진 생성자)
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	// 생성자(사용자 정의 생성자 → 매개변수 없는 생성자)
	//-- 매개변수가 존재하는 생성자를 사용자 정의 생성자로 구성하였기 때문에
	//   default 생성자가 자동으로 삽입되지 않을 것을 우려하여
	//   추가로 정의한 생성자
	GradeVO()
	{	
	}

	//@ getter setter 구현해보기
	String getHak()
	{
		return hak;
	}

	void setHak(String hak)
	{
		this.hak = hak;
	}

	String getName()
	{
		return name;
	}

	void setName(String name)
	{
		this.name = name;
	}

	int getKor()
	{
		return kor;
	}

	void setKor(int Kor)
	{
		this.kor = kor;
	}

	int getEng()
	{
		return eng;
	}

	void setEng(int eng)
	{
		this.eng = eng;
	}

	int getMat()
	{
		return mat;
	}

	void setMat(int mat)
	{
		this.mat = mat;
	}






	// 추가 메소드 정의(총점 산출)
	int getTot()
	{
		return kor + eng + mat;
	}
}

class MyComparator<T> implements Comparator<T>
{
	@Override
	public int compare(T o1, T o2) //@ 요소요소끼리 비교하기!
	{
		GradeVO s1 = (GradeVO)o1;
		GradeVO s2 = (GradeVO)o2;
		
		/*
		// 학번 기준(오름차순)
		return Integer.parseInt(s1.getHak()) - Integer.parseInt(s2.getHak());
		//       "20211523"                        "20211524"
		// return Integer.parseInt("20211523") - Integer.parseInt("20211524");
		// return 20211523 - 20211524;
		// return -1
		*/
		//@ 어근데 나도 이거 오름차순은 하나만 되는듯 왜지,,??? -> 아 왜냐면 둘다 s1이었어서,,! 고침
		
		/*
		// 학번 기준(내림차순)
		return Integer.parseInt(s2.getHak()) - Integer.parseInt(s1.getHak());
		*/
		
		/*
		// 총점 기준(오름차순)
		return s1.getTot() - s2.getTot();
		*/
		
		/*
		// 총점 기준(내림차순)
		return s2.getTot() - s1.getTot();
		*/

		//@ API 도큐먼트 참고...

		/*
		// 이름 기준(오름차순)
		// return 정수형;  ------------ : string! . >> string 가진것 사용 가능
		System.out.println(s1.getName().compareTo(s2.getName()));
		return s1.getName().compareTo(s2.getName());
		*/

		// 이름 기준(내림차순)
		return s2.getName().compareTo(s1.getName());

		//@ 중간중간 찍어보는 과정에서 오류나면 바로얘기하기!!! 아 이단계에서 오류났어요~!
		//@ 중간중간 찍어보는거 확인하는데서 아 이 과정까지는 진행됐구나~! 를 알수있어서 금방 에러잡을수 있는데
		//@ 전부터 에러나는데 한참뒤에 에러났다고 얘기하면 에러 잡기가 힘듬....!
		
	}
}