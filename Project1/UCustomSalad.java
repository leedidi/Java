import java.util.Vector;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


// 커스텀 샐러드 클래스
// 체크사항★★★★★★★★★★ 메뉴 고를때 메뉴에 없는 번호 고르면 다시 하도록
public class UCustomSalad
{	
	// ISetup 인스턴스 생성
	ISetup is = new ISetup();

	int resultKcal=0;	// 총 칼로리 변수
	int resultMoney=0;	// 총 금액 변수
	int vegMax=0, mainMax=0, sourceMax=0, topMax=0;		// 야채, 메인, 소스, 토핑 제한 변수 (????? 체크)

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	// 메뉴 선택 메소드 ★완성★
	public void uCustomMenuSelect() throws IOException
	{
		int sel;	// 메뉴 선택받을 변수

		System.out.println("\n    [메뉴 선택]");
		System.out.println();
		System.out.println("1. 재료 선택");
		System.out.println("2. 재료 취소");
		System.out.println("3. 제품 완성");
		System.out.println();

		System.out.print("실행할 기능을 선택하세요. : "); 
		sel = Integer.parseInt(br.readLine());

		switch (sel)
		{
			case Menus.E_ONE : uCustomSelectInput(); break;	// 1일때,  [1. 재료 선택] 선택.	
			case Menus.E_TWO : System.out.println("ㅎㅎ"); break;	// 2일때,  [2. 재료 취소] 선택.
			//case Menus.E_THREE : return xxx; break;				// 3일때,  [3. 제품 완성] 선택.  ★★★★★★★★★★★★★★★★★★★★★★ 연결해야함
		}
	} //end uCustomMenuSelect()


	// 커스텀 가능한 재료 출력(카테고리별) ★완성★
	public void uCustomSaladStock(int cate)	// cate 어디인지 찾기
	{
		// 재품 재고 초기 셋팅
		is.firstSet();
		is.testSet();

		System.out.println("\n    [커스텀 샐러드 재료]");
		switch (cate)
		{
		case Menus.E_ONE :
			{
				System.out.println("    [야채] (최대 5회)");
				System.out.println();

				// 야채 출력 반복문
				for (int n=0; n<is.vVeg.size(); n++)
					System.out.printf("%2d. %5s", n+1, is.vVeg.get(n).name);	// 번호. 제품명

			} break;
		case Menus.E_TWO : 
			{
				System.out.println("    [메인] (최대 3회)");
				System.out.println();

				// 육류 출력 반복문
				for (int n=0; n<is.vMain.size(); n++)
					System.out.printf("%2d. %5s", n+1, is.vMain.get(n).name);	// 번호. 제품명

			} break;
		case Menus.E_THREE :
			{
				System.out.println("    [소스류] (최대 1회)");
				System.out.println();

				// 소스 출력 반복문
				for (int n=0; n<is.vSource.size(); n++)
					System.out.printf("%2d. %5s", n+1, is.vSource.get(n).name);	// 번호. 제품명

			} break;
		case Menus.E_FOUR :
			{
				System.out.println("    [토핑류] (최대 3회)");
				System.out.println();

				// 토핑 출력 반복문
				for (int n=0; n<is.vTop.size(); n++)
					System.out.printf("%2d. %5s", n+1, is.vTop.get(n).name);	// 번호. 제품명
			}
		}// end switch
		
	}// end uCustomSaladStock


