package Collections;

public class comparable implements Comparable<comparable> {
	
	private int age;

	public comparable(int age) {
		super();
		this.age = age;
	}
	
	public int compareTo(comparable s) {
		return this.age - s.age;
	}
	public String toString() {
		return age + "";
	}

}


