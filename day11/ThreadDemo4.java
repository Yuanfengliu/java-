/*����
	�򵥵���Ʊ����
	�������ͬʱ��Ʊ��

�����̵߳ĵڶ��ַ�ʽ��ʵ��Runable�ӿ� 
���裺  
	1. ������ʵ��Runable�ӿ�  
	2. ����Runable�ӿ��е�run������  �����߳�Ҫ���еĴ����ŵ���run�����У�
	3. ͨ��Thread�ཨ���̶߳���  
	4. ��Runable�ӿڵ����������Ϊʵ�ʲ������ݸ�Thread��Ĺ��캯����
	��  ΪʲôҪ��Runnable�ӿڵ�������󴫵ݸ�Thread�Ĺ��캯����
		�Զ����run���������Ķ���ʱRunable�ӿڵ������������Ҫ���߳�ȥָ�������run�������ͱ�����ȷ��run���������Ķ���  
	5. ����Thread���start���������̲߳�����Runable�ӿ������run������

ʵ�ַ�ʽ�ͼ̳з�ʽ��ʲô�����أ�  

ʵ�ַ�ʽ�������˵��̳еľ����ԡ�
�ڶ����߳�ʱ������ʹ��ʵ�ַ�ʽ��  

���ַ�ʽ������  
�̳�Thread���̴߳�������Thread�����run�����С�  
ʵ��Runable���̴߳�����ڽӿڵ������run�����С�

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
   3���뱣֤ͬ����ֻ����һ���߳������С�  
   �ô�������˶��̵߳İ�ȫ���⡣  
   �׶ˣ�����߳���Ҫ�ж�������Ϊ������Դ��

*/

class Ticket implements Runnable
{
	private  int tick=30;//staticȡ���Ļ������֣�����30��Ʊ������120�š�����ͬһ��λ�ã�����4��Ʊ
							//���Ƿ���staticռ������̫���������ʺϡ����巽������һ�ĵ�
	public void run()
	{
		while (true)
		{
			if (tick>0)
				System.out.println(Thread.currentThread().getName()+"---sale--- : "+tick--);
		}		
	}
}
class ThreadDemo4 
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
