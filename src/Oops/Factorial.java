package Oops;

public class Factorial {
	int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
	public static void main(String[] args) {
		Factorial n=new Factorial();
		int num=5;
		int res=n.fact(num);
		System.out.println("Fact: "+res);
	}

}
