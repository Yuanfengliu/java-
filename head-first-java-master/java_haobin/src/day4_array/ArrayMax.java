package day4_array;

public class ArrayMax {
	public static void main(String[] args) {
		int[] x={1,2,4,5,7,9,133};
		System.out.println(compareArray(x));
	}
	public static int compareArray(int[] arr){
		//��ȡ��������ֵ
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		return max;
	}
}
