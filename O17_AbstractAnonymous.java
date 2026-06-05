abstract class Shape{
    public abstract void edges();
    public abstract void area();
}
public class O17_AbstractAnonymous {
    public static void main(String args[])
    {
        Shape s=new Shape(){
            public void edges()
            {
                System.out.println("I have 4 edges");
            }
            public void area()
            {
                System.out.println("Area is length*width");
            }
        };
        s.edges();
        s.area();
    }
    
}
