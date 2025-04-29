package Oops;

abstract class Hotel{
	Hotel(){
		System.out.println("Hotel Constructor");
	}
	abstract void sambar();
	void dosa() {
		System.out.println("dosa");
	}
}
abstract class Kitchen extends Hotel{
	Kitchen(){
		System.out.println("Kitchen Constructor");
	}
	abstract void sambarPodi();
	void sambar() {
		System.out.println("Secret recipie");
	}
}
class Home extends Kitchen{
	void sambarPodi() {
		System.out.println("Sambar Podi");
	}
}
public class Abstract{
	public static void main(String[] args) {
		Hotel h=new Home();
		h.dosa();
		h.sambar();
	}
}