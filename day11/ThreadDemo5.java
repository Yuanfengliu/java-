/*

���߳����г��ְ�ȫ�����ԭ��  
	����������ڲ���ͬһ���̹߳�������ʱ��һ���̶߳Զ������ִֵ����һ���֣���û��ִ���꣬��һ���̲߳���ִ�С����¹������ݵĴ���  

����취��
	�Զ��������������ݵ���䣬ֻ����һ���̶߳�ִ���ꡣ��ִ�й����У������̲߳����Բ���ִ�С�

java���ڶ��̵߳İ�ȫ�����ṩ��רҵ�Ľ����ʽ��  

����ͬ������顣

synchronized������
	{
		��Ҫ��ͬ���Ĵ���
	}  

������ͬ�������������߳̿�����ͬ����ִ�С�û�г��������̼߳�ʹ��ȡcpu��ִ��Ȩ��Ҳ����ȥ����Ϊû�л�ȡ����  

ͬ����ǰ�᣺  

1. ����Ҫ���������������ϵ��̡߳�  
2. �����Ƕ���߳�ʹ��ͬһ����  
3. ���뱣֤ͬ����ֻ����һ���߳������С�  
   
   �ô�������˶��̵߳İ�ȫ���⡣  
   �׶ˣ�����߳���Ҫ�ж�������Ϊ������Դ��

*/

class Ticket implements Runnable
{
	private  int tick=100;
	Object 	obj=new Object();
	public void run()
	{
		while (true)
		{
			synchronized (obj)
			{		if (tick>0)
					{
						try
						{
							Thread.sleep(1);//��1ms
						}
						catch (Exception e)
						{
						}
						System.out.println(Thread.currentThread().getName()+"---sale--- : "+tick--);
						//�����һ����ʲô��ִ�нϿ죬����ֻ�ж���0�������ж���0����3
					}
			}
		}		
	}
}
class ThreadDemo5 
{
	public static void main(String[] args) 
	{
		Ticket t=new Ticket();

		Thread t1=new Thread(t);//����һ������
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		Thread t4=new Thread(t);

//		System.out.println("Hello World!");
//		Ticket t1=new Ticket();
//		Ticket t2=new Ticket();
//		Ticket t3=new Ticket();
//		Ticket t4=new Ticket();

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
