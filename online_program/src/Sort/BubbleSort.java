package Sort;

public class BubbleSort {
	
	public static void main(String[] strs){
		int[] A={1,3,4,4,1,5};
		int[] b=bubbleSort(A, 6);
		for(int i:b){
			System.out.println(i);
		}		
	}
	
	public static int[] bubbleSort(int[] A, int n) {
		// write code here
		
		for(int i=0;i<n-1;i++){
			
			for(int j=0;j<n-i-1;j++){
				if(A[j]>A[j+1]){
					int temp=A[j];
					A[j]=A[j+1];
					A[j+1]=temp;
				}
			}
		}
		return A;
	}
}
