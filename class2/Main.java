package class2;

public class Main {
	public static void main(String[] args) {
		name obj = new name();
		
		obj.setFirstname("sanjay");
		obj.setLastname("m");
		
        String resf = obj.getFirstname();
        String resl = obj.getLastname();
        System.out.println(resf);
        System.out.println(resl);
	}

}
