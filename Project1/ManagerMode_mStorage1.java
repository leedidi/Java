
	//* �޼ҵ� �ѷ� ����
	//public void mStorageChange() throws IOException // ��� �߰�/���� �޼ҵ�
	
	
	public void mStorageChangeInput() throws IOException // ��� �߰�/���� �Է� + �߸��� �Է½� �ٽ� �Է��ϴ� �޼ҵ�
	{

		ISetup is = new ISetup();
		is.firstSet();

		Scanner sc = new Scanner(System.in);

		System.out.println("��� �߰�/���� �޼ҵ�");
		
		//1. ���� ��� ���
		//2. �߰�(+), ����(-) ���� ���� �Է¹��� - �Է� do~while
		//3. ����ȣ, ���� �Է¹��� - �Է�
		//4. �߰� ���� Ȯ�� ���� ���
		//5. �߰� ���� ���� �Է¹��� �� �Է�
		
		
		// 2. �߰�(+), ����(-) ���� ���� �Է¹���
		// --> �Է¿����� : �Է¿� ������ �ֽ��ϴ� ���. 
		//(���⼭ �Է¿�����? +/-, [����ȣ, �������� �ּҰ�~�ִ밪] �̿��� ���� �Է½�?)
		

		//1. �߰����� ����°�
		//2. ����°� �Է°� �޾ƿͼ� �����ϴ� �޼ҵ�

		String oper;
		int ctSelect;
		int num;
		int su;
		
		while(true) 
		{
			System.out.print("��Ḧ �߰��Ͻ÷��� (+), �����Ͻ÷��� (-) : "); // oper
			//op = (char)System.in.read();
			//op = sc.nextInt();
			//op = (char)System.in.read();
			oper = sc.next();
			//�׽�Ʈ
			//System.out.println(oper); //--- + �Է½� + ���, �Է��� ��!

			if(oper.equals("+")||oper.equals("-")) 
			{
			break;
			}
			System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n");			
		}
		

		while (true)
		{
			System.out.print("��� ī�װ� : "); // num
			num = Integer.parseInt(br.readLine());

			if(num<20) //����: [����ȣ�� �ִ밪 �ʰ�] �Է½�
			{
				break;  // ��� �Է�ĭ ���
			}
			System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n");
		}
			

		while (true)
		{
			System.out.print("��� ��ȣ : "); // num
			num = Integer.parseInt(br.readLine());

			if(num<20) //����: [����ȣ�� �ִ밪 �ʰ�] �Է½�
			{
				break;  // ��� �Է�ĭ ���
			}
			System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n");
		}
			

		while (true)
		{
			System.out.print("��� ���� : "); // su
			su = Integer.parseInt(br.readLine());

			if(su<20) // ����: [�������� �ִ밪 �ʰ�] �Է½�
			{
				break;  // ��� �Է�ĭ ���
			}
			System.out.println("\n�Է¿� ������ �ֽ��ϴ�.\n");
		
		}
		
	}

	public void mStorageChangeExecution()												
	{														// �Էµ� ����� ���ڴ�� ��� ���� ����, �����ϴ� Ŭ����
															// ��Ŭ���� ���....? oper.num.su �����;���
		// 3. �߰� ���� Ȯ�� ���� ���
		// 4. �߰�, ���� ����
		// -->> ��� �߰��Ǿ����ϴ� / �����Ǿ����ϴ� ���� ���
		
		if (oper.equals("-"))
		{
			System.out.println("\n��� �����Ͻðڽ��ϱ�? (Y/N)");
			String yn = sc.next();
			if(yn == "y" || yn == "Y")
				{
				// + ��� ���� ����	
				is.vVeg.get(num).num = is.vVeg.get(num).num - su;

				System.out.println("��ᰡ �����Ǿ����ϴ�.");
				}
				else if(yn == "n" || yn == "N")
				{
				// ó�� ȭ������,,,,,���� ���ư���,,,,? ����?
				System.out.println("��ҵǾ����ϴ�.");
				return;
				}
		}
			else
			{
				System.out.println("\n��� �߰��Ͻðڽ��ϱ�? (Y/N)");
				String yn = sc.next();
				if(yn == "y" || yn == "Y")
					{
					// + ��� �߰� ����	
					is.vVeg.get(num).num = is.vVeg.get(num).num + su;

					System.out.println("��ᰡ �߰��Ǿ����ϴ�.");
					}
					else if(yn == "n" || yn == "N")
					{
					// ó�� ȭ������,,,,,���� ���ư���,,,,.
					return;
					}
			}
			// �� Ȯ�ο� �׽�Ʈ
			System.out.println("���Դϴ�.");
	}

