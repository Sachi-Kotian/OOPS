class India{
    public void display()
    {
        System.out.println("India is a diverse country");
    }
}

public class O16_AnonymousInner {
    
    public static void main(String args[])
    {
        //anonymous inner class
        //used when diifferent definition of a class is needed only once
        India i1=new India(){
            public void display()
            {
                System.out.println("India is in South Asia");
            }
        };
        i1.display();
    }
}
