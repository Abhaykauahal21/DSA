import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        // sort karo array ko
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int idx = 0; // index for merged intervals

        for (int i = 1; i < n; i++) {
            if (intervals[i][0] <= intervals[idx][1]) {
                // overlap → merge with previous
                intervals[idx][1] = Math.max(intervals[idx][1], intervals[i][1]);
            } else {
                // no overlap → move forward
                idx++;
                intervals[idx] = intervals[i];
            }
        }

        // return only the merged part
        int[][] ans = new int[idx + 1][2];
        for (int i = 0; i <= idx; i++) {
            ans[i] = intervals[i];
        }
        return ans;
    }
}