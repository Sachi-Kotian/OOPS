interface Cartoon{
    String name="Doraemon"; //by default public static final
    public void display(); //by default public abstract method

}

class Character implements Cartoon{
    String character;
    public void display()
    {
        System.out.println("Main character is "+name);
    }
    public void printCharacter(String character)
    {
        System.out.println("Name of the character is "+this.character);

    }
}
public class O12_Interface {
    public static void main(String args[]){
        Character c1=new Character();
        c1.character="Nobita";
        c1.display(); //calling interface method
        c1.printCharacter(c1.character); //calling class method

    }
    
}
