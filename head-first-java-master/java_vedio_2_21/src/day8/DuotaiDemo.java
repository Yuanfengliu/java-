package day8;
/*
 ���è����*/
abstract class Animal{
	public abstract void eat();
}
class Cat extends Animal{
	public void eat(){System.out.println("����");}
	public void catchMouse(){System.out.println("ץ����");}
}
class Dog extends Animal{
	public void eat(){System.out.println("�Թ�ͷ");}
	public void kanjia(){System.out.println("����");} 
}
class Pig extends Animal{
	public void eat(){System.out.println("������");}
	public void gongDi(){System.out.println("����");}
}
public class DuotaiDemo {
	public static void main(String[] args) {
//		Cat c=new Cat();
//		Cat c1=new Cat();
//		function(c1);
//		c.eat();
//		Dog d=new Dog();
//		d.eat();
	Animal c=new Cat();
	function(c);
	}
	public static void function(Animal c){
		c.eat();
	}
	
}
