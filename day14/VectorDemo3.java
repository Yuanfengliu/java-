/*
ö�پ���Vector���е�ȡ����ʽ��
����ö�ٺ͵���������
��ʵö�ٺ͵���ʱһ���ġ�

��Ϊö�ٵ������Լ����������ƶ�������
���Ա�������ȡ���ˡ�

*/
import java.util.*;
class VectorDemo3 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		Vector v =new Vector();

		v.add("java01");
		v.add("java02");
		v.add("java03");
		v.add("java04");
		
		Enumeration en = v.elements();

		while (en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}

	}
}