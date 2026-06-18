package composition;

public class Main {
	public static void main(String[] args) {
		
		Students student = new Students("sanjay",23,86);
		Dept dep = new Dept("AIDS",6,student);
		Kgisl ass = new Kgisl("kgisl",dep);
		
	    System.out.println(ass.getName());
	    ass.getDept().OpeningDate();
	    System.out.println(ass.getDept().getStudents().getRollno());	
			
		
		
	}

}
