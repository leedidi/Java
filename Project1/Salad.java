
import java.util.Vector;
import java.lang.NullPointerException;
import java.io.IOException;

public class Salad
{
	public static void main(String[] args) throws IOException, NullPointerException
	{	
		/*
		ISetup is = new ISetup();
		is.firstSet();
		is.result();
		*/

		ManagerMode mn = new ManagerMode();
		mn.mStock();

		mn.mMenuPrint();
		mn.mMenuSelect();
		mn.mMenuRun();

	}
}