package com.github.fernandoperc.algorithmscourse.algorithms.unionfind;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Constants;

public class WeightedQuickUnion extends QuickUnion {
    
    private int sz[];
    
    @Override
    public void init(int arraysize) {
        super.init(arraysize);
        sz = new int[id.length];
        
        for (int i = 0; i < sz.length; i++) {
            sz[i] = 0;
        }
    }
    
    @Override
     public void union(int a, int b) {
       
        int roota = root(a);
        int rootb = root(b);
        
        if (sz[roota] == sz[rootb]) return;
        if (sz[roota] < sz[rootb]) {
            id[roota] = rootb;
            sz[roota] += sz[rootb];
        } else {
            id[rootb] = roota;
            sz[rootb] += sz[roota];
        }
        id[roota] = rootb; 
    }
     
    @Override
    public String tostring() {
        
        String returnval = "";

        for (int i = 0; i < id.length; i++) {
            returnval += "index: "
                        + i 
                        + "entry: "
                        + id[i]
                        + "size: "
                        + sz[i]
                        + "\n";
                        
        }
        return returnval;
    }
}