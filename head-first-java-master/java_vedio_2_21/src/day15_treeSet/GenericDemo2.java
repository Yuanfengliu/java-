package day15_treeSet;
import java.util.*;
public class GenericDemo2 {
	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>(new StrLengthComparator());
		ts.add("abcd");
		ts.add("cc");
		ts.add("cba");
		ts.add("aaa");
		ts.add("z");
		ts.add("hahaha");
		
		Iterator<String> it=ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
}	
}
class StrLengthComparator implements Comparator<String>
{
	public int compare(String o1,String o2)
	{
		int num=new Integer(o1.length()).compareTo(new Integer(o2.length()));
		if(num==0)
		{
			if(!o1.equals(o2))
				return o1.compareTo(o2);
		}
		return num;
	}

	/*@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return 0;
	}*/

	
}