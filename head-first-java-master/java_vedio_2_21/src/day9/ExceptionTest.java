package day9;
/*需求：毕老师用电脑 上课
 开始思考上课中出现的问题
 比如：电脑蓝屏，电脑冒烟
 要对对象进行描述，封装成对象
 出现了老师讲课的问题，课时计划无法完成*/
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
			throw new LanPingException("蓝屏了");
		}
		if(state ==3)
			throw new MaoYanException("冒烟了");
		System.out.println("电脑运行");
	}
	public void reset(){
		state=1;
		System.out.println("电脑重启");
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
			throw new NoPlanException("课时无法继续");
		}
		System.out.println("讲课");
	}
	public void test(){
		System.out.println("练习");
	}
}
public class ExceptionTest {
	public static void main(String[] args) {
		Teacher t=new Teacher("毕老师");
		try{t.prelect();}
		catch (Exception e) {
			System.out.println("换老师或者放假");
			// TODO: handle exception
		}
	}
}
