import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Collections;

public class MMoneyCheck // 매출 확인 클래스
{
	private static Scanner sc;
	private static ManagerMode mm;

	static
	{
		sc = new Scanner(System.in);

		mm = new ManagerMode();
	}

	
	public void mMoneyPrint()
	{
		System.out.println("\n             [매출 확인]");
		
		System.out.println("┌────────────────────────────────────────┐");
		System.out.println("│		                         │");
		System.out.println("│		                         │");
		System.out.println("│               [야채]                   │");
		System.out.println("│		                         │");
		int sumMPay = 0;      // 매출 누적 변수

		for (int i=0; i<ISetup.v.size(); i++)
		{
			if (ISetup.v.get(i).cate == 1)
			{
				System.out.printf("│	%-6s\t %3d개\t %,5d원 │\n", ISetup.v.get(i).name, Collections.frequency(ISetup.payArray, ISetup.v.get(i).name), 
												(Collections.frequency(ISetup.payArray, ISetup.v.get(i).name) * ISetup.v.get(i).money));
				sumMPay += (Collections.frequency(ISetup.payArray, ISetup.v.get(i).name) * ISetup.v.get(i).money);
			}
		}
		System.out.println("│		                         │");
		System.out.println("│      --------------------------        │");
		System.out.println("│		                         │");
		System.out.println("│		                         │");
		System.out.println("│               [메인]                   │");
		System.out.println("│		                         │");
		for (int i=0; i<ISetup.v.size(); i++)
		{
			if (ISetup.v.get(i).cate == 2)
			{
				System.out.printf("│	%-6s\t %3d개\t %,5d원 │\n", ISetup.v.get(i).name, Collections.frequency(ISetup.payArray, ISetup.v.get(i).name), 
												(Collections.frequency(ISetup.payArray, ISetup.v.get(i).name) * ISetup.v.get(i).money));
				sumMPay += (Collections.frequency(ISetup.payArray, ISetup.v.get(i).name) * ISetup.v.get(i).money);
			}
		}
		System.out.println("│		                         │");
		System.out.println("│      --------------------------        │");
		System.out.println("│		                         │");
		System.out.println("│		                         │");
		System.out.println("│               [소스]                   │");
		System.out.println("│		                         │");
		for (int i=0; i<ISetup.v.size(); i++)
		{
			if (ISetup.v.get(i).cate == 3)
			{
				System.out.printf("│	%-6s\t %3d개\t %,5d원 │\n", ISetup.v.get(i).name, Collections.frequency(ISetup.payArray, ISetup.v.get(i).name), 
												(Collections.frequency(ISetup.payArray, ISetup.v.get(i).name) * ISetup.v.get(i).money));
				sumMPay += (Collections.frequency(ISetup.payArray, ISetup.v.get(i).name) * ISetup.v.get(i).money);
			}
		}
		System.out.println("│		                         │");
		System.out.println("│      --------------------------        │");
		System.out.println("│		                         │");
		System.out.println("│		                         │");
		System.out.println("│               [토핑]                   │");
		System.out.println("│		                         │");
		for (int i=0; i<ISetup.v.size(); i++)
		{
			if (ISetup.v.get(i).cate == 4)
			{
				System.out.printf("│	%-6s\t %3d개\t %,5d원 │\n", ISetup.v.get(i).name, Collections.frequency(ISetup.payArray, ISetup.v.get(i).name), 
												(Collections.frequency(ISetup.payArray, ISetup.v.get(i).name) * ISetup.v.get(i).money));
				sumMPay += (Collections.frequency(ISetup.payArray, ISetup.v.get(i).name) * ISetup.v.get(i).money);
			}
		}
		System.out.println("│		                         │");
		System.out.println("└────────────────────────────────────────┘");

		// 2. 총 매출 출력
		System.out.println();
		System.out.printf("▶ 총 매출 : %,5d원\n", sumMPay); 

	}//end mMoneyPrint()


	public void mMoneyCal() throws IOException	//총 투입금액 확인 및 출금 
	{
		UserMode um = new UserMode();

		//pay누적 잘불러오기~!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println("");

		int sumMPay = 0;	// 누적 변수
		
		for (int i=1; i<um.count + 1;i++ )
			sumMPay += ISetup.payNum.get(i);
		
		System.out.printf("▶ 총 투입 금액 : %,5d원 입니다.", sumMPay);

		// 출금하기
		System.out.println("\n★출금 여부 확인 후 [관리자 모드]로 돌아갑니다.★");
		System.out.println("★경고! 되돌릴 수 없습니다.★");
		System.out.print("  출금 하시겠습니까? (Y/N) : ");
		String real = sc.next().toUpperCase();

		if (real.equals("Y"))				// UpperClass 로 하기
		{
			System.out.println(sumMPay + "원이 출금 되었습니다.");
			sumMPay = 0;
		}

		mm.mMenuPrint(); //출금여부 관계없이 관리자모드로...
		mm.mMenuSelect();
		mm.mMenuRun();

	}//end mMoneyCal()

}// end class MMoneyCheck