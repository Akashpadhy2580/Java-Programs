package Java_Programs;

import java.util.Arrays;

public class Program31
{
        public static void main(String[] args)
        {
                //Anagram strings
                String s1="Akash";
                String s2="Akash";
                if (isAnagram(s1,s2))
                        System.out.println("Anagram");
                else
                        System.out.println("Not Anagram");

        }
        public static boolean isAnagram(String s1, String s2)
        {
                boolean flag=true;
                s1=s1.replaceAll("\\s","").toLowerCase();
                s2=s2.replaceAll("\\s","").toLowerCase();
                if (s1.length()!=s2.length())
                        return false;
                else {
                     char[] ch1=s1.toCharArray();
                     char[] ch2=s2.toCharArray();

                        Arrays.sort(ch1);
                        Arrays.sort(ch2);

                        return Arrays.equals(ch1,ch2);

                }
        }
}
