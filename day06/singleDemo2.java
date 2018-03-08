/*之前讲过的一种方法（这种是先初始化对象；称为：饿汉式）

single类一进入内存，就已经创建好了对象。（开发一般用饿汉式）
class single
{
	private static single s=new single();
	private single(){}
	public static single getInstance()
	{
		return s;
	}
}
*/
//第二种写法（对象是方法被调用时，才初始化，也叫做对象的延时加载。称为：懒汉式。）
//single进内存，对象还没有存在只有调用getInstance方法时，才建立对象。
class single
{
	private static single s=null;
	private single(){}
	public static single getInstance()//由于这种方法可能会出错，可加上synchronized，这是加锁的意思，
	{										//但是这种加锁，效率就变慢了，改进的方法在本文最后。
		if (s==null)
		{
			s=new single();
		}
		return s;
	}
}
//记住原则：定义单例，建议使用饿汉式。
class singleDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		single ss=single.getInstance();
	}
}

/*懒汉式的改进方法（即使改进了，但是代码过多，还不如使用饿汉式的）
class single
{
	private static single s=null;
	private single(){}
	public static single getInstance()
	{
		if (s==null)
		{
			synchronized(single.class)
			{
				if(s==null)
					s=new single();
			}			
		}
		return s;
	}
}


*/