import java.util.Vector;

public class ISetup
{
	static Vector<Ingredient> v = new Vector<Ingredient>(); 


	public ISetup()	//�ʱ���Ἴ�� �� �����ڷ� ����?
	{	
		// ��ä �� 1
		v.add(new Ingredient(1, "�����", 20, 11, 2000));
		v.add(new Ingredient(1, "���", 10, 34, 1000));
		v.add(new Ingredient(1, "����丶��", 10, 8, 1000));
		v.add(new Ingredient(1, "����", 10, 35, 1000));
		v.add(new Ingredient(1, "����", 10, 9, 1000));

		// ���� �� 2
		v.add(new Ingredient(2, "����", 3, 106, 2500));
		v.add(new Ingredient(2, "������", 3, 145, 1800));
		v.add(new Ingredient(2, "�߰�����", 3, 107, 1500));

		// �ҽ� �� 3
		v.add(new Ingredient(3, "�߻��", 3, 27, 500));
		v.add(new Ingredient(3, "������Ż",3,28,500));
		v.add(new Ingredient(3, "�����巹��",3,65,700));
		v.add(new Ingredient(3, "��ϸӽ�Ÿ��",3,30,300));

		// ���� �� 4
		v.add(new Ingredient(4, "ġ��", 3, 25, 300));
		v.add(new Ingredient(4, "�Ǹ�", 5, 17, 600));
		v.add(new Ingredient(4, "����", 9, 68, 200));
		v.add(new Ingredient(4, "�����ķ���ũ", 4, 77, 300));
		v.add(new Ingredient(4, "������", 10, 56, 100));
	}

} //end ISetup class