package day14;
import java.util.*;
public class VectorDemo {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("java01");
		v.add("java02");
		v.add("java03");
		v.add("java04");
		
		Enumeration en=v.elements();
		while (en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
	}
}
