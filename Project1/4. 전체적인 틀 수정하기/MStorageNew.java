
import java.util.Scanner;
import java.io.IOException;

public class MStorageNew
{
	private static Scanner sc;
	private static ManagerMode mm;

	String name;
	int cate,num,kcal,money;

	static
	{
		 sc = new Scanner(System.in);

		 mm = new ManagerMode();
	}


	public void mAddRemove() throws IOException // 품목 추가/ 삭제 메소드
	{
		//System.out.println("신규 품목 추가/삭제 ");

		System.out.println("추가, 삭제할 재료의 번호와 수량을 입력하세요.");
		System.out.print("재료 추가 시(+), 삭제(-) 시 입력 : ");
		Password.op = sc.next();

		//※※※※※※※※※※ 추가5 : MStorageNew.mAddRemove() - 제거 가능한 항목 박스 제거
		// 제거 가능한 항목 표시하도록 ★★★★★★★★★★★★★★★★★★★★
		/*
		System.out.println();
		System.out.println("┌──────────────────────────┐");
		System.out.println("│                          │");
		System.out.println("│    [제거 가능한 항목]    │");
		System.out.println("│                          │");
		mm.mStock();
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
		System.out.print("새로운 품목의 카테고리를 입력해주세요 : ");
		cate = sc.nextInt();

 		System.out.print("▶ 품목명을 입력해주세요 : ");
		name = sc.next();

		System.out.print("▶ 수량을 입력해주세요   : ");
		num = sc.nextInt();

		System.out.print("▶ 칼로리를 입력해주세요 : ");
		kcal = sc.nextInt();

		System.out.print("▶ 금액을 입력해주세요   : ");
		money = sc.nextInt();

			
		System.out.println();
		System.out.println(" [품목명] [수량] [칼로리] [금액]");	
		System.out.printf("%5s %4d개 %4dkcal %5d원",name,num,kcal,money);

		System.out.println();
		System.out.print("정말로 추가하시겠습니까? (Y/N) : ");
		Password.con = sc.next().toUpperCase();
 
		if (Password.con.equals("Y"))
		{
			ISetup.v.add(new Ingredient(cate,name,num,kcal,money));

			System.out.printf("\n<%s 품목이 추가되었습니다.>\n",name);
		}
		else
		{
			System.out.println("추가가 취소되었습니다.");
		}						

	}//end mNewAdd()


	public void mNewRemove() throws IOException// 품목 제거 메소드
	{	
		System.out.print("제거할 품목명을 입력해주세요 : ");
		name = sc.next();

		for (int i=0; i<ISetup.v.size(); i++)
		{
			if (ISetup.v.get(i).name.equals(name))
			{	
				ISetup.v.remove(i);
				System.out.printf("\n<%s 품목이 제거되었습니다.>\n",name);
			}
		}

	}//end mNewRemove()

	// 품목 추가/삭제 계속 물어보는 메소드
	public void mStorageNewReturn() throws IOException
	{

		System.out.print("품목 추가/삭제를 계속 하시겠습니까? (Y/N) : ");
		Password.con = sc.next().toUpperCase();

		Password pw = new Password();

		if (Password.con.equals("Y"))
			mAddRemove();
		else
			pw.modeRun();
		//else => 관리자 모드로 가기 &&
	}//end mStorageNewReturn()

}//end class