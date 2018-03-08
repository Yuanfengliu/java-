class ShuZu6 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//toHex(60);
		toHex(60);
		System.out.println("");//换行
		toBin(6);
	}
/*十进制转二进制*/
	public static void toBin(int num)
	{
		//定义一个二进制的表
		char[] chs={'0','1'};

		//定义一个临时存储器
		char[] arr =new char[32];

		//定义一个操作数组的指针
		int pos=arr.length;

		while (num!=0)
		{
			int temp=num&1;
			arr[--pos]=chs[temp];
			num=num>>>1;
		}
		for (int x=pos;x<arr.length ;x++ )
		{
			System.out.print(arr[x]);			
		}
	}

/*不打印左边多余的0的十六进制*/
	public static void toHex(int num)
	{
		
		//定义一个临时容器
		char[] arr=new char[8];
		int pos=arr.length-1;//定义一个指针，指向存储的数组位置。
		char[] chs={'0','1','2','3'
					,'4','5','6','7'
					,'8','9','A','B'
					,'C','D','E','F'};
		while(num>0)
		{
			int temp= num & 15;
			//System.out.println(chs[temp]);
			arr[pos]=chs[temp];
			pos--;
			num = num >>> 4;			
		}
		//存储数据的ARR数据遍历。
		System.out.println(arr.length-1);
		System.out.println("pos="+pos);
		for (int x=pos+1;x<arr.length ;x++ )
		{
			System.out.print(arr[x]+",");			
		}		
	}
}
