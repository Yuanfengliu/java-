package day15_treeSet;
import java.util.*;
class Demo<T>
{
	public void show(T t)
	{
		System.out.println("show()"+t);
	}
	public <Q> void print(Q q)
	{
		System.out.println("print()"+q);
	}
	public static <T> void method(T t)
	{
		System.out.println("method:"+t);
	}
}
public class GenericDemo4 {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.show("haha");
		d.print("heng");
		d.show(new Integer(4));
		Demo.method("kaishi");
	}
}
