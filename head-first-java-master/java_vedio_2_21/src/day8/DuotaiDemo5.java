package day8;
/*
需求：
电脑运行实例，电脑运行基于主板*/
/*class MainBoard{
	public void run(){System.out.println("MainBoard run");}
	public void useNetCard(NetCard c){
		c.open();
		c.close();
	}
}
class NetCard{
	public void open(){System.out.println("netcard open");}
	public void close(){System.out.println("netcard close");}
}*/

interface Pci{
	public void open();
	public void close();
}
class MainBoard{
	public void run(){System.out.println("mainboard run");}
	public void usePci(Pci p){//接口型引用指向自己的子类对象
		if(p!=null){
		p.open();
		p.close();
		}
	}
}
class NetCard implements Pci{
	public void open(){System.out.println("netcard open");}
	public void close(){System.out.println("netcard close");
	}
	}
	
public class DuotaiDemo5 {
	public static void main(String[] args) {
		MainBoard mb=new MainBoard();
		mb.run();
		mb.usePci(null);
		mb.usePci(new NetCard());
	}
}
