package Java_Programs;

import java.util.*;
import java.util.stream.Collectors;

public class Program32
{
        public static void main(String[] args)
        {
                //group anagrams
                String[] strs={"bat","cat","abt","act","tba","tab","zat"};

                //Way-1 (Using stream API)
                Map<String, List<String>> result=Arrays.stream(strs).collect(Collectors.groupingBy((word)->{
                        char[] chars=word.toCharArray();
                        Arrays.sort(chars);
                        return new String(chars);
                }));
                System.out.println(result.values());

                //Way-2
                Map<String, List<String>> hm=new HashMap<>();
                for (String str:strs)
                {
                    char[] ch=str.toCharArray();
                    Arrays.sort(ch);
                    String sorted=String.valueOf(ch);
                    if(!hm.containsKey(sorted))
                    {
                        hm.put(sorted,new ArrayList<>());
                    }
                    hm.get(sorted).add(str);
                }
                System.out.println(hm.values());
        }
}
