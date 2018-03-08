class LianXi 
{
	public static void main(String[] args) 
	{		//根据用于指定月份，打印该月份季节
		//345是春节；678夏季；9，10，11秋季；12，1，2冬季
		int x=4;
		if (x==3||x==4||x==5)//两个‘||’表示只要第一个x=3就可以不用看是否等于4，是否等于5；效果比‘|’更好
			System.out.println(x+"月是春季");
		else if(x==6||x==7||x==8)
			System.out.println(x+"月是夏季");
		else if(x==9||x==10||x==11)
			System.out.println(x+"月是秋季");
		else if(x==12||x==1||x==2)
			System.out.println(x+"月是冬季");
		else 
			System.out.println(x+"月份不存在");
		System.out.println("Hello World!");
		//方法二：可以用且运算符即(x>=3 && x<=5)表示
	}
}
