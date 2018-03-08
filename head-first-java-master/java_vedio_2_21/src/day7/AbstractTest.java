package day7;
/**
 对员工进行建模，员工包含三个属性：姓名，工号以及工资，经理也是员工，除了员工的属性外，另外还有一个奖金属性。
 请使用继承的思想设计初员工类和经理类。要求类中提供必要的方法进行属性访问 */
abstract class Employee{
	private String name;
	private String id;
	private double pay;
	
	Employee(String name,String id,double pay) {
		this.name=name;
		this.id=id;
		this.pay=pay;
	}	
	public abstract void work();
}
class Manager extends Employee{
	private int bonus;
	Manager(String name,String id,double pay,int bonus) {
		super(name, id, pay);
		this.bonus=bonus;
		// TODO Auto-generated constructor stub
	}
	public void work(){System.out.println("manager work");}
}
class Pro extends Employee{
	Pro(String name,String id,double pay) {
		super(name, id, pay);
		// TODO Auto-generated constructor stub
	}
	public void work(){System.out.println("Pro work");}
}
public class AbstractTest {
	public static void main(String[] args) {
		
	}
}
