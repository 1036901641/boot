package com.boot.utils;

import java.util.LinkedList;
import java.util.List;

/**
 * @author ：王继创
 * @version : 1.0
 * @description : TODO
 * @date : 2022/7/28 9:34
 */
public class DAG {
    public List<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        traverse(graph, 0, new LinkedList<>());
        return res;
    }

    public void traverse(int[][] graph, int s, LinkedList<Integer> path){
        path.add(s);
        int n = graph.length;
        if(s == n - 1){
            res.add(new LinkedList<>(path));
        }

        for(int i : graph[s]){
            traverse(graph, i, path);
        }
        path.removeLast();
    }
}
