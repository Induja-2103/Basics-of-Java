package WhileLoop;
import java.util.Scanner;
public class Break {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("which number did you want to break?");
	int n=sc.nextInt();
	int i=1;
	while(i<50) {
		if(i==n) {
			break;
		}
		System.out.println(i);
		i++;
	}
}
}
