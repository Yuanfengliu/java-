class ShuZu8 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//int[] arr=new int[3];//һά����
		int[][] arr1=new int[3][4];//�����������еĶ�ά����
		arr1[1][2]=78;
		System.out.println(arr1[1][1]);
		int[][] arr=new int[3][];//���У�����ÿ������Ϊ�ռ�null
		arr[0]=new int[2];//ÿ���ֶ���ֵ����Ԫ��
		arr[1]=new int[4];
		arr[2]=new int[3];
		System.out.println("��ά����ĳ���:"+arr.length);//��ӡ�Ƕ�ά����ĳ���
		System.out.println("��ά�����е�һ��һά����ĳ���:"+arr[0].length);//��ӡ�Ƕ�ά�����е�һ��һά����ĳ���
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
int[] x;int x[]					//��2��һά���������������
int[][] y;int y[][];int[] y[]   //��������ά���鶼������������

int[] x,y[];	//�����˼�ǣ�x��һά�ģ�y�Ƕ�ά��

*/