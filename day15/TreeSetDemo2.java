/*
��ϰ�������ַ�����������

�ַ��������߱��Ƚ��ԣ��������ıȽϷ�ʽ��������Ҫ��

��ʱ��ֻ��ʹ�ñȽ���


*/
import java.util.*;

class TreeSetDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		TreeSet ts=new TreeSet(new StrLenComparator());

		ts.add("abcd");
		ts.add("dd");
		ts.add("abc");
		ts.add("aaa");
		ts.add("z");
		ts.add("hahaha");

		Iterator it =ts.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
class StrLenComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1 =(String)o1;
		String s2 =(String)o2;
		
		/*
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()==s2.length())
			return 0;
	*/
		//����ע�͵ļ��У����Լ�д������һ��
	int num = new Integer(s1.length()).compareTo(new Integer(s2.length()));//��Ҫ����
	if (num==0)//�����������Ǵ�Ҫ��������������ͬ������ĸ˳�����У�
	{
		return s1.compareTo(s2);
	}
	return num;

	}
	
}