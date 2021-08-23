import java.util.Vector;

public class ISetup
{
	static Vector<Ingredient> v = new Vector<Ingredient>(); 


	public ISetup()	//초기재료세팅 → 생성자로 수정?
	{	
		// 야채 → 1
		v.add(new Ingredient(1, "양상추", 20, 11, 2000));
		v.add(new Ingredient(1, "당근", 10, 34, 1000));
		v.add(new Ingredient(1, "방울토마토", 10, 8, 1000));
		v.add(new Ingredient(1, "양파", 10, 35, 1000));
		v.add(new Ingredient(1, "오이", 10, 9, 1000));

		// 메인 → 2
		v.add(new Ingredient(2, "연어", 3, 106, 2500));
		v.add(new Ingredient(2, "케이준", 3, 145, 1800));
		v.add(new Ingredient(2, "닭가슴살", 3, 107, 1500));

		// 소스 → 3
		v.add(new Ingredient(3, "발사믹", 3, 27, 500));
		v.add(new Ingredient(3, "오리엔탈",3,28,500));
		v.add(new Ingredient(3, "참깨드레싱",3,65,700));
		v.add(new Ingredient(3, "허니머스타드",3,30,300));

		// 토핑 → 4
		v.add(new Ingredient(4, "치즈", 3, 25, 300));
		v.add(new Ingredient(4, "피망", 5, 17, 600));
		v.add(new Ingredient(4, "버섯", 9, 68, 200));
		v.add(new Ingredient(4, "갈릭후레이크", 4, 77, 300));
		v.add(new Ingredient(4, "옥수수", 10, 56, 100));
	}

} //end ISetup class