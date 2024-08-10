package Strings;

import java.util.HashMap;

public class Find_Occurance_of_Each_Char_In_String
{
        public static void main(String[] args)
        {
                //Find Occurance of each Character in a String
                String s="Akash Kumar Padhy";
                HashMap<Character, Integer> hm=new HashMap<>();
                for (Character ch:s.trim().toCharArray())
                {
                        if (hm.containsKey(ch)) {
                             hm.put(ch, hm.get(ch)+1);

                        }
                        else
                                hm.put(ch,1);
                }
                for (Character c:hm.keySet())
                {
                        System.out.println(c+ " :"+hm.get(c));
                }
        }
}
