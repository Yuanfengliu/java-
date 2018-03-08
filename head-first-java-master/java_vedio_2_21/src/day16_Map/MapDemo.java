package day16_Map;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String, String>();
		map.put("01", "zhangsan1");
		map.put("02", "zhangsan2");
		map.put("03", "zhangsan3");
		//将map中的映射关系取出，存到set中
		Set<Map.Entry<String, String>> entrySet=map.entrySet();
		Iterator<Map.Entry<String, String>> it=entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry<String, String> me=it.next();
			String key=me.getKey();
			String value=me.getValue();
			System.out.println("key:"+key+"value:"+value);
		}
		System.out.println(map.containsKey("022"));
//		System.out.println(map.remove("03"));
/*		System.out.println(map.get("02"));
		System.out.println(map);
		Collection<String> coll=map.values();
		System.out.println(coll);*/
		Set<String> keySet=map.keySet();
		/*Iterator<String> it=keySet.iterator();
		while(it.hasNext())
		{
			String key=it.next();
			String value=map.get(key);
			System.out.println("key:"+key+"value:"+value);
		}*/
} 
}