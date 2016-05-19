package stack;

import java.util.Stack;

public class sortStackByStack {
	public static void main(String[] str){
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(15);
		stack.push(45);
		stack.push(124);
		stack.push(24);
		stack.push(4);
		stack.push(134);
		doubleStack(stack);
		System.out.println(stack);
	}
	public static void doubleStack(Stack<Integer> stack){
		Stack<Integer> help=new Stack<Integer>();
		while(!stack.isEmpty()){
			int cur=stack.pop();
			while(!help.isEmpty()&&help.peek()<cur){
				stack.push(help.pop());
			}
			help.push(cur);
		}
		
		while(!help.isEmpty()){
			stack.push(help.pop());
		}
	}
}
