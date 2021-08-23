//거스름돈 저장 및 계산 클래스
public class Change		//일단,,,,,,완성이 눈감아주면 가능....★★★★★★
{

	int[] money = new int[5];
			  //= {만원,오천원,천원,오백원,백원}

	int[] bills = {10000, 5000, 1000, 500, 100};


	public void cInitial() //--권종 별 초기화
	{
		money[0] = 5;	// 만원 : 5장
		money[1] = 2;	// 오천원 : 2장		
		money[2] = 10;	// 천원: 10장
		money[3] = 5;	// 오백원: 5개
		money[4] = 10;	// 백원: 10개
		
	}// end cInitial()
	

	//여기서 바뀐 시재 사용하고 싶으면 MMoneyChange클래스의 changemoney[i]를 받아와서 사용하면될거같은뎅,,,
	// ★★★★★★★★★★


	//--거스름돈 계산  
	public void changeCal(int pay, int sumMoney) //받은 돈,가격
	{
		int total=0;
		int moneyTemp=0;
		int change = pay - sumMoney;	//받은돈 - 가격 = 거스름돈
		int[] out = new int[5];
				//={만원,오천원,천원,오백원,백원}
		
		for (int i =0;i<5 ;i++ )
		{
			total += money[i]*bills[i];
		}

		//17700       
		out[0] = change / 10000;							//만원
		out[1] = change % 10000 / 5000;						//오천원
		out[2] = change % 10000 % 5000 / 1000;				//천원
		out[3] = change % 10000 % 5000 % 1000 / 500;		//오백원
		out[4] = change % 10000 % 5000 % 1000 % 500 / 100;	//백원
		
		//거스름돈이 아예 안됨
		if (total < change)
		{
			System.out.println("거스름돈이 부족합니다.");
			
			//커스텀으로 가는게 맞다 이거죠? 그렇죠
		}

		//거스름돈이 넘어가면 가능
		else
		{

			System.out.println("거스름돈을 가져가세요.");
			System.out.println("==================================");
			System.out.println("거스름돈: " + change + "원");
			System.out.println();
			for	(int i=0; i<5; i++) 
			{

				if(change/bills[i] > money[i]) 
				{
					System.out.println(bills[i]+"원 : "+ " 0개 ");
				}else
				{
					System.out.println(bills[i]+"원 : "+ change/bills[i]+" 개 ");
					change %= bills[i];
				}

			} 
			System.out.println("==================================");
			
			
		} //end else

		
		//돈통에 돈 많은데 잔돈이 없어요,,,,ㅜㅠㅠㅠㅠㅠㅠㅠㅠ ★★★★★★ 눈감아요,,,강사님,,,



			//for (int i = 0;i<5 ;i++ ) --돈통에서 나간만큼 뺀거
			//	money[i] -= out[i];  

		


	}//end changeCal()


} //end Change class 