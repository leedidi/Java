
	//* 메소드 둘로 나눔
	//public void mStorageChange() throws IOException // 재료 추가/삭제 메소드
	
	
	public void mStorageChangeInput() throws IOException // 재료 추가/삭제 입력 + 잘못된 입력시 다시 입력하는 메소드
	{

		ISetup is = new ISetup();
		is.firstSet();

		Scanner sc = new Scanner(System.in);

		System.out.println("재료 추가/삭제 메소드");
		
		//1. 현재 재료 출력
		//2. 추가(+), 삭제(-) 여부 선택 입력문구 - 입력 do~while
		//3. 재료번호, 수량 입력문구 - 입력
		//4. 추가 삭제 확정 여부 출력
		//5. 추가 수행 여부 입력문구 및 입력
		
		
		// 2. 추가(+), 삭제(-) 여부 선택 입력문구
		// --> 입력오류시 : 입력에 문제가 있습니다 출력. 
		//(여기서 입력오류란? +/-, [재료번호, 재료수량의 최소값~최대값] 이외의 무언가 입력시?)
		

		//1. 추가삭제 물어보는거
		//2. 물어보는거 입력값 받아와서 수행하는 메소드

		String oper;
		int ctSelect;
		int num;
		int su;
		
		while(true) 
		{
			System.out.print("재료를 추가하시려면 (+), 삭제하시려면 (-) : "); // oper
			//op = (char)System.in.read();
			//op = sc.nextInt();
			//op = (char)System.in.read();
			oper = sc.next();
			//테스트
			//System.out.println(oper); //--- + 입력시 + 출력, 입력은 됨!

			if(oper.equals("+")||oper.equals("-")) 
			{
			break;
			}
			System.out.println("\n입력에 문제가 있습니다.\n");			
		}
		

		while (true)
		{
			System.out.print("재료 카테고리 : "); // num
			num = Integer.parseInt(br.readLine());

			if(num<20) //조건: [재료번호의 최대값 초과] 입력시
			{
				break;  // 재료 입력칸 통과
			}
			System.out.println("\n입력에 문제가 있습니다.\n");
		}
			

		while (true)
		{
			System.out.print("재료 번호 : "); // num
			num = Integer.parseInt(br.readLine());

			if(num<20) //조건: [재료번호의 최대값 초과] 입력시
			{
				break;  // 재료 입력칸 통과
			}
			System.out.println("\n입력에 문제가 있습니다.\n");
		}
			

		while (true)
		{
			System.out.print("재료 수량 : "); // su
			su = Integer.parseInt(br.readLine());

			if(su<20) // 조건: [재료수량의 최대값 초과] 입력시
			{
				break;  // 재료 입력칸 통과
			}
			System.out.println("\n입력에 문제가 있습니다.\n");
		
		}
		
	}

	public void mStorageChangeExecution()												
	{														// 입력된 재료의 숫자대로 재고 내용 삭제, 실행하는 클래스
															// 위클래스 상속....? oper.num.su 데려와야함
		// 3. 추가 삭제 확정 여부 출력
		// 4. 추가, 삭제 실행
		// -->> 재료 추가되었습니다 / 삭제되었습니다 문구 출력
		
		if (oper.equals("-"))
		{
			System.out.println("\n재고를 삭제하시겠습니까? (Y/N)");
			String yn = sc.next();
			if(yn == "y" || yn == "Y")
				{
				// + 재고 삭제 실행	
				is.vVeg.get(num).num = is.vVeg.get(num).num - su;

				System.out.println("재료가 삭제되었습니다.");
				}
				else if(yn == "n" || yn == "N")
				{
				// 처음 화면으로,,,,,어케 돌아가지,,,,? 루프?
				System.out.println("취소되었습니다.");
				return;
				}
		}
			else
			{
				System.out.println("\n재고를 추가하시겠습니까? (Y/N)");
				String yn = sc.next();
				if(yn == "y" || yn == "Y")
					{
					// + 재고 추가 실행	
					is.vVeg.get(num).num = is.vVeg.get(num).num + su;

					System.out.println("재료가 추가되었습니다.");
					}
					else if(yn == "n" || yn == "N")
					{
					// 처음 화면으로,,,,,어케 돌아가지,,,,.
					return;
					}
			}
			// 끝 확인용 테스트
			System.out.println("끝입니다.");
	}

