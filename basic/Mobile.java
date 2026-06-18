package basic;

public class Mobile {
	void iphone() {
		System.out.println("this is iphone");
	}
	static void oppo() {
		System.out.println("this is oppo");
		Mobile obj = new Mobile();
		obj.samsung();
	}
	void samsung() {
		System.out.println("this is samsung");
	}
	
	public static void main(String[]args) {
		Mobile fun = new Mobile();
		fun.iphone();
		
		fun.oppo();
		fun.samsung();
	}

}
