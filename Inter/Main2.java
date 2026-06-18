package Inter;

public class Main2{
    public static void main(String[] args){
       
        Elephant2 elephant = new Elephant2("Tom");
        elephant.height();
        elephant.lifeSpan();

        Sparrow2 bird = new Sparrow2("Rock");
        bird.height();
        bird.lifeSpan();
        bird.fly();
        
        Emu2 emu = new Emu2("Harry");
        emu.getName();
        emu.lifeSpan();
        emu.fly();
    }
}
