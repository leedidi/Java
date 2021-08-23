import java.util.Scanner;

public class MMoneyChange 
{
	Scanner sc = new Scanner(System.in);
	Change ch = new Change();
	ManagerMode mm = new ManagerMode();

	int[] money = new int[5];
	int[] bills = {10000, 5000, 1000, 500, 100};
	int[] changenum = new int[5];
	int[] changemoney = new int[5];		//기존에 있는 거 아니고 추가된 시재가져오기
	

	//현재 권종별 상황
	public void rightNowChange()
	{
		ch.cInitial();	//여기도 계속 초기화가 되는게 is.firstSet()이랑 같은 문제일것같아요,,,,,,★★★★★★★★★
		System.out.println("===========현재 시재 상황===============");
		for (int i = 0; i<5 ;i++ )
			System.out.printf("%5d원 : %3d개\n",bills[i],ch.money[i]);
		System.out.println("========================================");
	}


	//권종별 수량 입력(최대100개)
	public void changeInput()
	{
		for (int i = 0;i<5 ;i++ )
		{
			System.out.printf("%d원을 채워주세요.(수량입력) : ",bills[i]);
			changenum[i] = sc.nextInt();
			money[i] = changenum[i];
		}System.out.println();

		realChange();
	}

	// 진짜 변경할지 물어보는 메소드
	public void realChange()
	{
		System.out.println("수량을 변경하시면 [관리자 모드]로 넘어갑니다. ");
		System.out.print("수량을 변경하시겠습니까? (Y/N) : ");
		String real = sc.next();
		System.out.println();
		if (real.equals("y")|| real.equals("Y"))
			changeOutput();
		else
			changeInput();
	}


	// 바뀐거 확인하는 메소드2
	public void changeOutput()
	{
		System.out.println("===========현재 시재 상황===============");
		for (int i = 0; i<5 ;i++ )
			System.out.printf("%5d원 : %3d개\n",bills[i],money[i]);
		System.out.println("========================================");

		//관리자 모드로 이동...
		mm.mMenuPrint();

	}

	
	//진짜 채우기??
	//아니면,,,다시 수량 입력?
	//
	//응,,, 기존..change변경
	//cInitial() 여기 수량 변경,,,,
}