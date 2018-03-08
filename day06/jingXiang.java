/*
什么时候使用静态？
要从两个方面下手：
因为静态变量修饰的内容有成员变量和函数。
什么时候定义静态变量（类变量）呢/
当对象中出现共享数据时，该数据被静态所修饰。
对象中的特有数据要定义成非静态存在于堆内存中。

什么时候定义静态函数呢？

当功能内部没有访问到非静态数据(对象的特有数据)，
那么该功能可以定义成静态的。(如19行内部没有非静态数据name，这时可以定义静态函数show（）)
*/
class  Person
{
	String name;
	public static void show() 
	{
		System.out.println("hahahaha");
	}
}
class  jingXiang
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//Person p=new Person();
		//p.show();
		Person.show();//用这个语句就在17行加上静态
						//同样功能的27和28行就不用加静态的
						//但是如果show（）函数中有非静态变量name，17行就不能加静态。
	}
}
