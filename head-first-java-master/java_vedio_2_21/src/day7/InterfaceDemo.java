package day7;

interface Inter {
	public static final int NUM = 3;

	public abstract void show();
}
interface InterA{
	public abstract void method();
}
class Demo00{
	public void function(){}
}
class SubInter extends Demo00 implements Inter,InterA{
	public void show(){}
	public void method(){}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		SubInter t=new SubInter();
		System.out.println(t.NUM);
		System.out.println(SubInter.NUM);
		System.out.println(Inter.NUM);
	}	
}
