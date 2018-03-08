package day17_tool;

import java.util.*;
class strReverseComparator implements Comparator<String>
{
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
public class CollectionsDemo3 {
	public static void main(String[] args) {
		orderDemo();
	}
	public static void orderDemo()
	{
		TreeSet<String> ts=new TreeSet<String>(Collections.reverseOrder());
		ts.add("abcde");
		ts.add("aaa");
		ts.add("kkk");
		ts.add("ccc");
		Iterator<String> it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	public static void shuffleDemo()
	{

	}
}

