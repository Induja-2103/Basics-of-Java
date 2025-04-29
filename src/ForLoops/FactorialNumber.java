package ForLoops;
import java.util.Scanner;
public class FactorialNumber {
public static void main(String[] args) {
	int a=1;
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=n;i>0;i--) {
    	a*=i;
     }
     System.out.println(a);
}
}
