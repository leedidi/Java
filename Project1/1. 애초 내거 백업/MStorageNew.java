import java.util.Scanner;
import java.io.IOException;

public class MStorageNew
{
	Scanner sc = new Scanner(System.in);
	ISetup is = new ISetup();

	int cate;
	String real;
	String name;
	int num,kcal,money;

	public void mAddRemove() throws IOException // 품목 추가/ 삭제 메소드
	{
		String op;

		System.out.println("신규 품목 추가/삭제 ");

		System.out.println("추가, 삭제할 재료의 번호와 수량을 입력하세요.");
		System.out.print("재료 추가 시(+), 삭제(-) 시 입력 : ");
		op = sc.next();

		
		// 제거 가능한 항목 표시하도록 ★★★★★★★★★★★★★★★★★★★★
		System.out.println();
		System.out.println("┌──────────────────────────┐");
		System.out.println("│                          │");
		System.out.println("│    [제거 가능한 항목]    │");
		System.out.println("│                          │");
		System.out.println("│                          │");
		System.out.println("└──────────────────────────┘");
		System.out.println();
		System.out.println("카테고리를 선택하세요.");
		System.out.println(" 1. 야채 \n 2. 메인\n 3. 소스\n 4. 토핑");
		System.out.print("카테고리를 입력하세요 : ");
		cate = sc.nextInt();

		switch (op)
		{
			case "+" : mNewAdd(); break;
			case "-" : mNewRemove(); break;
		}
	}


	 public void mNewAdd() throws IOException // 추가 메소드
	 {
		is.firstSet();	//	바꾸야댐~!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

 		System.out.print("새로운 품목명을 입력해주세요 : ");
		name = sc.next();

		System.out.print("수량을 입력해주세요 : ");
		num = sc.nextInt();

		System.out.print("칼로리를 입력해주세요 : ");
		kcal = sc.nextInt();

		System.out.print("금액을 입력해주세요 : ");
		money = sc.nextInt();
			
		System.out.println();
		System.out.println(" [품목명] [수량] [칼로리] [금액]");	
		System.out.printf("%5s %5d %7d %6d원",name,num,kcal,money);

		System.out.println();
		System.out.print("정말로 추가하시겠습니까? (Y/N) : ");
		real = sc.next();
 
		if (real.equals("y")||real.equals("Y"))	// toUpperCase??로 바꾸기 ★★★★★★★★★★★★★★★
		{
			switch (cate)		// 나중에 보기
			{
				case Menus.E_ONE: // 야채
				{
					//진짜 추가 
					is.vVeg.add(new Ingredient(name,num,kcal,money));

					System.out.printf("%s품목이 추가되었습니다.\n",name);

					//테스트
					for (int i=0; i<is.vVeg.size();i++)
							System.out.print(is.vVeg.get(i).name + " ");

				} break;

				case Menus.E_TWO: // 메인
				{
					//진짜 추가 
					is.vMain.add(new Ingredient(name,num,kcal,money));

					System.out.printf("%s품목이 추가되었습니다.\n",name);

					for (int i=0; i<is.vMain.size();i++)
							System.out.print(is.vMain.get(i).name + " ");

				} break;

				case Menus.E_THREE: // 소스
				{
					//진짜 추가 
					is.vSource.add(new Ingredient(name,num,kcal,money));

					System.out.printf("%s품목이 추가되었습니다.\n",name);

					for (int i=0; i<is.vSource.size();i++)
							System.out.print(is.vSource.get(i).name + " ");	

				} break;

				case Menus.E_FOUR: // 토핑
				{

					//진짜 추가 
					is.vTop.add(new Ingredient(name,num,kcal,money));

					System.out.printf("%s품목이 추가되었습니다.\n",name);

					for (int i=0; i<is.vTop.size();i++)
							System.out.print(is.vTop.get(i).name + " ");

				} break;
			}

		}// end if

		else
		 {
			System.out.println("추가가 취소되었습니다");
		 }

				System.out.println();
				System.out.print("품목 추가/삭제를 계속 하시겠습니까? (Y/N) : ");
				real = sc.next();

				Password pw = new Password();		// 임시로 선언한것, 추후 옮기기★★★★★★★★★★★★★

				if (real.equals("y")||real.equals("Y"))
					mAddRemove();
				else
					pw.modeRun();
				//else => 관리자 모드로 가기 &&
						
					
	 }//end mNewAdd() => 완성 &&논의필요/ 벡터 초기화 해결
	 
	public void mNewRemove() throws IOException// 품목 제거 메소드
	{	
		is.firstSet();
		//재료출력

		System.out.print("제거할 품목명을 입력해주세요 : ");
		String str = sc.next();

		switch (cate) //카테고리 
		{
			case Menus.E_ONE :		// 야채 선택
			{
				for (int i=0; i<is.vVeg.size(); i++)
				{
					if (is.vVeg.get(i).name.equals(str))
					{	
						is.vVeg.remove(i);
						System.out.printf("%s품목이 제거되었습니다.",str);
						break;
					}

					if (i==is.vVeg.size()-1)
						System.out.print("잘못 입력했습니다.");

				} 
				
			} break;
		

			case Menus.E_TWO :		// 메인 선택
			{
				for (int i=0; i<is.vMain.size(); i++)
				{
					if (is.vMain.get(i).name.equals(str))
					{	
						is.vMain.remove(i);
						System.out.printf("%s품목이 제거되었습니다.",str);
						break;
					} 

					if (i==is.vMain.size()-1)
						System.out.print("잘못 입력했습니다.");
						
				} 
				
			} break;

			case Menus.E_THREE :	// 소스 선택
			{
				for (int i=0; i<is.vSource.size(); i++)
				{
					if (is.vSource.get(i).name.equals(str))
					{	
						is.vSource.remove(i);
						System.out.printf("%s품목이 제거되었습니다.",str);
						break;
					} 

					if (i==is.vSource.size()-1)
						System.out.print("잘못 입력했습니다.");

				}
				
			} break;

			case Menus.E_FOUR :		// 토핑 선택
			{
				for (int i=0; i<is.vTop.size(); i++)
				{
				if (is.vTop.get(i).name.equals(str))
					{	
						is.vTop.remove(i);
						System.out.printf("%s품목이 제거되었습니다.",str);
						break;
					} 

					if (i==is.vTop.size()-1)
						System.out.print("잘못 입력했습니다.");
			
				} 
				
			} break;
		}

		System.out.println();
		System.out.print("품목 추가/삭제를 계속 하시겠습니까? (Y/N) : ");
		real = sc.next();

		Password pw = new Password();		// 임시로 선언한것, 추후 옮기기★★★★★★★★★★★★★

		if (real.equals("y")||real.equals("Y"))
			mAddRemove();
		else
			pw.modeRun();

	}

}//end class
