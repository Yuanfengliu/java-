package day5;
//this��䣺���ڹ��캯���以�����
//this���ֻ�ܷ��ڹ��캯���ĵ�һ��
class Person4{
	private String name;
	private int age;
	Person4(String name){
		this.name=name;
	}
	Person4(String name,int age){
		this(name);
		this.age=age;
	}
}
public class PersonDemo4 {
	public static void main(String[] args) {
		Person4 p=new Person4("Lisi",20);
	}
}
