package Java_Programs;

import java.util.HashMap;

public class Program39
{
        public static void main(String[] args)
        {
                //Find the length longest substring without repeating character
                String s="cadbzabcd";
                System.out.println("The length of the longest substring without repeating characters is " + subArray(s));


        }
        public static int subArray(String s)
        {
                if (s.length()==0)
                        return 0;
                int maxlength=0;
                int l=0,r=0;
                HashMap<Character,Integer> hm=new HashMap<>();
                while(r<s.length())
                {
                        if (hm.containsKey(s.charAt(r)))
                        {
                                l=Math.max(hm.get(s.charAt(r))+1,l);
                        }
                        hm.put(s.charAt(r),r);
                        maxlength=Math.max(r-l+1,maxlength);
                        r++;
                }
                return maxlength;
        }



}
