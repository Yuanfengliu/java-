package day9;
/*�쳣*/
class Demo{
	int div(int a ,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException//�ڹ�����ͨ��throws�ؼ��������˸ù��ܿ��ܻ��������
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
			System.out.println("��0����");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e.toString());
			System.out.println("�Ǳ�Խ��");
		}*/
		/*catch (Exception e) {
			// TODO: handle exception
			System.out.println("����0");
			System.out.println(e.getMessage());// / by zero
			System.out.println(e.toString());
		}*/
		System.out.println("over");
	}
}
