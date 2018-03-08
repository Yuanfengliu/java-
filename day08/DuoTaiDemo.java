/*
多态：可以理解为事物存在的多种体现形态

多态的扩展性
1. 多态的体现  
	父类的引用指向了自己的子类对象  
	父类的引用也可以接收自己的子类对象
2. 多态的前提  
	必须是类与类之间有关系，要么继承，要么实现。
	通常还有一个前提：存在覆盖
3. 多态的好处  
	多态的出现大大的提高程序的扩展性
4. 多态的弊端：
	提高了扩展性，但是只能用父类的引用访问父类中的成员
5. 多态的应用  

6.多态成员的特点（多态使用的注意事项）
在多态中成员函数的特点：  
在编译时期：参阅引用型变量所属的类中是否有调用的方法，如果有，编译通过，如果没有，编译失败。
在运行时期：参阅对象所属的类中是否有调用的方法。  
简单总结就是：成员函数在多态调用时，编译看左边，运行看右边。  
在多态中，成员变量的特点：无论编译还是运行，都参考左边（引用型变量所属的类）。  
在多态中，静态成员函数的特点：无论编译还是运行，都参考左边（引用型变量所属的类）。

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
		funtion(new cat());//这里Animal a=new cat()
		funtion(new Dog());//这里Animal a=new Dog()
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
