package day18_others;

import java.util.*;

public class SystemDemo {
	public static void main(String[] args) {
		Properties prop=System.getProperties();
		System.setProperty("myKey", "myValue");
		String value1=System.getProperty("os.name");
		System.out.println(value1);
		for(Object obj:prop.keySet())
		{
			String value =(String)prop.get(obj);
			System.out.println("obj:"+obj+" value:"+value);
		}
	}
}
