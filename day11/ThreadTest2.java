/*��ϰ�����������̣߳������߳̽�������


ԭ���̶߳����Լ�Ĭ�ϵ����ơ�Thread-��ţ��ñ�Ŵ�0��ʼ��  

static Thread currentThread()����ȡ��ǰ�̶߳���  
getName()����ȡ�߳�����  

�����߳����ƣ�setName���߹��캯����

*/
class Test extends Thread
{
	//private String name;
	Test(String name)
	{
	//	this.name=name;
		super(name);
	}
	public void run()
	{
		for (int x=0;x<60 ;x++ )
			//System.out.println(name+" run"+x);//name�ĳ�this.getName()����Ч��//����������Դ�API�����п�֪
			System.out.println(Thread.currentThread().getName()+" run"+x);//����ȡ��ע��14��7��23�У���ע��18��24�У���������һ�ַ�����Ч��
	}																	//����Thread.currentThread()=this
}
class ThreadTest2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Test t1=new Test("one");
		Test t2=new Test("two");
		t1.start();
		t2.start();
		for (int x=0;x<60 ;x++ )
			System.out.println("main..."+x);
	}
}