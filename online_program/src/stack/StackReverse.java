package stack;

import java.util.Stack;

public class StackReverse {
	public int[] reverseStack(int[] A, int n) {
        // write code here
		Stack<Integer> stack=new Stack<Integer>();
		for(int i=0;i<n;i++){
			stack.push(A[i]);
		}
		for(int i=0;i<n;i++){
			A[i]=stack.pop();
		}
		return A;
    }

}
