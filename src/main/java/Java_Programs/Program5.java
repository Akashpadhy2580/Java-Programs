package Java_Programs;

public class Program5
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
