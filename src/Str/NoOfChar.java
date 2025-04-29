package Str;

public class NoOfChar {
public static void main(String[] args) {
	String str="Eswar plays good";
	int count=0;
	char ch;
	for (int i=0;i<str.length();i++) {
		 ch=str.charAt(i);
		if(ch=='a' ||ch== 'A'){
			count++;
		
	}
		
}
	
	System.out.println(count);
}
}
