package day5;
//������󣬷�װproject

//ע�⣬��װֻ��˽�е�һ�ֱ�����ʽ����˽��Ҳ�ܷ�װ��

//��age˽�л�,�����⽨���˶���Ҳ����ֱ�ӷ���
//������Ӧ�������䣬����Ҫ��Person�����ṩ�������age�ķ�ʽ
class Person {
	private int age;

	public void setAge(int a) {// ֮���Զ����ṩ���ʷ�ʽ������Ϊ���Կ��ƴ����������ݣ��Է��ʵ����ݽ��в�������ߴ���Ľ�׳�ԡ�
		if (a > 0 && a < 130)
			{age = a;
			speak();}
		else
			System.out.println("�Ƿ�������");
	}

	public int getAge() {
		return age;
	}

	void speak() {
		System.out.println("age=" + age);
	}
}

public class PersonDemo {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(25);
		
	}
}
