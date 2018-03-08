package day5;
//面向对象，封装project

//注意，封装只是私有的一种表现形式。不私有也能封装。

//将age私有化,类以外建立了对象也不能直接访问
//但是人应该有年龄，就需要在Person类中提供对外访问age的方式
class Person {
	private int age;

	public void setAge(int a) {// 之所以对外提供访问方式，是因为可以控制传进来的数据，对访问的数据进行操作，提高代码的健壮性。
		if (a > 0 && a < 130)
			{age = a;
			speak();}
		else
			System.out.println("非法的年龄");
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
