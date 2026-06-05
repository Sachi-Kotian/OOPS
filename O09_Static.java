class Mobile{
    Mobile()
    {
        System.out.println("Constructor called");
    }
    String brand;
    static String os;

    //static block-will be called only once when the class is loaded into memory
    //before constructor and main method
    static{
        int ram=128;
        System.out.println("Static block called. RAM is "+ram+"GB");
    }

    //only static variables can be accessed in static methods
    public static void printOS(String os)
    {
        System.out.println("Operating system is "+os);

    }

    //static method can access non static variable if object is passed
    public static void printBrand(Mobile m)
    {
        System.out.println("Brand of the mobile is "+m.brand);
    }
}

public class O09_Static {
    public static void main(String args[])
    {

        Mobile m1=new Mobile();
        Mobile.os="Android"; //accessing static variable using class name
        m1.brand="Redmi";
        Mobile m2=new Mobile();
        m2.brand="Samsung";
        System.out.println("Brand of m1 is "+m1.brand);
        System.out.println("Brand of m2 is "+m2.brand); 
        System.out.println("Operating System:"+Mobile.os); //accessing static variable using class name
        System.out.println(m1.os); //accessing static variable using object reference
        Mobile.printOS(Mobile.os); //accessing static method using class name   
        Mobile.printBrand(m1);//passing object to static method
        
    }
    
}
