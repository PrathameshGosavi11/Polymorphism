

class Test11
{
	public Test11()
	{
		System.out.println("This is default construtor");
	}
	
	public Test11(int a)
	{
		System.out.println("parametric construtor is :"+a);
	}
	
}
class Test21 extends Test11
{
	public Test21()
	{
		System.out.println("This is default construtor");
	}
	
	public Test21(int a)
	{
		super(a); //call the base class paramter 
		System.out.println("parametric construtor is :"+a);
	}
}
class Test31 extends Test21
{
	public Test31()
	{
        this(10); 
		System.out.println("This is default construtor");
	}
	
	public Test31(int a) // enter 
	{
		super(a);//super call the base class paramter construtor
		System.out.println("parametric construtor is :"+a);
	}
}

public class TestParametric {
    public static void main(String[] args) {
		
		Test31 test31 =new Test31();	 //when we call this construtor control go 35
    }			
}
