package Others;

public class Factorial_Without_recursion
{
        public static void main(String[] args)
        {
                //Factorial of a no using and without using Recursion
                int n=5;
                int fact=1;
                for (int i=1;i<=n;i++)
                {
                     fact=fact*i;
                }
                System.out.print(fact);
        }
}
