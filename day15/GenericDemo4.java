/*
泛型类：带泛型的类。  
什么时候定义泛型类？
当类中要操作的引用数据类型不确定的时候，
早期定义Object来完成扩展，现在定义泛型完成扩展。


泛型类定义的泛型，在整个类中有效，如果被方法使用，
那么泛型类的对象没明确要操作的具体类型后，所有要操作的类型就已经固定了。
为了让不同方法可以操作不同类型，而且类型还不确定。
那么可以将泛型定义到方法上。


特殊之处是：静态方法不可以访问类上定义的泛型，
如果静态方法操作的引用数据类型不确定，可以将泛型定义在方法上。

？： 通配符，也可以理解为占位符。
泛型的限定：
？ extends E： 可以接收E类型或者E的子类型。上限  
？ super E：可以接收E类型或者E的父类型。下限
*/
class Demo<T>
{
	public <T> void show(T t) 
	{
		System.out.println("show: "+t);
	}
	public <Q> void print(Q q) 
	{
		System.out.println("print: "+q);
	}
	public static <W> void method(W t)
	{
		System.out.println("method: "+t);
	}
}
class  GenericDemo4
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Demo <String> d=new Demo<String>();
		d.show("haha");
		//d.show(4);这个不行，上面的泛型方法和泛型类一样，而且上2行建立对象时已经设定了String类型，所以出错
		d.print(5);
		d.print("hehe");

		Demo.method("hahahaasd");

/*
		Demo d =new Demo();
		d.show("haha");
		d.show(new Integer(4));
		d.print("heihei");
*/
	}
}
