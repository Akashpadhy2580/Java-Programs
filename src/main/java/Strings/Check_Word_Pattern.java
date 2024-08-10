package Strings;

import java.util.HashMap;
import java.util.Map;

public class Check_Word_Pattern
{
        public static void main(String[] args)
        {
                //Check word pattern
                //pattern="abba"
                //s="dog cat cat dog"

                String pattern="abba";
                String s="dog cat cat dog";
                boolean flag=true;
                String[] words=s.split(" ");

                Map<Character, String> charToWord=new HashMap<>();
                Map<String, Character> wordToChar=new HashMap<>();

                if (pattern.length()==words.length)
                {
                        for (int i=0;i<pattern.length();i++)
                        {
                                Character ch=pattern.charAt(i);
                                String word=words[i];
                                if (!charToWord.containsKey(ch))
                                        charToWord.put(ch,word);
                                if (!wordToChar.containsKey(word))
                                        wordToChar.put(word,ch);
                                if(!charToWord.get(ch).equals(word) || !wordToChar.get(word).equals(ch))
                                        flag=false;
                        }
                }
                if (flag==true)
                        System.out.println("Word pattern matched");
                else
                        System.out.println("Word pattern not matched");



        }
}
