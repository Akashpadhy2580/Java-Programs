package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Find_All_Matched_Elements_from_2_Arrays
{
        public static void main(String[] args) {
                //Print all unmatched element from 2 Arrays
                //input: {"a","b","c","e","g"}         {"a","b","d","e","f"}
                //output: {"c","d","g","f"}
                String[] l = {"a", "b", "c", "e", "g"};
                String[] m = {"a", "b", "d", "e", "f","z"};

                Set<String> set1 = new HashSet<>(Arrays.asList(l));
                Set<String> set2 = new HashSet<>(Arrays.asList(m));

                set1.retainAll(set2);

                System.out.println(set1);

        }
}
