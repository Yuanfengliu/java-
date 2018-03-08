package day9;


class Demo5 {
	int div(int a, int b)
	{
		/*if(b<0)
			throw new FuShuException("出现了除数是负数的情况",b);//手动通过throw关键字抛出一个
		// int[] arr=new int[a];
		// System.out.println(arr[4]);
*/		
		if(b<0)
			throw new ArithmeticException("被0除了");
		return a / b;
	}
}

public class ExceptionDemo5 {
	public static void main(String[] args) {
		Demo5 d=new Demo5();
		int x=d.div(4, 5);
		System.out.println("x="+x);
		System.out.println("over");
		/*try
		{
			int x=d.div(4, -1);
			System.out.println("x="+x);
		}
		catch (FuShuException e) {
			// TODO: handle exception
			System.out.println(e.toString());
//			System.out.println("出现负数了");
			System.out.println("错误的负数是："+e.getValue());
		}*/
	}
}
