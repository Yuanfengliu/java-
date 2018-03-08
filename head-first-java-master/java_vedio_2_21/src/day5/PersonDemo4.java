package day5;
//this语句：用于构造函数间互相调用
//this语句只能放在构造函数的第一行
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
