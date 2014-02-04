/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.github.fernandoperc.algorithmscourse.algorithms.unionfind;

/**
 *
 * @author SAOFerSi
 */
public abstract class UnionFind {
    
    protected int id[];
    
    public void init(int arraysize) {
         id = new int[arraysize];
        
        for (int i = 0; i < 200; i++) {
            id[i] = i;
        }
    }
    
    public abstract boolean isconnected(int a, int b);
    public abstract void union(int a, int b);
    
}
