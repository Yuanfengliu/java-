package day17_tool;

public class ParaMethodDemo {
	public static void main(String[] args) 
	{
		show(3,4);
	}
/*	public static void show(int a,int b)
	{
		System.out.println(a+","+b);
	}*/
	public static void show(int... arr)
	{
		System.out.println(arr);
	}
}
