package Oops;

public class Recursive {
	class Outer{
		void outMeth() {
			System.out.println("outer class method");
		}
		class Inner{
			void inMeth() {
				System.out.println("Inner class method");
			}
		}
	}

    public static void main(String[] args) {
        Recursive recursive = new Recursive(); 
        Outer out = recursive.new Outer(); 
        out.outMeth();
        Outer.Inner in = out.new Inner(); 
        in.inMeth(); 
    }
}
