package com.github.fernandoperc.algorithmscourse.algorithms.unionfind;

public abstract class UnionFind {
    
    protected int id[];
    
    public void init(int arraysize) {
         id = new int[arraysize];
         
         for (int i = 0; i < arraysize; i++) {
            id[i] = i;
         }
    }

    public String tostring() {
      String returnval = "";

        for (int i = 0; i < id.length; i++) {
            returnval += "index: "
                        + i
                        + " entry: "
                        + id[i]
                        + "\n";
                        
        }
        return returnval;
    }
     
    public abstract boolean isconnected(int a, int b);
    public abstract void union(int a, int b);
    
}
