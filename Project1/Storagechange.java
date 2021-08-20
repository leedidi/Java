
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Storagechange
{
	String oper;
	int ctSelect;
	int num;
	int su;

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
		
	}// end mStorageChange()


	public void mStorageCategory() throws IOException
	{
		while (true)
		{
			System.out.print("카테고리를 고르세요(1:야채, 2:육류, 3:소스, 4:토핑) : ");	// 재료 카테고리[1-4] 입력
			ctSelect = Integer.parseInt(br.readLine());
			
			if(ctSelect>0 && ctSelect<5) //조건: 재료 카테고리[1-4] 올바르게 입력 시
			{
				break;  // 카테고리 입력칸 통과
			}
			System.out.println("\n입력에 문제가 있습니다.\n");	// 카테고리 올바르지 않게 입력 시 메세지 표시 후 다시 입력받음	
		}
	}// end mStorageCategory()


	public void mStorageFoodSelect() throws IOException
	{
		while (true)
		{	
			System.out.print("재료 번호 : "); // 재료 번호 입력
			num = Integer.parseInt(br.readLine())-1;
			
			if (ctSelect==1)	
			{
				if(num<is.vVeg.size() && num>=0) //조건: [1. 야채/ (1 - 야채의 마지막 재료 번호) 까지 입력시] 
				{
					break;  // 재료 입력칸 통과
				}
			}
			else if (ctSelect==2)
			{
				if(num<is.vMain.size() && num>=0) //조건: [2. 메인/ (1 - 메인의 마지막 재료 번호) 까지 입력시] 
				{
					break;  // 재료 입력칸 통과
				}
			}
			else if (ctSelect==3)
			{
				if(num<is.vSource.size() && num>=0) //조건: [3. 소스/ (1 - 소스의 마지막 재료 번호) 까지 입력시]
				{
					break;  // 재료 입력칸 통과
				}
			}

			System.out.println("잘못 입력하셨습니다.");	// 각 카테고리의 재료 번호 잘못 입력시 메세지 출력

		}
	}// end mStorageFoodSelect()


	public void mStorageFoodNum() throws IOException
	{
		while (true)
		{
			System.out.print("재료 수량 : "); // 재료 추가/ 삭제할 수량 입력
			su = Integer.parseInt(br.readLine());
			
			//추가
			/*
			if(su<50) // 조건: 50개 이하로 입력시(*임의)
			{
				break;  // 재료 입력칸 통과
			}
			System.out.println("\n입력에 문제가 있습니다.\n")
			*/


			// 재료 추가시 : 50개 이하로 입력
			// 재료 삭제시 : 해당 재료의 현재 개수 이상 입력시 오류(-)될 수 없도록
			if (oper.equals("+"))
			{
				
				if (ctSelect==1)	
				{
					if((su+is.vVeg.get(num).num)<=50) // 조건: 50개 이하로 입력시(*임의)
					{
						break;  // 재료 입력칸 통과
					}
					System.out.println("\n입력에 문제가 있습니다.\n");
				}
				else if (ctSelect==2)
				{
					if((su+is.vMain.get(num).num)<=50) // 조건: 50개 이하로 입력시(*임의)
					{
						break;  // 재료 입력칸 통과
					}
					System.out.println("\n입력에 문제가 있습니다.\n");
				}
				else if (ctSelect==3)
				{
					if((su+is.vSource.get(num).num)<=50) // 조건: 50개 이하로 입력시(*임의)
					{
						break;  // 재료 입력칸 통과
					}
					System.out.println("\n입력에 문제가 있습니다.\n");
				}
			}

			else
				if (ctSelect==1)	
				{
					if(su<=is.vVeg.get(num).num) //조건: [1. 야채/ 해당 재료의 현재 최대수량까지 입력시] 
					{
						break;  // 재료 입력칸 통과
					}
				}
				else if (ctSelect==2)
				{
					if(su<=is.vMain.get(num).num) //조건: [2. 메인/ 해당 재료의 현재 최대수량까지 입력시] 
					{
						break;  // 재료 입력칸 통과
					}
				}
				else if (ctSelect==3)
				{
					if(su<=is.vSource.get(num).num) //조건: [3. 소스/  해당 재료의 현재 최대수량까지 입력시]
					{
						break;  // 재료 입력칸 통과
					}
				}

		}
	}// end mStorageFoodNum()

	
	public void mStorageRun() throws IOException // 재료 추가/삭제 실행 메소드
	{
		if (oper.equals("-")) // 구매자가 (-) 입력시
		{
			System.out.println("\n재고를 삭제하시겠습니까? (Y/N)"); // 재고를 삭제하시겠습니까? 메세지 출력
			String yn = br.readLine();

			if(yn.equals("y")||yn.equals("Y"))
			{
			
				switch (ctSelect)	// 각 카테고리 1,2,3 입력시 해당 카테고리, 각 번호 입력시 각 번호의 재료 개수에서 개수 삭제
				{
					case 1 : is.vVeg.get(num).num = is.vVeg.get(num).num - su; break;
					case 2 : is.vMain.get(num).num = is.vMain.get(num).num - su; break;
					case 3 : is.vSource.get(num).num = is.vSource.get(num).num - su; break;
					default : System.out.println("잘못 입력하셨습니다.");
				}

				if (ctSelect == 1 || ctSelect == 2 || ctSelect == 3) // 재료 개수 삭제시, 삭제 메시지 출력
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
			System.out.println("\n재고를 추가하시겠습니까? (Y/N)");
			String yn = br.readLine();

			if(yn.equals("y")||yn.equals("Y"))
			{

				switch (ctSelect) // 각 카테고리 1,2,3 입력시 해당 카테고리, 각 번호 입력시 각 번호의 재료 개수에서 개수 추가
				{
					case 1 : is.vVeg.get(num).num = is.vVeg.get(num).num + su; break;
					case 2 : is.vMain.get(num).num = is.vMain.get(num).num + su; break;
					case 3 : is.vSource.get(num).num = is.vSource.get(num).num + su; break;
					default : System.out.println("잘못 입력하셨습니다.");
				}
				if (ctSelect == 1 || ctSelect == 2 || ctSelect == 3) // 재료 개수 추가시, 삭제 메시지 출력
				{
					System.out.println("재료가 추가되었습니다.");
				}
			}
			else
			{
				System.out.println("취소되었습니다."); // 재료 개수를 추가하지 않은 경우, 취소 메시지 출력
			}
		}

	}// end mStorageRun()



}// end class Storagechange