package Arrays;

import java.util.Arrays;

public class Find_Smallest_and_Largest_element_in_an_Array
{
        public static void main(String[] args)
        {
                //Find Second smallest and Second Largest element in an array
                int[] a={1,5,68,78,9,52,44,16,18,364,78,64};

                //Way-1
//                Arrays.sort(a);
//                System.out.println("Smallest: "+a[0]);
//                System.out.println("largest: "+a[a.length-0]);


                //Way-2
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for (int i:a)
                {
                        if(i<min)
                                min=i;
                        if(i>max)
                                max=i;
                }
                System.out.println("Smallest: "+min);
                System.out.println("largest: "+max);


        }
}
