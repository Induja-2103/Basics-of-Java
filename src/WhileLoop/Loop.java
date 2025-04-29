package WhileLoop;

public class Loop {
public static void main(String[] args) {
	int i=1;
	int sum=0;
	int a=1;
	while(i<=8) {
		if(i%2==0) {
			sum=i+sum;
		System.out.println(i);
		}
		
		if(!(i%2==0)) {
			a*=i;
		}
		i++;
	}
	System.out.println(sum);
	System.out.println(a);
}
}
