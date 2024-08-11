package Others;

public class Find_Nth_number_In_Fibonacci_Series
{
    public static void main(String[] args)
    {
        int n=4;
        System.out.print(fibo(n));

    }

    public static int fibo(int n)
    {
        if (n<=1)
            return n;
        else
            return fibo(n-1)+fibo(n-2);
    }
}
