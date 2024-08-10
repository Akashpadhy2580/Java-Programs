package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Find_All_Unmatched_Elements_from_2_Arrays
{
        public static void main(String[] args) {
                //Print all unmatched element from 2 Arrays
                //input: {"a","b","c","e","g"}         {"a","b","d","e","f"}
                //output: {"c","d","g","f"}
                String[] l = {"a", "b", "c", "e", "g"};
                String[] m = {"a", "b", "d", "e", "f","z"};

                //Way-1 (Applicable when arrays length is same)
                ArrayList<String> al=new ArrayList<>();
                boolean flag=true;
                for(int i=0;i<l.length;i++)
                {
                        flag=true;
                        for(int j=0;j<m.length;j++)
                        {
                                if (l[i]==m[j])
                                {
                                        flag=false;
                                }

                        }
                        if (flag==true)
                        {
                                al.add(l[i]);
                                al.add(m[i]);
                        }
                }
                System.out.println(al);

                //Way-2 (Applicable everywhere)
                Set<String> set1 = new HashSet<>(Arrays.asList(l));
                Set<String> set2 = new HashSet<>(Arrays.asList(m));

                Set<String> unmatchedset1 = new HashSet<>(set1);
                unmatchedset1.removeAll(set2);

                Set<String> unmatchedset2 = new HashSet<>(set2);
                unmatchedset2.removeAll(set1);

                unmatchedset1.addAll(unmatchedset2);
                System.out.println(unmatchedset1);

        }
}
