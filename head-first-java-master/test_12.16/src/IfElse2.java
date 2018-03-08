
public class IfElse2 {
	static int test(int testval,int target){
		if (testval>target)
			return +1;
		else if (testval<target)
			return -1;
		else
			return 0;
	}
	public static void main(String[] args){
		System.out.println(test(1, 5));
		System.out.println(test(2, 1));
		System.out.println(test(2, 2));
	}
}
