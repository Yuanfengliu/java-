/*
|--Set��Ԫ��������ģ������ظ���
	|--HashSet���ײ����ݽṹ�ǹ�ϣ��
		HashSet����α�֤Ԫ�ص�Ψһ�Ե��أ�
		��ͨ��Ԫ�ص�����������hashCode��equals����ɡ�
		���Ԫ�ص�HashCodeֵ��ͬ���Ż��ж�equals�Ƿ�Ϊtrue��
		���Ԫ�ص�hashCode��ͬ�������ж�equals��
	|--TreeSet:���Զ�set�����е�Ԫ�ؽ������򡣣���Ȼ������
				�ײ����ݽṹ�Ƕ�������
				��֤Ԫ��Ψһ�Ե����ݡ�
				comparaTo����return 0������0  ���ǱȽϽ������ͬ����˼��ֻ����һ�����ݣ�
				������67-81��ע�͵�������return 1;�������ǴӴ�С�����У����������������ţ�
			
			TreeSet���еĵ�һ�ַ�ʽ����Ԫ������߱��Ƚ��ԡ�
			Ԫ����Ҫʵ��Comparable�ӿڣ�����compareTO������
			���ַ�ʽҲ��ΪԪ�ص���Ȼ˳�򣬻��߽���Ĭ��˳��

			TreeSet����ĵڶ��ַ�ʽ��
			��Ԫ�������߱��Ƚ���ʱ�����߾߱��ıȽ��Բ�������Ҫ�ġ�
			��ʱ����Ҫ�ü�������߱��Ƚ��ԡ�
			�ڼ��ϳ�ʼ��ʱ�������˱ȽϷ�ʽ��



����
��Treeset�����д洢�Զ������ѧ����
�밴��ѧ���������������

��ס������ʱ������Ҫ������ͬʱ��һ���ж�һ�´�Ҫ��������������73�У�
*/
import java.util.*;
class  TreeSetDemo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");

		TreeSet ts =new TreeSet();

		ts.add(new Student("nba02",22));
		ts.add(new Student("nba03",20));
		ts.add(new Student("nba07",24));
		ts.add(new Student("nba05",24));
				//������ǰ�����˳�����У�����Ȼ˳������
		Iterator it =ts.iterator();
		while(it.hasNext())
		{
			//System.out.println(it.next());
			Student stu =(Student)it.next();
			System.out.println(stu.getName()+"..."+stu.getAge());
		}
	}
}
class Student implements Comparable//�ýӿ�ǿ����ѧ���߱��Ƚ���
{

	private String name;
	private int age;

	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public int compareTo(Object obj)
	{
		if(!(obj instanceof Student))
			throw new RuntimeException("����ѧ������");
		Student s=(Student)obj;

		System.out.println(this.name+".....compareto........"+s.name);
		
		if(this.age>s.age)
			return 1;
		if(this.age==s.age)
		{
			return this.name.compareTo(s.name);
			//return 0;//ע����һ�к�ע����һ��Ч����һ�����������¿���
		}
			
		return -1;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}