package com.github.fernandoperc.algorithmscourse.algorithms.unionfind;

public class QuickFind extends UnionFind {

    public boolean isconnected(int a, int b) {
        return (id[a] == id[b]);
    }
    
    public void union(int a, int b) {
        
        int ida = id[a];
        int idb = id[b];
        
        for (int i = 0; i < id.length; i++) {
           if (id[i] == ida) {
               id[i] = idb;
           }
        }
    }
}
