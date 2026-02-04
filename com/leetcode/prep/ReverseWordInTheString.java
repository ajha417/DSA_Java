package com.leetcode.prep;

public class ReverseWordInTheString {
    public static void main(String[] args) {
        String s = "sky is the  blue";
        System.out.println(reverse(s));
    }
    private static String reverse(String s) {
        int i = 0, j = 0;
        String result = "";
        int n = s.length();
        while(i < n){
            // it removes space
            while(i < n && s.charAt(i) == ' ') i++;
            if(i >= n) break;
            j = i+1;
            while(j < n && s.charAt(j) != ' ') j++;
            String sub = s.substring(i,j);
            if(result.isEmpty()) result = sub;
            else{
                result = sub + " " + result;
            }
            i = j + 1;
        }
        return result;
    }
}
