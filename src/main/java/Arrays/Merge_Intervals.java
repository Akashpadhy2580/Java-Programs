package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Merge_Intervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int[][] results=merge(intervals);

        for(int[] result:results)
        {
            System.out.print(Arrays.toString(result));

        }
    }
    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals, Comparator.comparingInt(i->i[0]));

        List<int[]> results=new ArrayList<>();
        int[] newInterval=intervals[0];
        results.add(newInterval);

        for (int[] interval:intervals)
        {
            if (interval[0]<=newInterval[1])
                newInterval[1]=Math.max(interval[1],newInterval[1]);
            else{
                newInterval=interval;
                results.add(newInterval);
            }
        }
        return results.toArray(new int[results.size()][]);

    }
}
