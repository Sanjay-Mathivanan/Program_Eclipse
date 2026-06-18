package Inter;

public abstract class Bird2 extends Animal2{
    public Bird2 (String name){
        super(name);
    }


    @Override
    public void height() {
        // TODO Auto-generated method stub
        System.out.println("Most birds have very less height");
       
    }


    @Override
    public void lifeSpan() {
        // TODO Auto-generated method stub
        System.out.println("Birds have low life span");
       
    }
    public abstract void fly();
   
}