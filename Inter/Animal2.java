package Inter;

public abstract class Animal2 {
    public String Name;
    public Animal2(String name){
        Name = name;
    }
    public abstract void height();
    public abstract void lifeSpan();

    public String getName(){
        return Name;
    }
   
}