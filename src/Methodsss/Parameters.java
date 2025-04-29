package Methodsss;

public class Parameters {
	//Without Return Type and Without Parameter
void sum(){
	int n1=9;
	int n2=8;
	System.out.println(n1+n2);
}
	//Without Return Type and With Parameter
void product(float n1,float n2) {
	float res=n1*n2;
	System.out.println(res);
}
//With Return Type With Parameter
int difference(int n1,int n2) {
	int res=n1-n2;
	return res;
}
//With Return Type Without Parameter
float division() {
	float f1=4.8f;
	float f2=2;
	float res=f1/f2;
	return res;
}
String name() {
	String s1="Java";
	String s2="Programming";
	return s1+s2;
}
public static void main(String[] args) {
	Parameters ob=new Parameters();
	ob.sum();
	float f1=2.5f;
	ob.product(3.7f, f1);
	int d=ob.difference(5,10);
	System.out.println(d);
	float f=ob.division();
	System.out.println(f);
	System.out.println(ob.name());
}
}
