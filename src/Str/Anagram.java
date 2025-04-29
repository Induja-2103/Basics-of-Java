package Str;
import java.util.*;
public class Anagram {
public static void main(String[] args) {
	String st1="Malayalam";
	String st2="Malayalam";
	st1=st1.toLowerCase();
	st2=st2.toLowerCase();
	if(st1.length()==st2.length()) {
		char s1[]=st1.toCharArray();
		char s2[]=st2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		if(Arrays.equals(s1,s2)) {
			System.out.println("Anagram");
		}
	}
}
}
