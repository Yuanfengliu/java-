/*
匿名内部类
1. 匿名内部类其实就是内部类的简写格式  
2. 定义匿名内部类的前提：
	内部类必须是继承一个类或者实现接口。  
3. 匿名内部类的格式：new 父类或者接口（）{定义子类的内容}    (30到36行)
4. 其实匿名内部类就是一个匿名子类对象，而且这个对象有点胖。可以理解为带内容的对象  
5. 匿名内部类中定义的方法最多不要超过三个。
*/

abstract class abcDemo
{
	abstract void show();
}
class Outer
{
	int x=3;
	/*
	class Inner extends abcDemo
	{
		void show()
		{
			System.out.println("show:"+x);
		}
	}
	*/
	public void function()
	{
//		new Inner().show();
		new abcDemo()
		{
			void show()
			{
				System.out.println("show:"+x);
			}
		}.show();

		abcDemo d=new abcDemo()
		{
			void show()
			{
				System.out.println("show(d对象里面的):"+x);
			}
			void abc()
			{
				System.out.println("haha");
			}
		};
		d.show();
		//d.abc();//编译失败；父类没有定义abc（）

	}
}
class InnerClassDemo4
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		new Outer().function();
	}
}
