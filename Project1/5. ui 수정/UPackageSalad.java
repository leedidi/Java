import java.util.Vector;
import java.util.Scanner;
import java.io.IOException;


// 세트할인
// 패키지 샐러드 클래스
public class UPackageSalad
{
	static Vector<Ingredient> salmon = new Vector<Ingredient>();
	static Vector<Ingredient> cajun = new Vector<Ingredient>();
	static Vector<Ingredient> chicbr = new Vector<Ingredient>();

	public static void uPackageStock() // 메뉴 구성 메소드
	{
		// 현재 재고 수량으로 나오게 수정 해야함
			
		// 연어 샐러드 : 연어, 양상추, 당근, 양파, 오리엔탈, 방토 (-500원)
		salmon.add(ISetup.v.get(5));	// 연어
		salmon.add(ISetup.v.get(0));	// 양상추
		salmon.add(ISetup.v.get(1));	// 당근				
		salmon.add(ISetup.v.get(2));	// 방토
		salmon.add(ISetup.v.get(3));	// 양파
		salmon.add(ISetup.v.get(9));	// 오리엔탈

		// 케이준 샐러드 : 케이준, 허니머스타드, 양상추, 방토, 당근 (-500원)
		cajun.add(ISetup.v.get(6));		// 케이준
		cajun.add(ISetup.v.get(11));	// 허니머스타드
		cajun.add(ISetup.v.get(0));		// 양상추
		cajun.add(ISetup.v.get(2));		// 방울토마토
		cajun.add(ISetup.v.get(1));		// 당근

		// 닭가슴살 샐러드 : 오이, 닭가슴살, 양상추, 방토, 당근, 발사믹 (-500원)
		chicbr.add(ISetup.v.get(7));	// 닭가슴살
		chicbr.add(ISetup.v.get(4));	// 오이
		chicbr.add(ISetup.v.get(0));	// 양상추
		chicbr.add(ISetup.v.get(2));	// 방울토마토
		chicbr.add(ISetup.v.get(8));	// 발사믹
	}//end uPackageStock()	


	public void uPackagePrint()
	{
		System.out.println();
		System.out.println("┌──────────────────────────────────────┐");
		System.out.println("│                                      │");
		System.out.println("│                                      │");
		System.out.println("│    [패키징 샐러드] (이전 메뉴 : -1)  │");
		System.out.println("│                                      │");
		System.out.println("│         1. 연어 샐러드               │");
		System.out.println("│         2. 케이준 샐러드             │");
		System.out.println("│         3. 닭가슴살 샐러드           │");
		System.out.println("│                                      │");
		System.out.println("│                                      │");
		System.out.println("└──────────────────────────────────────┘");
		System.out.println();
	}//end uPackagePrint()
	

	public Vector<Ingredient> uPackageSalad() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		UserMode um = new UserMode();

		// 1. 패키징 샐러드명과 가격을 나열하여 출력
		//위의 uPackageStock() 소환
		uPackageStock();
		uPackagePrint();
		
		// 2. 구매자가 구매하고 싶은 샐러드의 번호 입력
		while (true)
		{
			System.out.print("메뉴 선택 : ");
			Password.sel = sc.nextInt();

			if((Password.sel>0 && Password.sel<4) || Password.sel==-1)		// 메뉴 번호 올바르게 입력 시
				break;			    // 반복문 탈출
			System.out.println("\n입력에 문제가 있습니다.\n");	// 올바르지 않게 입력 시 메세지 표시 후 다시 입력받음	
		}
		
		if (Password.sel == Menus.E_MINUS)
		{
			um.uMenuPrint();
			um.uMenuSelect();
			um.uMenuRun();
		}

		if (Password.sel == Menus.E_ONE)
		{
			return salmon;
		}
		else if (Password.sel == Menus.E_TWO)
		{
			return cajun;
		}
		else 
		{
			return chicbr;
		}

	}//end Vector<Ingredient> uPackageSalad()
}//end uPackageSalad()