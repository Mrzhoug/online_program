package stack;

import java.util.Stack;
//用递归函数和栈操作逆序一个栈
public class reverseStackByRecursive {

	public static int[] reverseStackRecursively(int[] stack, int top) {
		// write code here
		Stack<Integer> stack2=new Stack<Integer>();
		for(int i=0;i<=top;i++){
			stack2.push(stack[i]);
		}
		reverse(stack2);
		
		for(int i=top;i>=0;i--){
			stack[i]=stack2.pop();
		}
		
		return stack;
	}
	public static int getAndRemoveLastElement(Stack<Integer> stack){
		int result = stack.pop();
		if(stack.empty()){
			return result;
		}
		else {
			int last =getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		}		
	}
	
	public static void reverse(Stack<Integer> stack){
		if(stack.empty()){
			return;
		}
		
		int i=getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}
	
	public static void main(String[] strs){
		int[] a={289,435,175,336,432,455,4};
		reverseStackRecursively(a,6);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
