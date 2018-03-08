package day15_treeSet;
import java.util.*;
public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("abc01");
		al.add("abc02");
		al.add("abc03");
//		al.add(4);
		Iterator<String> it=al.iterator();
		
		while(it.hasNext())
		{
			String s=(String)it.next();
			System.out.println(s);
		}
	}
}
