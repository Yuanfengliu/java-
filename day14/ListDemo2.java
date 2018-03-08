/*
collection
	|--List��Ԫ��������ģ�Ԫ�ؿ����ظ�����Ϊ�ü�����ϵ��������
		|--ArrayList:�ײ�����ݽṹʹ�õ�������ṹ���ص㣺��ѯ�ٶȿ졣������ɾ�������̲߳�ͬ����
		|--LinkedList:�ײ�ʹ�õ����������ݽṹ���ص㣺��ɾ�ٶȺܿ죬��ѯ������
		|--Vector:�ײ�������ṹ���ص㣺��ɾ����ѯ����������ArrayList�������
								�߳�ͬ���������̲߳���ʱ���κ�һ�����̵ĸı�Ҳ�������Ľ�����Ӱ�죩��
	|--Set��Ԫ��������ģ������ظ���

List�����з��������ǿ��Բ����Ǳ�ķ������Ǹ���ϵ���еķ�����  
����
	add(index,element); 
	addAll(index,collection);
ɾ��
	remove(index)
�ģ�
	set(index,element);
�飺
	get(index)
	subList(from,to)
	listIterator(); 

List�������еĵ�������ListIterator��Iterator���ӽӿڡ�

�ڵ���ʱ��������ͨ�����϶���ķ������������е�Ԫ�ء�
��Ϊ�ᷢ��ConcurrentModificationException�쳣���������쳣��

���ԣ��ڵ�����ʱ��ֻ���õ������ķ�������Ԫ�أ�����Iterator���������޵ģ�ֻ�ܶ�Ԫ�ؽ����жϣ�ȡ����ɾ���Ĳ�����
�����Ҫ�����Ĳ�������ӣ��޸ĵȣ�����Ҫʹ�����ӽӿڣ�ListIterator��  
�ýӿ�ֻ��ͨ��List���ϵ�ListIterator������ȡ�������ǰ�ԭ����Iterator it=al.iterator();-->���ɣ�ListIterator it=al.ListIterator();  ���ɣ�

*/
import java.util.*;
class ListDemo2 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		ArrayList al =new ArrayList();

		//���Ԫ��
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");

		//��ӡԭ����
		System.out.println("ԭ�����ǣ� "+al);

		//��ָ��λ�����Ԫ��
		al.add(1,"java09");
		System.out.println("��Ӻ󼯺��ǣ�"+al);

		//ɾ��ָ��Ԫ��
		al.remove(2);
		System.out.println(al);

		//�޸�Ԫ��
		al.set(2,"java007");

		//ͨ���Ǳ��ȡԪ��
		System.out.println("get(1)�ǣ�"+al.get(1));
		System.out.println(al);

System.out.println("-----------------------------------");
		//��ȡ����Ԫ��
		for (int x=0;x<al.size();x++ )
		{
			System.out.println("al("+x+")="+al.get(x));
		}

		Iterator it=al.iterator();//��ȡ������������ȡ�������е�Ԫ�ء�//���治�ܽ���ɾ���Ȳ������������ֲ����쳣
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

		//ͨ��indexOf��ȡ�����λ��
		System.out.println("index="+al.indexOf("java04"));//��û�з���-1
		List sub =al.subList(1,3);//����ͷ��������β
		System.out.println("sub="+sub);
	}
}
