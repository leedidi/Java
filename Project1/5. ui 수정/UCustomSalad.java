import java.util.Vector;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


// 커스텀 샐러드 클래스
public class UCustomSalad
{	
	Vector<Ingredient> temp = new Vector<Ingredient>();

	int currentKcal;	// 실시간 칼로리 변수
	int currentMoney;	// 실시간 금액 변수

	int vegMax=0, mainMax=0, sourceMax=0, topMax=0;	// 야채, 메인, 소스, 토핑 제한 변수

	static BufferedReader br;
	static Scanner sc;

	static
	{
		br = new BufferedReader(new InputStreamReader(System.in));

		sc = new Scanner(System.in);
	}

	// ★
	// 메뉴 선택 메소드 
	public void uCustomMenuSelect() throws IOException
	{
		UserMode um = new UserMode();

		System.out.println();
		System.out.println("┌─────────────────────────────────────────┐");
		System.out.println("│                                         │");
		System.out.println("│                                         │");
		System.out.println("│   [커스텀 샐러드]  (이전 메뉴로 : -1)   │");
		System.out.println("│                                         │");
		System.out.println("│      내가 직접 골라 만드는 샐러드       │");
		System.out.println("│                                         │");
		System.out.println("│             1. 재료 선택                │");
		System.out.println("│             2. 재료 취소                │");
		System.out.println("│                                         │");
		System.out.println("│                                         │");
		System.out.println("└─────────────────────────────────────────┘");
		System.out.println();

		do
		{
			System.out.print("실행할 기능을 선택하세요. : "); 
			Password.sel = Integer.parseInt(br.readLine());
		}
		while ( Password.sel != -1 && ( Password.sel<1 || Password.sel>2 ));
		

		switch (Password.sel)
		{	
			case Menus.E_MINUS : 
				{		
					um.uMenuPrint();		
					um.uMenuSelect();
					um.uMenuRun();
				} break;			// -1일때, 이전 단계로
			
			case Menus.E_ONE : 
				{
					uCAdd();
				} break;			// 1일때,  [1. 재료 담기] 선택.	
			
			case Menus.E_TWO : 
				{
					uCRemove();
				} break;			// 2일때,  [2. 재료 취소] 선택.
		}

	} //end uCustomMenuSelect()


	// ★
	public void uCCatePrint()	// 카테고리별로 재료 출력해서 보여주는 부분.
	{
		System.out.println("┌──────────────────────────────────────────────────────┐");
		System.out.println("│                                                      │");
		System.out.println("│                      [재료 목록]                     │");
		System.out.println("│                                                      │");
		System.out.println("│                         [야채]                       │");
		System.out.println("│------------------------------------------------------│");
		System.out.print("│");
		for (int n=0; n<ISetup.v.size(); n++)
		{
		   if (ISetup.v.get(n).cate == 1)
		      System.out.printf("\t%s", ISetup.v.get(n).name);
		}
		System.out.println("   │");
		
		System.out.println("│                                                      │");
		System.out.println("│                         [메인]                       │");
		System.out.println("│------------------------------------------------------│");
		System.out.print("│");
		for (int n=0; n<ISetup.v.size(); n++)
		{
		   if (ISetup.v.get(n).cate == 2)
		      System.out.printf("\t%5s ", ISetup.v.get(n).name);
		}
		System.out.println("     │");

		System.out.println("│                                                      │");
		System.out.println("│                         [소스]                       │");
		System.out.println("│------------------------------------------------------│");
		System.out.print("│");
		for (int n=0; n<ISetup.v.size(); n++)
		{
		   if (ISetup.v.get(n).cate == 3)
		      System.out.printf("    %s", ISetup.v.get(n).name);
		}
		System.out.println("  │");

		System.out.println("│                                                      │");
		System.out.println("│                         [토핑]                       │");
		System.out.println("│------------------------------------------------------│");
		System.out.print("│");
		for (int n=0; n<ISetup.v.size(); n++)
		{
		   if (ISetup.v.get(n).cate == 4)
		     System.out.printf("\t%s ", ISetup.v.get(n).name);
		}
		System.out.println("│");
		System.out.println("│                                                      │");
		System.out.println("└──────────────────────────────────────────────────────┘");
		System.out.println();
	}// uCCatePrint()


