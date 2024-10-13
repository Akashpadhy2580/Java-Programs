package Strings;

import java.util.HashMap;

public class String_Compression
{
        public static void main(String[] args)
        {
                //String Compression    Way-1
                String s="aabbbcddddeeffguuuuuoo";
                int count=1;
                StringBuilder sb=new StringBuilder();

                for (int i=1;i<s.length();i++)
                {
                        if (s.charAt(i)==s.charAt(i-1))
                                count++;
                        else
                        {
                                sb.append(s.charAt(i-1));
                                sb.append(count);
                                count=1;
                        }
                }
                sb.append(s.charAt(s.length()-1));
                sb.append(count);
                System.out.println(sb.toString());



                //Way-2 (Using HashMap)
                HashMap<Character,Integer> hm=new HashMap<>();
                StringBuilder sb1=new StringBuilder();
                for (int i=0;i<s.length();i++)
                {
                       if (hm.containsKey(s.charAt(i)))
                       {
                               int c=hm.get(s.charAt(i));
                               hm.put(s.charAt(i),++c);
                       }
                       else
                               hm.put(s.charAt(i),1);
                }
                for(Character ch:hm.keySet())
                {
                        sb1.append(ch);
                        sb1.append(hm.get(ch));
                }
                System.out.println(sb1.toString());
        }
}
