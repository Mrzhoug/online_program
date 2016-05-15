package Sort;

public class MergeSort {

	public static void main(String[] strs) {
		int[] A={1,3,4,4,1,5};
		int[] b=mergeSort(A, 6);
		for(int i:b){
			System.out.println(i);
		}		
	}

	public static int[] mergeSort(int[] A, int n) {
		// write code here

		int[] temp = new int[n];

		mergesort(A, 0, n - 1, temp);
		
		return temp;
	}

	private static void mergesort(int[] a, int first, int last, int[] temp) {
		// TODO Auto-generated method stub
		if (first < last) {
			int mid = (first + last) / 2;
			mergesort(a, first, mid, temp); // 划分左边有序
			mergesort(a, mid + 1, last, temp); // 划分右边有序
			mergeArray(a, first, mid, last, temp); // 合并两边
		}
	}

	private static void mergeArray(int[] a, int first, int mid, int last, int[] temp) {
		// TODO Auto-generated method stub
		int i = first, j = mid + 1;
		int m = mid, n = last;
		int k = 0;

		while (i <= m && j <= n) {
			if (a[i] <= a[j])
				temp[k++] = a[i++];
			else
				temp[k++] = a[j++];
		}

		while (i <= m)
			temp[k++] = a[i++];

		while (j <= n)
			temp[k++] = a[j++];

		for (i = 0; i < k; i++)
			a[first + i] = temp[i];
	}

}
