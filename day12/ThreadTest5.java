/*
练习；三个线程一起运行

方法很多，这里用到内部类等

*/

class ThreadTest5 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		new Thread()
		{
			public void run()
			{
				for (int x=0;x<100 ;x++ )
				{
					System.out.println(Thread.currentThread().getName()+"******"+x);
				}
			}
		}.start();


		for (int x=0;x<100 ;x++ )
		{
			System.out.println(Thread.currentThread().getName()+"......"+x);
		}	

		Runnable r =new Runnable()
		{
			public void  run()
			{
				for (int x=0;x<100 ;x++ )
				{
					System.out.println(Thread.currentThread().getName()+"------"+x);
				}
			}
		};
		new Thread(r).start();
		


	}
}
