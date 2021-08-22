import java.util.Vector;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


// 커스텀 샐러드 클래스
public class UCustomSalad
{	
	// ISetup 인스턴스 생성
	ISetup is = new ISetup();
	Vector<Ingredient> temp = new Vector<Ingredient>();

	int sel;	// 메뉴 선택받을 변수
	
	int uIngSelect;	// 제품 번호 선택 변수
	int uNum;		// 제품 갯수 선택 변수
	int uctSelect;	// 카테고리 선택 변수

	int resultKcal=0;	// 총 칼로리 변수
	int resultMoney=0;	// 총 금액 변수
	int vegMax=0, mainMax=0, sourceMax=0, topMax=0;	// 야채, 메인, 소스, 토핑 제한 변수

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// 메뉴 선택 메소드 ★완성★
	public void uCustomMenuSelect() throws IOException
	{
		System.out.println("\n    [메뉴 선택]");
		System.out.println();
		System.out.println("1. 재료 선택");
		System.out.println("2. 재료 취소");
		System.out.println();

		do
		{
			System.out.print("실행할 기능을 선택하세요. : "); 
			sel = Integer.parseInt(br.readLine());
		}
		while (sel<1 || sel>2);
		

		switch (sel)
		{
			case Menus.E_ONE : 
				{
					uCustomSelectInput();
					uCustomSelectRun();
					uMoneyResult();
					uCustomReturn();
				} break;			// 1일때,  [1. 재료 선택] 선택.	
			case Menus.E_TWO : 
				{
					uCustomRemoveInput();
					uMoneyResult();
					uCustomRemoveRun();
					uCustomReturn();
				} break;			// 2일때,  [2. 재료 취소] 선택.
		}

	} //end uCustomMenuSelect()


	// 커스텀 가능한 재료 출력(카테고리별) ★완성★
	public void uCustomSaladStock(int cate)	// cate 어디인지 찾기
	{
		// 재품 재고 초기 셋팅
		is.firstSet();

		System.out.println("\n    [커스텀 샐러드 재료]");
		switch (cate)
		{
		case Menus.E_ONE :
			{
				System.out.println("    [야채] (최대 5회)");
				System.out.println();

				// 야채 출력 반복문
				for (int n=0; n<is.vVeg.size(); n++)
					System.out.printf("%2d. %5s\n", n+1, is.vVeg.get(n).name);	// 번호. 제품명
				System.out.println();

			} break;
		case Menus.E_TWO : 
			{
				System.out.println("    [메인] (최대 3회)");
				System.out.println();

				// 육류 출력 반복문
				for (int n=0; n<is.vMain.size(); n++)
					System.out.printf("%2d. %5s\n", n+1, is.vMain.get(n).name);	// 번호. 제품명
				System.out.println();

			} break;
		case Menus.E_THREE :
			{
				System.out.println("    [소스류] (최대 1회)");
				System.out.println();

				// 소스 출력 반복문
				for (int n=0; n<is.vSource.size(); n++)
					System.out.printf("%2d. %5s\n", n+1, is.vSource.get(n).name);	// 번호. 제품명
				System.out.println();

			} break;
		case Menus.E_FOUR :
			{
				System.out.println("    [토핑류] (최대 3회)");
				System.out.println();

				// 토핑 출력 반복문
				for (int n=0; n<is.vTop.size(); n++)
					System.out.printf("%2d. %5s\n", n+1, is.vTop.get(n).name);	// 번호. 제품명
				System.out.println();
			}
		}// end switch
		
	}// end uCustomSaladStock


