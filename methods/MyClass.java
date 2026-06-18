package methods;

public class MyClass { //class

    private int myVariable;

    public MyClass() { //constructor
        System.out.println("Default Constructor Called");
    }

    public MyClass(int value) {
        this.myVariable = value;
        System.out.println("Int Constructor Called");
    }

    public MyClass(String name, int age) {
        System.out.println("String and Int Constructor Called");
    }

    public static void main(String[] args) {

        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass(20);
        MyClass myClass3 = new MyClass("Ramesh", 20);
    }
}