package day13;
//½«×Ö·û´®·´×ª
public class StringTest2 {
	public static String myStringReverse(String s){
		char[] s1=s.toCharArray();
		char[] s2=s.toCharArray();
		for(int i=0;i<s1.length;i++){
			s1[i]=s2[s2.length-i-1];
			}
		return new String(s1);
	}
	public static void main(String[] args) {
		String s="abcdefg";
		System.out.println(s);
		String s1=myStringReverse(s);
		System.out.println(s1);
	}
}
