/*


*/
abstract class Animal
{
	abstract void eat();
}
class cat extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void catchMouse()
	{
	System.out.println("ץ����");
	}
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("�Թ�ͷ");
	}
	public void kanJia()
	{
	System.out.println("����");
	}
}

class pig extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void gongDi()
	{
	System.out.println("����");
	}
}

class  DuoTaiDemo2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Animal a=new cat();//��������������ת��
		a.eat();
		System.out.println("--------------------");
		//�����Ҫ����è�����з���ʱ����β�����
		//ǿ�ƽ���������á�ת���������͡�����ת�͡�
		//ǧ��Ҫ���������Ĳ��������ǽ��������ת������������
//		������ת�����Ǹ���Ӧ��ָ�����Լ����������ʱ�������ÿ��Ա�������Ҳ���Ա�ǿ��ת����  
//		��̬��ʼ���ն���������������ű仯
		
//		cat c= (cat)a;
//		c.catchMouse();
		funtion(new cat());
		funtion(new Dog());
	}
	public static void funtion(Animal a)//
	{
		a.eat();
		/*********������ôд�����ܰѸ������ǰ�档���е������������ġ�
		if (a instanceof Animal)//�ж��Ƿ���è����
		{
			System.out.println("haha");
		}
		else
		*/
		if (a instanceof cat)//�ж��Ƿ���è����
		{
			cat c= (cat)a;
			c.catchMouse();
		}
		else if (a instanceof Dog)
		{
			Dog d= (Dog)a;
			d.kanJia();
		}
	}
}