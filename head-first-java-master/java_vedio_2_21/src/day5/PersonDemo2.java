package day5;
/*构造函数
构造函数和一般函数在写法上有不同
构造函数在对象一建立就运行，
而一般方法是在对象调用的时候才运行，是给对象添加对象具备的功能。
一个对象建立，构造方法运行*/
class Person1{
	private String name;
	private int age;
	//构造代码块
	/*作用：给对象初始化，对象一建立就运行，而且优先于构造函数执行。
	和构造函数的区别：
	构造代码块是给所有的对象初始化，构造函数是给特定的对象初始化。
	构造代码块 中定义的是不同对象共性的特性*/
	{
		System.out.println("Person code run.");
	}
	Person1(){
		System.out.println("name:"+name+"age:"+age);
	}
	Person1(String n){
		name=n;
		System.out.println("name:"+name+",age:"+age);
	}
	Person1(String n,int a){
		name=n;
		age=a;
		System.out.println("name:"+name+",age:"+age);
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name=n;
	}
}
public class PersonDemo2 {
	public static void main(String[] args) {
		Person1 p=new Person1();
		System.out.println(p.getName());
		p.setName("张三");
		System.out.println(p.getName());
		
		Person1 s=new Person1("Mike",24);
		
		Person1 sPerson1=new Person1("王五");
	}
}
