package Oops;

public class ThisKey {
int roll;
String name;
ThisKey(){
	System.out.println("Default Constructor");
}
ThisKey(int roll,String name){
	this(); //invoke current class constructor
	this.roll=roll; //invoke instance variable
	this.name=name;
}
void meth() {
	System.out.println(this); //used to refer current class instance
	this.disp(this); // invoke instance method and passing this as a parameter
}
void disp(ThisKey i) {
	System.out.println(i);
	System.out.println(roll +" : "+name);
}
public static void main(String[] args) {
	ThisKey s1=new ThisKey(13,"Eswar");
	System.out.println(s1);
	s1.meth();
}
}
