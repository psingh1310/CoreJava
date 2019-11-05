import java.io.Console;

class Assignment{
	public static void main(String[] args){
	int size= MyConsole.getNumber("enter the size of array");
      int arr[]=new int[size];
      for (	int i=0;i<size ;i++ ) {
      	arr[i]=MyConsole.getNumber("");	
      }
      // int max=ArrayOperations.maxArray(arr);
      // MyConsole.print("the maximum value is "+max);
      // int min=ArrayOperations.minArray(arr);
      // MyConsole.print("the minimum value is "+min);
      // float avg=ArrayOperations.avgArray(arr);
      // MyConsole.print("the avegare of the arrya is "+avg);
      int a[] = new int[arr.length];
      a=ArrayOperations.reverseArray(arr);
      for (int value :a ) {
      	 MyConsole.print(value);
      }
	}
}

class ArrayOperations{
     public static int maxArray(int[] arr){
     	int max=0;
     	for (int i=0;i< arr.length ;i++ ) {
     		if(arr[i]>max){
     			max=arr[i];
     		}
     	}
     	return max;
     }
     public static int minArray(int[] arr){
     	int min=arr[0];
     	for (int i=1;i< arr.length ;i++ ) {
     		if(arr[i]<min){
     			min=arr[i];
     		}
     	}
     	return min;
     }
     public static float avgArray(int[] arr){
     	float sum=0;
     	int len=arr.length;
     	for (int i=0;i<len ;i++ ) {
     		sum=sum+arr[i];
     	}
        float avg=sum/len;
        return avg;
     }
     public static int[] reverseArray(int[] arr){
     	int a[]=new int[arr.length];
     	int j=0;
     	for (int i=arr.length-1;i>=0 ;i-- ) {
     		a[j]=arr[i];
     		j++;
     	}
     	return a;
     }
}
