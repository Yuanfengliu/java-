package day15_treeSet;
import java.util.*;
class Student2
{
	
}
class Worker
{
	
}
class Tool
{
	private Object obj;
	public void setObject(Object obj)
	{
		this.obj=obj;
	}
	public Object getObject()
	{
		return obj;
	}
}
class ToolTest<QQ>
{
	private QQ q;
	public void setObject(QQ q)
	{
		this.q=q;
	}
	public QQ getObject(){
		return q;
	}
}
public class GenericDemo3 {
	public static void main(String[] args) {
		ToolTest<Worker> t=new ToolTest();
		t.setObject(new Worker());
		System.out.println(t.getObject());
}	
}


	/*@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}*/