	// 추가할 재료 번호,수량 입력받기
	public void uCustomSelectInput() throws IOException
	{	
		System.out.println("\n    [재료 선택]");

		System.out.println("[번호]  [제품명]  [수량]");
		
		for (int i=0; i<temp.size(); i++)
		{
			System.out.printf("%d.  %s, %d개\n", (i+1), temp.get(i).name, temp.get(i).num);
		} // end for

		System.out.println();
		System.out.printf("현재 금액   : %d\n", resultMoney);
		// temp에 담긴 제품들 금액을 입력받은 변수들과 곱해서 저장한 변수
		System.out.printf("현재 칼로리 : %d\n", resultKcal);
		// temp에 담긴 제품들 칼로리를 입력받은 변수들과 곱해서 저장한 변수

		// 카테고리 선택
		System.out.print("추가할 재료의 카테고리를 고르세요(1:야채, 2:메인, 3:소스, 4:토핑) : ");
		uctSelect = Integer.parseInt(br.readLine());

		// 카테고리에 해당하는 재료 출력
		uCustomSaladStock(uctSelect);

		// 카테고리 내에서 추가할 재료 번호 선택
		// 입력번호가 1이면 벡터에서는 0이 선택되도록
		System.out.print("추가할 재료 번호: " );
		uIngSelect = Integer.parseInt(br.readLine())-1;

		// 추가할 재료 갯수 입력
		System.out.print("추가할 재료 수량: " );
		uNum = Integer.parseInt(br.readLine());

/*
		// 용기 1개 제한량 : 야채 총 5번, 메인 3개, 소스 1개, 토핑 3번
		switch (uctSelect)
		{
		case 1:		// 야채일 경우
			{
				vegMax += uNum;	// vegMax 를 uNum(입력한 재료 갯수)만큼 더하면서
				if (vegMax>6)	// 5개 제한
				{
					vegMax -= uNum;
					System.out.println("용기에 담을 수 있는 [야채] 제한량을 넘었습니다.");
					System.out.println("([메뉴 선택] 창으로 되돌아갑니다.)");
					uCustomMenuSelect();
				}
			} break;
		case 2:		// 메인일 경우
			{
				mainMax += uNum;	// mainMax 를 uNum(입력한 재료 갯수)만큼 더하면서
				if (mainMax>4)		// 3개 제한
				{
					mainMax -= uNum;
					System.out.println("용기에 담을 수 있는 [메인] 제한량을 넘었습니다.");
					System.out.println("([메뉴 선택] 창으로 되돌아갑니다.)");
					uCustomMenuSelect();
				}
			} break;
		case 3:		// 소스일 경우
			{
				sourceMax += uNum;	// sourceMax 를 uNum(입력한 재료 갯수)만큼 더하면서
				if (sourceMax>2)	// 1개 제한
				{
					sourceMax -= uNum;
					System.out.println("용기에 담을 수 있는 [소스] 제한량을 넘었습니다.");
					System.out.println("([메뉴 선택] 창으로 되돌아갑니다.)");
					uCustomMenuSelect();
				}
			} break;
		case 4:		// 토핑일 경우
			{
				topMax += uNum;	// topMax 를 uNum(입력한 재료 갯수)만큼 더하면서
				if (topMax>4)		// 3개 제한
				{
					topMax -= uNum;
					System.out.println("용기에 담을 수 있는 [토핑] 제한량을 넘었습니다.");
					System.out.println("([메뉴 선택] 창으로 되돌아갑니다.)");
					uCustomMenuSelect();
				}
			} break;

		}// end switch
*/
	}// end uCustomSelectInput()
	

	public void uCustomSelectRun() throws IOException //재료 추가 실행 메소드
	{
		switch (uctSelect)
		{
			case 1 :
			{
				vegMax += uNum;	// vegMax 를 uNum(입력한 재료 갯수)만큼 더하면서
				if (vegMax>5)	// 5개 제한
				{
					vegMax -= uNum;
					System.out.println("용기에 담을 수 있는 [야채] 제한량을 넘었습니다.");
					System.out.println("([메뉴 선택] 창으로 되돌아갑니다.)");
					uCustomMenuSelect();
				}

				// 입력받은 (야채)의 벡터를 카테고리를 장바구니 벡터에 저장
				temp.add(is.vVeg.get(uIngSelect));

				temp.get(temp.size()-1).num = uNum;
			} break;
			case 2 :
			{
				mainMax += uNum;	// mainMax 를 uNum(입력한 재료 갯수)만큼 더하면서
				if (mainMax>3)		// 3개 제한
				{
					mainMax -= uNum;
					System.out.println("용기에 담을 수 있는 [메인] 제한량을 넘었습니다.");
					System.out.println("([메뉴 선택] 창으로 되돌아갑니다.)");
					uCustomMenuSelect();
				}

				temp.add(is.vMain.get(uIngSelect));

				temp.get(temp.size()-1).num = uNum;
			} break;
			case 3 :
			{
				sourceMax += uNum;	// sourceMax 를 uNum(입력한 재료 갯수)만큼 더하면서
				if (sourceMax>1)	// 1개 제한
				{
					sourceMax -= uNum;
					System.out.println("용기에 담을 수 있는 [소스] 제한량을 넘었습니다.");
					System.out.println("([메뉴 선택] 창으로 되돌아갑니다.)");
					uCustomMenuSelect();
				}

				temp.add(is.vSource.get(uIngSelect));

				temp.get(temp.size()-1).num = uNum;
			} break;
			case 4 :
			{
				topMax += uNum;	// topMax 를 uNum(입력한 재료 갯수)만큼 더하면서
				if (topMax>3)		// 3개 제한
				{
					topMax -= uNum;
					System.out.println("용기에 담을 수 있는 [토핑] 제한량을 넘었습니다.");
					System.out.println("([메뉴 선택] 창으로 되돌아갑니다.)");
					uCustomMenuSelect();
				}

				temp.add(is.vTop.get(uIngSelect));

				temp.get(temp.size()-1).num = uNum;
			} break;
		}
		System.out.println(temp.get(0).name);
		System.out.println(temp.get(0).num);
		System.out.println(temp.get(0).kcal);
		System.out.println(temp.get(0).money);
		System.out.println(resultMoney);
		System.out.println(resultKcal);
	}// end uCustomSelectRun()

	
	// 삭제할 재료 번호,수량 입력받기
	public void uCustomRemoveInput() throws IOException
	{
		System.out.println("\n    [재료 삭제]");  
		
		System.out.println("선택된 재료");
		System.out.println("[번호]  [재료명]  [수량]");

		// 지금 선택된 재료 출력
		for (int i=0; i<temp.size(); i++)
			System.out.printf("%d.  %5s  %4d개\n", (i+1), temp.get(i).name, temp.get(i).num);

		System.out.println();
		System.out.printf("현재 금액   : %d\n", resultMoney);
		System.out.printf("현재 칼로리 : %d\n", resultKcal);

		do	// 장바구니의 수량보다 많이 입력하면 다시 입력
		{
			System.out.print("삭제할 재료 번호: " );
			uIngSelect = Integer.parseInt(br.readLine())-1;

			System.out.print("삭제할 재료 수량: " );
			uNum = Integer.parseInt(br.readLine());

			if (temp.get(uIngSelect).num < uNum)
			{
				System.out.println("장바구니의 수량보다 많이 입력하셨습니다.");

			}
		}
		while (temp.get(uIngSelect).num < uNum);

	}// end uCustomRemoveInput()

