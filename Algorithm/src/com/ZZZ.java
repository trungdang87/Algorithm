package com;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ZZZ{
	 
    
    public static void main(String[] args) {

    	 Function<Integer, Integer> f1=i-> i*i*i;
    	 Function<Integer, Integer> f2=i-> i*2;
    			
    	 System.out.println(f1.compose(f2).apply(3));
    	
    	
    }
	
}

