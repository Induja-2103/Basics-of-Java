package Oops;
interface Hotels{
	int idly=10;    //public,static,final
	//all methods inside interface are abstract by default
	public void sambar();
	//to make the method default use default keyword
	default void dosa() {
		System.out.println("making dosa infront of others");
	}
	static void parcel() {
		System.out.println("Get the parcel here");
	}
}
class Kitchens implements Hotels{
	public void sambar() {
		System.out.println("Cooking sambar secretly in kitchen");
	}
}

public class Interfaces{
	public static void main(String[] args) {
		Hotels h= new Kitchens();
		h.sambar();
		h. dosa();
		Hotels.parcel();
		}
}

