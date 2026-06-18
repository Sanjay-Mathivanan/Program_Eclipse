package Inter;

public class A3 extends Marks3{
	private float sub1, sub2, sub3;

	public A3(float sub1, float sub2, float sub3) {
		super();
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	public double getPercentage() {
		
		return (sub1+sub2+sub3)/300.0*100;
	}
	

}
