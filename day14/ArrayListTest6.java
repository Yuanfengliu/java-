/*
ȥ��ArrayList�����е��ظ���Ԫ�ء�


*/
import java.util.*;
class ArrayListTest6 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		ArrayList al =new ArrayList();
		al.add("java01");
		al.add("java02");
		al.add("java01");
		al.add("java02");
		al.add("java01");
		al.add("java03");

		System.out.println(al);//ԭ��������

		al=singleElement(al);//�ı������
		System.out.println(al);
	}
	public static ArrayList singleElement(ArrayList al)
	{
		//����һ����ʱ������
		ArrayList newAl =new ArrayList();
		Iterator it =al.iterator();

		while (it.hasNext())
		{
			Object obj=it.next();

			if(!newAl.contains(obj))//newAl����û��objԪ�أ�����ӽ������ʱ������
				newAl.add(obj);
		}
		return newAl;
	}
}
