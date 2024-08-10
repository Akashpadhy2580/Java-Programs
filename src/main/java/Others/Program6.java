package Others;

public class Program6
{
        public static void main(String[] args)
        {
                //Find if there is a subarray with sum is 0 or not
                int[] arr={-12,5,6,-5,6,-79,7,56,8,-89};
                boolean flag=false;
                int sum=0;
                for (int i=0;i<arr.length;i++)
                {
                        sum=sum+arr[i];
                        if (sum==0)
                        {
                                flag=true;
                        }
                        for (int j=i+1;j< arr.length;j++)
                        {
                                sum=sum+arr[j];
                                if (sum==0)
                                {
                                        flag=true;
                                }
                        }
                }
                if (flag==true)
                        System.out.println("there is a subarray with sum is 0");
                else
                        System.out.println("there is no subarray with sum is 0");

        }
}
