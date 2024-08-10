package Java_Programs;

import java.util.Arrays;

public class Program9
{
        public static void main(String[] args)
        {
                //Find the subarray in groups and Reverse them
                //input: {1,2,3,4,5,6,7,8} , k=3 (Make group of 3)
                //output: {3,2,1,6,5,4,8,7}

                int[] arr={1,2,3,4,5,6,7,8};
                int k=3;
                int start,end;
                for (int i=0;i< arr.length;i=i+k)
                {
                        start=i;
                        end=Math.min(i+k-1,arr.length-1);
                        while(start<end)
                        {
                                int temp=arr[start];
                                arr[start]=arr[end];
                                arr[end]=temp;
                                start++;
                                end--;
                        }
                }
                System.out.print(Arrays.toString(arr));

        }
}
