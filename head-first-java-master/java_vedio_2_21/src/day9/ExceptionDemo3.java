package day9;

class FuShuException extends Exception{
	private int value;
	FuShuException() {
		super();
		// TODO Auto-generated constructor stub
	}
	FuShuException(String msg,int value){
		super(msg);
		this.value=value;
	}
	public int getValue(){
		return value;
	}
/*	private String msg;
	FuShuException(String msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}
	public String getMessage(){return msg;}*/
}
class Demo3 {
	int div(int a, int b) throws FuShuException
	{
		if(b<0)
			throw new FuShuException("�����˳����Ǹ��������",b);//�ֶ�ͨ��throw�ؼ����׳�һ��
		// int[] arr=new int[a];
		// System.out.println(arr[4]);
		return a / b;
	}
}

public class ExceptionDemo3 {
	public static void main(String[] args) {
		Demo3 d=new Demo3();
		try
		{
			int x=d.div(4, -1);
			System.out.println("x="+x);
		}
		catch (FuShuException e) {
			// TODO: handle exception
			System.out.println(e.toString());
//			System.out.println("���ָ�����");
			System.out.println("����ĸ����ǣ�"+e.getValue());
		}
	}
}
