/*
练习：按照字符串长度排序

字符串本身具备比较性，但是他的比较方式不是所需要的

这时就只能使用比较器


*/
import java.util.*;

class TreeSetDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		TreeSet ts=new TreeSet(new StrLenComparator());

		ts.add("abcd");
		ts.add("dd");
		ts.add("abc");
		ts.add("aaa");
		ts.add("z");
		ts.add("hahaha");

		Iterator it =ts.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
class StrLenComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1 =(String)o1;
		String s2 =(String)o2;
		
		/*
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()==s2.length())
			return 0;
	*/
		//上面注释的几行，可以简写成下面一行
	int num = new Integer(s1.length()).compareTo(new Integer(s2.length()));//主要条件
	if (num==0)//接下来三行是次要条件（即长度相同，按字母顺序排列）
	{
		return s1.compareTo(s2);
	}
	return num;

	}
	
}