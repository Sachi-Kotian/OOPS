class Student{
    int roll;
    String name;

    public void printDetails()
    {
        System.out.println("Roll: " +this.roll);
        System.out.println("Name: " +this.name);
    }
}

public class O01_ClassObjects{
    public static void main(String args[])
    {

        Student s1=new Student();
        s1.roll=1;
        s1.name="Ria";
        s1.printDetails();

         Student s2=new Student();  
        s2.roll=2;
        s2.name="Rohit";    
        s2.printDetails();

    }
}