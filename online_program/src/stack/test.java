package stack;
public class test {
	public static void main(String[] strs) {
		trans("this SDs fgF a simple ",1);
	}
	public static void trans(String s,int n){
		if(s==null||n<0){
			return ;}
		char[] ch=s.toCharArray();
		swap(ch,0,ch.length-1);
		int begin=0;
		for(int i=0;i<ch.length;i++){
			if(ch[i]==' '){
			swap(ch,begin,i-1);
			begin=i+1;
			}}
		swap(ch,begin,ch.length-1);
		String s1=new String(ch);
		System.out.println(s1);
		StringBuffer sb = new StringBuffer();
		if(s1!=null){
			for(int i=0;i<s1.length();i++){
				char c = s1.charAt(i);
				if(Character.isUpperCase(c)){
					sb.append(Character.toLowerCase(c));
				}else {
					sb.append(Character.toUpperCase(c)); 
				}}}	
		System.out.println(sb.toString());
	}
	public static void swap(char[] arr,int begin,int end){
		while(begin<end){
			char temp=arr[begin];
			arr[begin]=arr[end];
			arr[end]=temp;
			begin++;
			end--;
		}}
}