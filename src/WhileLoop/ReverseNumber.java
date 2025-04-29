package WhileLoop;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=0;
	
	while(n!=0) {
		a=a*10+(n%10);
		n=n/10;
		
		}
	
	System.out.println(a);
}
}
