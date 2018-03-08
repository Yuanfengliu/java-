/*
需求：获取一段程序运行的时间。
原理：获取程序开始和结束的时间并相减即可。

获取时间：System.currentTimeMillis()

当代码完成优化后，就可以解决这类问题

这种方式，模块方法设计模式。

什么是模板方法呢？
答：在定义功能时，功能的一部分是确定的，但是有一部分功能时不确定的，
而确定的部分在使用不确定的部分，就将不确定的部分暴露出去，

*/
abstract class GetTime
{
	public final void GetTime()//加上final 只是为了不让GetTime复写，只让runcode()复写
	{
		long start =System.currentTimeMillis();
		runcode();
		long end =System.currentTimeMillis();
		System.out.println("");
		System.out.println("毫秒："+(end-start));
	}
	public abstract void runcode();
//	{
//		for(int X=0;X<100;X++)
//		{
//			System.Out.Print(X);
//		}
//	}
}
class SubTime extends GetTime
{
	public void runcode()
	{		
		for(int x=0;x<111;x++)
		{
			System.out.print(x);
		}		
	}
}
class  TempplateDemo8
{
	public static void main(String[] args) 
	{
		//GetTime gt=new GetTime();
		SubTime gt=new SubTime();
		gt.GetTime();
		System.out.println("Hello World!");
	}
}
