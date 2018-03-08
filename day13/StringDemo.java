class StringDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		String s1="abc";//s1是一个类类型变量，“abc”是一个对象
						//字符串最大的特点：一旦被初始化就不可以被改变

		String s2=new String("abc");
		String s3="abc";

//s1和s2有什么区别？
//s1在内存中有一个对象。
//s2在内存中有两个对象。（这里是new和sbc）

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));//String类复写了object类中equals方法，该方法用于判断字符串是否相同
										//这里s1和s2里指向的对象的比较，都是abc
		//结果：false true
	
		System.out.println(s1==s3);	//答案是true,建立对象时，发现有这个abc对象，就和s1一起指向这个对象
	}
}
