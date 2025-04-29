package Str;

public class StrMethod {
	
	String  str(String st1) {
		String st2="";
		st1=st1.toLowerCase();
		for(int i=st1.length()-1;i>=0;i--) {
			char ch=st1.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		         {
			st2+=st1.charAt(i);
		}
			}
	}
		return st2;
	}
public static void main(String[] args) {
	String st1="Abdhul";
	String st2= new String("Abdhul");
	System.out.println(st1.length());
	System.out.println(st1.equals(st2));
	System.out.println(st1.charAt(0));
	StrMethod st=new StrMethod();
	System.out.println(st.str(st1));
	
}
}
