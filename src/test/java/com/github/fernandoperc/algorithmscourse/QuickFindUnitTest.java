package com.github.fernandoperc.algorithmscourse;

import com.github.fernandoperc.algorithmscourse.algorithms.unionfind.UnionFind;
import com.github.fernandoperc.algorithmscourse.algorithms.unionfind.QuickFind;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class QuickFindUnitTest extends TestCase {
    
    public QuickFindUnitTest( String testName ) {
        super( testName );
    }

    public static Test suite() {
        return new TestSuite( QuickFindUnitTest.class );
    }

    public void test() {
        
        System.out.println("testing quick find algorithm...\n");
        
        UnionFind unionfind = new QuickFind();
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
