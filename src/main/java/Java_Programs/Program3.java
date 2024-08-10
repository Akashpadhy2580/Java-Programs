package Java_Programs;

import java.util.Arrays;

public class Program3
{
        public static void main(String[] args)
        {
                //Reverse an array or String
                int[] arr={1,5,9,7,8};
                int start=0;
                int end=arr.length-1;
                while(start<end)
                {
                        int temp=arr[start];
                        arr[start]=arr[end];
                        arr[end]=temp;
                        start++;
                        end--;
                }
                System.out.println(Arrays.toString(arr));

        }
}
