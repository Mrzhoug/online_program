package Sort;

public class InsertionSort {
	public static void main(String[] strs){
		int[] A={54,35,48,36,27,12,44,44,8,14,26,17,28};
		int[] b=insertionSort(A, 13);
		for(int i:b){
			System.out.println(i);
		}		
	}
	public static int[] insertionSort(int[] A, int n) {
        // write code here
		int i,j,temp;
		for(i=1;i<n;i++){
			temp=A[i];
			j=i-1;
			while(j>=0){
				if(temp<A[j]){
					A[j+1]=A[j];
					
				}
				else{
					break;
				}
				j--;
			}
			A[j+1]=temp;
		}
		return A;
    }
}
