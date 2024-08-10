package Java_Programs;

import java.util.HashSet;

public class Program37
{
        public static void main(String[] args)
        {
                //Common Elements from 3 arrays
                int[] a1={1,2,3,4};
                int[] a2={1,2,4};
                int[] a3={2,3};

                HashSet<Integer> s1=new HashSet<>();
                HashSet<Integer> s2=new HashSet<>();

                for (int i:a1)
                        s1.add(i);
                for (int i:a2)
                        s2.add(i);
                for (int i:a3)
                {
                        if (s1.contains(i) && s2.contains(i))
                                System.out.println(i);
                }
        }
}
