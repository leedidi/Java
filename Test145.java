/*=========================================
  ■■■ 예외(Exception) 처리 ■■■
===========================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test145
{
	private String[] data = new String[3];

	public void proc() // throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		int n=0;

		try
		{
			System.out.print("이름 입력(종료:Ctrl+z) : ");

			while ( (str = br.readLine()) != null )
			{
				data[n++] = str;
				System.out.print("이름 입력(종료:Ctrl+z) : ");
			}

			System.out.println("입력된 내용...");
			for (String s : data) //@ data에 들어있는거 하나하나 꺼내서 출력하겠다..!
			{
				if (s != null)
				{
					System.out.println(s);
				}
			}
			
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}

		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("예외 발생~!!!");
			System.out.println("getMesage  : " + e.getMessage());
			System.out.println("toString   : " + e.toString());
			System.out.println("printStackTrace..............");
			e.printStackTrace();
		}

		
	}

	public static void main(String[] args) // throws IOException 
										   //@ 에러 잡아버리기 때문에 폭발물●이 밖으로 던져질(굴러나올) 일이 없음.
	{
		Test145 ob = new Test145();
		ob.proc();
	}
}