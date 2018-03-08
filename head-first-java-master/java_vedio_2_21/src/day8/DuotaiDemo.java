package day8;
/*
 动物，猫，狗*/
abstract class Animal{
	public abstract void eat();
}
class Cat extends Animal{
	public void eat(){System.out.println("吃鱼");}
	public void catchMouse(){System.out.println("抓老鼠");}
}
class Dog extends Animal{
	public void eat(){System.out.println("吃骨头");}
	public void kanjia(){System.out.println("看家");} 
}
class Pig extends Animal{
	public void eat(){System.out.println("吃饲料");}
	public void gongDi(){System.out.println("拱地");}
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
