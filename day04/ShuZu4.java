class ShuZu4 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		toBe(6);
		toHex(60);
	}
	/*
	十进制-->十六进制
	*/
	public static void toHex(int num)
	{
		StringBuffer sb=new StringBuffer();
		for (int x=0;x<8 ;x++ )
		{
			int temp=num&15;
			if(temp>9)
				//System.out.println((char)(temp-10+'a'));//注意char自己要加括号
				sb.append((char)(temp-10+'a'));
			else
				//System.out.println(temp);
				sb.append(temp);
			num=num>>>4;
		}
		System.out.println(sb.reverse());//反转sb容器
		
	}



	/*
	十进制-->二进制
	*/
	public static void toBe(int num)
	{
		StringBuffer sb=new StringBuffer();//用这个容器装数据
		while(num>0)
		{
			//System.out.println(num%2);
			sb.append(num%2);
			num=num/2;
		}
		System.out.println(sb);
		System.out.println(sb.reverse());//反转后就是要的二进制结果
	}
}
