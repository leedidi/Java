public class Ingredient
{
	public int cate;	//카테고리
	public String name;	// 재료명
	public int num;		// 수량
	public int kcal;		// 칼로리
	public int money;

	public Ingredient(int cate, String name, int num, int kcal, int money)
	{
		this.cate = cate;		// 카테고리
		this.name = name;		// 재료명
		this.num = num;			// 수량
		this.kcal = kcal;		// 칼로리
		this.money = money;		// 금액
	}

}