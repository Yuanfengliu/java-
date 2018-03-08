/*
死锁。
同步中嵌套同步

发现结果锁死不动（结果可能只是2行，可能有四行，可能。。。）
*/

class Test implements Runnable
{
	private boolean flag;
	Test(boolean flag)
	{
		this.flag=flag;
	}
	public void run()
	{
		if (flag)
		{			
			synchronized(MyLock.locka)
			{
				System.out.println("if locka");
				synchronized(MyLock.lockb)
				{
					System.out.println("if locka");
				}				
			}
		}
		else 
		{
			synchronized(MyLock.lockb)
			{
				System.out.println("else lockb");
				synchronized(MyLock.locka)
				{
					System.out.println("else lockb");
				}
			}
		}
	}
}
class MyLock
{
	static Object locka=new Object();
	static Object lockb=new Object();

}
class  DeadLockTest8
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Thread t1=new Thread(new Test(true));
		Thread t2=new Thread(new Test(false));
		t1.start();
		t2.start();
	}
}
