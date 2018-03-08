package day7;
/*
 ���󣺻�ȡһ�γ������е�ʱ�䡣
 ԭ����ȡ����ʼ�ͽ�����ʱ�䲢���
 
��ȡʱ�䣺System.currentTimeMillis()
�������Ż��󣬾Ϳ��Խ���������⡣
���ַ�ʽ���Ű淽�����ģʽ*/
abstract class GetTime{
	public final void getTime(){
		long start=System.currentTimeMillis();
		runCode();
		long end=System.currentTimeMillis();
		System.out.println("���룺"+(end-start));
	}
	public abstract void  runCode();
	}

class SubTime extends GetTime{
	public void runCode(){
		for (int x=0;x<2000;x++){System.out.println(x);}
	}
}
public class TemplateDemo {
	public static void main(String[] args) {
		SubTime gt=new SubTime();
		gt.getTime();
	}
}
