/*
Map集合：该集合存储键值对。一对一对往里存。而且要保证键的唯一性。
1. 添加。 
	put(K key,V value)
	putAll(Map<? extends k,? excends v>m)
2. 删除。clear()  
3. 判断。 
	containsValue(Object value)
	containsKey(Object key)
4. 获取。
	get(Object key)
	size()
	values()

	entrySet()
	keySet()

Map
	|--Map：Hashtable：底层是哈希表数据结构，不能存入null键null值，是线程同步的。jdk1.0 效率低

	|--HashMap:底层是哈希表数据结构，允许使用null键null值，该集合是不同步的。  jdk1.2 效率高

	|--TreeMap：底层是二叉树数据结构。线程不同步。可以用于给map集合中的键进行排序。
发现：和Set很像，其实Set底层就是使用了Map集合。


*/
import java.util.*;
class  MapDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Map<String,String> map=new HashMap<String,String>();
		//添加元素（如果出现添加相同的键时，那么后添加的值会覆盖原有键对应的值）
		//比如这里添加：map.put("01","feng 1");这时，就没有zhangfei 1，是由feng 1
		map.put("01","zhangfei 1");
		map.put("02","zhangfei 2");
		map.put("03","zhangfei 3");

		System.out.println("containsKey:"+map.containsKey("022"));
		//System.out.println("remove:   "+map.remove("02"));

		map.put("04",null);//加一个元素
		System.out.println("get: "+map.get("01"));
		//可以通过get方法的返回值来判断一个键是否存在，通过返回null来判断。
System.out.println("---------------");
		//获取map集合中所有的值。
		Collection<String> coll = map.values();
		System.out.println(coll);
		System.out.println("----------------");
		System.out.println(map);
		
	}
}
