package composition;

public class Students {
	private String stdname;
	private int rollno;
	private int regno;
	
	public Students(String stdname,int roll,int reg) {
		this.stdname = stdname;
		this.rollno = roll;
		this.regno = reg;
	}
	
	public String getStdname() {
		return stdname;
	}
	public int getRollno() {
		return rollno;
	}
	public int getRegno() {
		return regno;
	}


}
