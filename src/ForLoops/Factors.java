package ForLoops;
import java.util.Scanner;
public class Factors {
public static void main(String[] args) {
	Scanner ob =new Scanner(System.in);
			int n=ob.nextInt();
			int count=0;
	for(int i=1;i<=n/2;i++) {
		if(n%i==0) {
			count++;
			System.out.println(i);
		}
	}
	System.out.println("number of factors:"+count);
}
}
