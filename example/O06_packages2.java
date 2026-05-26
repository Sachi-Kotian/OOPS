package example;
public class O06_packages2 {
    public static void main(String args[])
    {
        email e2=new email();
        e2.emailId="xyz@example.com";
        e2.dob="01-01-2000";    
        
        System.out.println(e2.emailId);
        System.out.println(e2.dob);
    }

}