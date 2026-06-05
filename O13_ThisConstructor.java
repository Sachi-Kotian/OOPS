class A{
    A(){
        System.out.println("A constructor called");
    }
}

class B extends A{

    B()
    {
        System.out.println("B constructor called");
    }

    B(int x)
    {
        this(); //calls the default constructor of the same class
        System.out.println("In int B");
    }

}

public class O13_ThisConstructor{
    public static void main(String args[])
    {
        B obj1=new B();
        B obj2=new B(10);
    }
}