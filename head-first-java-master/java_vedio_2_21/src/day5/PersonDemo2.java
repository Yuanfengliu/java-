package day5;
/*���캯��
���캯����һ�㺯����д�����в�ͬ
���캯���ڶ���һ���������У�
��һ�㷽�����ڶ�����õ�ʱ������У��Ǹ�������Ӷ���߱��Ĺ��ܡ�
һ�������������췽������*/
class Person1{
	private String name;
	private int age;
	//��������
	/*���ã��������ʼ��������һ���������У����������ڹ��캯��ִ�С�
	�͹��캯��������
	���������Ǹ����еĶ����ʼ�������캯���Ǹ��ض��Ķ����ʼ����
	�������� �ж�����ǲ�ͬ�����Ե�����*/
	{
		System.out.println("Person code run.");
	}
	Person1(){
		System.out.println("name:"+name+"age:"+age);
	}
	Person1(String n){
		name=n;
		System.out.println("name:"+name+",age:"+age);
	}
	Person1(String n,int a){
		name=n;
		age=a;
		System.out.println("name:"+name+",age:"+age);
	}
	public String getName(){
		return name;
	}
	public void setName(String n){
		name=n;
	}
}
public class PersonDemo2 {
	public static void main(String[] args) {
		Person1 p=new Person1();
		System.out.println(p.getName());
		p.setName("����");
		System.out.println(p.getName());
		
		Person1 s=new Person1("Mike",24);
		
		Person1 sPerson1=new Person1("����");
	}
}
