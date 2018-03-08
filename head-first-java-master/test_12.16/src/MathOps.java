import java.util.*;

public class MathOps {
	public static void main(String[] args){
//		System.out.println("hello world");
		Random rand =new Random(47);
		int i,j,k;
		System.out.println("11");
		j=rand.nextInt(100)+1;
		System.out.println("j: "+j);

		k=rand.nextInt(100)+1;
		System.out.println("k: "+k);
		i=j+k;
		System.out.println("j+k: "+i);
		i=j-k;
		System.out.println("j-k:"+i);
		i=j*k;
		System.out.println("j*k: "+i);
		
	}
}
