package Array;

public class Replacement {
	public static void main(String[] strs){
		System.out.println(replaceSpace("Hello  World", 12));
	}
	
	public static String replaceSpace(String iniString, int length) {
        // write code here
		char[] arr=iniString.toCharArray();
		int count=0;
		for(int i=0;i<length;i++){
			if(arr[i]==' ')
				count++;
		}
		char[] arrs=new char[length+count*2];
		for(int i=length-1;i>=0;i--){
			if(arr[i]!=' '){
				arrs[i+count*2]=arr[i];
			}
			else{
				arrs[i+count*2]='0';
				arrs[i+count*2-1]='2';
				arrs[i+count*2-2]='%';
				count--;
			}
		}
		return String.valueOf(arrs);
    }
}
