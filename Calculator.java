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
class Advanced extends Operation //using extends Keyword we reuse the coad.
{
   

    public int mul(int a,int b)
    {
        return a*b;
    }

    public int div(int a,int b)
    {
        return b/a;

    }
}
class ScientificCalculator extends Advanced
{
    

    public double power(double  num1,double num2)
    {
        return Math.pow(num1, num2);
         
    }

    public double sin(double a)
    {
        return Math.sin(a);
    }
    public double cos(double a)
    {
        return Math.cos(a);
    }

}
public class Calculator
{
    public static void main(String[] args)
     {
         Operation  operation=new Operation();

         System.out.println("first User");

         int result=operation.add(2, 3);
         System.out.println("addtion is:"+result);

         int resultSub=operation.sub(12, 10);
         System.out.println("substraction is:"+resultSub);

         System.out.println("2nd user");
         System.out.println("-----------------------");
        
        
         Advanced advanced=new Advanced();

         int r1=advanced.add(10, 5);
         System.out.println("advanced calculatoe  is:"+r1);

         int r2=advanced.sub(3, 1);
        System.out.println("substraction is:"+r2);

        int result3=advanced.mul(12, 12);
         System.out.println("multiplication is:"+result3);

         int result4=advanced.div(4, 16);
         System.out.println("division is :"+result4);

         System.out.println("---------------------------");
         System.out.println("3rd User");
         ScientificCalculator calculator=new ScientificCalculator();

         int sr1=calculator.add(2, 2);
         System.out.println(" addition result is scientific calculator is:"+sr1);
         
         int sr2=calculator.sub(5, 2);
         System.out.println(" suubstraction result is sci calculator is:"+sr2);

         int sr3=calculator.mul(5, 2);
         System.out.println(" multiplication result is sci calculator is:"+sr3);

         int sr4=calculator.div(10, 2);
         System.out.println(" division rsult is sci calculator is:"+sr4);

         double sr5=calculator.power(4.0, 2.0);
         System.out.println("Poerwe valu is "+sr5);

         double sr6=calculator.sin(3);
         System.out.println("sin value is :"+sr6);

         double sr7=calculator.cos(4);
         System.out.println("cos value is:"+sr7);


         

    }
}