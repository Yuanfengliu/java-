package day9;
/*异常*/
class Demo{
	int div(int a ,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException//在功能上通过throws关键字声明了该功能可能会出现问题
	{	
		int[] arr=new int[a];
		System.out.println(arr[4]);
		return a/b;
	}
}
public class ExceptionDemo{
	public static void main(String[] args){
		Demo d=new Demo();
		try{
		int x=d.div(5, 0);
		System.out.println("x="+x);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("haha"+e.toString());
		}
		/*catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e.toString());
			System.out.println("被0除了");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.toString());
			System.out.println("角标越界");
		}*/
		/*catch (Exception e) {
			// TODO: handle exception
			System.out.println("除了0");
			System.out.println(e.getMessage());// / by zero
			System.out.println(e.toString());
		}*/
		System.out.println("over");
	}
}
