package day6;
/*��Ҫ��֤����Ψһ��
1. Ϊ�˱�������������ཨ����������ȿ��ƽ�ֹ�����������������
2. ��Ϊ��������������Է��ʸ������ֻ���ڱ����У��Զ���һ������
3. Ϊ�˷�������������Զ������ķ��ʣ����Զ����ṩһЩ���ʷ�ʽ

��������ô����
1. �����캯��˽�л�
2. �����д���һ���������
3. �ṩһ���������Ի�ȡ���ö���

���������ô����������ô����
����Ҫ������Ķ���֤���ڴ���Ψһʱ���ͽ����ϵ��������ϼ���*/
class Single{
	private Single(){}
	private static Single s=new Single();
	public static Single getInstance(){
		return s;
	}
}
public class SingleDemo {
	public static void main(String[] args) {
//		Single ss=Single.getInstance();
		Student s1=Student.getStudent();
		s1.setAge(23);
		Student s2=Student.getStudent();
		System.out.println(s2.getAge());
	}
}

class Student{
	private int age;
	private Student(){}
	private static Student s=new Student();
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){return age;}
	public static Student getStudent(){return s;}
}
