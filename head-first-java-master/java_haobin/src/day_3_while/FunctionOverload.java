package day_3_while;

public class FunctionOverload {

	// ����һ���ӷ����㣬��ȡ���������ĺ�
	public static int add(int x, int y) {
		return x + y;
	}

	// ����һ���ӷ����㣬��ȡ���������ĺ�
	public static int add(int x, int y, int z) {
		return x + y + z;
	}

	public static void main(String[] args) {
		System.out.println(add(1, 2));
		System.out.println(add(1, 2, 3));
	}
}
