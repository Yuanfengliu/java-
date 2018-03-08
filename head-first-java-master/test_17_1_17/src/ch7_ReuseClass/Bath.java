package ch7_ReuseClass;

//变量的四种初始化
//在定义对象的地方，在类的构造器中，正要使用这些对象之前，使用实例初始化
class Soap {
	private String s;

	Soap() {
		System.out.println("Soap()");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}

}

public class Bath {
	private String s1 = "Happy", s2 = "Happy", s3, s4;
	private Soap castille;
	private int i;
	private float toy;

	public Bath() {
		// TODO Auto-generated constructor stub
		System.out.println("Inside Bath()");
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}

	// 变量初始化
	{
		i = 47;
	}

	public String toString() {
		if (s4 == null)
			s4 = "Joy";
		return "s1=" + s1 + "\n" + "s2=" + s2 + "\n" + "s3=" + s3 + "\n" + "s4=" + s4 + "\n" + "i=" + i + "\n" + "toy="
				+ toy + "\n" + "castille=" + castille + "\n";

	}

	public static void main(String[] args) {
		Bath b = new Bath();
		System.out.println(b);
	}
}
