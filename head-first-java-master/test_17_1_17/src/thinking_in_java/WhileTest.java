package thinking_in_java;

public class WhileTest {
	static boolean condition(){
		boolean result=Math.random()<0.1;
		System.out.println(result+".");
		return result;
	}
	
	public static void main(String []args){
		while(condition())
			System.out.println("Inside 'while'");
		System.out.println("Exited 'while'");
	}
}
