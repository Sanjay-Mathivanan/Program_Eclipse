package composition;

public class Dept {
	private String Deptname;
	private int Deptfloor;
	private Students std;
	
	public Dept(String deptname,int floor,Students std) {
		this.Deptname = deptname;
		this.Deptfloor = floor;
		this.std = std;
		
	}

	public String getDeptname() {
		return Deptname;
	}

	public int getDeptfloor() {
		return Deptfloor;
	}
	
	public Students getStudents() {
		return std;
	}
	
    public void OpeningDate(){
        System.out.println("The Opening date is 20th JAN");
    }


}
