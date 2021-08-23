import java.util.Vector;

public class ISetup
{

    Vector<Ingredient> vVeg = new Vector<Ingredient>();
	Vector<Ingredient> vMain = new Vector<Ingredient>();
	Vector<Ingredient> vSource = new Vector<Ingredient>();
	Vector<Ingredient> vTop = new Vector<Ingredient>();

	Vector<String> vNote = new Vector<String>();
	
	Vector<String> afterPay = new Vector<String>();				// 결제가 완료되면 재료 이름이랑, 수량, 횟수(용기) 이 담기는 벡터	
	//Vector<Integer> vPaymoney = new Vector<Integer>();						// 결제가 완료되면 금액이 담기는 벡터. . 
	static int countBowl;	

	public void firstSet()	//초기재료세팅
	{	
		vVeg.add(new Ingredient("양상추",20,11,2000));
		vVeg.add(new Ingredient("당근",10,34,1000));
		vVeg.add(new Ingredient("방울토마토",10,8,1000));
		vVeg.add(new Ingredient("양파",10,35,1000));
		vVeg.add(new Ingredient("오이",10,9,1000));

		vMain.add(new Ingredient("연어",3,106,2500));
		vMain.add(new Ingredient("케이준",3,145,1800));
		vMain.add(new Ingredient("닭가슴살",3,107,1500));

		vSource.add(new Ingredient("발사믹",3,27,500));
		vSource.add(new Ingredient("오리엔탈",3,28,500));
		vSource.add(new Ingredient("참깨드레싱",3,65,700));
		vSource.add(new Ingredient("허니머스타드",3,30,300));
	}


} //end ISetup class