/*
��̬���������Ϊ������ڵĶ���������̬

��̬����չ��
1. ��̬������  
	���������ָ�����Լ����������  
	���������Ҳ���Խ����Լ����������
2. ��̬��ǰ��  
	������������֮���й�ϵ��Ҫô�̳У�Ҫôʵ�֡�
	ͨ������һ��ǰ�᣺���ڸ���
3. ��̬�ĺô�  
	��̬�ĳ��ִ�����߳������չ��
4. ��̬�ı׶ˣ�
	�������չ�ԣ�����ֻ���ø�������÷��ʸ����еĳ�Ա
5. ��̬��Ӧ��  

6.��̬��Ա���ص㣨��̬ʹ�õ�ע�����
�ڶ�̬�г�Ա�������ص㣺  
�ڱ���ʱ�ڣ����������ͱ��������������Ƿ��е��õķ���������У�����ͨ�������û�У�����ʧ�ܡ�
������ʱ�ڣ����Ķ��������������Ƿ��е��õķ�����  
���ܽ���ǣ���Ա�����ڶ�̬����ʱ�����뿴��ߣ����п��ұߡ�  
�ڶ�̬�У���Ա�������ص㣺���۱��뻹�����У����ο���ߣ������ͱ����������ࣩ��  
�ڶ�̬�У���̬��Ա�������ص㣺���۱��뻹�����У����ο���ߣ������ͱ����������ࣩ��

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

class  DuoTaiDemo
{
	public static void main(String[] args) 
	{
//		cat c=new cat();
//		c.eat();
//
//		Dog d=new Dog();
//		d.eat();
		System.out.println("Hello World!");
	/*	cat c=new cat();
		cat c1=new cat();
		funtion(c1);
		funtion(c);

		Dog d=new Dog();
		funtion(d);
		funtion(new Dog());

		funtion(new pig());
	*/
//		Animal c=new cat();
//		c.eat();
		funtion(new cat());//����Animal a=new cat()
		funtion(new Dog());//����Animal a=new Dog()
		funtion(new pig());
	}
	public static void funtion(Animal a)//
	{
		a.eat();
	}
	/*
	public static void funtion(cat c)
	{
		c.eat();
	}
	public static void funtion(Dog d)
	{
		d.eat();
	}
	public static void funtion(pig p)
	{
		p.eat();
	}
	*/
}
