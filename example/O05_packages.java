package example;
class email{
    String emailId;
    protected String dob;

}
public class O05_packages{
    protected int x=10;
    public static void main (String agrs[])
    {
        
        email e1=new email();
        e1.emailId="abc@example.com";
        System.out.println(e1.emailId);


    }
}