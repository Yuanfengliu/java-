package day14;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		//���Ԫ��
		a1.add("java01");
		a1.add("java02");
		a1.add("java03");
		System.out.println("ԭ�����ǣ�"+a1);
		a1.add(1,"java09");
		System.out.println("��Ӻ�"+a1);
		a1.set(2, "java07");
		System.out.println("�޸ĺ�"+a1);
		for (int i=0;i<a1.size();i++)
			System.out.println(a1.get(i));
		Iterator it=a1.iterator();
		//������
		//�ڵ��������У�׼����ӻ���ɾ��Ԫ��
//		for (Iterator it=a1.iterator();it.hasNext();)
//			System.out.println(it.next());
		while(it.hasNext())
		{
			Object obj=it.next();
			if(obj.equals("java09"))
				it.remove();
			System.out.println(obj);
		}
		System.out.println(a1);
		ListIterator li=a1.listIterator();
		System.out.println(a1);
		while(li.hasNext())
		{
			Object obj=li.next();
			if(obj.equals("java07"))
				li.set("java009");
		}
		System.out.println(a1);
	}
	
}
