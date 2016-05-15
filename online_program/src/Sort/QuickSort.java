package Sort;

public class QuickSort {
	public static void main(String[] strs) {
		int[] A={1,3,4,4,1,5};
		int[] b=quickSort(A, 6);
		for(int i:b){
			System.out.println(i);
		}		
	}
	
	public static int[] quickSort(int[] A, int n) {
        // write code here
		quick_sort(A, 0, n-1);
		return A;
    }
	public static void quick_sort(int[] A,int first,int last){
		if(first<last){
			
			int i=first,j=last,temp=A[first];
			
			while(i<j){
				while(i<j&&A[j]>=temp){   //���������ҵ�һ��С��temp����  
					j--;
				}
				if(i<j){
					A[i++]=A[j];
				}
				while(i<j&&A[i]<temp){   //���������ҵ�һ�����ڵ���temp����  
					i++;
				}
				if(i<j){
					A[j--]=A[i];
				}
				
			}
			A[i]=temp;
			
			quick_sort(A, first, i-1);  // �ݹ����
			quick_sort(A, i+1, last);
		}
				
	}
	
}
