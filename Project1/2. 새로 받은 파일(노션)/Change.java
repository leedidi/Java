//�Ž����� ���� �� ��� Ŭ����
public class Change		//�ϴ�,,,,,,�ϼ��� �������ָ� ����....�ڡڡڡڡڡ�
{

	int[] money = new int[5];
			  //= {����,��õ��,õ��,�����,���}

	int[] bills = {10000, 5000, 1000, 500, 100};


	public void cInitial() //--���� �� �ʱ�ȭ
	{
		money[0] = 5;	// ���� : 5��
		money[1] = 2;	// ��õ�� : 2��		
		money[2] = 10;	// õ��: 10��
		money[3] = 5;	// �����: 5��
		money[4] = 10;	// ���: 10��
		
	}// end cInitial()
	

	//���⼭ �ٲ� ���� ����ϰ� ������ MMoneyChangeŬ������ changemoney[i]�� �޾ƿͼ� ����ϸ�ɰŰ�����,,,
	// �ڡڡڡڡڡڡڡڡڡ�


	//--�Ž����� ���  
	public void changeCal(int pay, int sumMoney) //���� ��,����
	{
		int total=0;
		int moneyTemp=0;
		int change = pay - sumMoney;	//������ - ���� = �Ž�����
		int[] out = new int[5];
				//={����,��õ��,õ��,�����,���}
		
		for (int i =0;i<5 ;i++ )
		{
			total += money[i]*bills[i];
		}

		//17700       
		out[0] = change / 10000;							//����
		out[1] = change % 10000 / 5000;						//��õ��
		out[2] = change % 10000 % 5000 / 1000;				//õ��
		out[3] = change % 10000 % 5000 % 1000 / 500;		//�����
		out[4] = change % 10000 % 5000 % 1000 % 500 / 100;	//���
		
		//�Ž������� �ƿ� �ȵ�
		if (total < change)
		{
			System.out.println("�Ž������� �����մϴ�.");
			
			//Ŀ�������� ���°� �´� �̰���? �׷���
		}

		//�Ž������� �Ѿ�� ����
		else
		{

			System.out.println("�Ž������� ����������.");
			System.out.println("==================================");
			System.out.println("�Ž�����: " + change + "��");
			System.out.println();
			for	(int i=0; i<5; i++) 
			{

				if(change/bills[i] > money[i]) 
				{
					System.out.println(bills[i]+"�� : "+ " 0�� ");
				}else
				{
					System.out.println(bills[i]+"�� : "+ change/bills[i]+" �� ");
					change %= bills[i];
				}

			} 
			System.out.println("==================================");
			
			
		} //end else

		
		//���뿡 �� ������ �ܵ��� �����,,,,�̤ФФФФФФФ� �ڡڡڡڡڡ� �����ƿ�,,,�����,,,



			//for (int i = 0;i<5 ;i++ ) --���뿡�� ������ŭ ����
			//	money[i] -= out[i];  

		


	}//end changeCal()


} //end Change class 