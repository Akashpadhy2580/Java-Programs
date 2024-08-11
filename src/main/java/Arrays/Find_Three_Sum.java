package Arrays;

import java.util.*;

public class Find_Three_Sum
{
        public static void main(String[] args)
        {
                //Find three sum
                int[] a={-1,0,1,2,-1,-4};
                int target=0;

                System.out.println(threeSum(a,target));

        }

        public static List<List<Integer>> threeSum(int[] a,int target)
        {
                Set<List<Integer>> set=new HashSet<>();
                List<List<Integer>> result=new ArrayList<>();
                Arrays.sort(a);

                for(int i=0;i<a.length;i++)
                {
                        int j=i+1;
                        int k=a.length-1;
                        while(j<k)
                        {
                                int sum=a[i]+a[j]+a[k];
                                if (sum==target)
                                {
                                        set.add(Arrays.asList(a[i],a[j],a[k]));
                                        j++;
                                        k--;
                                }
                                else if (sum>target) {
                                        k--;

                                }else
                                        j++;
                        }
                }
                result.addAll(set);
                return result;
        }
}
