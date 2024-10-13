package Arrays;

public class Trapping_Rain_Water {
    public static void main(String[] args){
        int a[]={4,2,0,3,2,5};
        int n=a.length;

        //Way-1
        int left[]=new int[n];
        int right[]=new int[n];
        int ans=0;

        left[0]=a[0];
        for (int i=1;i<n;i++)
        {
            left[i]=Math.max(left[i-1],a[i]);
        }

        right[n-1]=a[n-1];
        for (int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],a[i]);
        }

        for (int i=0;i<n;i++)
        {
            ans=ans+Math.min(left[i],right[i])-a[i];
        }
        System.out.println(ans);

        //Way-2 (2 pointer approach)
        int leftmax=0;
        int rightmax=0;
        int l=0, r=n-1;
        int res=0;
        while(l<r)
        {
            if (a[l]>leftmax)
                leftmax=Math.max(leftmax,a[l]);
            if (a[r]>rightmax)
                rightmax=Math.max(rightmax,a[r]);
            if (leftmax<rightmax)
            {
                res=res+leftmax-a[l];
                l++;
            }
            else {
                res=res+rightmax-a[r];
                r--;
            }
        }
        System.out.println(res);
    }
}
