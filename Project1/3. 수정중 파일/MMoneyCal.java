
import java.util.Scanner;


	Scanner sc = new Scanner(System.in);
	ManagerMode mm = new ManagerMode();
			
	public void mMoneyCal()	//총 투입금액 확인 및 출금 
	{
				
			//총 투입 금액
			
			//pay누적 잘불러오기~!!!!!!!!!!!!!!!!!!!!!!!!


			System.out.println(" 총 투입 금액 : "+ 누적값 + " 원 입니다.");

			
			// 출금하기
			System.out.println("★출금 여부 확인 후 [관리자 모드]로 돌아갑니다.★");
			System.out.println("★경고! 되돌릴 수 없습니다.★");
			System.out.println("  출금 하시겠습니까? (Y/N) : ");
			String real = sc.next();


			if (real.equals("y")||real.equals("Y"))				// UpperClass 로 하기
			{
				System.out.println(sum + "원이 출금 되었습니다.");
				sum = 0;
			}

			mm.mMenuPrint(); //출금여부 관계없잉 관리자모드로...
			//연결이 아직입니다.....가긴합니다,,,
	}
