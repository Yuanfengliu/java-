/*
����
������һ����⡣
��2�������ֱ��300Ԫ��ÿ��100����3�Ρ�   ��2���ܹ���600��

Ŀ�ģ��ó����Ƿ��а�ȫ���⣬����У���ν����

��������⣺
1����ȷ��Щ�����Ƕ��߳����д��롣
2����ȷ�������ݡ�
3����ȷ���߳����д�������Щ����ǲ����������ݵ�

ͬ�����������õ���this�� 
������Ҫ��������á���ô��������һ�������������á�����this��
����ͬ������ʹ�õ�����this��

����ͨ����Ʊ����Ľ�����֤��
һ���߳���ͬ��������С�
һ���߳���ͬ�������С�
����ִ����Ʊ������

���ͬ����������̬���κ�ʹ�õ�����ʲô�أ�
ͨ����֤�����ֲ�����this����Ϊ��̬������Ҳ�����Զ���this��

��̬���ڴ�ʱ���ڴ���û�б�����󣬵���һ���и����Ӧ���ֽ��ļ�����
����.class �ö����������class

��̬ͬ��������ʹ�õ����Ǹ÷�����������ֽ����ļ�����  ����.class 


*/
class Bank
{
	private int sum;
//	Object obj=new Object();
	public synchronized void add(int n)
	{
//		synchronized(obj)  ��//ͬ��������ͬ���������һ������˼�����϶��д�����ͬ����������������ͬ��ͬ����������Ҫ������ע�͵���䡣
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
