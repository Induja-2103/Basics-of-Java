package Access;
public class Package1{
	//default access specifier
	void mul(int n1,int n2) {
		System.out.println(n1*n2);
	}
	//protected access specifier
	protected void sub(int n1,int n2){
		System.out.println(n1-n2);
	}
	//private access specifier
	private void div(int n1,int n2) {
		System.out.println(n1/n2);
	}
public static void main(String[] args) {
	Package1 p1=new Package1();
	p1.mul(10, 20);
	p1.sub(30, 10);
	p1.div(40, 5);
	
}
}
 