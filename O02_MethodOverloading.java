class Numbers{
    public int add(int a, int b)
        {
            return a+b;
        }
    public int add(int a, int b, int c)
        {
            return a+b+c;
        }
    
}

public class O02_MethodOverloading {
    public static void main(String args[])
        {
            Numbers n=new Numbers();
            System.out.println(n.add(2, 3));
            System.out.println(n.add(2, 3, 4));

        }
    
}
