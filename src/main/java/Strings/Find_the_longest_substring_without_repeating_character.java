package Strings;

import java.util.HashMap;

public class Find_the_longest_substring_without_repeating_character
{

                public static void main(String[] args)
                {
                        //Find the longest substring without repeating character
                        String s="cadbzabcd";
                        System.out.println("The longest substring without repeating characters is " + subArray(s));


                }
                public static String subArray(String s)
                {
                        if (s.length()==0)
                                return s;
                        String output="";
                        int l=0,r=0;
                        HashMap<Character,Integer> hm=new HashMap<>();
                        while(r<s.length())
                        {
                                if (hm.containsKey(s.charAt(r)))
                                {
                                        l=Math.max(hm.get(s.charAt(r))+1,l);
                                }
                                if(output.length()<r-l+1)
                                {
                                        output=s.substring(l,r+1);
                                }
                                hm.put(s.charAt(r),r);
                                r++;
                        }
                        return output;
                }

}
