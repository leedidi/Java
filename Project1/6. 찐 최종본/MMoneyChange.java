import java.util.Scanner;
import java.io.IOException;

public class MMoneyChange 
{
	
	Scanner sc = new Scanner(System.in);
	//ManagerMode mm = new ManagerMode();

	int[] changenum = new int[5];		// temp 비슷한 느낌
	int[] changemoney = new int[5];		// 기존에 있는 거 아니고 추가된 시재가져오기
	

	// 현재 권종별 상황
	public void rightNowChange()
	{
		System.out.println("=============시재 상황================");
		System.out.println();
		for (int i=0; i<Change.moneyCount.length; i++)
			System.out.printf("%5d원 : %3d개\n", Change.bills[i], Change.moneyCount[i]);
		System.out.println();
		System.out.println("========================================");
	}


	// 권종별 수량 입력(최대100개)
	public void changeInput() throws IOException
	{
		System.out.println("권종별 수량 제한 100개");
		for (int i = 0;i<5 ;i++ )
		{
			do
			{
				System.out.printf("%d원권 수량 (입력값으로 변경됩니다.) : ",Change.bills[i]);
				changenum[i] = sc.nextInt();
			}
			while (changenum[i] >100 ||  changenum[i]<=0);
		}
		System.out.println();
		realChange();

	}


	// 진짜 변경할지 물어보는 메소드
	public void realChange() throws IOException
	{
		System.out.println("★수량 여부 확인 후 [관리자 모드]로 돌아갑니다.★");
		System.out.print("수량을 변경하시겠습니까? (Y/N) : ");
		String real = sc.next().toUpperCase();
		
		if (real.equals("Y"))
		{
			for (int i=0; i<5; i++)
				Change.moneyCount[i] = changenum[i];
			rightNowChange();	// 현재 시재상황
		}
		else	
			System.out.println("\n수량이 변경되지 않았습니다.\n");	

		System.out.println("관리자 모드로 돌아갑니다.");

		ManagerMode mm = new ManagerMode();
		mm.mMenuPrint();
		mm.mMenuSelect();
		mm.mMenuRun();

	}
}