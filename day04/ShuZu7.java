/*在前面几个文件中发现，进制转换有公共部分，故写成一个公共函数*/

class ShuZu7 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		toBin(-6);
		System.out.println("");
		toHex(60);
		System.out.println("");
		toBa(60);

	}
	/*十进制转二进制*/
	public static void toBin(int num)
	{
		trans(num,1,1);
	}
	/*十进制转八进制*/
	public static void toBa(int num)
	{
		trans(num,7,3);
	}
	/*十进制转十六进制*/
	public static void toHex(int num)
	{
		trans(num,15,4);
	}	
	public static void trans(int num,int base,int offset)
	{//base：与的数大小（二进制是1，十六进制是15）。offset：右移几位。
		if (num==0)
		{
			System.out.println(0);
			return;
		}
		char[] chs={'0','1','2','3'
					,'4','5','6','7'
					,'8','9','A','B'
					,'C','D','E','F'};
		char[] arr =new char[32];
		int pos=arr.length;
		while (num!=0)
		{
			int temp = num&base;
			arr[--pos]=chs[temp];
			num=num>>>offset;
		}
		for (int x=pos;x<arr.length ;x++ )
		{
			System.out.print(arr[x]);			
		}
	}
}
