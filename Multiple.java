

class Vehical
{
    public void show()
    {
        System.out.println("SHow ");
    }
}
class Car extends Vehical
{
    public void start()
    {
        System.out.println("start");
    }
}

class Bike
{
    public void Horn()
    {
        System.out.println("stop the horn");
    }
}
public class Multiple {
    
    public static void main(String[] args) {
        
       Car car=new Car();
       car.show();
       car.start();
        
       Bike bike=new Bike();
       bike.Horn();
     
    }
}
