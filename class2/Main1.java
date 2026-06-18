package class2;

public class Main1 {
	public static void main(String[]args) {
	
//	building newb = new building("red");
//	building oldb =newb;
//	System.out.println(newb.getcolor());
//	System.out.println(oldb.getcolor());
//	
//	building curb=new building("black");
//	System.out.println(curb.getcolor());
	
	building test = new building();
	test.setcolor("yellow");
	System.out.println(test.getcolor());
	
	

	
	}

}

class building{
	private String color;
	
	public void setcolor(String color) {
		this.color = color;
	}
	
//	public building(String color) {
//		this.color = color;
//	}
	
	public String getcolor() {
		return color;
	}
	
	
	
}
