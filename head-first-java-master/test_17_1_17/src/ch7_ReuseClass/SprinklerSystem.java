package ch7_ReuseClass;

//p126
class WaterSource {
	private String s;

	WaterSource() {
		// TODO Auto-generated constructor stub
		System.out.println("WaterSource()");
		s = "Constructed";
	}
}

public class SprinklerSystem {
	private String valve1, valve2, valve3, valve4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;

	public String toString() { // ??为什么不能用
		// 前面必须使用的是public
		return "valve1=" + valve1 + " " + "valve2=" + valve2 + " " + "valve3=" + valve3 + " " + "valve4=" + valve4 + " "
				+ "i=" + i + " " + "f=" + f + " " + "source=" + source;

	}

	public static void main(String[] args) {
		SprinklerSystem sprinklers = new SprinklerSystem();
		System.out.println(sprinklers);
	}

}
