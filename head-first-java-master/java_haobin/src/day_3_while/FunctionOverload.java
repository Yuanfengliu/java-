package day_3_while;

public class FunctionOverload {

	// 定义一个加法运算，获取两个整数的和
	public static int add(int x, int y) {
		return x + y;
	}

	// 定义一个加法运算，获取三个整数的和
	public static int add(int x, int y, int z) {
		return x + y + z;
	}

	public static void main(String[] args) {
		System.out.println(add(1, 2));
		System.out.println(add(1, 2, 3));
	}
}
