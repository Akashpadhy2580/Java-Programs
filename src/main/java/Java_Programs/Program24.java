package Java_Programs;

public class Program24
{
        public static void main(String[] args)
        {
                //Reverse of an integer
                int x=-123;
                System.out.println(reverse(x));
        }
        public static int reverse(int x)
        {
                int original=x;
                int rev=0;
                if (x<0)
                        original=-1*x;
                while(original>0)
                {
                      rev=rev*10+original%10;
                      original/=10;
                }
                if (x< Integer.MIN_VALUE || x>Integer.MAX_VALUE)
                {
                        return 0;
                }
                if (x<0)
                        return (int)(-1*rev);
                return (int) rev;
        }
}
