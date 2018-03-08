package ch7_ReuseClass;

class Art{
	Art() {
		// TODO Auto-generated constructor stub
		{System.out.println("Art constructor");}
	}
}
class Drawing extends Art{
	Drawing() {
		// TODO Auto-generated constructor stub
		{System.out.println("Drawing constructor");}
	}
}
public class Cartoon extends Drawing{
	public Cartoon(){System.out.println("Cartoon constructor");}
	public static void main(String[] args){
		Cartoon x=new Cartoon();
	}
}
/*output:
	Art constructor
	Drawing constructor
	Cartoon constructor
	从最高层开始,由基类向外扩散
	*/
