class  ShuZu
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//int[] arr=new int[2];//也可以这样 int arr[]=new int[2];
		//int[] arr=new int[]{3,2,4,5,6};//注意[]内长度就不要写了
		int[] arr={3,2,4,5,6};//数据明确的情况下，用这种。7,8行一样的
		System.out.println(arr[2]);
		//使用数组中有一个属性可以直接获取到数组元素的个数。length
		//使用方式：数组名称.length=
		System.out.println("length:"+arr.length);
		for (int x=0;x<5 ;x++ )
		{
			System.out.println("arr["+x+"]="+arr[x]+";");
		}
		printArray(arr);
	}
	public static void printArray(int[] arr)//创建打印数组的函数
	{	System.out.print("{");
		for (int x=0;x<arr.length ;x++ )
		{	
			if (x!=arr.length-1)//前面四个有逗号
				System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"}");//最后一个没有逗号！
		}
	}
}