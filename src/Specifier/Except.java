package Specifier;

public class Except {
public static void main(String[] args) {
	try {
		int n=10;
		System.out.println("Before Division");
		System.out.println(n/0);
		System.out.println("Line after division");
	}
	catch(ArithmeticException e) {
		System.out.println("Its Arith excep");
	}
	catch(Exception e) {
		System.out.println();
	}
}
}