import java.util.Vector;
import java.util.Iterator;

public class ISetup
{

    Vector<Ingredient> vVeg = new Vector<Ingredient>();
	Vector<Ingredient> vMain = new Vector<Ingredient>();
	Vector<Ingredient> vSource = new Vector<Ingredient>();
	Vector<Ingredient> vTop = new Vector<Ingredient>();


	public void firstSet()	//�ʱ���Ἴ��
	{	
		vVeg.add(new Ingredient("�����",20,11));
		vVeg.add(new Ingredient("���",10,34));
		vVeg.add(new Ingredient("����丶��",10,8));
		vVeg.add(new Ingredient("����",10,35));
		vVeg.add(new Ingredient("����",10,9));

		vMain.add(new Ingredient("����",3,106));
		vMain.add(new Ingredient("������",3,145));
		vMain.add(new Ingredient("�߰�����",3,107));

		vSource.add(new Ingredient("�߻��",3,27));
		vSource.add(new Ingredient("������Ż",3,28));
		vSource.add(new Ingredient("�����巹��",3,65));
		vSource.add(new Ingredient("��ϸӽ�Ÿ��",3,30));

	}

/*
	public void newSet(String newname, int newnum, int newkcal)	//���ο� ǰ�� �߰�
	{
		v.add(new Ingredient(newname,newnum, newkcal));
		System.out.println(v.get(3).name);

		// ����
		v.remove(0);
		System.out.println(v.get(0).name);

		
   	}
	
		//���� ����
		 v.get(0).num += n;
		 System.out.println(v.get(0).num);
*/


     


/*
      System.out.printf("%5s %5d %5d\n", v.get(0).name, v.get(0).num, v.get(0).kcal);
      System.out.printf("%5s %5d %5d\n", v.get(1).name, v.get(1).num, v.get(1).kcal);
      System.out.printf("%5s %5d %5d\n", v.get(2).name, v.get(2).num, v.get(2).kcal);

      v.set(0,new Ingredient("����", 5,500));
      System.out.printf("%5s %5d %5d\n", v.get(0).name, v.get(0).num, v.get(0).kcal);
   
*/

} //end ISetup class