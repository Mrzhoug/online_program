package stack;

import java.util.Stack;

public class getmin2 {
	private Stack<Integer> stackNum = new Stack<Integer>();
	private Stack<Integer> stackMin = new Stack<Integer>();

	public void push(int node) {
		if (stackMin.isEmpty())
			stackMin.push(node);
		else {
			if (node <= stackMin.peek()) {
				stackMin.push(node);
			} else {
				stackMin.push(stackMin.peek());
			}
		}
		stackNum.push(node);
	}

	public void pop() {
		if (!stackMin.isEmpty()&&!stackNum.isEmpty()) {
			stackNum.pop();
			stackMin.pop();
		}
	}

	public int top() {
		return stackNum.peek();
	}

	public int min() {
		
			return stackMin.peek();
		
	}
	public static void main(String[] strs){
		getmin2 getmin=new getmin2();
		getmin.push(3);
		getmin.push(4);
		getmin.push(5);
		getmin.push(5);
		getmin.push(2);
		getmin.push(3);
		System.out.println(getmin.min());
	}
}
