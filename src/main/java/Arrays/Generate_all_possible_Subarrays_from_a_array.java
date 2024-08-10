package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Generate_all_possible_Subarrays_from_a_array
{
        public static void main(String[] args)
        {
                //Print all combinations of subarrays in a given Array

                //Way-1
                int[] arr={1,2,3,4,5,6,7,8};
                int n=arr.length;
                for (int i=0;i<arr.length;i++)
                {
                        ArrayList<Integer> al=new ArrayList<>();
                        for (int j=i;j<arr.length;j++)
                        {
                                if (i<=j)
                                {
                                        al.add(arr[j]);
                                        System.out.println(al);
                                }
                        }
                }


                //Way-2
                // Generate all possible subarrays
                for (int i = 0; i < n; i++) {
                        for (int j = i; j < n; j++) {
                                System.out.println(Arrays.toString(Arrays.copyOfRange(arr, i, j + 1)));
                        }
                }

        }
}
