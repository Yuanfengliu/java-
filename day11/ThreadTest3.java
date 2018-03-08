/*需求：
	简单的卖票程序；
	多个窗口同时卖票；

*/

class Ticket extends Thread
{
	private static int ticket=30;//static取消的话，发现：本来30张票，卖出120张。发现同一个位置，卖出4张票
								//但是发现static占用周期太长，并不适合。具体方法看下一文档
	public void run()
	{
		while (true)
		{
			if (ticket>0)
				System.out.println(Thread.currentThread().getName()+"---sale--- : "+ticket--);
		}
		
	}
}
class ThreadTest3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Ticket t1=new Ticket();
		Ticket t2=new Ticket();
		Ticket t3=new Ticket();
		Ticket t4=new Ticket();

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
