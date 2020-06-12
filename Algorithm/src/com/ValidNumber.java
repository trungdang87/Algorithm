package com;

//https://leetcode.com/problems/valid-number/
public class ValidNumber {
	
	public boolean isDigit(char c){
        return c >= '0' && c <= '9';
    }
    
    public boolean isDot(char c){ return c == '.'; }
    public boolean isE(char c) { return c == 'e' || c == 'E';}
    public boolean isPlusMinus(char c) { return c == '+' || c == '-';}
    
    public boolean isNumber(String s) {
       
        s = s.trim();
        if( s.length() == 0) return false;
        char prev=0, cur=0;
        boolean dotSeen = false, eSeen=false;
        boolean digitSeen=false;
        for(int i=0; i< s.length(); i++, prev = cur){
            cur = s.charAt(i);
            // -/+ && can only stay in front or right after "e"
            // " -90e3   " => true // " 6e-1" => true
            if ( isPlusMinus(cur) && ( i ==0 || isE(prev) ) ){ 
                continue;
            }
            //e/E && appear only 1 && must have number in front && when i>0
            if ( isE(cur) && !eSeen && digitSeen && (isDot(prev) || isDigit(prev))){
                eSeen = true;
                continue;
            }
            // "." && not appear twice && can't be after "e"
            if( isDot(cur) && !dotSeen  && !eSeen ){
                dotSeen = true;
                continue;
            }
            if( isDigit(cur)){
                digitSeen = true;
                continue;
            }
            return false;
            
        }
        //return digitSeen;
        //return digitSeen && isDigit(prev);
        //return digitSeen &&    isDot(prev);                  
        return digitSeen && (isDigit(prev) || isDot(prev));
        
    }
	
	

}
