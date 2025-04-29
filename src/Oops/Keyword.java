package Oops;

public class Keyword {
class OldoldNgp{
	OldoldNgp(){
		System.out.println("Grand parent");
	}
	OldoldNgp(int n){
		System.out.println("parameter grand parent");
	}
}
class OldNgp extends OldoldNgp{
	final int num=50;
	OldNgp(){
		System.out.println("parent class");
	}
	OldNgp(int n){
		System.out.println("parameter parent class");
	}
}
class NewNgp extends OldNgp{
	NewNgp(){
		System.out.println("child class");
	}
	NewNgp(int n){
		
	}
}
}
