package Basics;
import java.util.Scanner;
public class PrintStatement {
	int num;
	int roll;
	void meth() {
		System.out.println("hello java");
	}
	public static void main(String[] args) {

		PrintStatement ob=new PrintStatement();
		PrintStatement ob1=new PrintStatement();
		PrintStatement ob2=new PrintStatement();
		ob.num=2;
		ob.roll=23;
		ob1.num=9;
		ob1.roll=98;
		System.out.println(ob.num);
		System.out.println(ob.roll);
		System.out.println(ob1.num);
		System.out.println(ob1.roll);
		System.out.println(ob2.num);
		System.out.println(ob2.roll);
		ob.meth();
		Scanner sc=new Scanner(System.in);
		System.out.println(sc);
	}
}
