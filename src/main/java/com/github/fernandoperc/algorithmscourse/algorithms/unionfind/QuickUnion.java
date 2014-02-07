package com.github.fernandoperc.algorithmscourse.algorithms.unionfind;

public class QuickUnion extends UnionFind {

    public boolean isconnected(int a, int b) {
       return root(a) == root(b);
    }
    
    public void union(int a, int b) {
       
        int roota = root(a);
        int rootb = root(b);
        id[roota] = rootb; 
    }
    
    protected int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }
}

//public class QuickUnion extends UnionFind {
//
//    public boolean isconnected(int a, int b) {
//       
//        if (id[a] == id[b]) {
//            return true;
//        } else {
//            return isconnected(id[a], id[b]);
//        }
//    }
//    
//    public void union(int a, int b) {
//        id[a] = id[b];
//    }
//    
//}
