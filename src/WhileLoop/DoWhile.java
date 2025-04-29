package WhileLoop;

import java.util.Scanner;

public class DoWhile {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=1;
	int a=1;
	do {
		if(i%2==0) {
			a=i*a;
		}
		i++;
	}while(i<n);
	System.out.println(a);
   
}
}
