/*
LinkedList���з���������������˼�Ϳ��Զ���
addFirst()
addLast()

getFirst()
getLast()
��ȡԪ�أ����ǲ�ɾ��Ԫ�ء�

removeFirst()
removeLast() 
��ȡԪ�أ�����Ԫ�ر�ɾ�������������û��Ԫ�أ������NoSuchElementException

JDK1.6���������������

offerFrist();
offerLast();

peekFirst();
peekLast();
��ȡԪ�أ����ǲ�ɾ��Ԫ�ء����������û��Ԫ�أ��᷵��null��

poolFirst(); 
poolLast(); 
��ȡԪ�أ�����Ԫ�ر�ɾ�������������û��Ԫ�أ��᷵��null��

��ջ���Ƚ����  

���У� �Ƚ��ȳ� FIFO  

List�����ж�Ԫ���Ƿ���ͬ�����ݵ���Ԫ�ص�equals������


*/
import java.util.*;
class LinkedListDemo4
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		LinkedList link =new LinkedList();

		link.add("java01");
		link.add("java02");
		link.add("java03");
		link.add("java04");

		System.out.println(link.removeFirst());
		System.out.println("size="+link.size());
	}
}
