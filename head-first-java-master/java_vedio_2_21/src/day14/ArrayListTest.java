package day14;
//ȥ��ArrayList�е��ظ�Ԫ��
import java.util.*;
public class ArrayListTest {
	
		public static void main(String[] args) {
			ArrayList a1=new ArrayList();
			a1.add("java01");
			a1.add("java02");
			
			a1.add("java01");
			a1.add("java04");
			a1.add("java01");
			a1.add("java03");
			System.out.println(a1);
			a1=singleElement2(a1);
			System.out.println(a1);
			
		}
		public static ArrayList singleElement2(ArrayList a)
		{
			//����һ����ʱ����
			ArrayList newA=new ArrayList();
			Iterator it=a.iterator();
			while(it.hasNext()){
				Object obj=it.next();
				if(!newA.contains(obj))
				{
					newA.add(obj);
				}
			}
			return newA;
		}
	}
