package Java_Programs;

public class Program11
{
        public static void main(String[] args)
        {
                //Reverse a Number using Recursion
                int num=2873;
                reverse(num);

        }
        public static void reverse(int num)
        {
                if (num<10) {
                        System.out.println(num);
                        return;
                }
               else
                {
                        System.out.print(num%10);
                        reverse(num/10);
                }
        }
}
