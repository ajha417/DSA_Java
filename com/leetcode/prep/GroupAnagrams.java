package com.leetcode.prep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> list = groupAnagrams(strs);
        System.out.println(list);

    }
    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<Map<Character, Integer>, List<String>> map = new HashMap<>();
        for(String s: strs) {
            Map<Character, Integer> map1 = new HashMap<>();
            for (char c : s.toCharArray()) {
                map1.put(c, map1.getOrDefault(c, 0) + 1);
            }
            if (map.containsKey(map1)) {
                List<String> list = map.get(map1);
                list.add(s);
            } else {
                List<String> list1 = new ArrayList<>();
                list1.add(s);
                map.put(map1, list1);
            }
        }
        return new ArrayList<>(map.values());
    }
}
