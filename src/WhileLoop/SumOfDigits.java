package WhileLoop;

import java.util.Scanner;

public class SumOfDigits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=0;
	
	while(n!=0) {
		sum+=(n%10);
		n=n/10;
		if(n==0 && sum>10) {
			n=sum;
			sum=0;
		}
	}
	System.out.println(sum);
}
}
