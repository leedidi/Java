import java.util.Vector;
import java.io.IOException;

public class Salad
{
	public static void main(String[] args) throws IOException
	{
		ISetup is = new ISetup();
		Change cg = new Change();

		Password pw = new Password();
		System.out.println("\t »Ï·Õ~ Power On ");
		pw.inputPass();
		pw.modePrint();
		pw.modeSelect();
		pw.modeRun();
	}
}