package stack;

import java.util.Stack;

public class TwoStack {
	public static int[] twoStack(int[] ope, int n) {
		// write code here
		Stack<Integer> stack1=new Stack<Integer>();
		Stack<Integer> stack2=new Stack<Integer>();
		
		int[] num;
		int count=0;
		for(int i=0;i<n;i++){
			if(ope[i]==0){	
				count++;
			}
		}
		num=new int[count];
		count=0;
		for(int i=0;i<n;i++){
			if(ope[i]!=0){
				stack1.push(ope[i]);
			}
			else {
				num[count++]=pop(stack1, stack2);
			}
		}
		return num;
	}
	
	public static int pop(Stack<Integer> stack1, Stack<Integer> stack2){
		while(!stack1.isEmpty()){
			stack2.push(stack1.pop());
		}
		int res=stack2.pop();
		while(!stack2.isEmpty()){
			stack1.push(stack2.pop());
		}
		return res;
	}
	
	public static void main(String[] strs){
		int[] A={287,202,181,156,0};
		int[] B=twoStack(A,5);
		for(int i:B){
			System.out.println(i);
		}
	}
}
