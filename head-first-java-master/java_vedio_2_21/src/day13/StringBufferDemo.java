package day13;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("abc").append(true).append(34);
		sb.insert(1, "qq");
		sb.delete(1, 3);
//		sb.delete(0, sb.length());
		sb.deleteCharAt(2);
//		StringBuffer sb1=sb.append(34);
//		System.out.println(sb==sb1);
		System.out.println(sb.toString());
//		System.out.println(sb1.toString());
	}
}
