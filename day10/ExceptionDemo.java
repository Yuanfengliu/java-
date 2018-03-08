/*
finally代码块：定义一定执行的代码。通常用于关闭资源。

第一种格式：
try
{
}
catch()
{
}
第二种格式：
try
{	
}
catch ()
{
}
finally
{
}
第三种格式：
try
{	
}
finally
{
}
记住一点：catch是用于处理异常的。如果没有catch就代表异常没有被处理过，如果该异常是监测时异常。那么必须声明.
*/
class FuShuException extends Exception	
{	
	
	FuShuException(String msg)
	{
		super(msg);
	}	
}
class Demo
{
	int div(int a,int b)throws FuShuException
	{
		if (b<0)
		{
			throw new FuShuException("出现了除数为负数了");
		}			
		return a/b;
	}									  
}
class  ExceptionDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Demo d=new Demo();
		try
		{
			int x=d.div(4,-1);
			System.out.println("x="+x);
		}
		catch (FuShuException e)
		{
			System.out.println(e.toString());
			return;//这一行是为了后面的‘over’等语句，但是有没有这行，finally任何情况下都会执行的
		}
		finally 
		{
			System.out.println("finally");//finally中存放的是一定会被执行的代码
		}							
		System.out.println("over");
	}
}
