class ShuZu8 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//int[] arr=new int[3];//一维数组
		int[][] arr1=new int[3][4];//定义三行四列的二维数组
		arr1[1][2]=78;
		System.out.println(arr1[1][1]);
		int[][] arr=new int[3][];//三行，但是每行数据为空即null
		arr[0]=new int[2];//每行手动赋值几个元素
		arr[1]=new int[4];
		arr[2]=new int[3];
		System.out.println("二维数组的长度:"+arr.length);//打印是二维数组的长度
		System.out.println("二维数组中第一个一维数组的长度:"+arr[0].length);//打印是二维数组中第一个一维数组的长度
		int[][] arr2={{3,5,1,7},{2,3,5,8},{6,4,6,7}};
		int sum=0;
		for (int x=0;x<arr2.length ;x++ )
		{
			for (int y=0;y<arr2[x].length ;y++ )
			{
				sum=sum+arr2[x][y];
			}
		}
		System.out.println("sum="+sum);
	}
}
/*
int[] x;int x[]					//这2个一维数组可以这样定义
int[][] y;int y[][];int[] y[]   //这三个二维数组都可以这样定义

int[] x,y[];	//这个意思是：x是一维的，y是二维。

*/