	// 추가할 재료 번호,수량 입력받기
	public void uCustomSelectInput() throws IOException
	{	
		int uctSelect;	// 카테고리 선택 변수
		int unum;		// 제품 번호 선택 변수
		int usu;		// 제품 갯수 선택 변수

		System.out.println("\n    [재료 선택]");

		System.out.println("[번호]  [제품명]  [수량]");
		
		for (int i=0; i<is.vCart.size(); i++)	// vCart가 비어있으면 오류뜰것으로 예상 => 하나를 채워넣고 시작?? check~!!!★★★★★★★★★★★★
		{
			System.out.printf("%d.  %s, %d개\n", (i+1), is.vCart.get(i).cName, is.vCart.get(i).cNum);

			switch (is.vCart.get(i).cCate)
			{
			case 1 :	// 야채일경우
				{		// vVeg의 크기만큼 반복
					for (int j=0; j<is.vVeg.size(); j++)
					{
						// 장바구니에 담긴 제품명과 야채에 있는 제품명이 동일한 경우
						if (is.vCart.get(i).cName.equals(is.vVeg.get(j).name))
						{
							// 총 금액(칼로리)를 합산
							resultMoney += is.vCart.get(i).cNum * is.vVeg.get(j).money;
							resultKcal += is.vCart.get(i).cNum * is.vVeg.get(j).kcal;
							break;
						}
					}
				} break;
			case 2 :
				{
					for (int j=0; j<is.vMain.size(); j++)
					{
						if (is.vCart.get(i).cName.equals(is.vMain.get(j).name))
						{
							resultMoney += is.vCart.get(i).cNum * is.vMain.get(j).money;
							resultKcal += is.vCart.get(i).cNum * is.vMain.get(j).kcal;
							break;
						}
					}
				} break;
			case 3 :
				{
					for (int j=0; j<is.vSource.size(); j++)
					{
						if (is.vCart.get(i).cName.equals(is.vSource.get(j).name))
						{
							resultMoney += is.vCart.get(i).cNum * is.vSource.get(j).money;
							resultKcal += is.vCart.get(i).cNum * is.vSource.get(j).kcal;
							break;
						}
					}
				} break;
			case 4 :
				{
					for (int j=0; j<is.vTop.size(); j++)
					{
						if (is.vCart.get(i).cName.equals(is.vTop.get(j).name))
						{
							resultMoney += is.vCart.get(i).cNum * is.vTop.get(j).money;
							resultKcal += is.vCart.get(i).cNum * is.vTop.get(j).kcal;
							break;
						}
					}
				} break;

			}

		} // end for

		System.out.println();
		System.out.printf("현재 금액   : %d\n", resultMoney);
		// vCart에 담긴 제품들 금액을 입력받은 변수들과 곱해서 저장한 변수
		System.out.printf("현재 칼로리 : %d\n", resultKcal);
		// vCart에 담긴 제품들 칼로리를 입력받은 변수들과 곱해서 저장한 변수

		// 카테고리 선택
		System.out.print("추가할 재료의 카테고리를 고르세요(1:야채, 2:메인, 3:소스, 4:토핑) : ");
		uctSelect = Integer.parseInt(br.readLine());

		// 카테고리에 해당하는 재료 출력
		uCustomSaladStock(uctSelect);

		// 카테고리 내에서 추가할 재료 번호 선택
		System.out.println("추가할 재료 번호: " );
		unum = Integer.parseInt(br.readLine());

		// 추가할 재료 갯수 입력
		System.out.println("추가할 재료 수량: " );
		usu = Integer.parseInt(br.readLine());


		// 용기 1개 제한량 : 야채 총 5번, 메인 3개, 소스 1개, 토핑 3번
		switch (uctSelect)
		{
		case 1:		// 야채일 경우
			{
				vegMax += usu;	// vegMax 를 usu(입력한 재료 갯수)만큼 더하면서
				if (vegMax>5)	// 5개 제한
				{
					vegMax -= usu;
					System.out.println("용기에 담을 수 있는 [야채] 제한량을 넘었습니다.");
					System.out.println("([메뉴 선택] 창으로 되돌아갑니다.)");
					uCustomMenuSelect();
				}
			} break;
		case 2:		// 메인일 경우
			{
				mainMax += usu;	// mainMax 를 usu(입력한 재료 갯수)만큼 더하면서
				if (mainMax>3)	// 3개 제한
				{
					mainMax -= usu;
					System.out.println("용기에 담을 수 있는 [메인] 제한량을 넘었습니다.");
					System.out.println("([메뉴 선택] 창으로 되돌아갑니다.)");
					uCustomMenuSelect();
				}
			} break;
		case 3:		// 소스일 경우
			{
				sourceMax += usu;	// sourceMax 를 usu(입력한 재료 갯수)만큼 더하면서
				if (sourceMax>1)	// 1개 제한
				{
					sourceMax -= usu;
					System.out.println("용기에 담을 수 있는 [소스] 제한량을 넘었습니다.");
					System.out.println("([메뉴 선택] 창으로 되돌아갑니다.)");
					uCustomMenuSelect();
				}
			} break;
		case 4:		// 토핑일 경우
			{
				topMax += usu;		// topMax 를 usu(입력한 재료 갯수)만큼 더하면서
				if (topMax>3)		// 3개 제한
				{
					topMax -= usu;
					System.out.println("용기에 담을 수 있는 [토핑] 제한량을 넘었습니다.");
					System.out.println("([메뉴 선택] 창으로 되돌아갑니다.)");
					uCustomMenuSelect();
				}
			} break;

		}// end switch

	}// end uCustomSelectInput()
	
/*
	public void uCustomSelectRun() //재료 추가 실행 메소드
	{
		switch (uctSelect)
		{
			case 1 :
			{
				// 입력받은 (야채)의 제품명과 갯수와 카테고리를 장바구니 벡터에 저장
				is.vCart.add(new CartIngredient(is.vVeg(unum).name,usu,uctSelect));
			} break;
			case 2 :
			{
				is.vCart.add(new CartIngredient(is.vMain(unum).name,usu,uctSelect));
			} break;
			case 3 :
			{
				is.vCart.add(new CartIngredient(is.vSource(unum).name,usu,uctSelect));
			} break;
			case 4 :
			{
				is.vCart.add(new CartIngredient(is.vTop(unum).name,usu,uctSelect));
			} break;
		}
	}// end uCustomSelectRun()


	// 삭제할 재료 번호,수량 입력받기
	public void uCustomRemoveInput() throws IOException
	{
		System.out.println("\n    [재료 삭제]");  
		
		System.out.println("선택된 재료");
		System.out.println("[번호]  [재료명]  [수량]");

		// 지금 선택된 재료 출력
		for (int i=0; i<is.vCart.size(); i++)
			System.out.printf("%d.  %5s  %4d개\n", (i+1), is.vCart.get(i).name, is.vCart.get(i).num);

		System.out.println();
		System.out.printf("현재 금액   : %d\n", resultMoney);
		System.out.printf("현재 칼로리 : %d\n", resultKcal);

		do	// 장바구니의 수량보다 많이 입력하면 다시 입력
		{
			System.out.println("삭제할 재료 번호: " );
			unum = Integer.parseInt(br.readLine());

			System.out.println("삭제할 재료 수량: " );
			usu = Integer.parseInt(br.readLine());

			if (is.vCart(unum).num < usu)
			{
				System.out.println("장바구니의 수량보다 많이 입력하셨습니다.");

			}
		}
		while (is.vCart(unum).num < usu);

	}// end uCustomRemoveInput()

	public void uCustomRemoveRun() // 재료 삭제 실행 메소드
	{

		for (int i=0; i<is.vCart.size(); i++) // 재료 추가에서 같은구문 바꾸면 이것 바꿔야함★★★★★★★
		{
			switch (is.vCart.get(i).cCate)
			{
				case 1 :	// 야채일 경우
					{
						for (int j=0; j<is.vVeg.size(); j++)	// 야채 크기만큼 반복하면서
						{										// 장바구니 재료 이름과 입력한 재료 이름이 동일하면
							if (is.vCart.get(i).cName.equals(is.vVeg.get(j).name))
							{
								// 총 금액(칼로리) 감소
								resultMoney -= usu * is.vVeg.get(j).money;
								resultKcal -= usu * is.vVeg.get(j).kcal;
							}
							
						}
					} break;
				case 2 :
					{
						for (int j=0; j<is.vMain.size(); j++)
						{
							if (is.vCart.get(i).cName.equals(is.vMain.get(j).name))
							{
								resultMoney -= usu * is.vMain.get(j).money;
								resultKcal -= usu * is.vMain.get(j).kcal;
							}
						}
					} break;
				case 3 :
					{
						for (int j=0; j<is.vSource.size(); j++)
						{
							if (is.vCart.get(i).cName.equals(is.vSource.get(j).name))
							{
								resultMoney -= usu * is.vSource.get(j).money;
								resultKcal -= usu * is.vSource.get(j).kcal;
							}
						}
					} break;
				case 4 :
					{
						for (int j=0; j<is.vTop.size(); j++)
						{
							if (is.vCart.get(i).cName.equals(is.vTop.get(j).name))
							{
								resultMoney -= usu * is.vTop.get(j).money;
								resultKcal -= usu * is.vTop.get(j).kcal;
							}
						}
					} break;
			}// end switch
		}// end for

		// 만약 장바구니에 담긴 수량이랑 입력 수량이 같은경우
		// 장바구니 제품 자체를 삭제하고
		// 그렇지 않은경우 수량만 줄인다
		if (is.vCart(unum).num == usu)
		{
			is.vCart.remove(unum);
		}
		else
		{
			is.vCart.get(unum).num -= usu;
		}

	}// end uCustomRemoveRun()

	public void uFinalCart() // 지금까지 담은 제품명 보여주는 메소드
	{
		// 지금까지 담은 제품명 출력
		for (int i=0; i<is.vCart.size(); i++)
		{
			System.out.printf("제품명, 수량 : %s, %d\n", is.vCart.get(i).cName, is.vCart.get(i).cNum);
		}

		// 총 금액(칼로리) 출력
		System.out.printf("총 금액   : %d\n", resultMoney);
		System.out.printf("총 칼로리 : %d\n", resultKcal);

	}// end uFinalCart()
	
	public void adfasdf() // 계속 추가/삭제할지 여부 물어보기
	{
		
	}

	

/*
	// 추가한 제품 담는 벡터 메소드
	public static Vector<Ingredient> uCustomSalad()
	{	
		// 테스트용 ISetup 인스턴스 생성
		// ISetup isu = new ISetup();
		// isu.firstSet();

		Vector<Ingredient> temp = new Vector<Ingredient>();

		// -- 재료 선택
		// 양상추, 당근만 넣어서 
		// 양파 : 인그리 객체, 셋업에서 생성한 벡터에서 빼와서.
			
		temp.add(isu.vMain.get(0));	// 연어
		temp.add(isu.vMain.get(1));	// 케이준

		// => 재료이름은 나열, 칼로리 연산
		return temp;

	
		
	}
*/
}


/*
체크하고 넘어가야할 것들

*/