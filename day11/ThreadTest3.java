/*����
	�򵥵���Ʊ����
	�������ͬʱ��Ʊ��

*/

class Ticket extends Thread
{
	private static int ticket=30;//staticȡ���Ļ������֣�����30��Ʊ������120�š�����ͬһ��λ�ã�����4��Ʊ
								//���Ƿ���staticռ������̫���������ʺϡ����巽������һ�ĵ�
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
