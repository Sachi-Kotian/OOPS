//cannot be instantiated
abstract class Fruits{
    String name;
    
    //abstract method does not have a body
    //abstract method has to be overriden
    abstract void taste(); 

    //non abstract method can have a body
    //can be called using object reference in subclass
    public void color()
    {
        System.out.println("Fruits have different colors");
    }

    public void printName()
    {
        System.out.println("Name of the fruit is "+this.name);
    }

    
    //static method can be defined in abstract class
    public static void printNutrition()
    {
        System.out.println("Fruits are rich in vitamins and minerals");
    }

    //final method is allowed in abstract class but cannot be overridden
    public final void display()
    {
        System.out.println("This is a final method in abstract class");
    }

    //constructor can be defined in abstract class
    Fruits(String name)
    {
        this.name=name;
         System.out.println("Fruits constructor called");
    }
    

    
}

class Citrus extends Fruits{
    public void taste()
    {
        System.out.println("Citrus fruits are sour");
    }
    Citrus(String name)
    {
        super(name); //calling the constructor of abstract class
         System.out.println("Citrus constructor called");

    }
}

public class O11_AbstractClass {

    public static void main(String args[])
    {
        Citrus c=new Citrus("Orange");
        c.taste(); //calling abstract method
        c.color(); //calling non abstract method
        c.display(); //calling final method
        Fruits.printNutrition(); //calling static method
        c.printName(); //calling non abstract method
    }
    
}
