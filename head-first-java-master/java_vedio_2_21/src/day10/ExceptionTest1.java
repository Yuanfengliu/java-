package day10;
/*
��һ��Բ�κͳ����Ρ�
�����Ի�ȡ������������������ַǷ�����ֵ����Ϊ�ǻ�ȡ����������⡣
����ͨ���쳣����ʾ�������������л������*/
class NoValueException extends RuntimeException{
	NoValueException(String message){
		super(message);
	}
}
interface Shape{
	void getArea();
}
class Rec implements Shape {
	private int len,wid;
	Rec(int len,int wid) {//throws NoValueException
		/*if(len<=0|| wid<=0){
			System.out.println("����");
		}
		else{
		this.len=len;
		this.wid=wid;
		}*/
		if(len<=0 || wid<=0)
			throw new NoValueException("���ַǷ�ֵ");
	
		this.len=len;
		this.wid=wid;
		
	}
	public void getArea(){System.out.println(len*wid);}
}

class Circle implements Shape{
	private int radius;
	public static final double PI=3.14;
	Circle(int radius) {
		if(radius<=0)
			throw new NoValueException("���ַǷ�ֵС��0");
		this.radius=radius;
	}
	public void getArea(){
		System.out.println(radius*radius*PI);
	}
}
public class ExceptionTest1 {
	public static void main(String[] args) {
//		Rec r=new Rec(-4, 5);
//		r.getArea();
		Circle c=new Circle(-2);
		System.out.println("over");
		/*try{
			
		}
		catch (NoValueException e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}*/
		
	}
}
