import java.util.Vector;
import java.io.IOException;

public class TempStation
{
	static Vector<Ingredient> temp = new Vector<Ingredient>();

	public void tStation (Vector<Ingredient> temp) throws IOException
	{
		for (int i=0; i<temp.size(); i++)
		{
			this.temp.addElement(temp.get(i));
		}
	}
}