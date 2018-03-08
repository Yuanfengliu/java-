
/*
Exception中有一个特殊的子类异常RuntimeException运行时异常。
如果在函数内抛出该异常，函数上可以不用声明，编译一样通过。  
如果在函数上声明了该异常。调用者可以不用进行处理。编译一样通过。
之所以不用在函数声明，是因为不需要让调用者处理，当该异常发生，希望程序停止。因为在运行时，出现了无法继续运算的情况，
希望停止程序后，对代码尽心修正。  

自定义异常时，如果该异常的发生，无法再继续进行运算，就让自定义异常继承RuntimeException   

对于异常分两种： 

1. 编译时被检测的异常。  
2. 编译时不被检测的异常（运行时异常。RuntimeException以及其子类）


*/
class FuShuException extends RuntimeException	
{	
	
	FuShuException(String msg)
	{
		super(msg);
	}	
}

class Demo
{
	int div(int a,int b)//throws ArithmeticException
	{
		if (b<0)
		{
			throw new ArithmeticException("出现了除数为负数了");
		}
		if (b==0)
		{
			throw new ArithmeticException("被零除了");//这样抛出编译通过，但执行出错。因为函数内抛出它的父类是RuntimeExceptionm，他不需要声明，比较特殊。
		}											//如果ArithmeticException改成Exception，则连编译都不会通过。因为函数内抛出了，函数上必须声明。
		return a/b;
	}									  
}
class ExceptionDemo10 
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		Demo d=new Demo();
					
			int x=d.div(4,-4);
			System.out.println("x="+x);
		
		System.out.println("over");
	}
}
