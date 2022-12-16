/*
Description of Question : https://www.geeksforgeeks.org/split-the-binary-string-into-substrings-with-equal-number-of-0s-and-1s/
Input: str = “0100110101” 
Output: 4 
The required substrings are “01”, “0011”, “01” and “01”.
*/

import java.util.*;

class SplitString{
    
    public static int maxSubStr(String str) {
        int n = str.length();
        int count0=0,count1=0,count=0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='0')count0++;
            else count1++;
            if(count0==count1) count++;
        }
        if(count0!=count1) return -1;
        return count;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(maxSubStr(s));
    }
}
