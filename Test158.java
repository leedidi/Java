/*======================================================
  ■■■ 컬렉션 프레임워크(Collection Framework) ■■■
=======================================================*/

// 벡터 자료구조 객체 선언 및 생성 시
// 사용자 정의 클래스 활용 → 자료형

import java.util.Vector;

// 사용자 정의 클래스 설계 → 자료형처럼 활용
class MyData
{
	// 주요 속성 구성 → 주요 변수 선언(멤버 변수)
	private String name;	//-- 이름
	private int age;		//-- 나이

	// getXxx() → getter
	// setXxx() → setter

	// getter / setter 구성
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}

	// 생성자 (매개변수 2개인 생성자) → 사용자 정의 생성자
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// 생성자 (매개변수 없는 생성자) → 사용자 정의 생성자
	public MyData()
	{
		name = "";
		age = 0;
	}

}


public class Test158
{	
	public static void main(String[] args)
	{
		// 벡터 자료구조 생성
		Vector<MyData> v = new Vector<MyData>();

		
		// 벡터 자료구조 v 에
		// 채지윤 13세/ 김진령 7세 / 장진하 50세
		// 담아내기
		//@ Mydata를 기반으로 가져온 데이터를 담아냄

		/* //[내가 풀다 만..]
		Vector<String> v = new Vector<String>();
		for (int i=0; i<nameAge.length; i++)
		{
			v.add(nameAge[i]);
		}
		//MyData,,,,?
		*/
		
		//@★ 중요함! 세가지방법 다 이해 가야 함
		// ① 
		/*
		MyData st1 = new MyData();
		st1.setName("채지윤");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("김진령");
		st2.setAge(7);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("장진하");
		st3.setAge(50);
		v.add(st3);
		*/

		// ②
		/*
		MyData st1 = new MyData("채지윤", 13);
		v.add(st1);
		MyData st2 = new MyData("김진령", 7);
		v.add(st2);
		MyData st3 = new MyData("장진하", 50);
		v.add(st3);
		*/

		// ③
		v.add(new MyData("채지윤", 13));
		v.add(new MyData("김진령", 7));
		v.add(new MyData("장진하", 50));

		// 벡터 자료구조 v 에 담긴 내용(요소) 전체 출력하기
		// 실행 예)
		// 이름:채지윤, 나이:13세
		// 이름:김진령, 나이:7세
		// 이름:장진하, 나이:50세
		
		/* //[내가 풀다 만..]
		for (int i=0; i<; i++)
		{
			System.out.printf("이름:%s, 나이:%d", ,);
		}
		*/

		// ① 
		for (MyData obj : v)
			System.out.printf("이름:%s, 나이:%d세\n",obj.getName(),obj.getAge());
		System.out.println();
		//--==>> 이름:채지윤, 나이:13세
		//		 이름:김진령, 나이:7세
		//		 이름:장진하, 나이:50세
		
		// ②
		for (int i=0; i<v.size(); i++)
			System.out.printf("이름:%s, 나이:%d세\n",v.elementAt(i).getName(), v.elementAt(i).getAge());
		System.out.println();
		//--==>> 이름:채지윤, 나이:13세
		//		 이름:김진령, 나이:7세
		//		 이름:장진하, 나이:50세

		// ③
		for (Object temp : v)
		{
			System.out.printf("이름:%s, 나이:%d세\n", ((MyData)temp).getName(), ((MyData)temp).getAge());
		}//@ 주의! mydata로 다운캐스팅.....다운캐스팅 업캐스팅 개념 다시 제대로 봐보기

		//--==>> 이름:채지윤, 나이:13세
		//		 이름:김진령, 나이:7세
		//		 이름:장진하, 나이:50세

		//@ 어느 그릇에 넣고 어떻게 꺼내는지...자유자재로 되게 해야 함......
		//@ 특히 객체관련....
		
	}
}