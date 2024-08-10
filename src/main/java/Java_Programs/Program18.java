package Java_Programs;

import java.util.HashSet;

public class Program18
{
        public static void main(String[] args)
        {
                //FInd unique characters in a String
                String s="Aaksash";
                HashSet<Character> set=new HashSet<>();
                for (char ch:s.toCharArray())
                {
                        if (set.contains(ch))
                        {
                                set.remove(ch);
                        }
                        else
                                set.add(ch);
                }
                if (set.size()==0)
                        System.out.println("No Unique character");
                else {
                        for (char c:set)
                        System.out.print(c+" ");
                }
        }
}
