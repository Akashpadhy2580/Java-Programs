package Java_Programs;

import java.util.Arrays;

public class Program25
{
        public static void main(String[] args)
        {
                //Move all zeros to start of an array
                int[] a={1,5,9,0,8,0,6,0,0,4,8,6};
                int count=a.length-1;

                for (int i=a.length-1;i>=0;i--)
                {
                        if (a[i]!=0)
                        {
                                a[count]=a[i];
                                count--;
                        }
                }
                while(count>=0)
                {
                        a[count]=0;
                        count--;
                }
                System.out.println(Arrays.toString(a));
        }
}
