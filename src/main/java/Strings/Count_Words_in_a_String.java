package Strings;

import java.util.HashMap;

public class Count_Words_in_a_String
{
        public static void main(String[] args)
        {
                //Count_Words_in_a_String
                String s="Akash Kumar Padhy";
                int count=1;
                for (int i=0; i<s.length();i++)
                {
                        if ((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
                                count++;
                }
                System.out.println(count);


        }
}
