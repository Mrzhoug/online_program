package stack;

import java.util.ArrayList;

public class SetOfStacks {
	 public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
	        // write code here
		 ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
	     if(ope==null||ope.length==0){
	    	 return list;
	     }
		 ArrayList<Integer> stack=new ArrayList<Integer>();
         list.add(stack);
		 for(int i=0;i<ope.length;i++){
			 if(ope[i][0]==1){
				 if(stack.size()<size){
                    stack.add(ope[i][1]);
                 }
				 else{
					 stack=new ArrayList<Integer>();
                     list.add(stack);
                     stack.add(ope[i][1]);
				 }
			 }
			 if(ope[i][0]==2){
				 if(stack.size()>0){
					 stack.remove(stack.size()-1);
				 }
				 else {
					 list.remove(list.size() - 1);
	                 stack = list.get(list.size() - 1);
	                 stack.remove(stack.size() - 1);
				}
			 }
		 } 
         
		 return list;
	}
}
