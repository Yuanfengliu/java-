/*
��ϰ��
��sdfajksfjkfjadbafh����ȡ���ַ����е���ĸ���ֵĴ�����

ϣ����ӡ�����a(1)c(2)......

ͨ�����֣�ÿһ����ĸ���ж�Ӧ�Ĵ�����
˵����ĸ�ʹ���֮�䶼��ӳ���ϵ��

ע���ˣ���������ӳ���ϵʱ������ѡ��map���ϡ�
��Ϊmap�����д�ŵľ���ӳ���ϵ��  

ʲôʱ��ʹ��map���ϣ�
������֮�����ӳ���ϵʱ����Ҫ����map����

˼·��
1�����ַ���ת�����ַ����顣��ΪҪ��ÿһ����ĸ���в�����
2������һ��map���ϣ���Ϊ��ӡ�������ĸ��˳������ʹ��treemap����
3�������ַ�����
	��ÿһ����ĸ��Ϊ��ȥ��map���ϡ�
	�������null��������ĸ��1���뵽map������ȥ
	������صĲ���null��˵������ĸ��map�����Ѿ����ڲ��ж�Ӧ������
	��ô�ͻ�ȡ�ô���������������Ȼ�����ĸ�������Ĵ������뵽map�����У����ǵ���ԭ��������Ӧ��ֵ��
4����map�����е����ݱ��ָ�����ַ�����ʽ���ء�
*/
import java.util.*;
class  MapTest5
{
	public static void main(String[] args) 
	{
		System.out.println("---------Hello World!---------");
		String s =charCount("sdfajksfjkfjadbafh");
		System.out.println(s);
	}
	public static String charCount(String str)
	{
		char[] chs =str.toCharArray();
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();

		int count =0;
		for (int x=0;x<chs.length ;x++ )
		{
			if(!(chs[x]>='a'&&chs[x]<='z'|| chs[x]>='A'&&chs[x]<='z'))//��ֹ���ַ���ͳ��
				continue;
			Integer value=tm.get(chs[x]);
			if(value!=null)//�ж��Ƿ��Ѿ�ͳ�ƹ���ֵ
				count=value;
			count++;
			tm.put(chs[x],count);
			count=0;
			
/*
			if (value==null)
			{
				tm.put(chs[x],1);
			}
			else
			{
				value =value+1;
				tm.put(chs[x],value);
			}
*/
		}
		System.out.println(tm);
		

		StringBuilder sb =new StringBuilder();
		Set<Map.Entry<Character,Integer>> entrySet =tm.entrySet();
		Iterator<Map.Entry<Character,Integer>> it =entrySet.iterator();

		while (it.hasNext())
		{
			Map.Entry<Character,Integer> me =it.next();
			Character ch =me.getKey();
			Integer value =me.getValue();
			sb.append(ch+"("+value+")");
		}
		return sb.toString();
	}
}