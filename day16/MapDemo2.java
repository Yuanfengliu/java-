/*
map集合的两种取出方式：  

1. keySet：将map中所有的键存入到set集合。因为set具备迭代器。
		所有可以迭代方式取出所有的键，在根据get方法。获取每一个键对应的值。  
		
		map集合的取出原理：将map集合转换成set集合。在通过迭代器取出。

2. entrySet  
   Set<Map.Entry<K,V>> entrySet:将Map集合中的映射关系存入了set集合中，
   而这个关系的数据类型就是：Map.entry。其实Entry也是一个借口，它是Map接口中的一个内部接口。


*/
/*************第一种取出方式*******************/
/*
import java.util.*;
class MapDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Map<String,String> map=new HashMap<String,String>();

		map.put("01","zhangfei 1");
		map.put("02","zhangfei 2");
		map.put("03","zhangfei 3");
		map.put("04","zhangfei 4");

		//先获取map集合的所有键的set集合，keyset（）；
		Set<String> keySet =map.keySet();

		//有了Set集合，就可以获取其迭代器。
		Iterator<String> it =keySet.iterator();

		while (it.hasNext())
		{
			String key=it.next();
			//有了键可以通过map集合的get方法获取其对应的值。
			String value =map.get(key);
			System.out.println("key: "+key+",value:"+value);
		}
	}
}
*/
/*************第二种取出方式*******************/

import java.util.*;
class MapDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Map<String,String> map=new HashMap<String,String>();

		map.put("01","zhangfei 1");
		map.put("02","zhangfei 2");
		map.put("03","zhangfei 3");
		map.put("04","zhangfei 4");

		//先获取map集合的所有键的set集合，
		Set<Map.Entry<String,String>> entrySet =map.entrySet();

		Iterator<Map.Entry<String,String>> it =entrySet.iterator();

		while (it.hasNext())
		{
			Map.Entry<String,String> me =it.next();
			
			String key=me.getKey();
			
			String value =me.getValue();
			System.out.println(key+":  "+value);
		}
	}
}