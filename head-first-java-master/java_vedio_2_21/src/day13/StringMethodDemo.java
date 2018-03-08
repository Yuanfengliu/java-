package day13;

public class StringMethodDemo {
	public static void method_split(){
		String s="zhangsan,lisi,wangwu";
		String[] arr=s.split(",");
		for(int i=0;i<arr.length;i++){System.out.println(arr[i]);}
	}
	public static void method_replace(){
		String s="sdaksjhd";
		String s1=s.replace('s', 'a');
		System.out.println(s1);
	}
	public static void method_trans(){
		char[] arr={'a','b','c','d','e','f'};
		String str=new String(arr,1,3);
		sop(str);
		String s1="hdkjahsdk";
		char[] chs=s1.toCharArray();
		for (int i=0;i<chs.length;i++){System.out.println(chs[i]);}
	}
	public static void method_is(){
		String str="ArrayDemo.java";
		
		sop(str.startsWith("Array"));
		sop(str.endsWith("java"));
		sop(str.contains("Demo"));
		
	}
	public static void method_get(){
		String str="abcdeakpf";
		sop(str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf('m',3));//
		System.out.println(str.lastIndexOf('a'));//´ÓÓÒÍù×ó²éÕÒ
	}
	public static void main(String[] args) {
		method_split();
		//method_trans();//
		//method_is();
		//method_get();
/*		String s1="abc";
		String s2=new String("abc");
		String s3="abc";
		System.out.println(s1==s2);
		System.out.println(s1==s3);*/
	}
	public static void sop(Object obj){
		System.out.println(obj);
	}
}