	public void uCustomRemoveRun() // 재료 삭제 실행 메소드
	{
		switch (uctSelect)
		{
			case 1: vegMax -= uNum; break;
			case 2:	mainMax -= uNum; break;
			case 3:	sourceMax -= uNum; break;
			case 4:	topMax -= uNum;	break;
		}// end switch

		// 만약 장바구니에 담긴 수량이랑 입력 수량이 같은경우
		// 장바구니 제품 자체를 삭제하고
		// 그렇지 않은경우 수량만 줄인다
		if (temp.get(uIngSelect).num == uNum)
		{
			temp.remove(uIngSelect);
		}
		else
		{
			temp.get(uIngSelect).num -= uNum;
		}

	}// end uCustomRemoveRun()


	// 총 금액 / 칼로리 연산 메소드
	public void uMoneyResult()
	{
		if (sel == Menus.E_ONE)
		{
			// 총 금액(칼로리)를 장바구니 벡터에서 수량 * 금액(칼로리) 만큼 더하기
			resultMoney += temp.get(temp.size()-1).num * temp.get(temp.size()-1).money;
			resultKcal += temp.get(temp.size()-1).num * temp.get(temp.size()-1).kcal;
		}
		else
		{
			// 총 금액(칼로리)를 삭제할 수량 * 장바구니 벡터에서  금액(칼로리) 만큼 빼기
			resultMoney -= uNum * temp.get(uIngSelect).money;
			resultKcal -= uNum * temp.get(uIngSelect).kcal;
		}
	}

/* 확인 후 필요없으면 지우기
	public void uFinalCart() // 지금까지 담은 제품명 보여주는 메소드
	{
		// 지금까지 담은 제품명 출력
		for (int i=0; i<temp.size(); i++)
		{
			System.out.printf("제품명, 수량 : %s, %d\n", temp.get(i).name, temp.get(i).num);
		}

		// 총 금액(칼로리) 출력
		System.out.printf("총 금액   : %d\n", resultMoney);
		System.out.printf("총 칼로리 : %d\n", resultKcal);

	}// end uFinalCart()
*/
	
	// 계속 추가/삭제할지 여부 물어보기
	public void uCustomReturn() throws IOException	// 아직 안함 수정해야함★★★★★★★★★★★★★★★★
	{
		System.out.print("추가로 작업을 수행하시겠습니까? (Y/N) : ");

		String yn = br.readLine();

		// 'y' 입력시 추가 수행
		if(yn.equals("y")||yn.equals("Y"))
		{
			uCustomMenuSelect();
		}
	}

	public Vector<Ingredient> CustomRun() throws IOException
	{
		uCustomMenuSelect();

		return temp;
	}

}