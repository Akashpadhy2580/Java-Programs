package Strings;

import java.util.HashMap;

public class Find_Occurance_of_each_word_in_String
{
        public static void main(String[] args)
        {
                //Find Occurance of each word in a String
                String str="Apple is fruit with 2 seeds. Grapes may have seed or may not have seed. Papaya and watermelon have multiple seeds. Seeds are integral part for growing plant.";
                String[] words=str.split("\\s");
                HashMap<String,Integer> hm=new HashMap<>();

                for(int i=0;i<words.length;i++)
                {
                        String word=words[i];
                        if(hm.containsKey(word))
                        {
                                hm.put(word, hm.get(word)+1);
                        }
                        else
                        {
                                hm.put(word,1);
                        }
                }
                for(String word:hm.keySet())
                {
                        System.out.println(word+" : " +hm.get(word));}
        }
}
