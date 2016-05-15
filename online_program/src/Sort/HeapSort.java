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
			MaxHeapFixdown(A, i, n);  //初始化小根堆
		}
		
		for(int i=n-1;i>=1;i--){  
			swap(A,0,i);			//将堆顶和最后一个元素交换
			MaxHeapFixdown(A, 0, i);  //重新调整堆
		}
		
		return A;
		
	}
	public static void MaxHeapFixdown(int[] A,int i, int n){
		int j,temp;
		
		temp=A[i];
		j=2*i+1; //左孩子
		while(j<n){
			if(j+1<n&&A[j+1]>A[j]){  //右孩子小 调整到右子树
				j++;
			}
			
			if(A[j]<=temp){   //该节点的值小于或等于i节点的值就退出循环
				break;
			}
			
			A[i]=A[j];   //往上移动
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
