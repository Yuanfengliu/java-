package day9;
interface Inter{
	void method();
}
class Test{
	//������룬ͨ�������ڲ���
//	static class Inner implements Inter{public void method(){System.out.println("112");}}
	static Inter function(){
		return new Inter(){public void method(){System.out.println("11");}};
	}
}
public class InnerClassTest {
public static void main(String[] args) {
	//Test.function  Test������һ����̬��function
	//.method��function������������Ľ����һ�����󡣶�����һ��Inter���͵Ķ���
	//��Ϊֻ��Inter���͵Ķ���ſ��Ե���method����
	Test.function().method();
}
}
