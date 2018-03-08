package day4_array;

public class ArrayTest1 {
	//数组排序
	public static void arrayCompare(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for (int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int x=arr[j];
					arr[j]=arr[i];
					arr[i]=x;
				}
			}
		}
	}

	public static void printArray(int[] arr){
		//如何好看的打印数组
		System.out.print("[");
		for(int i=0;i<arr.length;i++){			
			if(i!=arr.length-1)
				System.out.print(arr[i]+",");
			else {
				System.out.println(arr[i]+"]");
			}
		}
	}
	public static void main(String[] args) {
		int[] t={1,2,6,32,3,4343,231,444,7};
		arrayCompare(t);
		printArray(t);
	}

}
