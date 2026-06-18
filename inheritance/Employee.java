package inheritance;

public class Employee extends IT {
	
	private String nameofemp;
	private int no;
	
	public Employee(String comname, String sector,
			int nooffloor, int noofemployees, 
			String nameofemp, int no) {
		super(comname, sector, nooffloor,
				noofemployees);
		this.nameofemp = nameofemp;
		this.no = no;
	}
	
	
	
	
	@Override
	public void name() {
		
		super.name();
			
	}
	public String getNameofemp() {
	    return nameofemp;
	}

	
	
	
	

}
