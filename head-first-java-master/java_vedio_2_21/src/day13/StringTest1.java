package day13;
//ȥ���ַ���ǰ��Ŀո�
public class StringTest1 {
	public static String myTrim(String str){
		int start=0,end=str.length()-1;
		while(start<=end&& str.charAt(start)==' ')
			start++;
		while(start<=end&& str.charAt(end)==' ')
			end--;
		return str.substring(start, end-1);
	}
	public static void main(String[] args) {
		String s="   abs  sdjklsj    ";
		System.out.println(s);
		String s1=myTrim(s);
		System.out.println(s1);
	}
}
