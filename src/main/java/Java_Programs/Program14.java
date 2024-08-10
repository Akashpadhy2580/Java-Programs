package Java_Programs;

import java.util.Arrays;

public class Program14
{
        public static void main(String[] args)
        {
                //Reverse a String preserving space position
                //input: I am String
                //output: g ni rtSmaI

                String s="I am Akash";
                int start=0;
                int end=s.length()-1;
                char[] a=s.toCharArray();
                while(start<end)
                {
                        if (a[start]==' ')
                        {
                              start++;
                              continue;
                        } else if (a[end]==' ') {
                                end--;
                                continue;

                        }else {
                                char temp=a[start];
                               a[start]=a[end];
                               a[end]=temp;
                               start++;
                               end--;

                        }
                }
                for (char ch:a)
                        System.out.print(ch);
        }
}
