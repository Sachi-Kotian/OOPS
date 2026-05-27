//cannot be inherited
final class Marks{
    int marks;
    public void grade(int marks)
    {
        System.out.println("Marks obtained: "+this.marks);
    }
}

class Attendance{
    final int percent=100; //final variable cannot be changed
    final void display() //final method cannot be overridden
    {
        System.out.println("Attendance should be "+percent+" %");
    }
}

public class O10_Final {
    public static void main(String args[])
    {
        Marks m1=new Marks();
        m1.marks=85;
        m1.grade(m1.marks);

        Attendance a1=new Attendance();
        a1.display();
    }
    
}
