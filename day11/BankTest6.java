/*
需求：
银行有一个金库。
有2个储户分别存300元，每次100，存3次。   （2人总共就600）

目的：该程序是否有安全问题，如果有，如何解决？

如何找问题：
1、明确哪些代码是多线程运行代码。
2、明确共享数据。
3、明确多线程运行代码中哪些语句是操作共享数据的

同步函数的锁用的是this。 
函数需要被对象调用。那么函数都有一个所属对象引用。就是this。
所以同步函数使用的锁是this。

比如通过买票程序的进行验证。
一个线程在同步代码块中。
一个线程在同步函数中。
都在执行买票动作。

如果同步函数被静态修饰后，使用的锁是什么呢？
通过验证，发现不在是this。因为静态方法中也不可以定义this。

静态进内存时，内存中没有本类对象，但是一定有该类对应的字节文件对象。
类名.class 该对象的类型是class

静态同步方法，使用的锁是该方法所在类的字节码文件对象。  类名.class 


*/
class Bank
{
	private int sum;
//	Object obj=new Object();
	public synchronized void add(int n)
	{
//		synchronized(obj)  、//同步函数和同步代码块是一样的意思（在上二行处加是同步函数），方法不同。同步函数不需要这四行注释的语句。
//		{
			sum=sum+n;
			try
			{
				Thread.sleep(10);
			}
			catch (Exception e)
			{
			}
			System.out.println("sum="+sum);
//		}
	}
}
class Cus implements Runnable
{
	private Bank b=new Bank();
	public void run()
	{
		for (int x=0;x<3 ;x++ )
		{
			b.add(100);
		}
	}
}
class  BankTest6
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Cus c=new Cus();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();

	}
}
