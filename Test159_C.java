/*====================================================
  ■■■컬렉션 프레임 워크 collection Framework■■■
======================================================*/
//○실습문제
//Test159 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다

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
	요소 입력 계속(Y/N)? Y

	1번째 요소 입력 : 서승균
	1번째 요소 입력 성공~!!!
	요소 입력 계속(Y/N)? N

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

	검색할 요소 입력: 손범석

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
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 5

	변경할 요소 입력 : 손범석
	수정할 내용 입력 : 정가연

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1~6) : 6
	
	프로그램 종료
	계속하려면 아무 키나 누르세요...

*/
import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus //완성
{
	public static final int E_ADD =1;
	public static final int E_DISP =2;
	public static final int E_FIND =3;
	public static final int E_DEL =4;
	public static final int E_CHA =5;
	public static final int E_EXIT =6;

}

public class Test159_C
{
	//주요 속성 구성
	private static final Vector<Object> vt;
	private static BufferedReader br;
	private static Integer sel; //선택 값
	private static String con; //계속 여부

	//static 초기화 블럭
	static
	{
		//vertor 자료 구조 생성
		vt = new Vector<Object>();
		
		//BufferedReader 인스턴스 생성
		 br=new BufferedReader(new InputStreamReader(System.in));

		//사용자 입력값 초기화
		sel = 1;
		con = "Y";
	}

	//메뉴 출력 메소드
	public static void menuDisp()
	{
	System.out.println("\n[메뉴선택]");	
	System.out.println("1.요소 추가");	
	System.out.println("2.요소 출력");	
	System.out.println("3.요소 검색");	
	System.out.println("4.요소 삭제");	
	System.out.println("5.요소 변경");	
	System.out.println("6.종료");	
	}

	//메뉴 선택 메소드
	public static void menuSelect() throws IOException
	{
	System.out.print(">>메뉴 선택(1~6) : ");	
	do
	{
	sel = Integer.parseInt(br.readLine());
	}
	while (sel<Menus.E_ADD || sel > Menus.E_EXIT);
	}

	//선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() throws IOException
	{
	switch(sel)	
		{
		case Menus.E_ADD : addElement();break;	
		case Menus.E_DISP : dispElement();break;	
		case Menus.E_FIND : findElement();break;	
		case Menus.E_DEL : delElement();break;	
		case Menus.E_CHA : chaElement();break;	
		case Menus.E_EXIT : exit();break;	

		}
	}
	//요소 추가 메소드
	public static void addElement() throws IOException
	{
		String name;
		int i = vt.size(); //vt에 저장된 개수 반환하는 메소드

		do
		{
			System.out.printf("%d번째 요소 입력 : ",++i);
			name = br.readLine();
			vt.add(name);

			System.out.printf("\n%d번째 요소 입력 성공\n",i);

			System.out.print("요소 입력 계속(Y/N)? : ");

			con = br.readLine();

		}
		while (con.equals("Y") || con.equals("y"));
	}
	//요소 출력 메소드
	public static void dispElement() 
	{
			System.out.println("[요소 전체 출력]");
			for(int i=0; i< vt.size(); i++)
			System.out.printf("%s \n", vt.get(i));
			System.out.println("요소 전체 출력 완료");
	}
	//요소 검색 메소드
	public static void findElement() throws IOException
	{
		String findName ="";
		System.out.print("검색할 요소 입력 : ");
		findName = br.readLine();

		if(vt.contains(findName)==true)

		System.out.println("항목이 존재합니다");
		else
		System.out.println("항목이 존재하지 않습니다");

	}
	//요소 삭제 메소드
	public static void delElement() throws IOException
	{
		String result ="";
		System.out.print("삭제할 요소 입력 : ");
		
		//삭제할 요소 찾기
		String del = br.readLine();
		int delSite = vt.indexOf(del);

		if(delSite<0)
		result = "항목이 존재하지 않아 삭제할 수 없습니다.";
		
		else
		{
		vt.remove(delSite);
		result = del+"항목이 삭제되었습니다.";
		}

		System.out.println("[삭제 결과 출력]");
		System.out.println(result);
	}
	
	//요소 수정(변경) 메소드 
	public static void chaElement() throws IOException
	{
	String chaName ="";
	System.out.print("변경할 대상 입력 : ");
	chaName = br.readLine();
	String temp;

	if(vt.contains(chaName)!= true)
		{
		System.out.println("[변경 결과 출력]");
		System.out.println("변경할 대상이 존재하지 않습니다.");
		}
	else
		{
		System.out.print("수정할 내용 입력 : ");
		String newName = br.readLine();

		vt.set(vt.indexOf(chaName),newName);
		
		System.out.println("[변경 결과 출력]");
		System.out.println("변경할 완료 되었습니다.");

		}

	}
	
	//프로그램 종료 메소드--완성 
	public static void exit()
	{
    	System.out.println("\t프로그램 종료");
		System.exit(-1);
	}
	//main() 메소드 --완성
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