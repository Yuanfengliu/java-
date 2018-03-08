/*
集合框架的工具类。
Collections:

*/
import java.util.*;
class  CollectionsDemo
{
	public static void main(String[] args) 
	{
		System.out.println("---Hello World!----");
		sortDemo();
	}
	public static void sortDemo()
	{
		List<String> list =new ArrayList<String>();

		list.add("abcd");
		list.add("aaa");
		list.add("z");
		list.add("qq");
		list.add("kkkkk");
		list.add("zz");

		System.out.println(list);

		//Collection.sort(list);
		Collections.sort(list,new StrLenComparator());

		System.out.println(list);

		String max =Collections.max(list);//找出自然顺序最大的
		System.out.println("max="+max);

		String max1 =Collections.max(list,new StrLenComparator());//找出最大长度的那个字符串
		System.out.println("max1="+max1);
	}
}
class StrLenComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()<s2.length())
			return -1;
		return s1.compareTo(s2);
	}
}
