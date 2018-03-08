package ch5_cleanup;

class Rock2{
	public Rock2(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Rock"+i+" ");
	}
}
public class SimpleConstructor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			new Rock2(i);
		}
	}

}
