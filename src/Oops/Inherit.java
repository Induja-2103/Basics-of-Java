package Oops;
	class EshwarDad{
		long dadp=999999;
		void dadphone() {
			System.out.println("its dad phone");
		}
	}
	class Eshwar extends EshwarDad{
		long ph=888888;
		void phone() {
			System.out.println("its Eshwar phone");
		}
	}
	class EshwarSon extends Eshwar{
		long son=777777;
		void sonphone() {
			System.out.println("its Eshwar son phone");
			}
		}
	public class Inherit{
		public static void main(String[] args) {
				Eshwar es=new Eshwar();
				es.dadphone();
				es.phone();
				//es.sonphone();
			}
}

