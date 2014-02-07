package com.github.fernandoperc.algorithmscourse;

import com.github.fernandoperc.algorithmscourse.algorithms.unionfind.UnionFind;
import com.github.fernandoperc.algorithmscourse.algorithms.unionfind.QuickUnion;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class QuickUnionUnitTest extends TestCase {
    
    public QuickUnionUnitTest( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( QuickUnionUnitTest.class );
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp(); 
    }
    
    @Override
    protected void tearDown() throws Exception {
       super.tearDown();
    }

    public void test() {
        
       System.out.println("testing quick union algorithm...\n");

        UnionFind unionfind = new QuickUnion();
        unionfind.init(10);
        unionfind.union(4, 3);
        unionfind.union(3, 8);
        unionfind.union(6, 5);
        unionfind.union(9, 4);
        unionfind.union(2, 1);
        unionfind.union(5, 0);
        unionfind.union(7, 2);
        unionfind.union(6, 1);
        unionfind.union(7, 3);
        
        System.out.println(unionfind.tostring() + "\n");
    }
}
