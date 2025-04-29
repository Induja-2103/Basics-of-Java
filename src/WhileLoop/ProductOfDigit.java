package WhileLoop;
import java.util.Scanner;
public class ProductOfDigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=1;
	int t;
	while(n>0) {
		t=n%10;
		a=a*t;
		if(t==0) {
			
		}
		n=n/10;
	}
	System.out.println(a);
}
}
