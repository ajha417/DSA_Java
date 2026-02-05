package com.leetcode.prep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongtangAntSimulation {
    public static void main(String[] args) {
        int startX = 0;
        int startY = 0;
        int k = 92;
        // there is infinite length grid
        // ant moves forward with below rules
        // starting from starting cordinates can move in four directions N, W, E and S
        // can move k steps
        // all of the grid color is white at initial
        // when white color is found, turn 90 degree right and move forward and turn the box color to black
        // when found black, turn 90 degree left and move forward and turn the box color to white
        // find the final cordinates and directions of ant after k steps following above steps
        List<String> result = findFinalSteps(startX, startY, k, "N");
        System.out.println(result);
    }

    private static List<String> findFinalSteps(int startX, int startY, int k, String initialDir) {
        Map<String, Integer> dirToIdx = new HashMap<>();
        dirToIdx.put("N", 0);
        dirToIdx.put("E", 1);
        dirToIdx.put("S", 2);
        dirToIdx.put("W", 3);

        String[] dirs = {"N", "E", "S", "W"};
        int[] dx = {0, 1, 0, -1};  // N E S W
        int[] dy = {1, 0, -1, 0};

        int dirIdx = dirToIdx.get(initialDir);
        long x = startX;
        long y = startY;

        Map<Long, Map<Long, Boolean>> grid = new HashMap<>();  // sparse grid, true=black

        for (long step = 0; step < k; step++) {
            Long rx = x;
            Long ry = y;
            grid.putIfAbsent(rx, new HashMap<>());
            Map<Long, Boolean> row = grid.get(rx);
            boolean isBlack = row.getOrDefault(ry, false);

            // Turn and flip
            if (isBlack) {
                // black: turn left
                dirIdx = (dirIdx - 1 + 4) % 4;
                row.put(ry, false);  // to white
            } else {
                // white: turn right
                dirIdx = (dirIdx + 1) % 4;
                row.put(ry, true);   // to black
            }

            // Move forward
            x += dx[dirIdx];
            y += dy[dirIdx];
        }

        List<String> result = new ArrayList<>();
        result.add(String.valueOf(x));
        result.add(String.valueOf(y));
        result.add(dirs[dirIdx]);
        return result;
    }
}
