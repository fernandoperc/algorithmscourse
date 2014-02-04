package com.github.fernandoperc.algorithmscourse;

import com.github.fernandoperc.algorithmscourse.algorithms.unionfind.*;
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        QuickFind unionfind2 = new QuickFind();
        unionfind2.init(10);
        
        QuickUnion unionfind1 = new QuickUnion();
        unionfind1.init(10);
        
    }
}
