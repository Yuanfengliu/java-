/*
静态的应用：

每一个应用程序中都有共性的功能
可以将这些功能进行抽取，独立封装。
以便复用。
*/

class Demo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int[] arr={3,4,1,8,13};
		
		/******这些是没有静态时，建立对象调用
		ArrayTool tool=new ArrayTool();//调用了另一个ArrayTool文件，即使不在同一个文档里也可以调用。
		int max=tool.getMax(arr);
		System.out.println("max="+max);

		int min=tool.getMin(arr);
		System.out.println("min="+min);
		
		tool.printArray(arr);//排序前
		tool.selectSort(arr);
		tool.printArray(arr);//排序后
		*/

		int max=ArrayTool.getMax(arr);
		System.out.println("max="+max);
	}	
}


