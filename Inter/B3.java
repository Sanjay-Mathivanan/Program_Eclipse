package Inter;

public class B3 extends Marks3{
	private float sub1,sub2,sub3,sub4;

	public B3(float sub1, float sub2, float sub3, float sub4) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}
	
	 public double getPercentage() {
		return (sub1 + sub2 + sub3 +sub4)/400.0 * 100;
		}
	
	

}
