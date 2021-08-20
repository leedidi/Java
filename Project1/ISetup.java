import java.util.Vector;
import java.util.Iterator;

public class ISetup
{

    Vector<Ingredient> vVeg = new Vector<Ingredient>();
	Vector<Ingredient> vMain = new Vector<Ingredient>();
	Vector<Ingredient> vSource = new Vector<Ingredient>();
	Vector<Ingredient> vTop = new Vector<Ingredient>();


	public void firstSet()	//초기재료세팅
	{	
		vVeg.add(new Ingredient("양상추",20,11));
		vVeg.add(new Ingredient("당근",10,34));
		vVeg.add(new Ingredient("방울토마토",10,8));
		vVeg.add(new Ingredient("양파",10,35));
		vVeg.add(new Ingredient("오이",10,9));

		vMain.add(new Ingredient("연어",3,106));
		vMain.add(new Ingredient("케이준",3,145));
		vMain.add(new Ingredient("닭가슴살",3,107));

		vSource.add(new Ingredient("발사믹",3,27));
		vSource.add(new Ingredient("오리엔탈",3,28));
		vSource.add(new Ingredient("참깨드레싱",3,65));
		vSource.add(new Ingredient("허니머스타드",3,30));

	}

/*
	public void newSet(String newname, int newnum, int newkcal)	//새로운 품목 추가
	{
		v.add(new Ingredient(newname,newnum, newkcal));
		System.out.println(v.get(3).name);

		// 삭제
		v.remove(0);
		System.out.println(v.get(0).name);

		
   	}
	
		//수령 변경
		 v.get(0).num += n;
		 System.out.println(v.get(0).num);
*/


     


/*
      System.out.printf("%5s %5d %5d\n", v.get(0).name, v.get(0).num, v.get(0).kcal);
      System.out.printf("%5s %5d %5d\n", v.get(1).name, v.get(1).num, v.get(1).kcal);
      System.out.printf("%5s %5d %5d\n", v.get(2).name, v.get(2).num, v.get(2).kcal);

      v.set(0,new Ingredient("방토", 5,500));
      System.out.printf("%5s %5d %5d\n", v.get(0).name, v.get(0).num, v.get(0).kcal);
   
*/

} //end ISetup class