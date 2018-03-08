/*
JDK1.5之后出现的新特性，用于解决安全问题，是一个安全机制。

好处：  
1. 将运行时期出现问题转移到编译时期，便于程序员解决。  
2. 避免了强制转换的麻烦。  
 
 泛型格式：通过<>来定义要操作的引用数据类型  
 
 在使用java提供的对象时，什么时候写泛型？  
 答：通常在集合框架中很常见，只要见到<>就要定义泛型。 其实<>就是用来接收类型的。
 当使用集合时，将集合中的要存储的数据类型放到<>中即可。  

*/
import java.util.*;
class GenericDemo3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		ArrayList<String> al =new ArrayList<String>();

		al.add("abc01");
		al.add("abc021");
		al.add("abc0341");
		//al.agg(4);
		Iterator<String> it=al.iterator();
		while (it.hasNext())
		{
			String s=it.next();
			System.out.println(s+" : "+s.length());
		}
	}
}
