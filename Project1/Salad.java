
import java.util.Vector;
import java.lang.NullPointerException;

public class Salad
{
	public static void main(String[] args) throws NullPointerException
	{
		ISetup is = new ISetup();

		is.firstSet();

		is.result();
	}
}