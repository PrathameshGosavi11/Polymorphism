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

    public int mul(int a,int b)
    {
        return a*b;
    }

    public int div(int a,int b)
    {
        return b/a;

    }
}

public class Calculator
{
    public static void main(String[] args) {
         Operation  operation=new Operation();
         int result=operation.add(2, 3);
         System.out.println("addtion is:"+result);

         int resultSub=operation.sub(12, 10);
         System.out.println("substraction is:"+resultSub);

         int result3=operation.mul(12, 12);
         System.out.println("multiplication is:"+result3);

         int result4=operation.div(4, 16);
         System.out.println("division is :"+result4);
    }
}