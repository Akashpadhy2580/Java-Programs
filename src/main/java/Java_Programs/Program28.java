package Java_Programs;

import java.util.HashSet;

public class Program28
{
        public static void main(String[] args)
        {
                //Intersection of 2 Arrays
                int[] num1={1,2,2,1};
                int[] num2={2,2};

                HashSet<Integer> s1=new HashSet<>();
                HashSet<Integer> s2=new HashSet<>();

                for (int i:num1)
                {
                        s1.add(i);
                }
                for (int i:num2)
                {
                        if(s1.contains(i))
                                s2.add(i);
                }
                System.out.println(s2.toString());

        }
}
