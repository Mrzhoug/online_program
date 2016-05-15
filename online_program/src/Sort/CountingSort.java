package Sort;

public class CountingSort {
	public static void main(String[] strs){
		int[] A={1,3,4,4,1,5};
		int[] b=countingSort(A, 6);
		for(int i:b){
			System.out.println(i);
		}		
	}
	
	public static int[] countingSort(int[] A, int n) {
		// write code here

		if (A == null || A.length < 1) {
			return null;
		}
		
		int min=A[0];
		int max=A[0];
		
		for(int i=0;i<A.length;i++){
			min=Math.min(A[i], min);   //取得所给数组中最小值
			max=Math.max(A[i], max);   //取得所给数组中最大值
		}
		int[] countArr=new int[max-min+1];
		for(int i=0;i<A.length;i++){
			countArr[A[i]-min]++;
		}
		int index=0;
		for(int i=0;i<countArr.length;i++){
			while(countArr[i]-- > 0){
				A[index++]=i+min;
			}
		}
		return A;
	}
}
