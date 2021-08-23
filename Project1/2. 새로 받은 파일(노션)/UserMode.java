import java.util.Vector;
import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

class UserMode
{
	
	public static int pay;
	private static Integer sel;			// 선택 값을 담을 변수
	private static String con;			// 선택 값을 담을 변수
	private static Scanner sc;
	public static int sumpay;			// 투입금액을 누적해서 남을 변수
	public static int summoney;			// 샐러드 금액을 계산할 변수


	static	// 초기화
	{
		// Scanner 인스턴스 생성 
		sc = new Scanner(System.in);
	}

	// 완성
	// 메뉴 출력 메소드
	public static void uMenuPrint()
	{
		System.out.println();
		System.out.println("1 . 패키징 샐러드 ");
		System.out.println("2 . 커스텀 샐러드");
		System.out.println("3 . 랜덤 샐러드");
		System.out.println("4 . 고객의 소리");
		System.out.println();
		System.out.print(">> 메뉴 선택(1~4) : ");
	}

	// 완성
	// 메뉴 선택 메소드
	public static void uMenuSelect() throws IOException
	{
		do
		{
			sel = sc.nextInt();
		}
		while ( sel!=4646 && (sel<1 || sel>4) );
		// 4646아니면서, 1보다 작고 4보다 크면 입력 다시.
	}


	// 완성
	// 선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void uMenuRun() throws IOException
	{
		Password pw = new Password();

		UPackageSalad ups = new UPackageSalad();

		UCustomSalad ucs = new UCustomSalad();

		URandomSalad urs = new URandomSalad();

		switch (sel)
		{
			case Menus.E_ONE : 
				{
					uDecision(ups.uPackageSalad());
				} break;		
			case Menus.E_TWO   :
				{
					uDecision(ucs.CustomRun());
				} break;
			case Menus.E_THREE : 
				{
					urs.limitCal();
					urs.cancel();
					uDecision(urs.randomRun());
				} break;
			case Menus.E_FOUR  : uNote();  break;		
			case Menus.E_SECRETCODE : 
				{
					pw.inputPass();

					pw.modePrint();
					pw.modeSelect();
					pw.modeRun();
				};
				//관리자로 돌아가는메소드호출;  break;		
		}
	}

	// 고객의소리 메소드
	public static void uNote() throws IOException
	{
		ISetup is = new ISetup();
		Password pw = new Password();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String test;

		System.out.println("■■■고객의 소리함■■■");
		System.out.println("원하시는 요청 사항을 적어주세요");
		System.out.println();
		System.out.print("- ");
		test = br.readLine();

		is.vNote.add(test);

		// 테스트 출력용
		// System.out.println(vNote.get(0));

		pw.modeRun();
	}

	// 구매 결정을 물어보는 메소드 -> 연산도 이루어지도록
	public static void uDecision(Vector<Ingredient> temp) throws IOException
	{
		// 위에서 담은 재료들..벡터로 받아서 화면에 출력
		System.out.println("=============================");

		System.out.print("재료 : ");
		for (int i=0; i<temp.size(); i++)
			System.out.printf("%s ", temp.get(i).name);
		System.out.println();

		
		int sumkcal=0;	// 칼로리 누적합을 담을 변수
		for (int i=0; i<temp.size(); i++)
			sumkcal += temp.get(i).kcal;
		System.out.printf("칼로리 : %dKcal\n", sumkcal);

		
		summoney=0;	// 금액 누적합을 담을 변수
		for (int i=0; i<temp.size(); i++)
			summoney += temp.get(i).money;
		System.out.printf("금액 : %d원\n", summoney);

		
		// System.out.printf("유통기한 : %d일까지...\n", ★);
		Calendar rightNow = Calendar.getInstance();		// 캘린서 클래스 생성

		int y = rightNow.get(Calendar.YEAR);
		int m = rightNow.get(Calendar.MONTH) + 1;
		int d = rightNow.get(Calendar.DATE);
		System.out.printf("제조일자 : %d-%d-%d일 \n", y, m, d);	

		
		int n = (temp.get(0).name == "연어") ?  3 : 5;
		rightNow.add(Calendar.DATE, n);
		//	get(i)에 들어가는 인덱스값에 따라 유통기한을 오늘로부터 추가
		//	연어 true → 3
		//	연어 false → 5


		y = rightNow.get(Calendar.YEAR);
		m = rightNow.get(Calendar.MONTH)+1;
		d = rightNow.get(Calendar.DATE);
		System.out.printf("유통기한 : %d-%d-%d일까지...\n", y, m, d);
		System.out.println("=============================");




		// 선택 (여태까지 담은 샐러드 할껀지 말껀지)
		System.out.print("결제 하시겠습니까? (Y/N) : ");
		con = sc.next().toUpperCase();	
		
		// yes라면 결제메소드로, no면 단계 1로- 
		if (con.equals("Y"))
			uPayRun(temp); 
			// uPayment(temp)
			// ★테스트하려고,
		else if(!con.equals("Y"))
		{
			System.out.println("재료 선택으로 돌아갑니다. ");
			// 현재까지 담아놓은 거 유지? 비워버릴지?
		}
	 }// end uDecision

	// 결제 확인 메소드
	// uPayment()에서는 temp 쓸일이 없지만, uPayRun에 넘겨줘야 함.
	// 매개변수로 안받고 uDecision에 있던 temp에 접근이 가능..?

	public static void uPayment() throws IOException
	{
		// int pay = 0; //	받은 돈 입력 받을 변수
		
		System.out.print("결제 방식을 선택하세요 (카드/현금)");
		con = sc.next();
			if (con.equals("현금"))
			{
				System.out.print("지불할 금액을 입력하세요."); 
				pay = sc.nextInt();
				
				if (pay == summoney)
				{
					System.out.print("결제가 완료 되었습니다.");
					// uPayRun(Vector<Ingredient> temp);
				}
				else
				{
					// 거스름돈 연산
					// 거스름돈 부족
					System.out.print("잔돈이 부족합니다. 미안요...");
						
					
					// 거스름돈 안부족
					System.out.print("결제가 완료 되었습니다.");
					// uPayRun();
				
				}// end if 
			}
			else if (con.equals("카드"))
			{
				System.out.print("결제가 완료 되었습니다.");
				// uPayRun();
			}
	}//end uPayment


	public static void uPayRun(Vector<Ingredient> temp) // 결제가 완료될 때 만. 데이터를 추합?저장?하는 기능.
	{
		
		ISetup is = new ISetup();
		ISetup.countBowl++ ;

		// PayRun 으로 넘어온 temp를 재료 수량별로 누적.
		// temp에서 재료 이름만 뽑아서 String으로 담자.
		// 그리고 세자.

		for (int i =0;i<temp.size();i++ )
			is.payment.add(temp.get(i).name);
			

		// 1. 용기 수량을 - : 결제건수 count 하면 될듯.
		 

		
		// 2.재고에서 temp에서 담은 재료들의 수량을 -
		
		
		// 투입받은 금액을 + 
		// sumpay += pay; 

	}//end uPayRun()

	
}
