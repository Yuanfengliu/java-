package day14;
import java.util.*;
public class CollectionDemo {
	public static void main(String[] args) {
		method_get();
	}
	public static void method_get(){
		ArrayList al=new ArrayList();
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
//		System.out.println(al1);
//		Iterator it=al.iterator();//��ȡ������������ȡ�������е�Ԫ��
		for(Iterator it=al.iterator();it.hasNext();)
			System.out.println(it.next());
	}
	public static void method_2(){
		ArrayList al1=new ArrayList();
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");
		ArrayList al2=new ArrayList();
		al2.add("java01");
		al2.add("java02");
		al2.add("java05");
		al2.add("java06");
		al1.retainAll(al2);
		System.out.println("al1="+al1);
		System.out.println("al2="+al2);
	}
	public static void baseMethod(){
		//����һ������������ʹ��collection�ӿڵ�����
				ArrayList a1=new ArrayList();
				
				//1.���Ԫ��
				a1.add("java01");//add(Object obj)
				a1.add("java02");
				a1.add("java03");
				a1.add("java04");
				System.out.println(a1);
				//2.��ȡ���������ϵĳ���
				System.out.println(a1.size());
				//ɾ��Ԫ��
//				a1.remove("java02");
//				a1.clear();
				System.out.println(a1);
				//4.�ж�Ԫ��
				System.out.println("java03�Ƿ����"+a1.contains("java03"));
				System.out.println("�����Ƿ�Ϊ��"+a1.isEmpty());
	}
	
}
