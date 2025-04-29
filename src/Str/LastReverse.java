package Str;

public class LastReverse {
public static void main(String[] args) {
	String str="Eswar plays good";
	String []st=str.split(" ");
	String st1=st[st.length-1];
	String s="";
	String s1="";
	for(int i=st1.length()-1;i>=0;i--) {
		s+=st1.charAt(i);
	}
	for(int i=0;i<st.length-1;i++) {
		s1+=st[i]+" ";
	}
	System.out.println(s1+s);
	
}
}
