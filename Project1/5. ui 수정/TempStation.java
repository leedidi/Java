public class TempStation
{
	

	public void tStaion (Vector<Ingredient> temp) throws IOException
	{
		Vector<Ingredient> tStation = new Vector<Ingredient>();

		this.tStation = temp;

		UPackageSalad ups = new UPackageSalad();

		tStation.add(ups.uPackageSalad());
	}
}