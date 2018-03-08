class HanShu
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int x;
		boolean c;
		x=get(4);
		System.out.println(x);
		c=compare(3,5);
		System.out.println(c);
	}
	//当函数运算时，没有具体的返回值时，这是返回值类型用一个特殊的关键字来标识。
	//该关键字就是void，void：代表的是函数没有具体的返回值的情况。
	//当函数的返回值类型是void时，函数中return语句可以省略不写。
	public static int get(int num)// public 可以删除；int代表返回值类型；
		{							//这个调用函数必须在这个类里面，上面和下面都可以
			return num*3+5;
		}
	public static boolean compare(int a,int b)//比较两个数是否相等
											//这里有三种方法
	{/*
		if (a==b)
			return true;
		//else
			return false;
	  */
	  //return (a==b)?true:false
		return a==b;

	}
}
	
