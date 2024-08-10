package Others;

public class Reverse_No_WIth_recursion
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
