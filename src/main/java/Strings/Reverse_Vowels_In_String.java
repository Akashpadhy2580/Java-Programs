package Strings;

import java.util.HashSet;

public class Reverse_Vowels_In_String
{
        public static void main(String[] args)
        {
                //Reverse vowels in a string
                String s="Akashio";
                HashSet<Character> set=new HashSet<>();
                set.add('A');
                set.add('E');
                set.add('I');
                set.add('O');
                set.add('U');
                set.add('a');
                set.add('e');
                set.add('i');
                set.add('o');
                set.add('u');

                char[] ch=s.toCharArray();
                int start=0,end=ch.length-1;
                while(start<end)
                {
                        if (set.contains(ch[start]))
                        {
                                if (set.contains(ch[end]))
                                {
                                    char temp=ch[start];
                                    ch[start]=ch[end];
                                    ch[end]=temp;
                                    start++;
                                    end--;
                                }else {
                                        end--;
                                }
                        }
                        else {
                                start++;
                        }
                }
                System.out.println(String.valueOf(ch));


        }
}
