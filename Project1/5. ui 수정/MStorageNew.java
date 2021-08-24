
import java.util.Scanner;
import java.io.IOException;

public class MStorageNew
{
	String name;				// 추가 품목 이름 변수
	int cate,num,kcal,money;	// 추가 품목 카테고리, 수량, 칼로리, 금액 변수

	private static Scanner sc;
	private static ManagerMode mm;

	static
	{
		// Scanner 인스턴스 생성
		 sc = new Scanner(System.in);

		// ManagerMode 인스턴스 생성
		 mm = new ManagerMode();
	}


	public void mAddRemove() throws IOException // 품목 추가/ 삭제 메소드
	{
		System.out.println("품목 추가/삭제 ");

		System.out.print("품목 추가 시(+), 삭제(-) 시 입력 : ");
		Password.op = sc.next();

/*
		// 제거 가능한 항목 표시하도록 ★★★★★★★★★★★★★★★★★★★★
		System.out.println();
		System.out.println("┌──────────────────────────┐");
		System.out.println("│                          │");
		System.out.println("│    [제거 가능한 항목]    │");
		System.out.println("│                          │");
		//mm.mStock();
		System.out.println("│                          │");
		System.out.println("└──────────────────────────┘");
		System.out.println();
*/
		System.out.println();
		System.out.println("    [제거 가능한 항목]    ");
		mm.mStock();
		System.out.println();

		switch (Password.op)
		{
			case "+" : mNewAdd(); break;
			case "-" : mNewRemove(); break;
		}
	}//end mAddRemove()


	public void mNewAdd() throws IOException // 추가 메소드
	{
		// 새로 추가할 품목의 카테고리, 품목명, 수량, 칼로리, 금액 입력
		System.out.println("(야채 : 1, 메인 : 2, 소스 : 3, 토핑 : 4)");
		System.out.print("새로운 품목의 카테고리를 입력해주세요 : ");
		cate = sc.nextInt();

 		System.out.print("▶ 품목명을 입력해주세요 : ");
		name = sc.next();

		System.out.print("▶ 수량을 입력해주세요 : ");
		num = sc.nextInt();

		System.out.print("▶ 칼로리를 입력해주세요 : ");
		kcal = sc.nextInt();

		System.out.print("▶ 금액을 입력해주세요 : ");
		money = sc.nextInt();
			
		System.out.println();
		System.out.println(" [품목명] [수량] [칼로리] [금액]");	
		System.out.printf("%5s %4d %4dkcal %5d원",name,num,kcal,money);

		System.out.println();
		System.out.print("정말로 추가하시겠습니까? (Y/N) : ");
		Password.con = sc.next().toUpperCase();
 
		if (Password.con.equals("Y"))	// Y 입력한 경우
		{								// v벡터에 품목 추가
			ISetup.v.add(new Ingredient(cate,name,num,kcal,money));

			System.out.printf("\n<<%s품목이 추가되었습니다.>>\n",name);
		}
		else
		{
			System.out.println("추가가 취소되었습니다");
		}						

	}//end mNewAdd()


	public void mNewRemove() throws IOException	// 품목 제거 메소드
	{	
		System.out.print("제거할 품목명을 입력해주세요 : ");
		name = sc.next();

		for (int i=0; i<ISetup.v.size(); i++)		// v벡터를 돌면서
		{
			if (ISetup.v.get(i).name.equals(name))	// 입력한 품목과 일치하는 품목을 찾아서
			{										// 제품명이 일치할 경우 품목 제거
				ISetup.v.remove(i);
				System.out.printf("\n<<%s품목이 제거되었습니다.>>\n",name);
			}
		}

	}//end mNewRemove()


	public void mStorageNewReturn() throws IOException	// 품목 추가/삭제 계속 물어보는 메소드
	{

		System.out.print("품목 추가/삭제를 계속 하시겠습니까? (Y/N) : ");
		Password.con = sc.next().toUpperCase();

		Password pw = new Password();

		if (Password.con.equals("Y"))	// Y 입력한 경우
			mAddRemove();				// 품목 추가/삭제 재실행
		else
			pw.modePrint();
			pw.modeSelect();
			pw.modeRun();				// 아닐경우 관리자 모드로
		//else => 관리자 모드로 가기 &&
	}//end mStorageNewReturn()

}//end class