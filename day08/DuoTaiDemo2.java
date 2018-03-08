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
		System.out.println("吃鱼");
	}
	public void catchMouse()
	{
	System.out.println("抓老鼠");
	}
}
class Dog extends Animal
{
	public void eat()
	{
		System.out.println("吃骨头");
	}
	public void kanJia()
	{
	System.out.println("看家");
	}
}

class pig extends Animal
{
	public void eat()
	{
		System.out.println("饲料");
	}
	public void gongDi()
	{
	System.out.println("拱地");
	}
}

class  DuoTaiDemo2
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Animal a=new cat();//类型提升，向上转型
		a.eat();
		System.out.println("--------------------");
		//如果想要调用猫的特有方法时，如何操作？
		//强制将父类的引用。转型子类类型。向下转型。
		//千万不要出现这样的操作，就是将父类对象转换成子类类型
//		我们能转换的是父类应用指向了自己的子类对象时，该引用可以被提升，也可以被强制转换。  
//		多态自始至终都是子类对象在做着变化
		
//		cat c= (cat)a;
//		c.catchMouse();
		funtion(new cat());
		funtion(new Dog());
	}
	public static void funtion(Animal a)//
	{
		a.eat();
		/*********不能这么写，不能把父类放在前面。所有的子类包括父类的。
		if (a instanceof Animal)//判断是否是猫类型
		{
			System.out.println("haha");
		}
		else
		*/
		if (a instanceof cat)//判断是否是猫类型
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
