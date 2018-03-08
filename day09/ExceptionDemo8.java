/*
对多异常的处理：
1. 声明异常时，建议声明更为具体的异常。这样处理的可以更具体。
2. 对方声明几个异常，就对应有几个catch块。不要定义多余的catch块  
   如果多个catch块中的异常出现继承关系，父类异常catch块放在最下面，否则会回出错。  
   
建立在进行catch处理时，catch中一定要具体的处理方式。不要简单的定义一句e.peintStackTrace()，
也不要简单的就书写一条输出语句。

*/
class Demo
{
	int div(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException//在功能上通过throws的关键字声明了改功能有可能会出现问题//可以看看有没有这个东西，编译是否通过
	{
		int[] arr =new int[a];
		System.out.println(arr[5]);//下面4传上来没有角标为5的，出现异常：角标越界
									//这个异常一出现，下面一句就不会执行，这个函数就不会再接着执行，就会抛出一个异常
		return a/b;
	}									  
}
class ExceptionDemo8
{
	public static void main(String[] args) //throws Exception//出错，把问题抛给虚拟机
	{
		System.out.println("Hello World!");
		Demo d=new Demo();
		try
		{			
			int x=d.div(4,0);
		}		
/*
		catch (ArithmeticException e)	
		{
		System.out.println(e.toString());	
		System.out.println("被除零啦！！！");
		}
		catch (ArrayIndexOutOfBoundsException e)	
		{
		System.out.println(e.toString());
		System.out.println("角标越界了！！！");
		}
*/
		catch (Exception e)	//以上30-39可以写成以下几行，但没有针对性，不具体。不提倡用这种方法。
		{					//也可以和上面2个一起放上，但是要放在最后面。否则程序一出现异常就会执行这个父类异常。
			System.out.println("快看："+e.toString());			
		}
		System.out.println("over");
	}
}
