package Strings;

import java.util.Arrays;

public class ReverseString_using_Sliding_Window_tech
{
        public static void main(String[] args)
        {
                //Reverse an array or String
                String s="Akash";
                char[] arr=s.toCharArray();
                int start=0;
                int end=arr.length-1;
                while(start<end)
                {
                        char temp=arr[start];
                        arr[start]=arr[end];
                        arr[end]=temp;
                        start++;
                        end--;
                }
                for (char a:arr) {
                        System.out.print(a);
                }


        }
}