	// ★
	public void uCAdd() throws IOException // 재료 추가 메소드
	{
		uCCatePrint();

		System.out.println("메인은 한번, 소스는 두번, 토핑은 세번, 야채는 다섯번 까지 추가 가능합니다.");		
		System.out.print("▶ 담을 재료를 입력하세요 : " );
		Password.con = br.readLine();
	
		for (int i=0;i<ISetup.v.size();i++)	
		{
			if (ISetup.v.get(i).name.equals(Password.con))
			{	
				switch (ISetup.v.get(i).cate)	
				{
					// 카테고리별로 분류, 수량 카운트.
					case Menus.E_ONE   : vegMax++;	  break; 
					case Menus.E_TWO   : mainMax++;	  break;				
					case Menus.E_THREE : sourceMax++; break;
					case Menus.E_FOUR  : topMax++;	  break;
				}
			}
		}

		if ( vegMax> 5 )
		{
			vegMax--;
			System.out.println("더 이상 야채는 담을 수 없습니다.");
			System.out.println("(최대 야채 선택횟수 : 5번)");
			uCAddContinue();
		}
				
		else if ( mainMax> 3 )
		{
			mainMax--;
			System.out.println("더 이상 메인은 담을 수 없습니다.");
			System.out.println("(최대 메인 선택횟수 : 3번)");
			uCAddContinue();
		}	
		else if ( sourceMax> 2 )
		{
			sourceMax--;
			System.out.println("더 이상 소스는 담을 수 없습니다.");
			System.out.println("(최대 소스 선택횟수 : 2번)");
			uCAddContinue();
		}	
		else if ( topMax> 3 )
		{
			topMax--;
			System.out.println("더 이상 토핑은 담을 수 없습니다.");
			System.out.println("(최대 토핑 선택횟수 : 3번)");
			uCAddContinue();
		}	
		else
			uCAddRun(Password.con);
	}//
	
		

	// ★
	public void uCAddRun(String con) throws IOException // 재료 추가 실행 메소드
	{
		for (int i=0;i<ISetup.v.size();i++)
		{
			if (ISetup.v.get(i).name.equals(con))
			{	
				temp.add(ISetup.v.get(i));
				System.out.println("\n<<재료가 추가됐습니다.>>\n" );
			}
		}
	
		uCNow();
		uCAddContinue();

	}//uCAddRun()
	

	// ★
	public void uCAddContinue() throws IOException // 재료 추가 계속할지 물어보는 메소드
	{
		UserMode um = new UserMode();

		System.out.print("\n 계속 담으시겠습니까? (Y/N) : ");
		Password.con = sc.next().toUpperCase();
		  
		if (Password.con.equals("Y")) // y일때만. 한번 더 입력
			uCAdd();
		else
			um.uDecision(temp);
	}//end uCRemoveContinue()


	// ★
	public void uCRemove() throws IOException // 재료 삭제 실행 메소드
	{
		uCNow();
	
		System.out.print("▶ 삭제할 재료를 입력하세요 : " );
		Password.con = br.readLine();

		for (int i=0;i<temp.size();i++)
		{
			if (temp.get(i).name.equals(Password.con))
			{	
				temp.remove(temp.get(i));
				System.out.println("\n<<재료가 삭제됐습니다.>>\n" );
			}
		}

		uCRemoveContinue();
	}// uCRemove()
	

	// ★
	public void uCRemoveContinue() throws IOException // 재료 삭제 계속할지 물어보는 메소드
	{
		UserMode um = new UserMode();

		System.out.print("삭제를 계속 하시겠습니까? (Y/N)");
		Password.con = sc.next().toUpperCase();
		  
		if (Password.con.equals("Y")) // y일때만. 한번 더 입력
			uCRemove();
		else
			um.uDecision(temp);
	}//end uCRemoveContinue()

	
	// ★	
	public void uCNow() // 실시간 재료, 금액, 칼로리 계산
	{
		currentMoney = 0;		
		currentKcal = 0;

		for (int i=0; i<temp.size(); i++)
		{
			System.out.printf("%s ", temp.get(i).name);
			currentMoney += temp.get(i).money;
			currentKcal  += temp.get(i).kcal;
		}
		System.out.println();
		System.out.println("\n =======================================");
		System.out.printf(" ▶ 현재 금액   : %d 원\n ", currentMoney);
		System.out.printf("▶ 현재 칼로리 : %d kcal\n ", currentKcal);
		System.out.print("=======================================");
	}// end uCNow()


}//end UCustomSalad