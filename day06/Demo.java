/*
��̬��Ӧ�ã�

ÿһ��Ӧ�ó����ж��й��ԵĹ���
���Խ���Щ���ܽ��г�ȡ��������װ��
�Ա㸴�á�
*/

class Demo
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int[] arr={3,4,1,8,13};
		
		/******��Щ��û�о�̬ʱ�������������
		ArrayTool tool=new ArrayTool();//��������һ��ArrayTool�ļ�����ʹ����ͬһ���ĵ���Ҳ���Ե��á�
		int max=tool.getMax(arr);
		System.out.println("max="+max);

		int min=tool.getMin(arr);
		System.out.println("min="+min);
		
		tool.printArray(arr);//����ǰ
		tool.selectSort(arr);
		tool.printArray(arr);//�����
		*/

		int max=ArrayTool.getMax(arr);
		System.out.println("max="+max);
	}	
}


