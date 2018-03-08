package day14;
import java.util.*;
public class CollectionDemo {
	public static void main(String[] args) {
		method_get();
	}
	public static void method_get(){
		ArrayList al=new ArrayList();
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
//		System.out.println(al1);
//		Iterator it=al.iterator();//获取迭代器，用于取出集合中的元素
		for(Iterator it=al.iterator();it.hasNext();)
			System.out.println(it.next());
	}
	public static void method_2(){
		ArrayList al1=new ArrayList();
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");
		ArrayList al2=new ArrayList();
		al2.add("java01");
		al2.add("java02");
		al2.add("java05");
		al2.add("java06");
		al1.retainAll(al2);
		System.out.println("al1="+al1);
		System.out.println("al2="+al2);
	}
	public static void baseMethod(){
		//创建一个集合容器，使用collection接口的子类
				ArrayList a1=new ArrayList();
				
				//1.添加元素
				a1.add("java01");//add(Object obj)
				a1.add("java02");
				a1.add("java03");
				a1.add("java04");
				System.out.println(a1);
				//2.获取个数，集合的长度
				System.out.println(a1.size());
				//删除元素
//				a1.remove("java02");
//				a1.clear();
				System.out.println(a1);
				//4.判断元素
				System.out.println("java03是否存在"+a1.contains("java03"));
				System.out.println("集合是否为空"+a1.isEmpty());
	}
	
}
