package Others;

public class Factorial_With_recursion
{
        public static int factorial(int n)
        {
                if (n==0)
                        return 1;
                else
                        return (n*factorial(n-1));

        }
        public static void main(String[] args)
        {
                //Factorial of a no using and with using Recursion
                int num=5;
                int fact=factorial(num);
                System.out.print(fact);

        }
}
