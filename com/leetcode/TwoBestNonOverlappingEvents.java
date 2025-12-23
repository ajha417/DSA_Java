package com.leetcode;

import java.util.Arrays;

public class TwoBestNonOverlappingEvents {
    public static void main(String[] args) {
        /*
        *
        *
        * You are given a 0-indexed 2D integer array of events where events[i] = [startTimei, endTimei, valuei].
        *  The ith event starts at startTimei and ends at endTimei, and
        *  if you attend this event, you will receive a value of valuei.
        *  You can choose at most two non-overlapping events to attend such that the sum of their values is maximized.

        Return this maximum sum.

        Note that the start time and end time is inclusive:
        *  that is, you cannot attend two events where one of them starts and the other ends at the same time.
        * More specifically, if you attend an event with end time t, the next event must start at or after t + 1.*/

        int[][] events = {{1,3,2}, {4,5,2}, {2, 4, 3}};
        int maxValue = maxTwoEvents(events);
        System.out.println(maxValue);
    }

    public static int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int[][] dp = new int[events.length][3];
        for(int[] d: dp) Arrays.fill(d, -1);
        return findEvents(events, 0, 0, dp);
    }

    private static int findEvents(int[][] events, int idx, int cnt, int[][] dp) {
        if(cnt == 2 || idx >= events.length) return 0;
        if(dp[idx][cnt] == -1) {
            int end = events[idx][1];
            int lo = idx + 1, high = events.length -1;
            while(lo < high) {
                int mid = (lo + high) / 2;
                if(events[mid][0] > end) high = mid;
                else lo = mid + 1;
            }
            int include = events[idx][2] + (lo < events.length && events[lo][0] > end
                    ? findEvents(events, lo, cnt + 1, dp) : 0);
            int exclude = findEvents(events, idx + 1, cnt, dp);
            dp[idx][cnt] = Math.max(include, exclude);
        }
        return dp[idx][cnt];
    }
}
