package thinking_in_java_ch5;

class Rock2{
	Rock2(int i){
		System.out.println("Rock "+i+" ");
	}
}
public class SimpleConstractor2 {
	public static void main(String[] args){
		for (int j=0;j<8;j++)
			new Rock2(j);
	}
}
