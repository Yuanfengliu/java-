class ShuZu5 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		toHex(60);
		System.out.println("");//换行
		toHex2(60);
	}
	/*
	0 1 2 3 4 5 6 7 8 9 A  B  C  D  E  F	==十六进制的元素
	0 1 2 3 4 5 6 7 8 9 10 11 12 12 13 15
	查表法：将所有的元素临时存储起来，建立对应关系。
	每一次&15后的值作为索引去查建立好的表，就可以找到对应的元素。
	这样比  -10+‘a'简单的多。

	这个表怎么建立呢?
	可以通过数据的形式来定义。

	发现终于出结果了，但是是反着的想要正过来呢？可以通过StringBuffer reverse功能完成。
	但是这个工具我们还没有学习。

	所以可以使用已学过的容器：数组来完成存储。
	
	*/
	public static void toHex(int num)
	{
		//定义一个临时容器
		char[] arr=new char[8];
		char[] chs={'0','1','2','3'
					,'4','5','6','7'
					,'8','9','A','B'
					,'C','D','E','F'};
		for (int x=0;x<8 ;x++ )
		{
			int temp=num&15;
			//System.out.println(chs[temp]);
			arr[x]=chs[temp];
			num=num>>>4;
		}
		//存储数据的ARR数据遍历。
		for (int x=arr.length-1;x>=0 ;x-- )
		{
			System.out.print(arr[x]+",");
		}
	}


/*不打印左边多余的0*/
	public static void toHex2(int num)
	{
		//定义一个临时容器
		char[] arr=new char[8];
		int pos=0;//定义一个指针，指向存储的数组位置。
		char[] chs={'0','1','2','3'
					,'4','5','6','7'
					,'8','9','A','B'
					,'C','D','E','F'};
		while(num!=0)
		{
			int temp= num & 15;
			//System.out.println(chs[temp]);
			arr[pos++]=chs[temp];
			//pos++;
			num = num >>> 4;
		}
		//存储数据的ARR数据遍历。
		for (int x=pos-1;x>=0 ;x-- )
		{
			System.out.print(arr[x]+",");
		}
		
	}
}
