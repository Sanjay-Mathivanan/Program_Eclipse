package basic;

class Mydata{
	int a=10;
	char ch ='f';
	String str = "Class";
	void hello()
	{
		System.out.println("hello");
	}
}

public class Variables {
	
	

	//methods
	//access modeifier// keyword // data type //variable name
	public static void main(String[] args) {
		
		Mydata data = new Mydata();//obj1
		Mydata data1 = new Mydata();//obj2
		//reference 
		
		
		//System.out.println(data);
		data.a++;
		
		System.out.println(data.a);//11
		data1.a++;
		System.out.println(data1.a);//12
	}

}
