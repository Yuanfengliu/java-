package day11;
class Test extends Thread{
//	private String name;
	Test(String name) {
		super(name);
		
	}
	public void run(){
		for(int x=0;x<60;x++){
			System.out.println(Thread.currentThread().getName()+"run.."+x);
		}
	}
}
public class ThreadTest {
	public static void main(String[] args) {
		Test t1=new Test("one");
		Test t2=new Test("two");
		t1.start();
		t2.start();
//		t1.run();
//		t2.run();
		for (int x=0;x<60;x++){
			System.out.println("main...."+x);
		}
	}
}
