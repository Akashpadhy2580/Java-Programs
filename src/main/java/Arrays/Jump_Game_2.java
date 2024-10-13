package Arrays;

public class Jump_Game_2 {
    public static void main(String[] args)
    {
        int a[]={2,3,1,2,1,4};
        int n=a.length;
        int l=0,r=0;
        int jumps=0;
        while(r<n-1)
        {
            int farthest=0;
            for (int i=l;i<=r;i++)
                farthest=Math.max(farthest,i+a[i]);
            l=r+1;
            r=farthest;
            jumps++;
        }
        System.out.println(jumps);
    }
}
