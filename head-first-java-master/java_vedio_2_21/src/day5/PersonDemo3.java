package day5;
//问题未解决
class Person3{
	private String name;
	private int age;
	
	Person3(int age ) {
		this.age=age;
	}

	Person3(String name){ //变量名起的没有意义，可读性非常差
		this.name=name;//局部变量和成员变量一样了，局部中有就在局部中使用，没有的话就在成员变量中找,将局部的值赋给成员变量，引出了this关键字
		//this:看上去，是用于区分局部变量和成员变量同名的情况
		/*this到底代表的是什么
		this：就代表本类的对象，到底代表哪一个呢？
		this代表它所在函数所在对象的引用
		简单说：哪个对象在调用this所在的函数，this就代表哪个对象*/
		/*this的应用：当定义类中的功能时，该函数内部要用到调用该函数的对象时，这时用this表示这个对象
		 */
		
	}
	Person3(String name,int age){
		this.name=name;
		this.age=age;
	}
	void speak(){
		System.out.println("name="+this.name+",age="+this.age);
		this.show();
	}
	void show(){
		System.out.println(this.name);
	}
	/*需求：给人定义一个比较年龄是否相同的功能，也就是是否是同龄人
	 但凡本类功能用了*/
	public boolean compare(Person3 p){//把年龄所属的对象传进来
		return this.age==p.getAge();
		
	}
	public int getAge(){
		return this.age;
	}
}
public class PersonDemo3 {
	public static void main(String[] args) {
		/*Person3 p1=new Person3("Lisi",24);
		Person3 p2=new Person3("Lisi",2);
		p1.speak();
		p2.speak();*/
		Person3 p1=new Person3(20);
		Person3 p2=new Person3(25);
		
		boolean b=p1.compare(p2);
		System.out.println(b);
}
}
