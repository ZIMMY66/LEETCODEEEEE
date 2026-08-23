import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {

        // Sort according to first value
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> ans = new ArrayList<>();

        // Take first interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            // Current interval overlaps
            if (intervals[i][0] <= end) {

                // Increase the end if needed
                end = Math.max(end, intervals[i][1]);

            } else {

                // No overlap, save previous interval
                ans.add(new int[]{start, end});

                // Start a new interval
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }

        // Add the last interval
        ans.add(new int[]{start, end});

        return ans.toArray(new int[ans.size()][]);
    }
}