/*需求：
	简单的卖票程序；
	多个窗口同时卖票；

创建线程的第二种方式：实现Runable接口 
步骤：  
	1. 定义类实现Runable接口  
	2. 覆盖Runable接口中的run方法。  （将线程要运行的代码存放到该run方法中）
	3. 通过Thread类建立线程对象。  
	4. 将Runable接口的子类对象作为实际参数传递给Thread类的构造函数。
	（  为什么要将Runnable接口的子类对象传递给Thread的构造函数？
		自定义的run方法所属的对象时Runable接口的子类对象。所以要让线程去指定对象的run方法，就必须明确该run方法所属的对象）  
	5. 调用Thread类的start方法开启线程并调用Runable接口子类的run方法。

实现方式和继承方式有什么区别呢？  

实现方式：避免了单继承的局限性。
在定义线程时，建议使用实现方式。  

两种方式的区别：  
继承Thread：线程代码存放在Thread子类的run方法中。  
实现Runable：线程代码存在接口的子类的run方法中。

多线程运行出现安全问题的原因：  
	当多条语句在操作同一个线程共享数据时，一个线程对多条语句值执行了一部分，还没有执行完，另一个线程参与执行。导致共享数据的错误。  

解决办法：
	对多条操作共享数据的语句，只能让一个线程都执行完。在执行过程中，其他线程不可以参与执行。

java对于多线程的安全问题提供了专业的解决方式。  

就是同步代码块。

synchronized（对象）
	{
		需要被同步的代码
	}  

对象如同锁。持有锁的线程可以在同步中执行。没有持有锁的线程即使获取cpu的执行权，也进不去，因为没有获取锁。  

同步的前提：  

1. 必须要有两个或两个以上的线程。  
2. 必须是多个线程使用同一个锁  
   3必须保证同步中只能有一个线程在运行。  
   好处：解决了多线程的安全问题。  
   弊端：多个线程需要判断锁，较为消耗资源。

*/

class Ticket implements Runnable
{
	private  int tick=30;//static取消的话，发现：本来30张票，卖出120张。发现同一个位置，卖出4张票
							//但是发现static占用周期太长，并不适合。具体方法看下一文档
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

		Thread t1=new Thread(t);//创建一个对象
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
