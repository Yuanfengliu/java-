package day15_treeSet;

import java.util.*;

//练习：按照字符串长度排序
//字符串本身具有比较性，但是其比较性不是所需要的

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new StringLengthComparator());
		ts.add("abcd");
		ts.add("cc");
		ts.add("cba");
		ts.add("abce");
		ts.add("z");
		ts.add("hahaha");
		Iterator it=ts.iterator();
		while(it.hasNext())
		{
			String s=(String)it.next();
			System.out.println(s);
		}
	}
}
class StringLengthComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1=(String)o1;
		String s2=(String)o2;
		/*if(s1.length()>s2.length())
			return 1;
		if(s1.length()==s2.length())
			return 0;*/
		int num=new Integer((Integer)s1.length()).compareTo(new Integer((Integer)s2.length()));
		/*if(num==0)
		{
			if(!(s1.equals(s2)))
				num=1;
		}*/
		if(num==0)
			return s1.compareTo(s2);
		return num;
	}
}
