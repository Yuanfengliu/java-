/*
静态代码块
格式：
static
	{
		静态代码中的执行语句。
	}

特点：随着类的加载而执行，只执行一次，并优先于主函数。记住，是一次。
用于给类进行初始化。
*/
class staticCode
{
	static
	{
		System.out.println("a");
	}
	public static void show()
	{
		System.out.println("show run");
	}
}


class  staticCodeDemo
{
	static
	{
		System.out.println("b");
	}
	public static void main(String[] args) 
	{
		new staticCode();
		new staticCode();//这一行不会再执行，因为上面一行已经执行过一次。
		System.out.println("Hello World!");
		staticCode.show();
		staticCode s=null;
	}
	static
	{
		System.out.println("c");
	}
}
