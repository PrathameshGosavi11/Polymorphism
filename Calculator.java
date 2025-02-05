class Operation
{
    public int add(int a,int b)
    {
        return a+b;

    }

    public int sub(int a,int b)
    {
        return a-b;
    }
}

public class Calculator
{
    public static void main(String[] args) {
         Operation  operation=new Operation();
         int result=operation.add(2, 3);
         System.out.println(result);
    }
}