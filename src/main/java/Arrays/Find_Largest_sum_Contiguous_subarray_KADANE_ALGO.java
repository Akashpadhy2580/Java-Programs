package Arrays;

public class Find_Largest_sum_Contiguous_subarray_KADANE_ALGO
{
        public static void main(String[] args)
        {
                //Find the largest sum contiguous array( Kadane's Algo )
                int[] arr={-12,11,-13,-5,6,-7,5,-3,-6};
               int sum=0;
               int max=arr[0];
               for (int a:arr)
               {
                       sum=sum+a;
                       if (sum>max)
                               max=sum;
                       if (sum<=0)
                               sum=0;
               }
                System.out.println(max);
        }
}
