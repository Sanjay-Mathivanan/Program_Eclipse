package methods;

public class conschaing {
	int id ;
	String name;
	
	public conschaing() {
		this(23,"sanjay");
	}
	
	public conschaing(int rollno,String student) {
		this.id = rollno;
		this.name =student;
	}
	
	public void display() {
		System.out.println(id + " and " + name);
	}
	
	public static void main(String[]args) {
		conschaing var = new conschaing();
		var.display();
		
	}

}
