class Cars{
    String color;

    public void display()
    {
        System.out.println("Color of the car is "+this.color);
    }
}

//if one then single level inheritance
class Supercars extends Cars{
    String brand;

    //Method overriding
    public void display()
    {
        System.out.println("Brand of the car is "+this.brand);
    }

}

//Multilevel inheritance
class SportsCars extends Supercars{
    int speed;

    public void display()
    {
        System.out.println("Speed of the car is "+this.speed);
    }
}

//Hierarchical inheritance
class ElectricCars extends Cars{
    int batteryCapacity;

    public void display()
    {
        System.out.println("Battery capacity of the car is "+this.batteryCapacity);
    }
}



public class O07_Inheritance {
    public static void main(String args[])
    {
        Cars c1=new Cars();
        c1.color="Red"; 
        c1.display();

        Supercars s1=new Supercars();
        s1.brand="Ferrari";     
        s1.display();

        SportsCars sp1=new SportsCars();
        sp1.speed=300;
        sp1.display();  

        ElectricCars e1=new ElectricCars();
        e1.batteryCapacity=100; 
        e1.display();

        //Dynamic method dispatch and upcasting
        Cars c2=new Supercars();//can only access the members of Cars class and not Supercars class
        c2.color="Blue";
        c2.display(); //This will call the display method of Cars class and not Supercars
    
        Supercars s2=(Supercars)c2; //downcasting
        s2.brand="Lamborghini"; 
        s2.display(); //This will call the display method of Supercars class
    }


    
}
