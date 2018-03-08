package day6;
/*��̬��Ӧ��
 ÿһ�������ж��й��� �Ĺ��ܣ����Խ���Щ������з�װ
 
 ����������ArrayTool.class �ļ����͸������ˣ�������ֻҪ�����ļ����õ�
 ��ʼ����java��˵���� java��˵����ͨ���ĵ�ע�������*/
/**
 ����һ�����Զ�������в����Ĺ����࣬�������ṩ�˻�ȡ��ֵ������Ĺ���
 @author mianhk
 @version V1.1
  
*/
public class ArrayTool {
	/**
	�ղ������캯��*/
	private ArrayTool(){}
	/**
	 ��ȡһ�����������е����ֵ
	 @param arr ����һ��int���͵�����
	 @return �᷵��һ���������е����ֵ
	*/
	public static int getMax(int[] arr){
		int max=0;
		for(int x=1;x<arr.length;x++){
			if(arr[x]>arr[max])
				max=x;
		}
		return arr[max];
	}
	/**
	 ��ȡһ�����������е���Сֵ
	 @param arr ����һ��int���͵�����
	 @return �᷵��һ���������е���Сֵ
	 */
	public static int getMin(int[] arr){
		int min=0;
		for(int x=1;x<arr.length;x++){
			if(arr[x]<arr[min])
				min=x;
		}
		return arr[min];
	}
	/**
	���������ѡ������
	 @param arr ����һ��int���͵�����
	*/
	public void selectSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for (int y=x+1;y<arr.length;y++){
				if (arr[x]>arr[y]){
					swap(arr, x, y);
				}
			}
		}
	}
	/**
	 ���������ð������
	 @param arr ����һ��int���͵�����
	 */
	public static void bubbleSort(int[] arr){
		for(int x=0;x<=arr.length-1;x++){
			for(int y=0;y<arr.length-x-1;y++){
				if(arr[y]>arr[y+1]){swap(arr, y, y+1);}
			}
		}
	}
	/**
	 *���������λ���û�
	 *@param arr ����һ��int���͵�����
	 *@param  a Ҫ�û���λ��
	 *@param  b Ҫ�û���λ��
	 * */
	private static void swap(int[] arr,int a,int b){
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	/**
	 ���ڴ�ӡ�����е�Ԫ�أ���ӡ��ʽ�ǣ�[e1,e2...]
	 * */
	private void printArray(int[] arr){
		System.out.print("[");
		for (int x=0;x<arr.length;x++){
			if(x!=arr.length-1)
			System.out.print(arr[x]+",");
			else
				System.out.println(arr[x]+"]");
			
		}
	}

};

/*
 * һ������Ĭ�ϻ���һ���ղ����Ĺ��캯��
 * ���Ĭ�ϵĹ��캯����Ȩ�޺���������һ��
 * ��������û��public���Σ���ôĬ�ϵĹ��캯������ô���캯��Ҳû��public����*/
 