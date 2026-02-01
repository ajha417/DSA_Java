package com.leetcode.prep.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSAndDFSTraversal {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(6);
        adjList.add(new ArrayList<>());
        adjList.add(list);
        adjList.add(list1);
        System.out.println(adjList);
        ArrayList<Integer> bfs = bfs(adjList);
        System.out.println(bfs);
    }

    // bfs traversal
    private static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adjList) {
        int n = adjList.size();
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        queue.add(1);
        while(!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);
            for(int child: adjList.get(node)) {
                if(!visited[child]) {
                    visited[child] = true;
                    queue.offer(child);
                }
            }
        }
        return result;
    }

    // dfs traversal
    private static ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        dfs(adj, 0, visited, list);
        return list;
    }

    private static void dfs(ArrayList<ArrayList<Integer>> adj, int node, boolean[] visited, ArrayList<Integer> list) {
        visited[node] = true;
        list.add(node);
        for(int it: adj.get(node)) {
            if (!visited[it]) {
                dfs(adj, it, visited, list);
            }
        }
    }
}
