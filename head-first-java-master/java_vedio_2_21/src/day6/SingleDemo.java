package day6;
/*想要保证对象唯一。
1. 为了避免其他程序过多建立该类对象。先控制禁止其他程序建立该类对象
2. 还为了让其他程序可以访问该类对象，只好在本类中，自定义一个对象
3. 为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式

这三步怎么做？
1. 将构造函数私有化
2. 在类中创建一个本类对象
3. 提供一个方法可以获取到该对象

对事物该怎么描述，还怎么描述
当需要对事物的对象保证在内存中唯一时，就将以上的三步加上即可*/
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
