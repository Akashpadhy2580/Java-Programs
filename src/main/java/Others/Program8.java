package Others;

public class Program8
{
        public static void main(String[] args)
        {
                //input: {9,9,9}
                //output: {1,0,0,0}

                //input: {9,7,8}
                //output: {9,7,9}

                int a[]={9,7,9};
                int len=a.length;
                for (int i=len-1;i>=0;i--)
                {
                        if (a[i]<9)
                        {
                                a[i]++;
                                break;
                        }
                        else
                                a[i]=0;

                }
                if (a[0]==0)
                {
                        a=new int[len+1];
                        a[0]=1;
                }
                for (int ele:a)
                        System.out.print(ele+" ");
        }
}
