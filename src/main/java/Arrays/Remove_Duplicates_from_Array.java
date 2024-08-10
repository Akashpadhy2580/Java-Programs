package Arrays;

import java.util.HashSet;

public class Remove_Duplicates_from_Array
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
