package stack;

import java.util.Stack;

//获取当前最小栈的值
public class getmin {
	private Stack<Integer> stackDate;
	private Stack<Integer> stackMin;
	
	public getmin(){
		this.stackDate=new Stack<Integer>();
		this.stackMin=new Stack<Integer>();
	}
	
	public void push(int newNum){
		if(this.stackMin.isEmpty()){
			this.stackMin.push(newNum);
		}
		else if(newNum<this.getmin()){
			this.stackMin.push(newNum);
		}
		else {
			int newMin=this.stackMin.peek();
			this.stackMin.push(newMin);
		}
		this.stackDate.push(newNum);
	}
	
	public int pop(){
		if(this.stackDate.isEmpty()){
			throw new RuntimeException("Your stack is empty");
		}
		this.stackMin.pop();
		return this.stackDate.pop();
	}
	public int getmin(){
		if(this.stackMin.isEmpty()){
			throw new RuntimeException("Your stack is empty");
		}
		return this.stackMin.peek();
	}
	
	
	public static void main(String[] strs){
		getmin getmin=new getmin();
		getmin.push(3);
		getmin.push(4);
		getmin.push(5);
		getmin.push(5);
		getmin.push(2);
		getmin.push(3);
		System.out.println(getmin.getmin());
	}
}
