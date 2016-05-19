package Array;

public class Parenthesis {
	public static void main(String[] strs){
		System.out.println(chkParenthesis("()(()()", 7));
	}
	public static boolean chkParenthesis(String A, int n) {
        // write code here
		char[] arr=A.toCharArray();
		int num=0;
		for(int i=0;i<n;i++){
			if(arr[i]!='('&&arr[i]!=')')
				return false;
			if(arr[i]=='('){
				num++;
			}
			if(arr[i]==')'){
				num--;
				if(num<0)
					return false;
			}
		}
		if (num!=0) {
			return false;
		}
		return true;
    }
}
