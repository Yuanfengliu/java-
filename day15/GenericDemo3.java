/*
JDK1.5֮����ֵ������ԣ����ڽ����ȫ���⣬��һ����ȫ���ơ�

�ô���  
1. ������ʱ�ڳ�������ת�Ƶ�����ʱ�ڣ����ڳ���Ա�����  
2. ������ǿ��ת�����鷳��  
 
 ���͸�ʽ��ͨ��<>������Ҫ������������������  
 
 ��ʹ��java�ṩ�Ķ���ʱ��ʲôʱ��д���ͣ�  
 ��ͨ���ڼ��Ͽ���кܳ�����ֻҪ����<>��Ҫ���巺�͡� ��ʵ<>���������������͵ġ�
 ��ʹ�ü���ʱ���������е�Ҫ�洢���������ͷŵ�<>�м��ɡ�  

*/
import java.util.*;
class GenericDemo3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		ArrayList<String> al =new ArrayList<String>();

		al.add("abc01");
		al.add("abc021");
		al.add("abc0341");
		//al.agg(4);
		Iterator<String> it=al.iterator();
		while (it.hasNext())
		{
			String s=it.next();
			System.out.println(s+" : "+s.length());
		}
	}
}
