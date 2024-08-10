package Java_Programs;

import java.util.HashMap;

public class Program19
{
        public static void main(String[] args)
        {
                //Find 1st unique character in a String
                String s="akhkassh";
                int index=-1;
                HashMap<Character,Integer> hm=new HashMap<>();
                for (Character ch:s.toCharArray())
                {
                        int freq=hm.getOrDefault(ch,0);
                        hm.put(ch,(freq+1));
                }


                for (Character ch:s.toCharArray()) {
                        if(hm.get(ch)==1) {
                                System.out.println("1st Unique Character: " + ch);
                                index=0;
                                break;
                        }
                }
                if (index==-1)
                {
                        System.out.println("No Unique Character");
                }

        }
}
