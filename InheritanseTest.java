
class a{
    public void x()
    {
        System.out.println("i am x");
    }
}
class B  extends a
{
    public void y()
    {
        System.out.println("i am y");
    }
}
 class C extends B {

    public void Z()
    {
        System.out.println("i am z");
    }

    
}
public class InheritanseTest {
    public static void main(String[] args) {
        B b=new B();
        b. x();
        b.y();
        System.out.println("----------------");
        C c=new C();
        c.x(); //look up start here. jis class object ham bana rahe hai vahi se look up start.
        c.y();
        c.Z();
    }
}
