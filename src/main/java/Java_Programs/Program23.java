package Java_Programs;

import java.util.Arrays;

public class Program23
{
        public static void main(String[] args)
        {
            //Move all zeros to end of an array
                int[] a={1,5,9,0,8,0,6,0,0,4,8,6};
                int count=0;

                for (int i=0;i<a.length;i++)
                {
                        if (a[i]!=0)
                        {
                                a[count]=a[i];
                                count++;
                        }
                }
                while(count<a.length)
                {
                        a[count]=0;
                        count++;
                }
                System.out.println(Arrays.toString(a));
        }
}
