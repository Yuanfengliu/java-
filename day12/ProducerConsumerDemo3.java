/*
对于多个生产者和消费者。
为什么要定义while判断标记。
原因：让唤醒者的线程再一次判断标记。

为什么定义notifyAll
因为需要唤醒对方线程。因为只用notify，容易出现只换醒本方线程的情况，导致程序都等待。
（原来用notify唤醒时，是唤醒线程池第一个等待的人）

JDK1.5中提供了多线程升级解决方案。
将同步synchronized替换成现实Lock操作。
将Object中的wait，notify，notifyAll替换Condition对象
该对象可以Lock锁，进行获取。
在该示例中，实现了本方只换醒对方操作。
*/

import java.util.concurrent.locks.*;
class ProducerConsumerDemo3 
{
	public static void main(String[] args) 
	{
		Resource r=new Resource();

		Producer pro=new Producer(r);
		Consumer con=new Consumer(r);
		Thread t1=new Thread(pro);
		Thread t2=new Thread(pro);
		Thread t3=new Thread(con);
		Thread t4=new Thread(con);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
class Resource
{
	private String name;
	private int count=1;
	private boolean flag=false;

	private Lock lock=new ReentrantLock();
	private Condition condition_pro =lock.newCondition();
	private Condition condition_con =lock.newCondition();
					//lock的优点是支持多个相关的 condition 对象

	public  void set(String name) throws InterruptedException
	{
		lock.lock();
		try
		{
			while(flag)
				condition_pro.await();//await里面有抛出异常，这里没用catch，所以前面要函数要标识一下
			this.name=name+"------"+count++;
			System.out.println(Thread.currentThread().getName()+"...生产者。。。"+this.name);
			flag=true;
			//condition.signalAll();
			condition_con.signal();
		}
		finally
		{
			lock.unlock();//释放锁的动作一定要执行。
		}		
	}

	public  void out() throws InterruptedException
	{
		lock.lock();
		try
		{
			while(!flag)
				condition_con.await();
			System.out.println(Thread.currentThread().getName()+"...消费者-----"+this.name);
			flag=false;
			//condition.signalAll();//如果不加上All，程序会执行一会后，不动，全部锁死
			condition_pro.signal();
		}
		finally
		{
			lock.unlock();
		}		
	}
}
class Producer implements Runnable
{
	private Resource res;
	Producer(Resource res)
	{
		this.res=res;
	}
	public void run()
	{
		while (true)
		{
			
			try
			{
				res.set("+商品+");
			}
			catch (InterruptedException e)
			{
			}
		}
	}
}
class Consumer implements Runnable
{
	private Resource res;
	Consumer(Resource res)
	{
		this.res=res;
	}
	public void run()
	{
		while (true)
		{
			try
			{
				res.out();
			}
			catch (InterruptedException e)
			{
			}
		}
	}
}