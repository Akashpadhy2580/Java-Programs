package Strings;

import java.util.HashSet;

public class Remove_Duplicates_from_string
{
        public static void main(String[] args)
        {
                //Remove duplicate characters in a String
                String s="akash";
                HashSet<Character> set=new HashSet<>();
                for (char ch:s.toCharArray())
                {
                        set.add(ch);

                }
                System.out.println(set.toString());
        }
}
