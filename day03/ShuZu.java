class ShuZu
{
	public static void main(String[] args) 
	{
		int[]x=new int[3];
		System.out.println(x[1]);
		int[]y=x;//此时x，y同时指向数组的地址，x，y都在栈中开辟空间
		y[1]=89;
		System.out.println(x[1]);

	}
}
/*数组 int[] x= new int[3];
x在栈中，用完x就消失了；
int[3]在堆中，有实际的地址（实体），3个数据中每个数据中有一个地址；
把堆中的地址赋值给栈中x（即x指向对应堆的地址的位置）；

*/