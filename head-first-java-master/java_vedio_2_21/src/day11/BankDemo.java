package day11;
class Bank{
	private int sum;
	Object obj=new Object();
	public synchronized void add(int n ){
//		synchronized (obj) {
			sum=sum+n;
			try{Thread.sleep(10);}catch (Exception e) {
				// TODO: handle exception
				
			}
			
			System.out.println("sum="+sum);
//		}
		
	}
}
class Cus implements Runnable{
	private Bank b=new Bank();
	public void run(){
		for (int x=0;x<3;x++){
			b.add(100);
		}
	}
}
public class BankDemo {
	public static void main(String[] args) {
		Cus c=new Cus();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
	}
}
