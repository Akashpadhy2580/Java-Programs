package Others;

public class Average_of_Prime_Nos_in_a_given_range
{
        public static void main(String[] args)
        {
                //Average of Prime Nos in a given range
                int start=10;
                int end=20;
                System.out.println(averageofPrime(start,end));
        }

        public static double averageofPrime(int start,int end)
        {
                int sum=0,count=0;
                for (int i=start;i<=end;i++)
                {
                        if (isPrime(i))
                        {
                                sum=sum+i;
                                count++;
                        }
                }
                return (double) sum/count;
        }

        public static boolean isPrime(int n)
        {
             boolean flag=true;
             int count=0;
             if (n<1)
                     return false;
             for (int i=1;i<=n;i++)
             {
                     if (n%i==0)
                             count++;
             }
             if (count==2)
                     return true;
             else
                     return false;
        }
}
