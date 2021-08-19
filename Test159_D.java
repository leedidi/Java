/*======================================================
  ■■■ 컬렉션 프레임워크(Collection Framework)■■■
======================================================*/

// ○ 실습 문제
// Test159 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 1

	1번째 요소 입력 : 손범석
	1번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N)? : Y

	2번째 요소 입력 : 서승균
	2번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N)? : n

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 2

	[벡터 전체 출력]
		손범석
		서승균
	벡터 전체 출력 완료~!!!

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력 : 정미화

	[검색 결과 출력]
	항목이 존재하지 않습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 3

	검색할 요소 입력 : 손범석
	
	[검색 결과 출력]
	항목이 존재합니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력 : 송해덕

	[삭제 결과 출력]
	항목이 존재하지 않아 삭제할 수 없습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 4

	삭제할 요소 입력 : 서승균

	[삭제 결과 출력]
	서승균 항목이 삭제되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 5

	변경할 요소 입력 : 이지영

	[변경 결과 출력]
	변경할 대상이 존재하지 않습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	4. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 5

	변경할 요소 입력 : 손범석
	수정할 내용 입력 : 정가연

	[변경 결과 출력]
	변경이 완료되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	4. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 6

	프로그램 종료
	계속하려면 아무 키나 누르세요...
  
*/

import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus		//-- 완성
{
	public static final int E_ADD = 1;		//-- 요소 추가
	public static final int E_DISP = 2;		//-- 요소 출력
	public static final int E_FIND = 3;		//-- 요소 검색
	public static final int E_DEL = 4;		//-- 요소 삭제
	public static final int E_CHA = 5;		//-- 요소 변경
	public static final int E_EXIT = 6;		//-- 종료
}



public class Test159_D
{
	// 주요 속성 구성
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel;			//-- 선택 값
	private static String con;			//-- 계속 여부

	// static 초기화 블럭
	static
	{
		// Vector 자료구조 생성;
		vt = new Vector<Object>();

		// BufferedReader 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자 입력값 초기화
		sel = 1;
		con = "Y";

	}

	// 메뉴 출력 메소드
	public static void menuDisp()
	{
		//[메뉴 선택]
		//1. 요소 추가
		//2. 요소 출력
		//3. 요소 검색
		//4. 요소 삭제
		//5. 요소 변경
		//6. 종료
		 
		System.out.println("\t1. 요소 추가");
		System.out.println("\t2. 요소 출력");
		System.out.println("\t3. 요소 검색");
		System.out.println("\t4. 요소 삭제");
		System.out.println("\t5. 요소 변경");
		System.out.println("\t6. 종료");

	}
	
	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException
	{
		System.out.print("\t>> 메뉴 선택(1~6) : ");
		sel = Integer.parseInt(br.readLine());		// 메뉴 선택 입력 값
		System.out.println();
	}
	
	// 선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{
			switch (sel)
			{
			case Menus.E_ADD: addElement(); break; 
			
			case Menus.E_DISP: dispElement(); break; 

			case Menus.E_FIND: findElement(); break; 

			case Menus.E_DEL: delElement(); break; 

			case Menus.E_CHA: chaElement(); break; 

			case Menus.E_EXIT: exit(); break; 

			}
		
	}

	// 요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		//1번째 요소 입력 : 손범석
		//1번째 요소 입력 성공~!!!
		//요소 입력 계속(Y/N)? : Y

		//2번째 요소 입력 : 서승균
		//2번째 요소 입력 성공~!!!
		//요소 입력 계속(Y/N)? : n
	
			
		do
		{
			System.out.printf("\t%d번째 요소 입력 : ", vt.size()+1);
			String name = br.readLine();
			vt.add(name);
			System.out.printf("\t%d번째 요소 입력 성공~!!!\n", vt.size());

			System.out.print("\t요소 입력 계속(Y/N)? : ");
			con = br.readLine();
		}
		while (con.equals("Y") || con.equals("y"));
			

		
		System.out.println();
	}

	// 요소 출력 메소드
	public static void dispElement()
	{
		//[벡터 전체 출력]
		//손범석
		//서승균
		//벡터 전체 출력 완료~!!!
		for (Object str : vt)
		{
			System.out.println("\t" + str.toString());
		}
		System.out.println("\t벡터 전체 출력 완료~!!!");
		System.out.println();

	}

	// 요소 검색 메소드
	public static void findElement() throws IOException
	{
		//검색할 요소 입력 : 정미화

		//[검색 결과 출력]
		//항목이 존재하지 않습니다.

		System.out.print("\t검색할 요소 입력 : ");
		String name = br.readLine();
		System.out.println();
		System.out.println("\t[검색 결과 출력]");
		int idx = vt.indexOf(name);
		if (idx<0)
			System.out.println("\t항목이 존재하지 않습니다.");
		else 
			System.out.println("\t항목이 존재합니다.");
		System.out.println();

		System.out.println();
		
	}

	// 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		//삭제할 요소 입력 : 송해덕

		//[삭제 결과 출력]
		//항목이 존재하지 않아 삭제할 수 없습니다.

		System.out.print("\t삭제할 요소 입력 : ");
		String name = br.readLine();
		System.out.println();
		
		System.out.println("\t[삭제 결과 출력]");
		if (vt.contains(name))
		{
			int idx = vt.indexOf(name);
			vt.remove(idx);
			System.out.printf("\t%s항목이 삭제되었습니다.\n", name);
			
		}
		else
		{
			System.out.println("\t항목이 존재하지 않아 삭제할 수 없습니다.");
		}
	}

	// 요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{
		System.out.print("\t변경할 요소 입력: ");
		String name = br.readLine();
		
		if (vt.contains(name))
		{
			System.out.print("\t수정할 내용 입력: ");
			String temp = br.readLine();

			int idx = vt.indexOf(name);
			vt.set(idx, temp);

			System.out.println("\t[변경 결과 출력]");
			System.out.println("\t변경이 완료되었습니다.");
		}
		else
		{
			System.out.println("\t[변경 결과 출력]");
			System.out.println("\t변경할 대상 존재하지 않습니다.");
		}

		System.out.println();
		
	}
	
	// 프로그램 종료 메소드 -- 완성
	public static void exit()
	{
		System.out.println("\t프로그램 종료~!!!");
		System.exit(-1);
	}

	// main() 메소드 -- 완성
	public static void main(String[] args) throws IOException
	{
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
	}


	
}