package Oops;
import java.util.Scanner;
public class Method {
static void meth(int n) {
	if(n>0){
     meth(n-2);
			System.out.println(n);
		}
}
public static void main(String[] args) {
	int n=50;
	System.out.println("By using recursion meth");
	meth(n);
	System.out.println("Method Terminated");
}
	
}
