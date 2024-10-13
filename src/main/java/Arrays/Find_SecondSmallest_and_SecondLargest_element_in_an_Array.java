package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Find_SecondSmallest_and_SecondLargest_element_in_an_Array
{
        public static void main(String[] args)
        {
                //Find Second smallest and Second Largest element in an array
                int[] a={1,5,68,78,9,52,44,16,18,364,78,64};

                //Way-1
                System.out.println("Second smallest: "+secondSmallest(a));
                System.out.println("Second largest: "+secondLargest(a));

                //Way-2

                Arrays.sort(a);
                System.out.println("Second smallest: "+a[1]);
                System.out.println("Second largest: "+a[a.length-2]);

                //way-3 (Stream API)
                System.out.println("Second smallest: "+
                        Arrays.stream(a).boxed().sorted().skip(1).findFirst().get());
                System.out.println("Second largest: "+
                        Arrays.stream(a)
                                .boxed()
                                .sorted(Comparator.reverseOrder())
                                .skip(1)
                                .findFirst()
                                .get());
        }

        public static int secondSmallest(int[] a) {

                int small=Integer.MAX_VALUE;
                int secondSmall=Integer.MAX_VALUE;

                if (a.length==1)
                        return a[0];
                else
                {
                        for (int i:a)
                        {
                                if(i<small)
                                {
                                        secondSmall=small;
                                        small=i;

                                } else if (i<secondSmall && i!=small) {
                                        secondSmall=i;
                                }
                        }
                        return secondSmall;
                }
        }

        public static int secondLargest(int[] a) {

                int large=Integer.MIN_VALUE;
                int secondlarge=Integer.MIN_VALUE;

                if (a.length==1)
                        return a[0];
                else
                {
                        for (int i:a)
                        {
                                if(i>large)
                                {
                                        secondlarge=large;
                                        large=i;

                                } else if (i>secondlarge && i!=large) {
                                        secondlarge=i;
                                }
                        }
                        return secondlarge;
                }
        }
}
