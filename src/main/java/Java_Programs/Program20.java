package Java_Programs;

import com.sun.jdi.IntegerType;

import java.util.HashMap;
import java.util.HashSet;

public class Program20
{
        public static void main(String[] args)
        {
                //remove duplicates from Array
                int[] a={1,2,3,4,5,4,3,5,6,7,8};
                HashSet<Integer> set=new HashSet<>();
                for (Integer ch:a)
                {
                        set.add(ch);

                }
                System.out.println(set.toString());
        }
}
