package stack;

import java.util.Stack;

//用两这个栈实现队列
public class twoStackQueue {

	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        if(this.stack2.empty()){
            while(!this.stack1.empty()){
                this.stack2.push(this.stack1.pop());
            }
        }
        this.stack1.push(node);
    }
    
    public int pop() {
    	if(this.stack2.empty()){
            while(!this.stack1.empty()){
                this.stack2.push(this.stack1.pop());
            }
        }
        return this.stack2.pop();
    }
	
	
}

    
