package Str;
import java.util.*;
public class StrBuild {
	public static void main(String[] args) {
	
String str="Eswar is a good cricketer";
String []st=str.split("");
String s1;
StringBuilder sb=new StringBuilder();
for(String s:st) {
	StringBuilder sh=new StringBuilder(s);
sb.append(sh.reverse().toString()).append("");
	
}
System.out.println(sb.toString().trim());
	}
}
//output not obtained
