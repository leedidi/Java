import java.util.Vector;

public class ISetup
{

    Vector<Ingredient> vVeg = new Vector<Ingredient>();
	Vector<Ingredient> vMain = new Vector<Ingredient>();
	Vector<Ingredient> vSource = new Vector<Ingredient>();
	Vector<Ingredient> vTop = new Vector<Ingredient>();

	Vector<String> vNote = new Vector<String>();
	
	Vector<String> afterPay = new Vector<String>();				// ������ �Ϸ�Ǹ� ��� �̸��̶�, ����, Ƚ��(���) �� ���� ����	
	//Vector<Integer> vPaymoney = new Vector<Integer>();						// ������ �Ϸ�Ǹ� �ݾ��� ���� ����. . 
	static int countBowl;	

	public void firstSet()	//�ʱ���Ἴ��
	{	
		vVeg.add(new Ingredient("�����",20,11,2000));
		vVeg.add(new Ingredient("���",10,34,1000));
		vVeg.add(new Ingredient("����丶��",10,8,1000));
		vVeg.add(new Ingredient("����",10,35,1000));
		vVeg.add(new Ingredient("����",10,9,1000));

		vMain.add(new Ingredient("����",3,106,2500));
		vMain.add(new Ingredient("������",3,145,1800));
		vMain.add(new Ingredient("�߰�����",3,107,1500));

		vSource.add(new Ingredient("�߻��",3,27,500));
		vSource.add(new Ingredient("������Ż",3,28,500));
		vSource.add(new Ingredient("�����巹��",3,65,700));
		vSource.add(new Ingredient("��ϸӽ�Ÿ��",3,30,300));
	}


} //end ISetup class