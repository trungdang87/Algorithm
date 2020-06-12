package com;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class ZZZ{
	public boolean isHappy(int n){
        int ans = 0, d = 0;
        while(n!=0){
            while(n!=0){
                d = n%10;
                ans += Math.pow(d,2);
                n /= 10;
            }
            System.out.println(ans);
            if(ans == 1) return true;
            if(ans == 4) return false;
            if(ans == 9) return false;
            n = ans;
            ans = 0;
        }
        return false;
    }

	public static void main(String args[])
	{
		ZZZ ob = new ZZZ();
		System.out.println(ob.isHappy(300));

	}

}
