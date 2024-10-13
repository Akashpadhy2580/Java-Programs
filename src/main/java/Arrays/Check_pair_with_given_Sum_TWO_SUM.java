package Arrays;

import java.util.Arrays;

public class Check_pair_with_given_Sum_TWO_SUM
{
        public static void main(String[] args)
        {
                //Find two sum
                int[] a={2,7,8,5,11,15};
                int target=103;

                //Way-1 (2 pointer approach)
               if(twoSum(a,target))
                        System.out.print("Yes");
               else
                       System.out.print("No");

        }

        public static boolean twoSum(int[] a,int target)
        {
                int l=0;
                int r=a.length-1;
                while(l<r)
                {
                        if (a[l]+a[r]==target)
                                return true;
                        else if (a[l]+a[r]>target)
                                r--;
                        else
                                l++;
                }
                return false;
        }
}
