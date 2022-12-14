/*
Description of Question : https://leetcode.com/problems/reverse-string/
Input: s = hello
Output: olleh
Time Comlexity : O(N)
*/

import java.util.*;

class ReverseString{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch[] = str.toCharArray();
        int s = 0,e = ch.length-1;
        while(s<e){
            char temp = ch[s];
            ch[s] = ch[e];
            ch[e] = temp;
            s++;
            e--;
        }
        for(char c:ch) System.out.print(c);
    }
}
