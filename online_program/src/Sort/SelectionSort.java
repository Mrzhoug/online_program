package Sort;

public class SelectionSort {
	public static void main(String[] strs){
		int[] A={1,3,4,4,1,5};
		int[] b=selectionSort(A, 6);
		for(int i:b){
			System.out.println(i);
		}		
	}
	
	public static int[] selectionSort(int[] A, int n) {
        // write code here
        for(int i=0;i<n;i++){
        	int min=i;
        	for(int j=i+1;j<n;j++){
        		if(A[j]<A[min]){
        			min=j;
        		}
        	}
        	int temp=A[min];
        	A[min]=A[i];
        	A[i]=temp;
        }
        return A;
    }
}
