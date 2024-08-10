package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Sort_Elements_BUBBLE_SORT
{
        public static void main(String[] args)
        {
            //Sort elements in Array (Bubble sort)
                int[] a={1,2,3,4,5,6,36,505,108,97,87};

                for (int i=0;i<a.length-1;i++)
                {
                        for (int j=0;j<a.length-1;j++)
                        {
                                if (a[j]>a[j+1])
                                {
                                        int temp=a[j];
                                        a[j]=a[j+1];
                                        a[j+1]=temp;
                                }
                        }
                }
                System.out.println(Arrays.toString(a));

        }
}
