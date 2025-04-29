package Str;

public class NoChar {
public static void main(String[] args) {
	String str="Eswar plays good";
	char ch,c;
	int count=0;
	String chk="";
	for(int i=0;i<str.length();i++) {
		ch=str.charAt(i);
		count=0;
		if(chk.indexOf(ch)>=0) {
			continue;
		}
		chk+=ch;
		
		for(int j=0;j<str.length();j++) {
			c=str.charAt(j);
			if(ch==c) {
				count++;
			}
		}
		System.out.println(ch+":"+count);
	}
	System.out.println();
	//METHOD 2
	
	System.out.println("METHOD 2");
	String s="Cricket09";
	int arr[]=new int[128];
	for (char cha:s.toCharArray()) {
		arr[cha]++;
	}
		for(int i='A';i<'Z';i++) {
			if(arr[i]!=0) {
				System.out.println((char)(i)+":"+arr[i]);
		         
			}
		}
		for(int i='a';i<'z';i++) {
				if(arr[i]!=0) {
					System.out.println((char)(i)+":"+arr[i]);
				}
		
		}
		for(int i='0';i<='9';i++) {
			if(arr[i]!=0) {
				System.out.println((char)(i)+":"+arr[i]);
			}
			
		}
	}
}


