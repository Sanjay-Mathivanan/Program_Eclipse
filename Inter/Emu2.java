package Inter;

public class Emu2 extends Bird2 implements FlyOrNot2 {
    public Emu2(String name){
        super(name);
    }


    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("We Don't Fly");
       
    }
     
}
