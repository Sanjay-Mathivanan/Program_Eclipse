package class1;

public class circle {
	//constructor for getting the radius val from main method
	private double radius;
	public circle(double radius) { //3.75
		this.radius=radius; //radius=3.75
	}
	
	//this method is radius is valid or not -- sent to main method
	public double getRadius() {
		if(radius<0) {
			radius =0;
			return radius;
		}else {
			return radius;
		}
		
	}
	//send to area to the main method
	public double getArea() {
		double area =(radius*radius*Math.PI);
		return area;
	}
	
	
	public class Cylinder extends circle{
		private double height;
		public Cylinder(double radius, double height) {
			super(radius);
			this.height=height;
		}
	    public double getHeight ()
	    {
	        if (height > 0)
	        {
		        return height;
	        }
	        else
	        {
		        height = 0;
		        return height;
	        }
	    }

	    public double getVolume ()
	    {
	        double area = getArea () * getHeight ();
	        return area;
	    }
	}
	



public static void main(String[] args) {

    circle Circle = new circle (3.75);
    System.out.println ("circle.radius= " + Circle.getRadius ());
    System.out.println ("circle.area= " + Circle.getArea ());
	
	//cyclinder
    circle.Cylinder cylinder = Circle.new Cylinder (5.55, 7.25);
    System.out.println ("cylinder.radius= " + cylinder.getRadius ());
    System.out.println ("cylinder.height= " + cylinder.getHeight ());
    System.out.println ("cylinder.area= " + cylinder.getArea ());
    System.out.println ("cylinder.volume= " + cylinder.getVolume ());
	
	
	
	
	
}

}