package day6;
/*��̬����顣
��ʽ��
static{
	��̬������е�ִ�����
}
�ص㣺������ļ��ض�ִ�У�ִֻ��һ�Ρ���������������ִ��
���ڸ�����г�ʼ��*/

class StaticCode{
	static{
		System.out.println("a");
	}
	public static void show(){
		System.out.println("show run");
	}
}
public class StaticCodeDemo {
	static {
		System.out.println("b");
	}
	public static void main(String[] args){
		/*new StaticCode();
		new StaticCode();//�����ٴα�����
		System.out.println("over");*/
//		StaticCode.show();
		StaticCode staticCode=null;
	}
	
	static{
		System.out.println("c");
	}
}
