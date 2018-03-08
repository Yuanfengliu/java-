package day16_Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//查找字符串中字母出现的次数

public class MapTest2{
	public static void main(String[] args) {
//		System.out.println(" ");
		String str="adbsjkdbajkshdjkaa";
		char[] array0=str.toCharArray();
		TreeMap<Character, Integer> tm=new TreeMap<Character, Integer>();
		int count=0;
		for(int i=0;i<array0.length;i++)
		{	
			char c=array0[i];
			/*if(!tm.containsKey(c))
				tm.put(c, 1);
			else
				tm.put(c, tm.get(c)+1);*/
			Integer value=tm.get(c);
			if(value!=null)
				count=value;
			count++;
			tm.put(c, count);
			count=0;
		}
		System.out.println(tm);
		StringBuilder sb=new StringBuilder();
		Set<Map.Entry<Character, Integer>> entrySet=tm.entrySet();
		Iterator<Map.Entry<Character, Integer>> it=entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry<Character, Integer> me=it.next();
			char key=me.getKey();
			int value=me.getValue();
			sb.append(key+"("+value+")");
		}
		System.out.println(sb.toString());
	}
}
