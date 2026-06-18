package Inter;

public class Sanjay1 implements Imy1 {
	
	private String name;
	private int age;
	private int rollno;
	private String dept;
	private int year;
	
	

	public Sanjay1(String name, int age, int rollno, String dept, int year) {
		super();
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		this.dept = dept;
		this.year = year;
	}

	@Override
	public void name() {
		System.out.println("Name of the student : " +name);
		
	}

	@Override
	public void age() {
		System.out.println("age of the studnet : " +age);
		
	}

	@Override
	public void rollno() {
		// TODO Auto-generated method stub
		System.out.println("Roll no of the student : " +rollno);
		
	}

	@Override
	public void dept() {
		// TODO Auto-generated method stub
		
		System.out.println("Dept of the student : " +dept);
		
	}

	@Override
	public void year() {
		// TODO Auto-generated method stub
		System.out.println("year of the student : " +year);
		
	}
	
	
	

}
