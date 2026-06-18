package inheritance;

public class Main {
	public static void main(String[]args) {
	
	IT it = new IT("vs3","coding",8,1000);
	Employee emp = new Employee("vs3","coding",
			8,1000,"sanjay",23);
	
	it.name();
	emp.name();
	

}
}