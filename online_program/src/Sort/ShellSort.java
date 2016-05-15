package Sort;

public class ShellSort {
	public static void main(String[] strs) {
		int[] a = new int[] { 2, 3, 1, 4, 5, 2 };
		int[] b;
		b = shellsort1(a, 6);
		for (int i = 0; i < 6; i++) {
			System.out.println(b[i]);
		}

	}

	public static int[] shellsort1(int A[], int n) {
		int i, j, gap;

		for (gap = n / 2; gap > 0; gap /= 2)
			// 步长
			for (i = 0; i < gap; i++) // 直接插入排序
			{
				for (j = i + gap; j < n; j += gap)
					if (A[j] < A[j - gap]) {
						int temp = A[j];
						int k = j - gap;
						while (k >= 0 && A[k] > temp) {
							A[k + gap] = A[k];
							k -= gap;
						}
						A[k + gap] = temp;
					}
			}
		return A;
	}

	public static int[] shellsort2(int A[], int n) {
		int j, gap;

		for (gap = n / 2; gap > 0; gap /= 2)
			for (j = gap; j < n; j++)
				// 从数组第gap个元素开始
				if (A[j] < A[j - gap])// 每个元素与自己组内的数据进行直接插入排序
				{
					int temp = A[j];
					int k = j - gap;
					while (k >= 0 && A[k] > temp) {
						A[k + gap] = A[k];
						k -= gap;
					}
					A[k + gap] = temp;
				}
		return A;
	}

	public static int[] shellsort3(int A[], int n) {
		int i, j, gap;

		for (gap = n / 2; gap > 0; gap /= 2)
			for (i = gap; i < n; i++)
				for (j = i - gap; j >= 0 && A[j] > A[j + gap]; j -= gap)
					Swap(A, j, j + gap);
		return A;
	}

	public static void Swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
	
}
