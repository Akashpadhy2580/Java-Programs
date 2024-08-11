package Others;

public class Generate_Fibonacci_Series_In_Reverse_Recursion
{
    public static void main(String[] args)
    {
        int n=10;
        fibo(n,0,1);
    }
    public static void fibo(int n, int a,int b)
    {
        if (n>0)
        {
            fibo(n-1,b,a+b);
            System.out.print(a+" ");
        }
    }
}
