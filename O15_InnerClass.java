class Outer{
    public void display1()
    {
        System.out.println("Hello I am Outer class");
    }

    class Inner1{
        public void display2()
        {
            System.out.println("Hello I am Inner1 class");
        }
    }

    static class Inner2{
        public void display3()
        {
            System.out.println("Hello I am Inner2 class");
        }
    }
}

public class O15_InnerClass {
    public static void main(String args[])
    {
        Outer obj=new Outer();
        obj.display1(); //calling method of outer class
        Outer.Inner1 obj1=obj.new Inner1(); //creating object of non static inner class using outer class object
        obj1.display2(); //calling method of non static inner class
        Outer.Inner2 obj2=new Outer.Inner2(); //creating object of static inner class using class name
        obj2.display3(); //calling method of static inner class
    }
    
}
