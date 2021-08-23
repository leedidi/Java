import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class TestBox 
{
	private static ManagerMode mm;
	static
	{
		sc = new Scanner(System.in);

		mm = new ManagerMode();
	}

	public void mMoneyPrint()
	{
		System.out.println("\n    [매출 확인]");
		
		System.out.println("┌─────────────────────────────┐");
		System.out.println("│		              │");
		System.out.println("│          [야채]             │");
		System.out.println("│		              │");
		for (int n=0; n<ISetup.v.size(); n++)
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(i).cate == 1)
				// System.out.printf("%2d %5s, %3d개\n", n+1, ISetup.v.get(n).name, 총 판매 수량, 총 판매 금액);
				System.out.printf("%2d. %-10s	" + ": " + "%3d개 / %d원\n", n+1, ISetup.v.get(n).name, 총 판매 수량, 총 판매 금액);
		}

		System.out.println("-----------------------");
		System.out.println("    [메인]");
		System.out.println();
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(i).cate == 2)
				System.out.printf("%2d. %-10s	" + ": " + "%3d개 / %d원\n", n+1, ISetup.v.get(n).name, 총 판매 수량, 총 판매 금액);
		}

		System.out.println("-----------------------");
		System.out.println("    [소스]");
		System.out.println();
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(i).cate == 3)
				System.out.printf("%2d. %-10s	" + ": " + "%3d개 / %d원\n", n+1, ISetup.v.get(n).name, 총 판매 수량, 총 판매 금액);
		}

		System.out.println("-----------------------");
		System.out.println("    [토핑]");
		System.out.println();
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(i).cate == 4)
				System.out.printf("%2d. %-10s	" + ": " + "%3d개 / %d원\n", n+1, ISetup.v.get(n).name, 총 판매 수량, 총 판매 금액);
		}
		// 총 판매 수량, 총 판매 금액 담아온 후 추가
		

		// 2. 총 매출 출력
		System.out.printf("총 매출 : %d\n", 총 판매 금액 합계); // 위의 (재료별 총 판매 금액) 총 합계 출력

	}//end mMoneyPrint()
}
