/*
stop �����Ѿ���ʱ��

���ֹͣ�̣߳�
ֻ��һ�ַ�����

���������
���̴߳��ڶ���״̬
�Ͳ����ȡ����ǣ���ô�߳̾Ͳ��������

��û��ָ���ķ�ʽ�ö�����ָ̻߳�������״̬ʱ����ʱ��Ҫ�Զ�����������
ǿ�����ָ̻߳�������״̬�����������Ϳ��Բ���������߳̽�����

Thread ���ṩ�÷��� interrupt();

join:
��A�߳�ִ�е���B�̵߳�.join()����ʱ��A�ͻ�ȴ�����B�̶߳�ִ���꣬A�Ż�ִ�С�

join����������ʱ�����߳�ִ�С�

getName()
toString()�����Է���  �߳��������ȼ����߳������Ϣ�������38��41��getName()�ĸĳ�toString()�����ڽ���п�����
*/

class StopThread implements Runnable
{
	private boolean flag=true;
	public synchronized void run()
	{
		while(flag)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				System.out.println(Thread.currentThread().toString()+".....Exception");
				flag=false;
			}
			System.out.println(Thread.currentThread().toString()+"....run");
		}
	}
	public void changeFlag()
	{
		flag=false;
	}
}
class StopThreadDemo4 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		StopThread st =new StopThread();
		
		Thread t1=new Thread(st);
		Thread t2=new Thread(st);
		
		t1.start();
		t1.setPriority(Thread.MAX_PRIORITY);//�����ȼ��������Ĭ����5�������10
		t2.start();

		int num=0;
		while (true)
		{
			if (num++ == 60)
			{
				//st.changeFlag();
				t1.interrupt();
				t2.interrupt();

				break;
			}
			System.out.println(Thread.currentThread().getName()+"......."+num);
		}
		System.out.println("over");
	}
}