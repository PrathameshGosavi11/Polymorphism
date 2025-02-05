
class  Test{

    

    public Test(int age,String name)
    {
        age=age;
        name=name;
        System.out.println("age is:"+age +"--"+"name is"+name);
        System.out.println("This is default construtor");
    }
    public void setAge(int age)
    {
        this.setAge(age);

    }

}

public class ConstrtorTest {
    
    public static void main(String[] args) {
        
        Test t=new Test(1, "Pratham");
        t.setAge(3);
    }
}
