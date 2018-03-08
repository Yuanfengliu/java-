/*
���ڶ�������ߺ������ߡ�
ΪʲôҪ����while�жϱ�ǡ�
ԭ���û����ߵ��߳���һ���жϱ�ǡ�

Ϊʲô����notifyAll
��Ϊ��Ҫ���ѶԷ��̡߳���Ϊֻ��notify�����׳���ֻ���ѱ����̵߳���������³��򶼵ȴ���
��ԭ����notify����ʱ���ǻ����̳߳ص�һ���ȴ����ˣ�

JDK1.5���ṩ�˶��߳��������������
��ͬ��synchronized�滻����ʵLock������
��Object�е�wait��notify��notifyAll�滻Condition����
�ö������Lock�������л�ȡ��
�ڸ�ʾ���У�ʵ���˱���ֻ���ѶԷ�������
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
					//lock���ŵ���֧�ֶ����ص� condition ����

	public  void set(String name) throws InterruptedException
	{
		lock.lock();
		try
		{
			while(flag)
				condition_pro.await();//await�������׳��쳣������û��catch������ǰ��Ҫ����Ҫ��ʶһ��
			this.name=name+"------"+count++;
			System.out.println(Thread.currentThread().getName()+"...�����ߡ�����"+this.name);
			flag=true;
			//condition.signalAll();
			condition_con.signal();
		}
		finally
		{
			lock.unlock();//�ͷ����Ķ���һ��Ҫִ�С�
		}		
	}

	public  void out() throws InterruptedException
	{
		lock.lock();
		try
		{
			while(!flag)
				condition_con.await();
			System.out.println(Thread.currentThread().getName()+"...������-----"+this.name);
			flag=false;
			//condition.signalAll();//���������All�������ִ��һ��󣬲�����ȫ������
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
				res.set("+��Ʒ+");
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