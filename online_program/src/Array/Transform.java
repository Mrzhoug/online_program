package Array;

public class Transform {
	public static void main(String[] strs){
		String stra="abcd";
		String strb="cba";
		
		System.out.println(chkTransform(stra,stra.length(),strb,strb.length()));
	}
	
	public static boolean chkTransform(String A, int lena, String B, int lenb) {
        // write code here
        if(lena!=lenb){
            return false;
        }
        char[] stra=A.toCharArray();
        char[] strb=B.toCharArray();
        int[] map=new int[256];
        for(int i=0;i<lena;i++){
        	map[stra[i]]++;
        }
        for(int i=0;i<lenb;i++){
        	if(map[strb[i]]--==0){
        		return false;
        	}
        }
        return true;
    }
}
