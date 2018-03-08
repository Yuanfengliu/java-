/*
this语句：用于构造函数之间的互相调用。不能用于一般函数。
this语句只能定义在构造函数的第一行，因为初始化要先执行。
*/
class Person
{
	private String name;
	private int age;
	Person()
	{
		System.out.println("A：name="+name+",,age="+age);
	}
	Person(String name)//这就是构造函数，与类名一样
	{
		//this.name=name;
		this();
		//System.out.println("B：name="+name+",,age="+age);
	}
	Person(String name,int age)//这就是构造函数，与类名一样
	{
		//this.name=name;
		this(name);//this代表本对象
		this.age=age;
		System.out.println("C：name="+name+",,age="+age);
	}
}
class  personThis
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Person p=new Person("李四",10);
	}
}
