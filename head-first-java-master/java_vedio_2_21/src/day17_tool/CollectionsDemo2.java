package day17_tool;

import java.util.*;

public class CollectionsDemo2 {
	public static void main(String[] args) {
//		maxDemo();
		replaceAllDemo();
	}
	public static void replaceAllDemo()
	{
		List<String> list=new ArrayList<String>();
		list.add("abcd");
		list.add("aaa");
		list.add("z");
		list.add("kkkkkkk");
		System.out.println(list);
		Collections.replaceAll(list, "aaa", "bbb");
		System.out.println(list);
	}
	public static void fillDemo()
	{
		List<String> list=new ArrayList<String>();
		list.add("abcd");
		list.add("aaa");
		list.add("z");
		list.add("kkkkkkk");
		System.out.println(list);

		Collections.fill(list, "pp");
		System.out.println(list);
	}
	
}

