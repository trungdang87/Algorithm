package com;

import java.util.Scanner;

/*	https://practice.geeksforgeeks.org/problems/how-many-xs/0
 * Given an integer X within the range of 0 to 9, and given two positive integers as upper and lower bounds respectively, find the number of times X occurs as a digit in an integer within the range, excluding the bounds. Print the frequency of occurrence as output.

	Input:
	The first line of input is an integer T, denoting the number of test cases. For each test case, there are two lines of input, first consisting of the integer X, whose occurrence has to be counted. Second, the lower and upper bound, L and U which are positive integers, on the same line separated by a single space, respectively.

	Output:
	For each test case, there is only one line of output, the count of the occurrence of X as a digit in the numbers lying between the lower and upper bound, excluding them.

	Constraints:
	1<=T<=100
	0<=X<=9
	0<L<U<=10^5

	Example:
	Input
	5
	3
	100 250
	2
	10000 12345
	0
	20 21
	9
	899 1000
	1
	1100 1345
	Output:
	35
	1120
	0
	120
	398
	
	How many times will each digit from 0 to 9 appear when all numbers from 1 to N are written in decimal notation?
This question previously had details. They are now in a comment.
https://www.quora.com/How-many-times-will-each-digit-from-0-to-9-appear-when-all-numbers-from-1-to-N-are-written-in-decimal-notation/answer/Raziman-T-V?ch=10&share=3c7b2441&srid=uH4DZ
Raziman T.V.
Raziman T.V., IOI silver medallist (2007), ACM ICPC world finalist (2011, 2012)
Answered Nov 19, 2013
We can solve this by looking at the digits in each position separately. For example, let N=1048365. We will count how many times the digit d appears in the position 8 currently is in. Write N as LcR, with L=104, c=8 and R=365. We will consider four cases.

Case 1: d=0
In this case, every number which has 0 in 8's current position should be of the form M0S. Since numbers are written without leading zeros, M has to be at least 1. And since L=104, M can be at most 104 as well. For each value of M, S can be any numerical string in [000…999]. Thus the total number of times 0 appears in 8's current position is 104×1000=104000.

Case 2: 1<=d<=7
The same conditions apply as earlier, except for the fact that M=0 gives valid solutions as well. Hence the number of times d appears in 8's current position is 105×1000=1050000.

Case 3: d=8
In this case, having M from [0…103] allows all 1000 values of S as earlier. But having M=104 allows us only S from [0…365] since taking a higher S will give us a number greater than N. Thus the total number of times 8 appears there is 104×1000+366=104366.

Case 4: d>8
In this case, we can have M only in the range [0…103]. For each value of M, all 1000 values of S are allowed and the total number of times d appears there is 104×1000=104000.

Repeat the procedure for every position in N and every digit d. The counts for all digits can thus be calculated in O(10 log N).
	
	*/

public class HowManyXMySolution {
	//find number of x occurs from 0 to upper limit (upperLimit)
	/*public static int find(int upperLimit,int x) //in case x != 0
	{
		int digits = (int) (Math.log10(upperLimit) + 1); //get number of digits of an int
		int left = 0, right = 0; //left is as L, right is as R
		int i = 1; //used to iterate through number of digits
		int y = 0, z = 0; // y used to get digits from the left of i, z used to get digits from the right of i
		int answer = 0;
		int ithValue = 0; //value at each position i
		
		while(i<=digits)
		{			
			y = (int) Math.pow(10, i); 
			z = (int) Math.pow(10, i - 1);
			left = upperLimit / y;
			right = upperLimit % z;
			ithValue = (upperLimit % y) / z ;
			
			if(x == 0) {
				answer = answer + (left * z);
			}
			if(x >= 1 && x < ithValue) {
				answer = answer + ((left + 1) * z);
			}
			if(x == ithValue) {
				answer = answer + ((left * z) + (right + 1));
			}
			if(x > ithValue) {
				answer = answer + (left * z);
			}
			i++;
		}
		return answer;
	}*/
	// find 1048365 -> LcR -> L=104, c=8 and R=365
	public static int find(int limit, int x) {
		int left=0, right = 0, l = 0, r = 0, ithValue = 0;
		int result = 0;
		int i = 1;
		int digits = (int)Math.log10(limit) + 1;
		while(i<=digits) {
			l = (int)Math.pow(10, i);
			r = (int) Math.pow(10,  i - 1);
			left = limit / l;
			right = limit % r;
			ithValue = limit % l / r;
			if(x==0) result += left * r;
			if(x>0 && x<ithValue) result += (left + 1) * r;
			if(x==ithValue) result += left * r + right + 1;
			if(x>ithValue) result += left * r;
			i++;
		}
		return result;
	}
	

	public static void main(String[] args) {
		/*int t; //t is number of test cases
		Scanner scanner = new Scanner(System.in);
		t = scanner.nextInt();
		while(t-- != 0)
		{
			int lowerBound, upperBound, x; //x is the number we have to count for how many times it occurs
			x = scanner.nextInt();
			lowerBound = scanner.nextInt();
			upperBound = scanner.nextInt();
			if(lowerBound+1 == upperBound || lowerBound > upperBound ) //if x is not within range (exclude lowerBound and upperBound) print 0
			{
				System.out.println(0);
			}
			else {
				int lowerBoundCount, upperBoundCount;
				lowerBoundCount = HowManyXMySolution.find(lowerBound,x);
				upperBoundCount= HowManyXMySolution.find(upperBound - 1,x);
				System.out.println(upperBoundCount - lowerBoundCount);
			}
		}
		scanner.close();*/
		int lowerBoundCount = HowManyXMySolution.find(10000,2);
		int upperBoundCount = HowManyXMySolution.find(12345 - 1,2);
		System.out.println(upperBoundCount - lowerBoundCount); 
		System.out.println(HowManyXMySolution.find(1345 - 1,1) - HowManyXMySolution.find(1100,1));
		//1120
		//398
	}
}
