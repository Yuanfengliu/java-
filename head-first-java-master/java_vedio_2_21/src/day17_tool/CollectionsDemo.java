package day17_tool;

import java.util.*;

public class CollectionsDemo {
	public static void main(String[] args) {
//		maxDemo();
		binarySerchDemo();
	}
	public static void maxDemo()
	{
		List<String> list=new ArrayList<String>();
		list.add("abcd");
		list.add("aaa");
		list.add("z");
		list.add("kkkkkkk");
		list.add("qqq");
		list.add("z");
		System.out.println(list);
		String max=Collections.max(list,new StrLenComparator());
		System.out.println(max);
	}
	public static void binarySerchDemo()
	{
		List<String> list=new ArrayList<String>();
		list.add("abcd");
		list.add("aaa");
		list.add("z");
		list.add("kkkkkkk");
		list.add("qqq");
		list.add("z");
		Collections.sort(list);
		System.out.println(list);
		int index=Collections.binarySearch(list,"z");
		System.out.println(index);
	}
	
}
class StrLenComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		return new Integer(s1.length()).compareTo(new Integer(s2.length()));
	}
}
