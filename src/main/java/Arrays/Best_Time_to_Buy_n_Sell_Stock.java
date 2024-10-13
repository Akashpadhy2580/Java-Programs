package Arrays;

import java.util.Arrays;

public class Best_Time_to_Buy_n_Sell_Stock
{
        public static void main(String[] args)
        {
                //Find the Max Profit
                //input: {7,1,5,3,6,4}
                //output: 5

                int[] arr={7,1,5,3,6,4};
                System.out.println("Max profit: "+ maxProfit(arr));
        }

        public static int maxProfit(int[] a)
        {
                int maxProfit=Integer.MIN_VALUE;
                int buy=a[0];
                for (int i=1;i<a.length;i++)
                {
                        if (a[i]<buy)
                                buy=a[i]; //Checking for lowest value of Stock
                        else if(a[i]-buy>maxProfit)
                        {
                                maxProfit=a[i]-buy;
                        }
                }
            return maxProfit;
        }
}
