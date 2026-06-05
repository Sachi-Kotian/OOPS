class C{
    C()
    {
        System.out.println("Constructor of class C");
    }
    void display(){
        System.out.println("Hello I am C class");
    }
}

public class O14_AnonymousClass {
    public static void main(String args[])
    {
        new C().display(); //creating an anonymous object of class C and calling display method
    }
    
}
