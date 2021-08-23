
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MStorage
{
	String oper;		// +/- 입력 변수
	int ctSelect;		// 카테고리 선택 변수
	int foodNum;		// 재료 번호 변수
	int su;				// 재료 증가(감소) 변수
	static int bowl=0;	// 용기 변수

	private static BufferedReader br;

	private static ISetup is;

	static
	{
		// BufferedReader 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));

		// ISetup 인스턴스 생성
		is = new ISetup();
	}


	public void mStorageChange() throws IOException // 재료 추가/삭제 입력 메소드
	{	
		is.firstSet();

		while(true) 
		{
			System.out.print("재료를 추가하시려면 (+), 삭제하시려면 (-) : "); // 재료를 추가하려면 (+), 삭제하려면 (-) 입력
			
			oper = br.readLine();
			
			if(oper.equals("+")||oper.equals("-"))	// 조건 : (+), (-) 올바르게 입력 시
			{
				break;		// 연산자 입력칸 통과
			}
			System.out.println("\n입력에 문제가 있습니다.\n");	// 연산자 올바르지 않게 입력 시 메세지 표시 후 다시 입력받음	
		}

		mStorageCategory();
		
	}// end mStorageChange()


	public void mStorageCategory() throws IOException
	{
		while (true)
		{
			System.out.print("카테고리를 고르세요(1:야채, 2:육류, 3:소스, 4:토핑, 5:용기) : ");	// 재료 카테고리[1-4] 입력
			ctSelect = Integer.parseInt(br.readLine());
			
			if(ctSelect>0 && ctSelect<Menus.E_FIVE) //조건: 재료 카테고리[1-4] 올바르게 입력 시
			{
				break;  // 카테고리 입력칸 통과
			}

			else if (ctSelect==Menus.E_FIVE)
			{
				mBowlChange();
			}
			System.out.println("\n입력에 문제가 있습니다.\n");	// 카테고리 올바르지 않게 입력 시 메세지 표시 후 다시 입력받음	
		}

		mStorageFoodSelect();

	}// end mStorageCategory()


	public void mStorageFoodSelect() throws IOException
	{
		while (true)
		{	
			System.out.print("재료 번호 : "); // 재료 번호 입력
			foodNum = Integer.parseInt(br.readLine())-1;
			
			if (ctSelect==Menus.E_ONE)	
			{
				if(foodNum<is.vVeg.size() && foodNum>=0) //조건: [1. 야채/ (1부터 야채의 마지막 재료 번호) 까지 입력시] 
				{
					break;  // 재료 입력칸 통과
				}
			}
			else if (ctSelect==Menus.E_TWO)
			{
				if(foodNum<is.vMain.size() && foodNum>=0) //조건: [2. 메인/ (1부터 메인의 마지막 재료 번호) 까지 입력시] 
				{
					break;  // 재료 입력칸 통과
				}
			}
			else if (ctSelect==Menus.E_THREE)
			{
				if(foodNum<is.vSource.size() && foodNum>=0) //조건: [3. 소스/ (1부터 소스의 마지막 재료 번호) 까지 입력시]
				{
					break;  // 재료 입력칸 통과
				}
			}
			else if (ctSelect==Menus.E_FOUR)
			{
				if(foodNum<is.vTop.size() && foodNum>=0) //조건: [4. 토핑/ (1부터 소스의 마지막 재료 번호) 까지 입력시]
				{
					break;  // 재료 입력칸 통과
				}
			}

			System.out.println("잘못 입력하셨습니다.");	// 각 카테고리의 재료 번호 잘못 입력시 메세지 표시 후 다시 입력받음	

		}

		mStorageFoodNum();

	}// end mStorageFoodSelect()


	public void mStorageFoodNum() throws IOException
	{
		while (true)
		{
			System.out.print("재료 수량 : "); // 재료 추가/ 삭제할 수량 입력
			su = Integer.parseInt(br.readLine());
			
			// 재료 추가시 : 총 재료 개수(원래 재료+추가 입력 재료) 50개 이하로 입력
			// 재료 삭제시 : 해당 재료의 현재 개수 이상 입력할 수 없도록 함
			if (oper.equals("+"))
			{
				
				if (ctSelect==Menus.E_ONE)	
				{
					if((su+is.vVeg.get(foodNum).num)<=50) // [1. 야채/ 조건: 각 재료당 총 재료 개수 50개 이하일 시]
					{
						break;  // 재료 번호 입력칸 통과
					}
					System.out.println("\n입력에 문제가 있습니다.\n"); // 올바르지 않게 입력 시 메세지 표시 후 다시 입력받음	
				}
				else if (ctSelect==Menus.E_TWO)
				{
					if((su+is.vMain.get(foodNum).num)<=50) // [2. 육류/ 조건: 각 재료당 총 재료 개수 50개 이하일 시]
					{
						break;  // 재료 번호 입력칸 통과
					}
					System.out.println("\n입력에 문제가 있습니다.\n"); 
				}
				else if (ctSelect==Menus.E_THREE)
				{
					if((su+is.vSource.get(foodNum).num)<=50) // [2. 소스/ 조건: 각 재료당 총 재료 개수 50개 이하일 시]
					{
						break;  // 재료 번호 입력칸 통과
					}
					System.out.println("\n입력에 문제가 있습니다.\n");
				}
			}

			else
				if (ctSelect==Menus.E_ONE)	
				{
					if(su<=is.vVeg.get(foodNum).num) //조건: [1. 야채/ (1부터 해당 재료의 현재 수량)까지 입력시] 
					{
						break;  // 재료 수량 입력칸 통과
					}
					System.out.println("\n입력에 문제가 있습니다.\n"); // 올바르지 않게 입력 시 메세지 표시 후 다시 입력받음	
				}
				else if (ctSelect==Menus.E_TWO)
				{
					if(su<=is.vMain.get(foodNum).num) //조건: [2. 육류/ (1부터 해당 재료의 현재 수량)까지 입력시] 
					{
						break;  // 재료 수량 입력칸 통과
					}
					System.out.println("\n입력에 문제가 있습니다.\n"); 	
				}
				else if (ctSelect==Menus.E_THREE)
				{
					if(su<=is.vSource.get(foodNum).num) //조건: [3. 소스/ (1부터 해당 재료의 현재 수량)까지 입력시]
					{
						break;  // 재료 수량 입력칸 통과
					}
					System.out.println("\n입력에 문제가 있습니다.\n"); 	
				}

		}

		mStorageRun();


	}// end mStorageFoodNum()

	
	public void mStorageRun() throws IOException // 재료 추가/삭제 실행 메소드
	{
		if (oper.equals("-")) // 구매자가 (-) 입력시
		{
			System.out.println("\n재고를 삭제하시겠습니까? (Y/N)"); // 재고를 삭제하시겠습니까? 메세지 출력
			String yn = br.readLine();

			if(yn.equals("y")||yn.equals("Y")) // 구매자가 Y, y 입력한 경우
			{

				switch (ctSelect)	// (각 카테고리 1,2,3 입력시 해당 카테고리 + 각 번호 입력시 각 번호)재료의 개수에서 입력 개수 삭제
				{
					case 1 : is.vVeg.get(foodNum).num = is.vVeg.get(foodNum).num - su; break;
					case 2 : is.vMain.get(foodNum).num = is.vMain.get(foodNum).num - su; break;
					case 3 : is.vSource.get(foodNum).num = is.vSource.get(foodNum).num - su; break;
					default : System.out.println("잘못 입력하셨습니다.");
				}

				if (ctSelect == Menus.E_ONE || ctSelect == Menus.E_TWO || ctSelect == Menus.E_THREE) // 재료 개수 삭제시, 삭제 메시지 출력
				{
					System.out.println("재료가 삭제되었습니다.");
				}
				
			}
			else
			{
				System.out.println("취소되었습니다.");	// 재료 개수를 삭제하지 않은 경우, 취소 메시지 출력
			}
		}
		else
		{
			System.out.print("\n재고를 추가하시겠습니까? (Y/N) : "); // 재고를 추가하시겠습니까? 메세지 출력
			String yn = br.readLine();

			if(yn.equals("y")||yn.equals("Y"))	// 구매자가 Y, y 입력한 경우
			{

				switch (ctSelect) // 각 카테고리 1,2,3 입력시 해당 카테고리, 각 번호 입력시 각 번호의 재료 개수에서 개수 추가
				{
					case Menus.E_ONE : is.vVeg.get(foodNum).num = is.vVeg.get(foodNum).num + su; break;
					case Menus.E_TWO : is.vMain.get(foodNum).num = is.vMain.get(foodNum).num + su; break;
					case Menus.E_THREE : is.vSource.get(foodNum).num = is.vSource.get(foodNum).num + su; break;
					default : System.out.println("잘못 입력하셨습니다.");
				}
				if (ctSelect == Menus.E_ONE || ctSelect == Menus.E_TWO || ctSelect == Menus.E_THREE) // 재료 개수 추가시, 추가 메시지 출력
				{
					System.out.println("재료가 추가되었습니다.");
					System.out.println(is.vVeg.get(0).num);
					System.out.println(is.vMain.get(0).num);
				}
			}
			else
			{
				System.out.println("취소되었습니다."); // 재료 개수를 추가하지 않은 경우, 취소 메시지 출력
			}
		}

		mStorageReturn();

	}// end mStorageRun()

	
	public void mBowlChange() throws IOException
	{
		int bowlChangeNum;

		while (true)
		{
			System.out.println();
			System.out.print("용기를 몇개 추가하기겠습니까? : ");
		
			bowlChangeNum = Integer.parseInt(br.readLine());

			if (bowl+bowlChangeNum <= 50)
			{
				bowl = bowl+bowlChangeNum;
				break;
			}
			else
			{
				System.out.println("입력에 문제가 있습니다");
			}
		}

		mStorageReturn();
		
	}

	public void mStorageReturn() throws IOException
	{
		// Password 인스턴스 생성
		Password pw = new Password();

		System.out.print("추가로 작업을 수행하시겠습니까? (Y/N) : ");

		String yn = br.readLine();

		// 'y' 입력시 추가 수행
		if(yn.equals("y")||yn.equals("Y"))
		{
			mStorageChange();
		}
		// 다른거 입력시 처음 화면으로
		else
		{
			pw.modeRun();
		}

	}// end mStorageReturn()



}// end class Storagechange