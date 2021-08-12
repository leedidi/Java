/*======================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

// Vector v = new Vector();
//-- 비어있는 Vector 자료구조 생성

// Vector v = new Vector(8);
//-- 8개의 초기 element 를 가진 Vector 자료구조 생성
//   8개가 모두 채워지게 되면(모자라게 되면) 자동으로 확장된다.

// Vector v = new Vector(3, 5);
//-- 3개의 초기 element 를 가진 Vector 자료구조 생성
//   3개가 모두 채워지게 되면(모자라게 되면) 자동으로 5개 증가(확장)된다.

// ※ 벡터는 데이터 요소로서 정수형, 실수형, 문자열... 등을
//    담아내는 것이 가능하다.
//    → 데이터 안정성 확보 check~!!!
//@ 문제생기는 경우 있음! 잘 체크하고 넘어가기

import java.util.Vector;
import java.util.Iterator;

// MyVector 클래스 설계 → Vector 클래스 상속
class MyVector extends Vector<Object>
{
	// 사용자 정의 생성자
	MyVector()
	{	
		// Vector(슈퍼 클래스) 생성자 호출
		super(1, 1);
		//-- 첫 번째 인자 : 주어진 용량
		//   두 번째 인자 : 증가량
	}

	void addInt(int i)
	{
		addElement(new Integer(i));
	}
	void addFloat(float f)
	{
		addElement(new Float(f));
	}
	void addString(String s)
	{
		addElement(s);
	}
	void addCharArray(char[] a)
	{
		addElement(a);
	}

	void write()
	{
		int length = size();
		System.out.println("백터 요소 갯수 : " + length);
		//--==>> 백터 요소 갯수 : 4
		
		Object o;

		for (int i=0; i<length; i++)
		{
			o = elementAt(i); //@ 기본 구성자체는 Objct!

			// 『intstanceof』 연산자		check~!!! //@ 너 Object인데 태생이 어디니? 너 한국사람인데 그럼에도불구하고 출신지 어디니?
			//-- 처리해야 하는 대상의 객체 타입 확인
			
			if (o instanceof String)//@ 한국사람인데 출신지가 String이에요!
			{
				System.out.println("문자열 : " + o.toString()); //@ 태생이 문자열이니까 문자열 처리 방식으로 처리해줄게!
			}
			else if (o instanceof Integer) //@o가 Integer 클래스 기반으로 생성된 오브젝트라면...
										   //@ 한국사람인데 출신지가 Integer이에요!
			{
				System.out.println("정수형 : " + o); //@ 오토 언박싱 해줄거.... 그래서 들어감! ex> object에 10 오토언박싱으로 들어감
			}
			else if (o instanceof Float)
			{
				System.out.println("실수형 : " + o);
			}
			else if(o instanceof char[]) //@ 오토언박싱 안됨! wrapper 클래스 X, toSting 안됨
			{	
				/*
				for (int i; i<((char[])o).length; i++)
				{
					System.out.println((char[]o)[i]);
				}
				*/ //@너무 복잡...
				//System.out.println("문자 배열 : " + o);
				//System.out.println("문자 배열 : " + o.toString());
				System.out.println("문자 배열 : " + String.copyValueOf((char[])o));
				//@ object 캐릭터배열로 형변환, 문자배열 같은 경우 문자열의 기능으로 사용하게 되는게 copyValueof!
				//@ String.copyValueOf(("문자배열"));
				//@ String.copyValueOf({'a','b','c'});
			}
			else
			{
				System.out.println("타입 확인 불가~!!!");
			}
		}
		




		/*
		Iterator<Object> it = this.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		//--==>> 5
		//		 3.14
		//		 안녕하세요
		//		 [C@15db9742
		*/
	}

}

public class Test155
{
	public static void main(String[] args)
	{
		// MyVector 클래스 기반 인스턴스 생성
		MyVector v = new MyVector();

		// 주요 변수 선언 및 초기화
		int digit = 5;
		//@ 백터는 태생부터가 참조타입. 객체 형식의 요소들만 멤버로 취할수 있음
		//  기본 프리미티브 자료형은 요소로 취할수 없음
		//@ 원래는 5 넣을수 없음. 나 int 5에요 x 나 integer 타입의 객체형 5에요~! 그래서 프리미티브 자료형도 벡터에 추가가 가능해짐
		//  이게 프리미티브 자료형이라고 벡터가 인지하진 못함..
		float real = 3.14f;
		String s = new String("안녕하세요");
		char[] letters = {'s', 't', 'u', 'd', 'y'};

		v.addInt(digit);			//-- 벡터 자료구조에 정수 저장
		v.addFloat(real);			//-- 벡터 자료구조에 실수 저장
		v.addString(s);				//-- 벡터 자료구조에 문자열 저장
		v.addCharArray(letters);	//-- 벡터 자료구조에 문자 배열 저장

		v.write();
	}
}