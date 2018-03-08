/*
map���ϵ�����ȡ����ʽ��  

1. keySet����map�����еļ����뵽set���ϡ���Ϊset�߱���������
		���п��Ե�����ʽȡ�����еļ����ڸ���get��������ȡÿһ������Ӧ��ֵ��  
		
		map���ϵ�ȡ��ԭ������map����ת����set���ϡ���ͨ��������ȡ����

2. entrySet  
   Set<Map.Entry<K,V>> entrySet:��Map�����е�ӳ���ϵ������set�����У�
   �������ϵ���������;��ǣ�Map.entry����ʵEntryҲ��һ����ڣ�����Map�ӿ��е�һ���ڲ��ӿڡ�


*/
/*************��һ��ȡ����ʽ*******************/
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

		//�Ȼ�ȡmap���ϵ����м���set���ϣ�keyset������
		Set<String> keySet =map.keySet();

		//����Set���ϣ��Ϳ��Ի�ȡ���������
		Iterator<String> it =keySet.iterator();

		while (it.hasNext())
		{
			String key=it.next();
			//���˼�����ͨ��map���ϵ�get������ȡ���Ӧ��ֵ��
			String value =map.get(key);
			System.out.println("key: "+key+",value:"+value);
		}
	}
}
*/
/*************�ڶ���ȡ����ʽ*******************/

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

		//�Ȼ�ȡmap���ϵ����м���set���ϣ�
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