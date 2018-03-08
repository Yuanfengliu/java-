/*
��̬��Ӧ�ã�

ÿһ��Ӧ�ó����ж��й��ԵĹ���
���Խ���Щ���ܽ��г�ȡ��������װ��
�Ա㸴�á�

��Ȼ����ͨ������ArrayTool�Ķ���ʹ����Щ���߷�������������в�����
�������⣺
1�����������ڷ�װ���ݵģ�����ArrayTool����δ��װ�������ݡ�
2�����������ÿһ��������û���õ�ArrayTool���������е�����

��ʱ���Կ��ǣ��ó�����Ͻ����ǲ���Ҫ����
���Խ�ArrayTool�еķ��������static�ģ�ֱ��ͨ���������ü��ɡ�
ʹ�ã����Ǹ��໹�ǿ��Ա���������������ģ�


��������̬�󣬿��Է���ʹ�ã����Ǹ��໹�ǿ��Ա���������������ġ�
Ϊ�˸�Ϊ�Ͻ���ǿ���ø��಻�ܽ������󣬿���ͨ�������캯��˽�л���ɡ�

˵���飺
����������ArrayTool.class�ļ����͸������ˣ�������ֻҪ�����ļ����õ�classpath·���£��Ϳ���ʹ�øù����࣬
���ǣ����ź��������е��׶����˶��ٷ������Է����������Ϊ���ಢû��ʹ��˵���顣
��ʼ���������˵���顣Java��˵����ͨ���ĵ�ע������ɡ�

*/
/**
����һ�����Զ�������в����Ĺ����࣬�������ṩ�ˣ���ȡ��ֵ������ȹ��ܡ�
@author ��Ԩ��
*/

/*ͨ��cmd����ڣ����ļ����ڵ��ļ��£����룺javadoc -d myhelp -author -version ArrayTool.java*/
/*��������Ŀ¼�´���һ��myhelp���ļ��У������кö�ҳ�棬������ҳ�棬�������Ƿ�ҳ��*/
public class ArrayTool//�����public����������˵�����ĵ�
{
	/**
		�ղ������캯����
	*/
	private ArrayTool(){}//˽�л���19�н���
	/**
	��ȡһ��������������ֵ��
	@param arr ����һ��int���͵����顣
	@return �᷵��һ�������������ֵ��
	*/
	public static int getMax(int[] arr)
	{
		int max=0;
		for (int x=1;x<arr.length ;x++ )
		{
			if (arr[x]>arr[max])
			{
				max=x;
			}			
		}
		return arr[max];
	}
	/**
	��ȡһ�������������Сֵ��
	@param arr ����һ��int���͵����顣
	@return �᷵��һ������������Сֵ��
	*/
	public static int getMin(int[] arr)
	{
		int min=0;
		for (int x=1;x<arr.length ;x++ )
		{
			if (arr[x]<arr[min])
			{
				min=x;
			}			
		}
		return arr[min];
	}
	/**
	��int�������ѡ������
	@param arr ����һ��int���͵����顣��param������������˼��
	*/
	public static void selectSort(int[] arr)
	{
		for (int x=0;x<arr.length-1 ;x++ )
		{
			for (int y=x+1;y<arr.length ;y++ )
			{
				if (arr[x]>arr[y])
				{
					swap(arr,x,y);
				}
			}
		}
	}
	/**
	��int�������ð������
	@param arr ����һ��int���͵����顣��param������������˼��
	*/
	public static void bubbleSort(int[] arr)
	{
		for (int x=0;x<arr.length-1 ;x++ )
		{
			for (int y=0;y<arr.length-x-1 ;y++ )
			{
				if (arr[y]>arr[y+1])
				{
					swap(arr,y,y+1);
				}
			}
		}
	}
	/**
	��������Ԫ�ؽ���λ�õ��û���
	@param arr ����һ��int���͵����顣��param������������˼��
	@param aҪ�û���λ��
	@param bҪ�û���λ��
	*/
	private static void swap(int[]arr,int a,int b)//��Ϊ�������û���ṩ���ݣ�����˽�л�����public�ĳ�private��
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	/**
	���ڴ�ӡ�����е�Ԫ�أ���ӡ��ʽ�ǣ�[element1��element2��elemen3��...]
	*/
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for (int x=0;x<arr.length;x++)
		{
			if (x!=arr.length-1)
				System.out.print(arr[x]+", ");
			else 
				System.out.println(arr[x]+"]");
		}
	}
}
/*
һ������Ĭ�ϻ���һ���ղ����Ĺ��캯����
���Ĭ�Ϲ��캯����Ȩ�޺�������һ�¡�
�����û�б�pubilc���Σ���ôĬ�ϵĹ��캯����Ҳû��public���Ρ�

Ĭ�Ϲ��칹�캯����Ȩ�������ŵ���ı仯���仯�ġ�
*/