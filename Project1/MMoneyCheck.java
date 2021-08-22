import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

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
  

  //XXXX 3. 권종 별 수량 출력(5만원...1만원...500원...) -> 권종별 수량을 이제 따로 입력받지 않으니까 필요x -> 삭제
  //x System.out.println("\n    [권종 별 수량]") x;

  public void mMoneyReturn() throws IOException	// 
  {	 
		  // BufferedReader 인스턴스 생성
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		  // 4. 돌아가기

		  System.out.print("\n메뉴 선택 화면으로 돌아가시겠습니까? (Y/N) : ");
		  String yn = br.readLine();

		  if(yn.equals("y")||yn.equals("Y"))
		  {
				System.out.println("메뉴 선택 화면으로 돌아갑니다.");
				// -> [3. 금고 관리 화면으로 되돌아감]
				// -- [3. 금고 관리 화면] 생성시 추가
		  }
				else if(yn.equals("N")||yn.equals("n"))
				{
					mMoneyPrint();
					System.out.print("\n메뉴 선택 화면으로 돌아가지 않았습니다."); 
					mMoneyReturn();
				}	
				 else
				{	
					 mMoneyPrint();
					 System.out.print("\n잘못 입력하셨습니다.");
					 mMoneyReturn();
				}

   }//end mMoneyReturn()

}// end class MMoneyCheck

		//-- XXX Y/N 으로 하기!
		/*
		String ans;
		do
		{	
			System.out.print("메뉴 선택 화면으로 돌아가시겠습니까? (돌아가기를 원하신다면 Y 입력) : ");
			ans = br.readLine();
		}
		while (!ans.equals("Y"));
					
		System.out.print("메뉴 선택 화면으로 돌아갑니다.");
		// -> [3. 금고 관리 화면으로 되돌아감]
		// -- [3. 금고 관리 화면] 생성시 추가
		*/

	


		