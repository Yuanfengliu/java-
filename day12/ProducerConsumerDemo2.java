/*
���ڶ�������ߺ������ߡ�
ΪʲôҪ����while�жϱ�ǡ�
ԭ���û����ߵ��߳���һ���жϱ�ǡ�

Ϊʲô����notifyAll
��Ϊ��Ҫ���ѶԷ��̡߳���Ϊֻ��notify�����׳���ֻ���ѱ����̵߳���������³��򶼵ȴ���
��ԭ����notify����ʱ���ǻ����̳߳ص�һ���ȴ����ˣ�
*/

class ProducerConsumerDemo2 
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
	public synchronized void set(String name)
	{
		while(flag)
			try{this.wait();}catch(Exception e){}
		this.name=name+"------"+count++;
		System.out.println(Thread.currentThread().getName()+"...�����ߡ�����"+this.name);
		flag=true;
		this.notifyAll();
	}
	public synchronized void out()
	{
		while(!flag)
				try{wait();}catch(Exception e){}
		System.out.println(Thread.currentThread().getName()+"...������-----"+this.name);
		flag=false;
		this.notifyAll();
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
			res.set("+��Ʒ+");
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
			res.out();
		}
	}
}