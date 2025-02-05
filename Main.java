class Vehical
{
    public void x()
    {
        System.out.println("I am x");
    }
    public void m()
    {
        System.out.println("i am m");
    }
}
class bike1  
{
    public void y()
    {
        System.out.println("I am y");
    }

    public void m()
    {
        System.out.println("i am m");
    }

}
class Car extends Vehical ,bike1
{
    public void z()
    {
        System.out.println("I am Z");
    }
}
public class Main {
    public static void main(String[] args) {
     Car c=new Car();
     c.z();   
     c.x();
     c.m();
    
    
    }

}
