package Strings;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic_String
{
        public static boolean isIsomorphic(String s1, String s2)
        {
                //Check 2 Strings are isomorphic or not
                Map<Character, Character> hm=new HashMap<>();
                boolean flag=true;
                if(s1.length()!=s2.length())
                {
                      return false;
                }
                else {
                        for (int i=0;i<s1.length();i++)
                        {
                                char original=s1.charAt(i);
                                char replacement=s2.charAt(i);
                                if(!hm.containsKey(original))
                                {
                                        if(!hm.containsValue(replacement))
                                        {
                                                hm.put(original,replacement);
                                        }else
                                                return false;
                                }
                                else {
                                        if (hm.get(original)!=replacement)
                                                return false;
                                }
                        }
                }
                return true;
        }

        public static void main(String[] args)
        {
                String s1="Akash";
                String s2="Kakzr";
                if (isIsomorphic(s1,s2))
                        System.out.println("Isomorphic");
                else
                        System.out.println("Not Isomorphic");
        }
}
