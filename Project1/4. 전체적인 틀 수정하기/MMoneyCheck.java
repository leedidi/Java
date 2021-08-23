import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MMoneyCheck // 매출 확인 클래스
{
	private static Scanner sc;
	private static ManagerMode mm;

	static
	{
		sc = new Scanner(System.in);

		mm = new ManagerMode();
	}

		//※※※※※※※※※※ 추가4: MMoneyCheck.mMoneyPrint() - 재고 출력 깔끔하게 정리 해야함..... + 네모 모양 일단 이따가...

/*
	public void mMoneyPrint()
	{
		System.out.println("\n    [매출 확인]");
		
		System.out.println("-----------------------");
		System.out.println("    [야채]");
		System.out.println();
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
*/

 // 추가4: MMoneyCheck.mMoneyPrint() - 재고 출력 + 박스 넣음 (완료★)
 	public void mMoneyPrint()
	{
		System.out.println("\n    [매출 확인]");
		
		// 요 부분으로 이용하면 알맞게 될듯! 
		
		//System.out.println("┌────────────────────────────────────────┐");
		//System.out.println("│		                         │");
		//System.out.println("│               [야채]                   │");
		//System.out.println("│		                         │");
		//System.out.println("│      --------------------------        │");
		
		//*** 컴파일이 안되서 다른 클래스에서 실험해봤어서 여기선 최종 실행확인 못해봤는데
		// 아마도 박스모양 공백 될거에요!!
		

		System.out.println("┌────────────────────────────────────────┐");
		System.out.println("│		                         │");
		System.out.println("│               [야채]                   │");
		System.out.println("│		                         │");
		
		for (int n=0; n<ISetup.v.size(); n++)
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(i).cate == 1)
				// System.out.printf("%2d %5s, %3d개\n", n+1, ISetup.v.get(n).name, 총 판매 수량, 총 판매 금액);
				System.out.printf("│%2d. %-10s	" + ": " + "%3d개 / %d원│\n", n+1, ISetup.v.get(n).name, 총 판매 수량, 총 판매 금액);
		}
		
		System.out.println("│		                         │");
		System.out.println("│      --------------------------        │");
		System.out.println("│		                         │");
		System.out.println("│               [메인]                   │");
		System.out.println("│		                         │");
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(i).cate == 2)
				System.out.printf("│%2d. %-10s	" + ": " + "%3d개 / %d원│\n", n+1, ISetup.v.get(n).name, 총 판매 수량, 총 판매 금액);
		}
		
		System.out.println("│		                         │");
		System.out.println("│      --------------------------        │");
		System.out.println("│		                         │");
		System.out.println("│               [소스]                   │");
		System.out.println("│		                         │");
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(i).cate == 3)
				System.out.printf("│%2d. %-10s	" + ": " + "%3d개 / %d원│\n", n+1, ISetup.v.get(n).name, 총 판매 수량, 총 판매 금액);
		}

		System.out.println("│		                         │");
		System.out.println("│      --------------------------        │");
		System.out.println("│		                         │");
		System.out.println("│               [토핑]                   │");
		System.out.println("│		                         │");
		for (int n=0; n<ISetup.v.size(); n++)
		{
			if (ISetup.v.get(i).cate == 4)
				System.out.printf("│%2d. %-10s	" + ": " + "%3d개 / %d원│\n", n+1, ISetup.v.get(n).name, 총 판매 수량, 총 판매 금액);
		}
		// 총 판매 수량, 총 판매 금액 담아온 후 추가
		System.out.println("└────────────────────────────────────────┘");
		

		// 2. 총 매출 출력
		System.out.printf("▶ 총 매출 : %d\n", 총 판매 금액 합계); // 위의 (재료별 총 판매 금액) 총 합계 출력

	}//end mMoneyPrint()

	public void mMoneyCal()	//총 투입금액 확인 및 출금 
	{
				
		//총 투입 금액
		
		//pay누적 잘불러오기~!!!!!!!!!!!!!!!!!!!!!!!!

		System.out.println("▶ 총 투입 금액 : "+ 누적값 + " 원 입니다.");

		// 출금하기
		System.out.println("★출금 여부 확인 후 [관리자 모드]로 돌아갑니다.★");
		System.out.println("★경고! 되돌릴 수 없습니다.★");
		System.out.println("  출금 하시겠습니까? (Y/N) : ");
		String real = sc.next().toUpperCase();

		if (real.equals("Y"))				// UpperClass 로 하기
		{
			System.out.println(sum + "원이 출금 되었습니다.");
			sum = 0;
		
		}

		mm.mMenuPrint(); //출금여부 관계없잉 관리자모드로...
		//연결이 아직입니다.....가긴합니다,,,

	}//end mMoneyCal()

}// end class MMoneyCheck