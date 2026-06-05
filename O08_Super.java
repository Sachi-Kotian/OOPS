class Parents{
    int age;
    Parents()
    {
        System.out.println("Parent constructor called");
    }
    public void display(int age)
    {
        System.out.println("Age of the parent is "+age);
    }
}

class Mother extends Parents{
    String name;
    Mother()
    {
        super(); //calls the parent constructor
        System.out.println("Mother constructor called");
        super.display(50); //calls the parent display method
    }


    public void display()
    {
        System.out.println("Name of the mother is "+this.name);
    }
}

public class O08_Super {
    public static void main(String args[])
        {
            Mother m1=new Mother();
            m1.name="Jane";
            m1.display();


        }
    
    
}
