import example.*;

class LogIn{
    String username;
    private String password;

    public void getPassword()
    {
        System.out.println(this.password);
    }

    class Package extends O05_packages{


    }

    public void setPassword(String password)
    {
        this.password=password;
    }
    
}

class Package extends O05_packages{

    Package()
    {
        System.out.println("Class Package Constructor called");
    }
    public void display()
    {
        System.out.println("Value of x is "+x);
    }


}

public class O04_AccessModifiers{
    public static void main(String args[])
    {

        LogIn u1=new LogIn();
        u1.username="Ria";
        u1.setPassword("abc123");   
        System.out.println(u1.username);
        u1.getPassword();

        Package p1=new Package();
        p1.display();

        

    }
}