package day11;
class Demo extends Thread{
	public void run(){
		for(int x=0;x<60;x++){
		System.out.println("Demo run"+x);
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		Demo d=new Demo();//创建了一个线程
		d.start();
		for (int x=0;x<60;x++){
			System.out.println("Hello world"+x);
		}
	}
}
