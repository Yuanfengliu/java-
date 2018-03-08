package day15_treeSet;
interface Inter<T>
{
	void show(T t);
}
class InterPle <T>implements Inter<T>
{

	@Override
	public void show(T t) 
	{
		// TODO Auto-generated method stub
		System.out.println("show:"+t);
	}
	public <S> void print(S s)
	{
		System.out.println("print:"+s);
	}
	
}
public class GenericDemo5 {
	public static void main(String[] args) {
		InterPle<Integer> ip=new InterPle<Integer>();
//		ip.show("haha");
		ip.show(6);
	}
}
