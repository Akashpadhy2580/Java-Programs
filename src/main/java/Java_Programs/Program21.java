package Java_Programs;

import java.util.HashSet;

public class Program21
{
        public static void main(String[] args)
        {
            //Find Duplicates in Array
                int[] a={1,2,3,4,5,4,3,5,6,7,8};

                //Way-1
                HashSet<Integer> set=new HashSet<>();
                for (int i=0;i<a.length;i++)
                {
                        if (!set.add(a[i]))
                        {
                                System.out.println("Duplicates found: "+a[i]);
                        }else
                                set.add(a[i]);
                }

                //Way-2
                boolean flag=false;
                for (int i=0;i<a.length;i++)
                {
                        for (int j=i+1;j<a.length;j++)
                        {
                                if(a[i]==a[j])
                                {
                                        System.out.println("Duplicates found: "+a[j]);
                                        flag=true;
                                }
                        }
                }
                if(flag==false)
                        System.out.println("Duplicates not found");
        }
}
