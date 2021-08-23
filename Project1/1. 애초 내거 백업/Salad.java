
import java.util.Vector;
import java.io.IOException;

public class Salad
{
	public static void main(String[] args) throws IOException
	{

		/*
		ISetup is = new ISetup();
		is.firstSet();
		is.result();
		*/

		Password pw = new Password();
		pw.inputPass();
		pw.modePrint();
		pw.modeSelect();
		pw.modeRun();

	}
}