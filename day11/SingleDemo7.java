/*
单例设计模式。


*/
/*
饿汉式：
class single
{
	private static final Single s=new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	}
}
*/
//懒汉式
class single
{
	private static Single s=null;
	private Single(){}

	public static Single getInstance()
	{
		if (s==null)//用两次判断，为了提高懒汉式的效率。是不符合条件的线程不在进行同步
		{
			synchronized(Single.class)
			{
				if(s==null)
					s=new Single();
			}
		}
		return s;
	}
}

class  SingleDemo7
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
