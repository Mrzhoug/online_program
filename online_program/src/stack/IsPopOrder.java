package stack;

import java.util.*;

import org.junit.Test;

public class IsPopOrder {
	public static void main(String[] strs){
		System.out.println(IsPopOrders());
	}
	
    public static boolean IsPopOrders() {
    	
		int[] pushA={1,2,3,4,5};
		int[] popA={4,3,5,1,2};
    	
        if(pushA==null || pushA.length==0){
            return false;
        }
        if(popA==null || popA.length==0){
            return false;
        }
        
        Stack<Integer> stackPop=new Stack<Integer>();
        stackPop.push(0);
        for(int i=popA.length-1;i>=0;i--){
            stackPop.push(popA[i]);
        }
        Stack<Integer> stackPush=new Stack<Integer>();
        //while(stackPop.peek()!=null){           
        stackPush.push(-1);
            for(int j=0;j<pushA.length;j++){
                stackPush.push(pushA[j]);
                while(stackPop.peek()==stackPush.peek()){
                    stackPop.pop();
                    stackPush.pop();
                }   
            }
            if(stackPop.peek()==0&&stackPush.peek()==-1){
                return true;
            }
            else{
                return false;
            }
        //}
    }
}