/*
Map���ϣ��ü��ϴ洢��ֵ�ԡ�һ��һ������档����Ҫ��֤����Ψһ�ԡ�
1. ��ӡ� 
	put(K key,V value)
	putAll(Map<? extends k,? excends v>m)
2. ɾ����clear()  
3. �жϡ� 
	containsValue(Object value)
	containsKey(Object key)
4. ��ȡ��
	get(Object key)
	size()
	values()

	entrySet()
	keySet()

Map
	|--Map��Hashtable���ײ��ǹ�ϣ�����ݽṹ�����ܴ���null��nullֵ�����߳�ͬ���ġ�jdk1.0 Ч�ʵ�

	|--HashMap:�ײ��ǹ�ϣ�����ݽṹ������ʹ��null��nullֵ���ü����ǲ�ͬ���ġ�  jdk1.2 Ч�ʸ�

	|--TreeMap���ײ��Ƕ��������ݽṹ���̲߳�ͬ�����������ڸ�map�����еļ���������
���֣���Set������ʵSet�ײ����ʹ����Map���ϡ�


*/
import java.util.*;
class  MapDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Map<String,String> map=new HashMap<String,String>();
		//���Ԫ�أ�������������ͬ�ļ�ʱ����ô����ӵ�ֵ�Ḳ��ԭ�м���Ӧ��ֵ��
		//����������ӣ�map.put("01","feng 1");��ʱ����û��zhangfei 1������feng 1
		map.put("01","zhangfei 1");
		map.put("02","zhangfei 2");
		map.put("03","zhangfei 3");

		System.out.println("containsKey:"+map.containsKey("022"));
		//System.out.println("remove:   "+map.remove("02"));

		map.put("04",null);//��һ��Ԫ��
		System.out.println("get: "+map.get("01"));
		//����ͨ��get�����ķ���ֵ���ж�һ�����Ƿ���ڣ�ͨ������null���жϡ�
System.out.println("---------------");
		//��ȡmap���������е�ֵ��
		Collection<String> coll = map.values();
		System.out.println(coll);
		System.out.println("----------------");
		System.out.println(map);
		
	}
}
