package Arrays;

import java.util.Arrays;

public class Program4
{
        public static void main(String[] args)
        {
                //Move all -ve numbers to the beginning and positive to end with constant extra space
                //input: {-12,11,-13,-5,6,-7,5,-3,-6}
                //output: {-13,-12,-7,-6,-5,-3,5,6,11}

                int[] arr={-12,11,-13,-5,6,-7,5,-3,-6};
                //way-1
                Arrays.sort(arr);
                for(int a:arr){
                        System.out.print(a+" ");
                }

                //way-2
                int[] a={-12,11,-13,-5,6,-7,5,-3,-6};
                int j=0;
                for (int i=0;i<a.length;i++)
                {

                        if (a[i]<0)
                        {
                                if (i!=j)
                                {
                                    int temp=a[i];
                                    a[i]=a[j];
                                    a[j]=temp;
                                }
                                j++;
                        }
                }
                System.out.println(Arrays.toString(a));

        }
}
