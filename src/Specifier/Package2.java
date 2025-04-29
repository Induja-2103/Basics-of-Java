package Specifier;

public class Package2 {
protected void sum(int n1,int n2) {
	System.out.println(n1+n2);

}
public static void main(String[] args) {
	Package2 p2=new Package2();
	p2.sum(10,20);
}
}
