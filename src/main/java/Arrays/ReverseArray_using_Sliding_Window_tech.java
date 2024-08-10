package Arrays;

import java.util.Arrays;

public class ReverseArray_using_Sliding_Window_tech
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
