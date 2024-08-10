package Arrays;

import java.util.Arrays;

public class Find_Two_Sum
{
        public static void main(String[] args)
        {
                //Find two sum
                int[] a={2,7,8,5,11,15};
                int target=13;

                //Way-1
                for (int i=0;i<a.length;i++){
                        for (int j=i+1;j<a.length;j++)
                        {
                           if (a[i]+a[j]==target)
                                   System.out.println(i+ " "+j);
                        }
                }

                //Way-2 (2 pointer approach)
                System.out.println(Arrays.toString(twoSum(a,target)));

        }

        public static int[] twoSum(int[] a,int target)
        {
                int l=0;
                int r=a.length-1;
                while(l<r)
                {
                        if (a[l]+a[r]==target)
                                return new int[]{l,r};
                        else if (a[l]+a[r]>target)
                                r--;
                        else
                                l++;
                }
                return new int[]{-1,-1};
        }
}
