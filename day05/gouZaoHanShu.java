/*构造函数
特点：
1：函数名与类名相同
2：不用定义返回值类型
3：不可以写return语句
作用：
给对象进行初始化
*/

/*
对象一建立，就会调用与之对应的构造函数
构造函数的作用：可以用于给对象进项初始化。
当一个类中没有定义构造函数时，那么系统会默认给该类加入一个空参数的构造函数

当类中自定义了构造函数后，默认的构造函数就没有了

构造函数和一般函数在写法上有不同：
1：运行上不同。
构造函数是在对象一建立就运行，给对象初始化；
而一般方法是对象调用在执行，给对象添加对象具备的功能。

2：一个对象建立，构造函数只运行一次；
而一般方法可以被该对象调用多次。

什么时候定义构造函数呢？
当分析事物时，该事物存在具备一些特性或者行为，那么将这些内容定义在构造函数中。

*/
/*
this:看上去，是用于区分局部变量和成员变量同名情况。
this为什么可以解决这个问题呢？
this到底代表的是什么呢？

this：就代表本类的对象，代表它所在函数所属对象的引用。
	简单说：哪个对象在调用this所在的函数，this就代表哪个对象。
this的应用：当定义类中功能时，该函数内部要用到调用该函数的对象时，这时用this来表示这个对象。
			但凡类功能内部使用了本类对象，都用this表示。
*/
class Person
{
	private String name;
	private int age;
	/*构建代码块：
	作用：给对象进行初始化。
	对象一建立就运行，而且优先于构造函数执行。
	和构造函数的区别：
	构造代码块是给所有对象进行统一初始化，
	而构建函数是给对应的对象初始化。

	构造代码块中定义的是不同对象共性的初始化内容。
	*/
	{//这个括号内的就是具有共性的代码块
		//System.out.println("person code run");
		cry();
	}
	Person(int age)
	{
		this.age=age;
		System.out.println("D：name="+name+",,age="+age);
	}

	Person()//这就是构造函数，与类名一样//如果类里面把所有的构造的函数私有化，
						//那么这个类就不能创建对象，因为对象都不能初始化动作
	{
		System.out.println("A：name="+name+",,age="+age);
		
	}
	Person(String name)//这就是构造函数，与类名一样
	{
		this.name=name;//this解释看第30行
		System.out.println("B：name="+name+",,age="+age);
	}
	Person(String name,int age)//这就是构造函数，与类名一样
	{
		this.name=name;
		this.age=age;
		System.out.println("C：name="+name+",,age="+age);
	}
	public void cry()//一个公共的函数
	{
		System.out.println("...cry...");
	}
	public void setName(String n)//改名字
	{
		name=n;
	}
	public String getName()//得到年龄 
	{
		return name;
	}
/*需求：给人定义一个用于比较年龄是否相同的功能，也就是是否是同龄人*/
	public boolean compare(Person p)
	{
		return this.age==p.age;
	}
}

class  gouZaoHanShu
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Person p1=new Person();//这个人出生没有名字，没有年龄//对象一建立，就会调用与之对应的构造函数
		p1.cry();//第一个函数想哭两次，就用这个一般函数。
					//不能再用Person p1=new Person();这个语句，这个语句等价于再创造一个孩子啦。。。
		System.out.println("---------------------------------------");
		Person p2=new Person("zhang san");//这个人出生有名字，没有年龄
		
		System.out.println("---------------------------------------");

		Person p3=new Person("李四",10);//这个人出生有名字，有年龄
		p3.setName("李不四");//可以改名字
		p3.setName("李四三");//可以再改名字
		System.out.println(p3.getName());

		System.out.println("---------------------------------------");

		Person p4=new Person("刘渊",24);
		Person p5=new Person(20);
		boolean b=p4.compare(p5);
		System.out.println("是否同龄呢？答："+b);
	}
}
