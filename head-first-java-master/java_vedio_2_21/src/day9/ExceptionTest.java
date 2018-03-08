package day9;
/*���󣺱���ʦ�õ��� �Ͽ�
 ��ʼ˼���Ͽ��г��ֵ�����
 ���磺��������������ð��
 Ҫ�Զ��������������װ�ɶ���
 ��������ʦ���ε����⣬��ʱ�ƻ��޷����*/
class LanPingException extends Exception{
	LanPingException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
class MaoYanException extends Exception{
	 MaoYanException(String message) {
		// TODO Auto-generated constructor stub
		 super(message);
	}
}
class Computer{
	private int state =3;
	public void run() throws LanPingException,MaoYanException{
		if(state ==2){
			throw new LanPingException("������");
		}
		if(state ==3)
			throw new MaoYanException("ð����");
		System.out.println("��������");
	}
	public void reset(){
		state=1;
		System.out.println("��������");
	}
}
class NoPlanException extends Exception{
	NoPlanException(String message){
		super(message);
	}
}
class Teacher{
	private String name;
	private Computer cmpt;
	Teacher(String name) {
		this.name=name;
		cmpt=new Computer();
	}
	public void prelect() throws NoPlanException{
		try{
			cmpt.run();
		}
		catch (LanPingException e) {
			
			// TODO: handle exception
			cmpt.reset();
		}
		catch (MaoYanException e) {
			// TODO: handle exception
			test();
			throw new NoPlanException("��ʱ�޷�����");
		}
		System.out.println("����");
	}
	public void test(){
		System.out.println("��ϰ");
	}
}
public class ExceptionTest {
	public static void main(String[] args) {
		Teacher t=new Teacher("����ʦ");
		try{t.prelect();}
		catch (Exception e) {
			System.out.println("����ʦ���߷ż�");
			// TODO: handle exception
		}
	}
}
