package Constructor;

public class Parameterized {
int roll;
String Name;
Parameterized(int r,String n){
	roll=r;
	Name=n;
}
Parameterized(){
	System.out.println("f");
}
void disp() {
	System.out.println("Name:"+Name+"\nRoll no:"+roll);
}
public static void main(String[] args) {
	Parameterized s1=new Parameterized(30,"Indu");
	Parameterized s2=new Parameterized();
	s1.disp();
}
}
