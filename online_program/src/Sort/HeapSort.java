package Sort;

public class HeapSort {
	public static void main(String[] strs){
		int[] a=new int[]{2,3,1,4,5,2};
		int[] b;
		b=heapSort(a, 6);
		for(int i=0;i<6;i++){
			System.out.println(b[i]);
		}
		
	}
	
	public static int[] heapSort(int[] A, int n) {
		// write code here
		for(int i=n/2-1;i>=0;i--){
			MaxHeapFixdown(A, i, n);  //��ʼ��С����
		}
		
		for(int i=n-1;i>=1;i--){  
			swap(A,0,i);			//���Ѷ������һ��Ԫ�ؽ���
			MaxHeapFixdown(A, 0, i);  //���µ�����
		}
		
		return A;
		
	}
	public static void MaxHeapFixdown(int[] A,int i, int n){
		int j,temp;
		
		temp=A[i];
		j=2*i+1; //����
		while(j<n){
			if(j+1<n&&A[j+1]>A[j]){  //�Һ���С ������������
				j++;
			}
			
			if(A[j]<=temp){   //�ýڵ��ֵС�ڻ����i�ڵ��ֵ���˳�ѭ��
				break;
			}
			
			A[i]=A[j];   //�����ƶ�
			i=j;
			j=2*i+1;
		}
		A[i]=temp;
		
	}
	public static void swap(int[] A,int i,int j){
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}
}
