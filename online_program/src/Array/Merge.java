package Array;

public class Merge {
	public static void main(String[] strs) {
		int[] A={2,4,5,6,7,9,10,11,12,13,0,0,0,0,0,0,0,0,0,0,0};
		int[] B={1,1,1,7,8,11,20,21,22,25,40};
		int[] b=mergeAB(A, B,10,11);
		for(int i:b){
			System.out.println(i);
		}		
		
	}
	
	
	public static int[] mergeAB(int[] A, int[] B, int n, int m) {
        // write code here
		if(n==0) return B;
		if(m==0) return A;
		
		n--;m--;
		for(int i=n+m+1;i>=0&&m>=0&&n>=0;i--){
			if(A[n]>B[m]){
				A[i]=A[n];
				n--;
			}
			else{
				A[i]=B[m];
				m--;
			}
		}
		if(m>0){
			
		}
		return A;
    }
}
