package Strings;

public class Swap_2_strings_without_3rd_Variable
{
        public static void main(String[] args)
        {
                //Swap 2 strings without using 3rd Variable
                String a="Akash";
                String b="Kumar";
                System.out.println("Before swapping: "+a+ " "+b);

                a=a+b;
                b=a.substring(0,(a.length()-b.length()));
                a=a.substring(b.length());
                System.out.println("After swapping: "+a+" "+b);

        }
}
