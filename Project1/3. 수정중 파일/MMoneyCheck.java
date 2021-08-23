import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class MMoneyCheck // 매출 확인 클래스
{
	public void mMoneyPrint()
	{
		System.out.println("\n    [매출 확인]");
		
		// 1. 카테고리별 재료 번호, 재료 이름, 총 판매 수량, 총 판매 금액 출력
		ISetup is = new ISetup();
		is.firstSet();
		System.out.println();
		System.out.println("-----------------------");
		System.out.println("    [야채]");
		System.out.println();
		
		// 야채 출력 반복문
		for (int n=0; n<is.vVeg.size(); n++)
		System.out.printf("%2d. %5s\n", n+1, is.vVeg.get(n).name);
		//System.out.printf("%2d. %5s, 총 %3d개, 총 %d원\n", n+1, is.vVeg.get(n).name, xxx, xxx); 
														// 재료 번호, 재료 이름, 총 판매 수량, 총 판매 금액
		// 총 판매 수량, 총 판매 금액 담아온 후 추가
		
		System.out.println("-----------------------");
		System.out.println("    [육류]");
		System.out.println();

		// 육류 출력 반복문
		for (int n=0; n<is.vMain.size(); n++)
		System.out.printf("%2d. %5s\n", n+1, is.vMain.get(n).name);
		//System.out.printf("%2d. %5s, 총 %3d개, 총 %d원\n", n+1, is.vMain.get(n).name, xxx, xxx); 
														// 재료 번호, 재료 이름, 총 판매 수량, 총 판매 금액
		System.out.println("-----------------------");
		System.out.println("    [소스류]");
		System.out.println();

		// 소스 출력 반복문
		for (int n=0; n<is.vSource.size(); n++)
		System.out.printf("%2d. %5s\n", n+1, is.vSource.get(n).name);
		//System.out.printf("%2d. %5s, 총 %3d개, 총 %d원\n", n+1, is.vMain.get(n).name, xxx, xxx); 
														// 재료 번호, 재료 이름, 총 판매 수량, 총 판매 금액
		System.out.println("-----------------------");
		System.out.println("    [토핑류]");
		// 토핑 추가 시 추가
		System.out.println();

	  // 2. 총 매출 출력
	  System.out.printf("총 매출 : %d\n", 1); // 위의 (재료별 총 판매 금액) 총 합계 출력
	}//end mMoneyPrint()
  
  public void mMoneyCal()	//총 투입금액 확인 및 출금 
	{
				
			//총 투입 금액
			
			//pay누적 잘불러오기~!!!!!!!!!!!!!!!!!!!!!!!!


			//System.out.println(" 총 투입 금액 : "+ 누적값 + " 원 입니다.");

			
			// 출금하기
			System.out.println("★출금 여부 확인 후 [관리자 모드]로 돌아갑니다.★");
			System.out.println("★경고! 되돌릴 수 없습니다.★");
			System.out.println("  출금 하시겠습니까? (Y/N) : ");
			//String real = sc.next();

			/*
			if (real.equals("y")||real.equals("Y"))				// UpperClass 로 하기
			{
				System.out.println(sum + "원이 출금 되었습니다.");
				sum = 0;
			}
			*/


			//mm.mMenuPrint(); //출금여부 관계없잉 관리자모드로...
			//연결이 아직입니다.....가긴합니다,,,
	}


}// end class MMoneyCheck