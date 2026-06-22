package Collections;

public class comparabe3 implements Comparable<comparabe3> {
	
	private String name;
	private String rollno;
	
	public comparabe3(String name, String rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
	@Override
	public int compareTo(comparabe3 n) {
		if(this.name.compareTo(n.name)==0) {
			return 0;
		}else if(this.rollno.compareTo(n.rollno)>0) {
			return 1;
		}else
			return -1;
	}
	
	public String getname() {
		return name;
	}
	public String getrollno() {
		return rollno;
	}
	

}
