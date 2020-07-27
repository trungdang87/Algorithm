package com;

import java.util.ArrayList;
import java.util.LinkedList;

//https://www.geeksforgeeks.org/write-a-c-program-to-calculate-powxn/
//https://leetcode.com/problems/powx-n/
public class ImplementPowerFunction {
	/*	static int power(int x, int y) 
    { 
        if (y == 0) 
            return 1; 
        else if (y % 2 == 0) 
            return power(x, y / 2) * power(x, y / 2); 
        else
            return x * power(x, y / 2) * power(x, y / 2); 
    } */

	/*	static double power(double x, int y) 
    { 
        if(y==0) return 1;
		double temp = power(x,y/2);
		if(y%2==0) {
			return temp * temp;
		}
		else{
			if (y > 0) {
				return x * temp * temp;
			}
			else {
				return temp * temp / x;
			}
		}
    }  */

/*	static double myPow(double x, int n) {
		if(n < 0) return 1/x * myPow(1/x, -(n+1));
		if(n == 0) return 1;
		if(n == 2) return x*x;
		if(n%2 == 0) return myPow(myPow(x, n/2), 2);
		else return x*myPow( myPow(x, n/2), 2);
	}*/
	//https://leetcode.com/problems/powx-n/
	public static double power(double a, int b) {
		if(b==0) return 1;
		double temp = power(a, b/2);
		if(b%2==0) {
			return temp * temp;
		}
		else {
			if(b>0) {
				return temp * temp * a;
			}
			else {
				return temp * temp / a;
			}
		}
	}
	//https://leetcode.com/problems/powx-n/
	public static void main(String[] args) {
		System.out.println(Math.pow(-2.3,  -3));
		System.out.println(ImplementPowerFunction.power(-2.3, -3));
		System.out.println(ImplementPowerFunction.power(2, -3));
		System.out.println(ImplementPowerFunction.power(2, 3));
		System.out.println(ImplementPowerFunction.power(-2, 3));
	} 

}
