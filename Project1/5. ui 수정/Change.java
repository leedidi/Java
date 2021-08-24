import java.util.Scanner;
import java.io.IOException;

//거스름돈 저장 및 계산 클래스
public class Change
{
	static int[] giveMoney = new int[5];	// 손님에게 드릴 화폐종류갯수들(만원, 오천원, 천원, 오백원, 백원)
	static final int[] bills = {10000, 5000, 1000, 500, 100};	// 화폐 종류들
	static int [] moneyCount = {5, 2, 10, 4, 10};	// 금고 통 초기값


	// 거스름돈 계산	  
	public static void changeCal(int pay, int price) throws IOException // 받은 돈(사람의 입력한 값), 메뉴가격
	{
		int won = 10000;
		int sw = 1;				// 권종 변경 변수
		int change;				// 거스름돈
		int totalChange = 0;	// 돈통의 총 금액
		int lack = 0;			// (돈통은 되지만)화폐가 모자를때 거르는 변수

		UserMode um = new UserMode();

		UCustomSalad ucs = new UCustomSalad();

		// 돈통의 총 금액 계산
		for (int a=0; a<5; a++)
			totalChange += bills[a] * moneyCount[a];

		change = pay - price;

		int x = 0;				// moneyCount[x] 변수
		int count = 1;			// 
		int temple = change;

		// 총 금액 < 거스름돈
		if (totalChange < change)
		{
			System.out.println("거스름돈이 부족합니다.");
			System.out.println();
			System.out.println("필요 시 관리자에게 전화주세요...");
			System.out.println("관리자 : 김호진");
			System.out.println("☎ 010-4848-4114");
			
			ucs.uCustomMenuSelect();
		}
		// 총 금액 > 거스름돈
		else
		{
			// 거스름돈 권종별 수량 계산
			while (true)
			{
				if (moneyCount[x] == 0 || change - won < 0)
				{
					count = 1;
					x++;
					if (sw == 1)
					{
						won = won/2;
						sw = 0;
					}
					else
					{
						won = won/5;
						sw = 1;
					}	
				}
				else
				{
					change = change - won;
					giveMoney[x] = count++;
					moneyCount[x] -= 1;
				}
				
				if (x == 5)
				{
					for (int b=0; b<giveMoney.length; b++)
						lack += bills[b] * giveMoney[b];

					break;
				}
			}	// end while~!!!
		}	// end else
		

		// 총 금액 > 거스름돈(그러나 수량 부족)
		if (temple != lack)
		{
			System.out.println("거스름돈이 부족합니다.");
			System.out.println();
			System.out.println("필요 시 관리자에게 전화주세요...");
			System.out.println("관리자 : 김호진");
			System.out.println("☎ 010-4848-4114");
			return;
		}

		System.out.println("입구에서 거스름돈을 가져가세요.");
		System.out.println("===============================");
		System.out.println();
		for (int i =0; i<5; i++)
			System.out.printf("%5d원 : %2d개\n", bills[i],giveMoney[i]);
		System.out.println();

		System.out.println("거스름돈 : " + temple);
		System.out.println();
		System.out.println("===============================");
		System.out.println("결제가 완료되었습니다.");

		um.uMenuPrint();
		um.uMenuSelect();
		um.uMenuRun();
		
		//um.uPayRun(temp);
		
		// ※ 여기 검토 필수 ~!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		//UserMode um = new UserMode();
		//um.uPayRun(벡터<Ingredient> 타입);

	}
	
}