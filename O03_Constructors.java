class Animal{
    String type;

    //Non-parameterized constructor
    public Animal()
    {
        System.out.println("Constructor called");
    }

    //Parameterized constructor
    public Animal(String name)
    {
        this.type=name;
    }
}

class WildAnimals{
    String color;
    public WildAnimals()
    {
        System.out.println("Constructor called");
    }

    //Copy constructor  
    public WildAnimals(WildAnimals w)
    {
        this.color=w.color;
    }

}

public class O03_Constructors {
    public static void main(String args[])
    {
        Animal a1=new Animal();
        Animal a2=new Animal("Cat");
        System.out.println(a2.type);    

        WildAnimals w1=new WildAnimals();
        w1.color="Brown";
        WildAnimals w2=new WildAnimals(w1);
        System.out.println(w2.color);

    }
    
}
