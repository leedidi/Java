import java.util.Vector;
import java.util.Scanner;
import java.io.IOException;


// 세트할인
// 패키지 샐러드 클래스
public class UPackageSalad	
{
	private static Integer sel;			// 선택 값을 담을 변수
	private static String con;	

	static Vector<Ingredient> salmon = new Vector<Ingredient>();
	static Vector<Ingredient> cajun = new Vector<Ingredient>();
	static Vector<Ingredient> chicbr = new Vector<Ingredient>();

	public static void uPackageStock() // 메뉴 구성 메소드
	{
		// 현재 재고 수량으로 나오게 수정 해야함
		ISetup is = new ISetup();	
		is.firstSet();		

		// 연어 샐러드 : 연어, 양상추, 당근, 양파, 오리엔탈, 방토 (-500원)
		salmon.add(is.vMain.get(0));	// 연어
		salmon.add(is.vVeg.get(0));	// 양상추
		salmon.add(is.vVeg.get(1));	// 당근				
		salmon.add(is.vVeg.get(2));	// 방토
		salmon.add(is.vVeg.get(3));	// 양파
		salmon.add(is.vSource.get(1)); // 오리엔탈
		salmon.add(new Ingredient("세트 할인",100,0,-500));	// 세트할인
		// 세트할인 확인 못해봄!

		// 케이준 샐러드 : 케이준, 허니머스타드, 양상추, 방토, 당근 (-500원)
		cajun.add(is.vMain.get(1));		// 케이준
		cajun.add(is.vSource.get(3));	// 허니머스타드
		cajun.add(is.vVeg.get(0));		// 양상추
		cajun.add(is.vVeg.get(2));		// 방울토마토
		cajun.add(is.vVeg.get(1));		// 당근
		cajun.add(new Ingredient("세트 할인",100,0,-500));	// 세트할인

		// 닭가슴살 샐러드 : 오이, 닭가슴살, 양상추, 방토, 당근, 발사믹 (-500원)
		chicbr.add(is.vMain.get(2));	// 닭가슴살
		chicbr.add(is.vVeg.get(4));		// 오이
		chicbr.add(is.vVeg.get(0));		// 양상추
		chicbr.add(is.vVeg.get(2));		// 방울토마토
		chicbr.add(is.vSource.get(0));	// 발사믹
		chicbr.add(new Ingredient("세트 할인",100,0,-500));	// 세트할인
	}//end uPackageStock()	
	

	public static void uPackagePrint()
	{
		System.out.println("-------------------------");
		System.out.println("    [패키징 샐러드]");
		System.out.println();
		System.out.println("1. 연어 샐러드");
		System.out.println("2. 케이준 샐러드");
		System.out.println("3. 닭가슴살 샐러드");
		System.out.println("-------------------------");
	}//end uPackagePrint()
	

	public static Vector<Ingredient> uPackageSalad()
	{
		Scanner sc = new Scanner(System.in);

		// 1. 패키징 샐러드명과 가격을 나열하여 출력
		//위의 uPackageStock() 소환
		uPackageStock();
		uPackagePrint();
		
		// 2. 구매자가 구매하고 싶은 샐러드의 번호 입력
		while (true)
		{
			System.out.print("메뉴 선택 : ");
			sel = sc.nextInt();

			if(sel>0 && sel<4)		// 메뉴 번호 올바르게 입력 시
				break;			    // 반복문 탈출
			System.out.println("\n입력에 문제가 있습니다.\n");	// 올바르지 않게 입력 시 메세지 표시 후 다시 입력받음	
		}
		
		if (sel == Menus.E_ONE)
		{
			return salmon;
		}
		else if (sel == Menus.E_TWO)
		{
			return cajun;
		}
		else
		{
			return chicbr;
		}


	}//end uPackageSalad()
}