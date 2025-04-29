package Constructor;

public class ArrayObject {
	int roll;
	String name;
ArrayObject(){
	System.out.println("Constructor");
}
ArrayObject(String n,int r){
	roll=r;
	name=n;
}
void disp() {
	System.out.println("Name:"+name+"Roll no:"+roll);
}
public static void main(String[] args) {
	ArrayObject [] s=new ArrayObject[3];
	s[0]=new ArrayObject();
	s[1]=new ArrayObject("Eswar",13);
	s[2]=new ArrayObject();
	for(ArrayObject i:s) {
		i.disp();
	}
}
}
